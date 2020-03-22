package typings.chui

import typings.std.Event_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for ChocolateChipJS HTMLElement Array.
  */
@js.native
trait ChocolateChipElementArray extends js.Object {
  /**
    * Display a busy indicator. Posible options: {size: "100px", color: "#ff0000", position: "align-flush", duration: "2s"}.
    *
    * @param size The size as a string with length identifier: "40px".
    * @param color The color for the busy indicator: "#ff0000".
    * @param position Optional positioning, such as "align-flush".
    * @param duration The time for the busy indicator to display: "500ms".
    * @return void
    */
  def UIBusy(): Unit = js.native
  def UIBusy(options: AnonColor): Unit = js.native
  /**
    * Center an element to the screen.
    */
  def UICenter(): Unit = js.native
  /**
    * Make a list editable. This can be enabling changing the order of list items, or deleting them, or both. Options: {editLabel: "Edit", doneLabel: "Done",
    * deleteLabel: "Delete", callback: function() {alert('Bye bye!');}, deletable: true, movable: true}.
    *
    * @return void
    */
  def UIEditList(): Unit = js.native
  def UIEditList(options: AnonDeletable): Unit = js.native
  /**
    * This method allows the user to use a segmented control to toggle a set of panels. It is executed on the segmented control.
    * The options id is the contain of the panels. The options callback is to execute when the user toggles a panel.
    *
    * @return void
    */
  def UIPanelToggle(panelsContainer: String, callback: js.Function0[_]): Unit = js.native
  /**
    * Close the currently displayed Popup. This is executed on the popup: $('#myPopup').UIPopupClose().
    *
    * @return void
    */
  def UIPopupClose(): Unit = js.native
  /**
    * Execute this on a range control to initialize it.
    *
    * @return void
    */
  def UIRange(): Unit = js.native
  /**
    * Initialize a segmented control. Options: {selected: 2, callback: function() {console.log('Blah');}}
    *
    * @return void
    */
  def UISegmented(): Unit = js.native
  def UISegmented(options: AnonSelected): Unit = js.native
  /**
    * Convert a simple list into a selection list. This converts the list into a radio button group, meaning only one can be selected at any time.
    * You can name the radios buttons using the options name. Options: {name: "selectedNamesGroup", selected: 2, callback: function() {alert('hi');}}
    *
    * @return void
    */
  def UISelectList(): Unit = js.native
  def UISelectList(options: AnonName): Unit = js.native
  /**
    * Create a stepper control by executing it on a span with the class "stepper". Possible options: {start: 0, end: 10, defaultValue: 3}.
    *
    * @return void
    */
  def UIStepper(options: AnonDefaultValue): Unit = js.native
  /**
    * Initialize any existing switch controls: $('.switch').UISwitch();
    *
    * @return void
    */
  def UISwitch(): Unit = js.native
  /**
    * Attach a handler to an event for the elements.
    *
    * @param eventType A string containing one or more DOM event types, such as "click" or "submit," or custom event names.
    * @param handler A function to execute each time the event is triggered.
    * @param useCapture Setting the third argument to true will trigger event bubbling. The default is false.
    * @return ChocolateChipStatic
    */
  def bind(eventType: String, handler: js.Function1[/* eventObject */ Event_, _]): ChocolateChipStatic = js.native
  def bind(eventType: String, handler: js.Function1[/* eventObject */ Event_, _], useCapture: Boolean): ChocolateChipStatic = js.native
  def bind(eventType: ChUIEventInterface, handler: js.Function1[/* eventObject */ Event_, _]): ChocolateChipStatic = js.native
  def bind(
    eventType: ChUIEventInterface,
    handler: js.Function1[/* eventObject */ Event_, _],
    useCapture: Boolean
  ): ChocolateChipStatic = js.native
  /**
    * Add a delegated event to listen for the provided event on the descendant elements.
    *
    * @param selector A string defining the descendant elements to listen on for the designated event.
    * @param eventType A string containing one or more DOM event types, such as "click" or "submit," or custom event names.
    * @param handler A function to execute each time the event is triggered. The keyword "this" will refer
    * to the element receiving the event.
    * @param useCapture Setting the third argument to true will trigger event bubbling. The default is false.
    * @return ChocolateChipStatic
    */
  def delegate(selector: js.Any, eventType: String, handler: js.Function1[/* eventObject */ Event_, _]): ChocolateChipStatic = js.native
  def delegate(
    selector: js.Any,
    eventType: String,
    handler: js.Function1[/* eventObject */ Event_, _],
    useCapture: Boolean
  ): ChocolateChipStatic = js.native
  def delegate(
    selector: js.Any,
    eventType: ChUIEventInterface,
    handler: js.Function1[/* eventObject */ Event_, _]
  ): ChocolateChipStatic = js.native
  def delegate(
    selector: js.Any,
    eventType: ChUIEventInterface,
    handler: js.Function1[/* eventObject */ Event_, _],
    useCapture: Boolean
  ): ChocolateChipStatic = js.native
  /**
    * Iterate over an Array object, executing a function for each matched element.
    *
    * @return void
    */
  def forEach(func: js.Function2[/* ctx */ js.Any, /* idx */ Double, Unit]): Unit = js.native
  /**
    * Reduce the set of matched elements to those that have a descendant that matches the selector or DOM element.
    *
    * @param contained A DOM element to match elements against.
    * @return HTMLElement[]
    */
  def haz(contained: HTMLElement): ChocolateChipElementArray = js.native
  /**
    * Reduce the set of matched elements to those that have a descendant that matches the selector or DOM element.
    *
    * @param selector A string containing a selector expression to match elements against.
    * @return HTMLElement[]
    */
  def haz(selector: String): ChocolateChipElementArray = js.native
  /**
    * Return any of the matched elements that have the given attribute.
    *
    * @param className The class name to search for.
    * @return HTMLElement[]
    */
  def hazAttr(attributeName: String): ChocolateChipElementArray = js.native
  /**
    * Return any of the matched elements that have the given class.
    *
    * @param className The class name to search for.
    * @return HTMLElement[]
    */
  def hazClass(className: String): ChocolateChipElementArray = js.native
  /**
    * Reduce the set of matched elements to those that have a descendant that does not match the selector or DOM element.
    *
    * @param contained A DOM element to match elements against.
    * @return HTMLElement[]
    */
  def haznt(contained: HTMLElement): ChocolateChipElementArray = js.native
  /**
    * Reduce the set of matched elements to those that have a descendant that does not match the selector or DOM element.
    *
    * @param selector A string containing a selector expression to match elements against.
    * @return HTMLElement[]
    */
  def haznt(selector: String): ChocolateChipElementArray = js.native
  /**
    * Return any of the matched elements that do not have the given attribute.
    *
    * @param className The class name to search for.
    * @return HTMLElement[]
    */
  def hazntAttr(attributeName: String): ChocolateChipElementArray = js.native
  /**
    * Return any of the matched elements that do not have the given class.
    *
    * @param className The class name to search for.
    * @return HTMLElement[]
    */
  def hazntClass(className: String): ChocolateChipElementArray = js.native
  /**
    * Check the current matched set of elements against a selector or element and return it
    * if it matches the given arguments.
    *
    * @param elements One or more elements to match the current set of elements against.
    * @return HTMLElement[]
    */
  def iz(element: js.Any): ChocolateChipElementArray = js.native
  /**
    * Check the current matched set of elements against a selector or element and return it
    * if it matches the given arguments.
    *
    * @param selector A string containing a selector expression to match elements against.
    * @return HTMLElement[]
    */
  def iz(selector: String): ChocolateChipElementArray = js.native
  /**
    * Check the current matched set of elements against a selector or element and return it
    * if it does not match the given arguments.
    *
    * @param elements One or more elements to match the current set of elements against.
    * @return HTMLElement[]
    */
  def iznt(element: js.Any): ChocolateChipElementArray = js.native
  /**
    * Check the current matched set of elements against a selector or element and return it
    * if it does not match the given arguments.
    *
    * @param selector A string containing a selector expression to match elements against.
    * @return HTMLElement[]
    */
  def iznt(selector: String): ChocolateChipElementArray = js.native
  /**
    * Remove a handler for an event from the elements. If the second argument is a selector, it tries to undelegate the event.
    * If no arugments are provided, it removes all events from the element(s).
    *
    * @param eventType A string containing one or more DOM event types, such as "click" or "submit," or custom event names.
    * @param selector A string defining the descendant elements are listening for the event.
    * @param handler A function handler assigned to this event.
    * @param useCapture Setting the third argument to true will trigger event bubbling. The default is false.
    * @return ChocolateChipStatic
    */
  def off(): ChocolateChipStatic = js.native
  def off(eventType: String): ChocolateChipStatic = js.native
  def off(eventType: String, selector: js.Any): ChocolateChipStatic = js.native
  def off(eventType: String, selector: js.Any, handler: js.Function1[/* eventObject */ Event_, _]): ChocolateChipStatic = js.native
  def off(
    eventType: String,
    selector: js.Any,
    handler: js.Function1[/* eventObject */ Event_, _],
    capturePhase: Boolean
  ): ChocolateChipStatic = js.native
  def off(eventType: ChUIEventInterface): ChocolateChipStatic = js.native
  def off(eventType: ChUIEventInterface, selector: js.Any): ChocolateChipStatic = js.native
  def off(
    eventType: ChUIEventInterface,
    selector: js.Any,
    handler: js.Function1[/* eventObject */ Event_, _]
  ): ChocolateChipStatic = js.native
  def off(
    eventType: ChUIEventInterface,
    selector: js.Any,
    handler: js.Function1[/* eventObject */ Event_, _],
    capturePhase: Boolean
  ): ChocolateChipStatic = js.native
  /**
    * Add a handler to an event for elements. If a selector is provided as the second argument, this implements a delegated event.
    *
    * @param eventType A string containing one or more DOM event types, such as "click" or "submit," or custom event names.
    * @param selector A string defining the descendant elements are listening for the event.
    * @param handler A function handler assigned to this event.
    * @param useCapture Setting the third argument to true will trigger event bubbling. The default is false.
    * @return ChocolateChipStatic
    */
  def on(eventType: String, selector: js.Any): ChocolateChipStatic = js.native
  def on(eventType: String, selector: js.Any, handler: js.Function1[/* eventObject */ Event_, _]): ChocolateChipStatic = js.native
  def on(
    eventType: String,
    selector: js.Any,
    handler: js.Function1[/* eventObject */ Event_, _],
    capturePhase: Boolean
  ): ChocolateChipStatic = js.native
  def on(eventType: ChUIEventInterface, selector: js.Any): ChocolateChipStatic = js.native
  def on(
    eventType: ChUIEventInterface,
    selector: js.Any,
    handler: js.Function1[/* eventObject */ Event_, _]
  ): ChocolateChipStatic = js.native
  def on(
    eventType: ChUIEventInterface,
    selector: js.Any,
    handler: js.Function1[/* eventObject */ Event_, _],
    capturePhase: Boolean
  ): ChocolateChipStatic = js.native
  /**
    *
    */
  def trigger(eventType: String): Unit = js.native
  def trigger(eventType: ChUIEventInterface): Unit = js.native
  /**
    * Remove a handler for an event from the elements.
    *
    * @param eventType A string containing one or more DOM event types, such as "click" or "submit," or custom event names.
    * @param handler A function to execute each time the event is triggered.
    * @param useCapture Setting the third argument to true will trigger event bubbling. The default is false.
    * @return ChocolateChipStatic
    */
  def unbind(eventType: String, handler: js.Function1[/* eventObject */ Event_, _]): ChocolateChipStatic = js.native
  def unbind(eventType: String, handler: js.Function1[/* eventObject */ Event_, _], useCapture: Boolean): ChocolateChipStatic = js.native
  def unbind(eventType: ChUIEventInterface, handler: js.Function1[/* eventObject */ Event_, _]): ChocolateChipStatic = js.native
  def unbind(
    eventType: ChUIEventInterface,
    handler: js.Function1[/* eventObject */ Event_, _],
    useCapture: Boolean
  ): ChocolateChipStatic = js.native
  /**
    * Add a delegated event to listen for the provided event on the descendant elements.
    *
    * @param selector A string defining the descendant elements are listening for the event.
    * @param eventType A string containing one or more DOM event types, such as "click" or "submit," or custom event names.
    * @param handler A function handler assigned to this event.
    * @param useCapture Setting the third argument to true will trigger event bubbling. The default is false.
    * @return ChocolateChipStatic
    */
  def undelegate(selector: js.Any, eventType: String, handler: js.Function1[/* eventObject */ Event_, _]): ChocolateChipStatic = js.native
  def undelegate(
    selector: js.Any,
    eventType: String,
    handler: js.Function1[/* eventObject */ Event_, _],
    useCapture: Boolean
  ): ChocolateChipStatic = js.native
  def undelegate(
    selector: js.Any,
    eventType: ChUIEventInterface,
    handler: js.Function1[/* eventObject */ Event_, _]
  ): ChocolateChipStatic = js.native
  def undelegate(
    selector: js.Any,
    eventType: ChUIEventInterface,
    handler: js.Function1[/* eventObject */ Event_, _],
    useCapture: Boolean
  ): ChocolateChipStatic = js.native
}

