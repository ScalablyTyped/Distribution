package typings.chui

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for jQuery
  */
@js.native
trait JQuery extends js.Object {
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
  def UIBusy(options: Anon_Color): Unit = js.native
  /**
    * Center an element to the screen.
    *
    * @return void
    */
  def UICenter(): Unit = js.native
  /**
    * Make a list editable. This can be enabling changing the order of list items, or deleting them, or both. Options: {editLabel: "Edit", doneLabel: "Done",
    * deleteLabel: "Delete", callback: function() {alert('Bye bye!');}, deletable: true, movable: true}.
    *
    * @return void
    */
  def UIEditList(): Unit = js.native
  def UIEditList(options: Anon_CallbackDeletable): Unit = js.native
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
  def UISegmented(options: Anon_CallbackSelected): Unit = js.native
  /**
    * Convert a simple list into a selection list. This converts the list into a radio button group, meaning only one can be selected at any time.
    * You can name the radios buttons using the options name. Options: {name: "selectedNamesGroup", selected: 2, callback: function() {alert('hi');}}
    *
    * @return void
    */
  def UISelectList(): Unit = js.native
  def UISelectList(options: Anon_CallbackName): Unit = js.native
  /**
    * Create a stepper control by executing it on a span with the class "stepper". Possible options: {start: 0, end: 10, defaultValue: 3}.
    *
    * @return void
    */
  def UIStepper(options: Anon_DefaultValue): Unit = js.native
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
    * @param eventData An object containing data that will be passed to the event handler.
    * @param handler A function to execute each time the event is triggered.
    */
  def bind(
    eventType: String,
    eventData: js.Any,
    handler: js.Function1[/* eventObject */ JQueryEventObject, _]
  ): JQuery = js.native
  /**
    * Attach a handler to an event for the elements.
    *
    * @param eventType A string containing one or more DOM event types, such as "click" or "submit," or custom event names.
    * @param eventData An object containing data that will be passed to the event handler.
    * @param preventBubble Setting the third argument to false will attach a function that prevents the default action from occurring and stops the event from bubbling. The default is true.
    * @return JQuery
    */
  def bind(eventType: String, eventData: js.Any, preventBubble: Boolean): JQuery = js.native
  /**
    * Attach a handler to an event for the elements.
    *
    * @param eventType A string containing one or more DOM event types, such as "click" or "submit," or custom event names.
    * @param handler A function to execute each time the event is triggered.
    * @return JQuery
    */
  def bind(eventType: String, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): JQuery = js.native
  /**
    * Attach a handler to an event for the elements.
    *
    * @param eventType A string containing one or more DOM event types, such as "click" or "submit," or custom event names.
    * @param preventBubble Setting the third argument to false will attach a function that prevents the default action from occurring and stops the event from bubbling. The default is true.
    * @return JQuery
    */
  def bind(eventType: String, preventBubble: Boolean): JQuery = js.native
  def bind(
    eventType: ChUIEventInterface,
    eventData: js.Any,
    handler: js.Function1[/* eventObject */ JQueryEventObject, _]
  ): JQuery = js.native
  def bind(eventType: ChUIEventInterface, eventData: js.Any, preventBubble: Boolean): JQuery = js.native
  def bind(eventType: ChUIEventInterface, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): JQuery = js.native
  def bind(eventType: ChUIEventInterface, preventBubble: Boolean): JQuery = js.native
  def delegate(
    selector: js.Any,
    eventType: String,
    eventData: js.Any,
    handler: js.Function1[/* eventObject */ JQueryEventObject, _]
  ): JQuery = js.native
  def delegate(selector: js.Any, eventType: String, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): JQuery = js.native
  def delegate(
    selector: js.Any,
    eventType: ChUIEventInterface,
    eventData: js.Any,
    handler: js.Function1[/* eventObject */ JQueryEventObject, _]
  ): JQuery = js.native
  def delegate(
    selector: js.Any,
    eventType: ChUIEventInterface,
    handler: js.Function1[/* eventObject */ JQueryEventObject, _]
  ): JQuery = js.native
  /**
    * Iterate over an Array object, executing a function for each matched element.
    *
    * @param callback A function to execute while looping over an interable. This takes to arguments: ctx: HTMLElement and idx: number.
    * @return JQuery
    */
  def forEach(callback: js.Function2[/* ctx */ HTMLElement, /* idx */ Double, _]): JQuery = js.native
  /**
    * Reduce the set of matched elements to those that have a descendant that matches the selector or DOM element.
    *
    * @param contained A DOM element to match elements against.
    * @return JQuery
    */
  def haz(contained: HTMLElement): JQuery = js.native
  /**
    * Reduce the set of matched elements to those that have a descendant that matches the selector or DOM element.
    *
    * @param selector A string containing a selector expression to match elements against.
    * @return JQuery
    */
  def haz(selector: String): JQuery = js.native
  /**
    * Return any of the matched elements that have the given attribute.
    *
    * @param className The class name to search for.
    * @return JQuery
    */
  def hazAttr(attributeName: String): JQuery = js.native
  /**
    * Return any of the matched elements that have the given class.
    *
    * @param className The class name to search for.
    * @return JQuery
    */
  def hazClass(className: String): JQuery = js.native
  /**
    * Reduce the set of matched elements to those that have a descendant that does not match the selector or DOM element.
    *
    * @param contained A DOM element to match elements against.
    * @return JQuery
    */
  def haznt(contained: HTMLElement): JQuery = js.native
  /**
    * Reduce the set of matched elements to those that have a descendant that does not match the selector or DOM element.
    *
    * @param selector A string containing a selector expression to match elements against.
    * @return JQuery
    */
  def haznt(selector: String): JQuery = js.native
  /**
    * Return any of the matched elements that do not have the given attribute.
    *
    * @param className The class name to search for.
    * @return JQuery
    */
  def hazntAttr(attributeName: String): JQuery = js.native
  /**
    * Return any of the matched elements that do not have the given class.
    *
    * @param className The class name to search for.
    * @return JQuery
    */
  def hazntClass(className: String): JQuery = js.native
  /**
    * Check the current matched set of elements against a selector or element and return it
    * if it matches the given arguments.
    *
    * @param elements One or more elements to match the current set of elements against.
    * @return JQuery
    */
  def iz(element: js.Any): JQuery = js.native
  /**
    * Check the current matched set of elements against a selector or element and return it
    * if it matches the given arguments.
    *
    * @param selector A string containing a selector expression to match elements against.
    * @return JQuery
    */
  def iz(selector: String): JQuery = js.native
  /**
    * Check the current matched set of elements against a selector or element and return it
    * if it does not match the given arguments.
    *
    * @param elements One or more elements to match the current set of elements against.
    * @return JQuery
    */
  def iznt(element: js.Any): JQuery = js.native
  /**
    * Check the current matched set of elements against a selector or element and return it
    * if it does not match the given arguments.
    *
    * @param selector A string containing a selector expression to match elements against.
    * @return JQuery
    */
  def iznt(selector: String): JQuery = js.native
  /**
    * Remove an event handler.
    *
    * @param events One or more space-separated event types and optional namespaces, or just namespaces, such as "click", "keydown.myPlugin", or ".myPlugin".
    * @param selector A selector which should match the one originally passed to .on() when attaching event handlers.
    * @param handler A handler function previously attached for the event(s), or the special value false.
    * @return JQuery
    */
  def off(events: String): JQuery = js.native
  /**
    * Remove an event handler.
    *
    * @param events One or more space-separated event types and optional namespaces, or just namespaces, such as "click", "keydown.myPlugin", or ".myPlugin".
    * @param handler A handler function previously attached for the event(s), or the special value false.
    * @return JQuery
    */
  def off(events: String, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): JQuery = js.native
  def off(events: String, selector: String): JQuery = js.native
  def off(events: String, selector: String, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): JQuery = js.native
  def off(events: ChUIEventInterface): JQuery = js.native
  def off(events: ChUIEventInterface, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): JQuery = js.native
  def off(events: ChUIEventInterface, selector: String): JQuery = js.native
  def off(
    events: ChUIEventInterface,
    selector: String,
    handler: js.Function1[/* eventObject */ JQueryEventObject, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for one or more events to the selected elements.
    *
    * @param events One or more space-separated event types and optional namespaces, such as "click" or "keydown.myPlugin".
    * @param data Data to be passed to the handler in event.data when an event is triggered.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
    * @return JQuery
    */
  def on(
    events: String,
    data: js.Any,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for one or more events to the selected elements.
    *
    * @param events One or more space-separated event types and optional namespaces, such as "click" or "keydown.myPlugin".
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false. Rest parameter args is for optional parameters passed to jQuery.trigger(). Note that the actual parameters on the event handler function must be marked as optional (? syntax).
    * @return JQuery
    */
  def on(
    events: String,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for one or more events to the selected elements.
    *
    * @param events One or more space-separated event types and optional namespaces, such as "click" or "keydown.myPlugin".
    * @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the selector is null or omitted, the event is always triggered when it reaches the selected element.
    * @param data Data to be passed to the handler in event.data when an event is triggered.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
    * @return JQuery
    */
  def on(
    events: String,
    selector: String,
    data: js.Any,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach an event handler function for one or more events to the selected elements.
    *
    * @param events One or more space-separated event types and optional namespaces, such as "click" or "keydown.myPlugin".
    * @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the selector is null or omitted, the event is always triggered when it reaches the selected element.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
    * @return JQuery
    */
  def on(
    events: String,
    selector: String,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  def on(
    events: ChUIEventInterface,
    data: js.Any,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  def on(
    events: ChUIEventInterface,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  def on(
    events: ChUIEventInterface,
    selector: String,
    data: js.Any,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  def on(
    events: ChUIEventInterface,
    selector: String,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  /**
    * Attach a handler to an event for the elements. The handler is executed at most once per element per event type.
    *
    * @param events A string containing one or more JavaScript event types, such as "click" or "submit," or custom event names.
    * @param data An object containing data that will be passed to the event handler.
    * @param handler A function to execute at the time the event is triggered.
    * @return JQuery
    */
  def one(events: String, data: js.Object, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): JQuery = js.native
  /**
    * Attach a handler to an event for the elements. The handler is executed at most once per element per event type.
    *
    * @param events A string containing one or more JavaScript event types, such as "click" or "submit," or custom event names.
    * @param handler A function to execute at the time the event is triggered.
    * @return JQuery
    */
  def one(events: String, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): JQuery = js.native
  /**
    * Attach a handler to an event for the elements. The handler is executed at most once per element per event type.
    *
    * @param events One or more space-separated event types and optional namespaces, such as "click" or "keydown.myPlugin".
    * @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the selector is null or omitted, the event is always triggered when it reaches the selected element.
    * @param data Data to be passed to the handler in event.data when an event is triggered.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
    * @return JQuery
    */
  def one(
    events: String,
    selector: String,
    data: js.Any,
    handler: js.Function1[/* eventObject */ JQueryEventObject, _]
  ): JQuery = js.native
  /**
    * Attach a handler to an event for the elements. The handler is executed at most once per element per event type.
    *
    * @param events One or more space-separated event types and optional namespaces, such as "click" or "keydown.myPlugin".
    * @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the selector is null or omitted, the event is always triggered when it reaches the selected element.
    * @param handler A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
    * @return JQuery
    */
  def one(events: String, selector: String, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): JQuery = js.native
  def one(
    events: ChUIEventInterface,
    data: js.Object,
    handler: js.Function1[/* eventObject */ JQueryEventObject, _]
  ): JQuery = js.native
  def one(events: ChUIEventInterface, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): JQuery = js.native
  def one(
    events: ChUIEventInterface,
    selector: String,
    data: js.Any,
    handler: js.Function1[/* eventObject */ JQueryEventObject, _]
  ): JQuery = js.native
  def one(
    events: ChUIEventInterface,
    selector: String,
    handler: js.Function1[/* eventObject */ JQueryEventObject, _]
  ): JQuery = js.native
  /**
    * Execute all handlers and behaviors attached to the matched elements for the given event type.
    *
    * @param eventType A string containing a JavaScript event type, such as click or submit.
    * @param extraParameters Additional parameters to pass along to the event handler.
    * @return JQuery
    */
  def trigger(eventType: String): JQuery = js.native
  def trigger(eventType: String, extraParameters: js.Array[_]): JQuery = js.native
  def trigger(eventType: String, extraParameters: js.Object): JQuery = js.native
  def trigger(eventType: ChUIEventInterface): JQuery = js.native
  def trigger(eventType: ChUIEventInterface, extraParameters: js.Array[_]): JQuery = js.native
  def trigger(eventType: ChUIEventInterface, extraParameters: js.Object): JQuery = js.native
  /**
    * Execute all handlers attached to an element for an event.
    *
    * @param eventType A string containing a JavaScript event type, such as click or submit.
    * @param extraParameters An array of additional parameters to pass along to the event handler.
    * @return Object
    */
  def triggerHandler(eventType: String, extraParameters: js.Any*): js.Object = js.native
  def triggerHandler(eventType: ChUIEventInterface, extraParameters: js.Any*): js.Object = js.native
  /**
    * Remove a previously-attached event handler from the elements.
    *
    * @param eventType A string containing a JavaScript event type, such as click or submit.
    * @param handler The function that is to be no longer executed.
    * @return JQuery
    */
  def unbind(): JQuery = js.native
  def unbind(eventType: String): JQuery = js.native
  /**
    * Remove a previously-attached event handler from the elements.
    *
    * @param eventType A string containing a JavaScript event type, such as click or submit.
    * @param fls Unbinds the corresponding 'return false' function that was bound using .bind( eventType, false ).
    * @return JQuery
    */
  def unbind(eventType: String, fls: Boolean): JQuery = js.native
  def unbind(eventType: String, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): JQuery = js.native
  def unbind(eventType: ChUIEventInterface): JQuery = js.native
  def unbind(eventType: ChUIEventInterface, fls: Boolean): JQuery = js.native
  def unbind(eventType: ChUIEventInterface, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): JQuery = js.native
  /**
    * Remove a handler from the event for all elements which match the current selector, based upon a specific set of root elements.
    *
    * @param selector A selector which will be used to filter the event results.
    * @param eventType A string containing a JavaScript event type, such as "click" or "keydown"
    * @param handler A function to execute at the time the event is triggered.
    * @return JQuery
    */
  def undelegate(selector: String, eventType: String): JQuery = js.native
  def undelegate(selector: String, eventType: String, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): JQuery = js.native
  /**
    * Remove a handler from the event for all elements which match the current selector, based upon a specific set of root elements.
    *
    * @param selector A selector which will be used to filter the event results.
    * @param events An object of one or more event types and previously bound functions to unbind from them.
    * @return JQuery
    */
  def undelegate(selector: String, events: js.Object): JQuery = js.native
  def undelegate(selector: ChUIEventInterface, eventType: String): JQuery = js.native
  def undelegate(
    selector: ChUIEventInterface,
    eventType: String,
    handler: js.Function1[/* eventObject */ JQueryEventObject, _]
  ): JQuery = js.native
  def undelegate(selector: ChUIEventInterface, events: js.Object): JQuery = js.native
}

