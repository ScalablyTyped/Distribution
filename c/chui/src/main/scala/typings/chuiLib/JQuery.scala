package typings
package chuiLib

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
  def UIBusy(): scala.Unit = js.native
  def UIBusy(options: Anon_Color): scala.Unit = js.native
  /**
    * Center an element to the screen.
    *
    * @return void
    */
  def UICenter(): scala.Unit = js.native
  /**
    * Make a list editable. This can be enabling changing the order of list items, or deleting them, or both. Options: {editLabel: "Edit", doneLabel: "Done",
    * deleteLabel: "Delete", callback: function() {alert('Bye bye!');}, deletable: true, movable: true}.
    *
    * @return void
    */
  def UIEditList(): scala.Unit = js.native
  def UIEditList(options: Anon_EditLabel): scala.Unit = js.native
  /**
    * This method allows the user to use a segmented control to toggle a set of panels. It is executed on the segmented control.
    * The options id is the contain of the panels. The options callback is to execute when the user toggles a panel.
    *
    * @return void
    */
  def UIPanelToggle(panelsContainer: java.lang.String, callback: js.Function0[_]): scala.Unit = js.native
  /**
    * Close the currently displayed Popup. This is executed on the popup: $('#myPopup').UIPopupClose().
    *
    * @return void
    */
  def UIPopupClose(): scala.Unit = js.native
  /**
    * Execute this on a range control to initialize it.
    *
    * @return void
    */
  def UIRange(): scala.Unit = js.native
  /**
    * Initialize a segmented control. Options: {selected: 2, callback: function() {console.log('Blah');}}
    *
    * @return void
    */
  def UISegmented(): scala.Unit = js.native
  def UISegmented(options: Anon_CallbackSelected): scala.Unit = js.native
  /**
    * Convert a simple list into a selection list. This converts the list into a radio button group, meaning only one can be selected at any time.
    * You can name the radios buttons using the options name. Options: {name: "selectedNamesGroup", selected: 2, callback: function() {alert('hi');}}
    *
    * @return void
    */
  def UISelectList(): scala.Unit = js.native
  def UISelectList(options: Anon_Callback): scala.Unit = js.native
  /**
    * Create a stepper control by executing it on a span with the class "stepper". Possible options: {start: 0, end: 10, defaultValue: 3}.
    *
    * @return void
    */
  def UIStepper(options: Anon_DefaultValue): scala.Unit = js.native
  /**
    * Initialize any existing switch controls: $('.switch').UISwitch();
    *
    * @return void
    */
  def UISwitch(): scala.Unit = js.native
  def bind(
    eventType: ChUIEventInterface,
    eventData: js.Any,
    handler: js.Function1[/* eventObject */ JQueryEventObject, _]
  ): JQuery = js.native
  def bind(eventType: ChUIEventInterface, eventData: js.Any, preventBubble: scala.Boolean): JQuery = js.native
  def bind(eventType: ChUIEventInterface, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): JQuery = js.native
  def bind(eventType: ChUIEventInterface, preventBubble: scala.Boolean): JQuery = js.native
  /**
    * Attach a handler to an event for the elements.
    *
    * @param eventType A string containing one or more DOM event types, such as "click" or "submit," or custom event names.
    * @param eventData An object containing data that will be passed to the event handler.
    * @param handler A function to execute each time the event is triggered.
    */
  def bind(
    eventType: java.lang.String,
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
  def bind(eventType: java.lang.String, eventData: js.Any, preventBubble: scala.Boolean): JQuery = js.native
  /**
    * Attach a handler to an event for the elements.
    *
    * @param eventType A string containing one or more DOM event types, such as "click" or "submit," or custom event names.
    * @param handler A function to execute each time the event is triggered.
    * @return JQuery
    */
  def bind(eventType: java.lang.String, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): JQuery = js.native
  /**
    * Attach a handler to an event for the elements.
    *
    * @param eventType A string containing one or more DOM event types, such as "click" or "submit," or custom event names.
    * @param preventBubble Setting the third argument to false will attach a function that prevents the default action from occurring and stops the event from bubbling. The default is true.
    * @return JQuery
    */
  def bind(eventType: java.lang.String, preventBubble: scala.Boolean): JQuery = js.native
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
  def delegate(
    selector: js.Any,
    eventType: java.lang.String,
    eventData: js.Any,
    handler: js.Function1[/* eventObject */ JQueryEventObject, _]
  ): JQuery = js.native
  def delegate(
    selector: js.Any,
    eventType: java.lang.String,
    handler: js.Function1[/* eventObject */ JQueryEventObject, _]
  ): JQuery = js.native
  /**
    * Iterate over an Array object, executing a function for each matched element.
    *
    * @param callback A function to execute while looping over an interable. This takes to arguments: ctx: HTMLElement and idx: number.
    * @return JQuery
    */
  def forEach(callback: js.Function2[/* ctx */ stdLib.HTMLElement, /* idx */ scala.Double, _]): JQuery = js.native
  /**
    * Reduce the set of matched elements to those that have a descendant that matches the selector or DOM element.
    *
    * @param contained A DOM element to match elements against.
    * @return JQuery
    */
  def haz(contained: stdLib.HTMLElement): JQuery = js.native
  /**
    * Reduce the set of matched elements to those that have a descendant that matches the selector or DOM element.
    *
    * @param selector A string containing a selector expression to match elements against.
    * @return JQuery
    */
  def haz(selector: java.lang.String): JQuery = js.native
  /**
    * Return any of the matched elements that have the given attribute.
    *
    * @param className The class name to search for.
    * @return JQuery
    */
  def hazAttr(attributeName: java.lang.String): JQuery = js.native
  /**
    * Return any of the matched elements that have the given class.
    *
    * @param className The class name to search for.
    * @return JQuery
    */
  def hazClass(className: java.lang.String): JQuery = js.native
  /**
    * Reduce the set of matched elements to those that have a descendant that does not match the selector or DOM element.
    *
    * @param contained A DOM element to match elements against.
    * @return JQuery
    */
  def haznt(contained: stdLib.HTMLElement): JQuery = js.native
  /**
    * Reduce the set of matched elements to those that have a descendant that does not match the selector or DOM element.
    *
    * @param selector A string containing a selector expression to match elements against.
    * @return JQuery
    */
  def haznt(selector: java.lang.String): JQuery = js.native
  /**
    * Return any of the matched elements that do not have the given attribute.
    *
    * @param className The class name to search for.
    * @return JQuery
    */
  def hazntAttr(attributeName: java.lang.String): JQuery = js.native
  /**
    * Return any of the matched elements that do not have the given class.
    *
    * @param className The class name to search for.
    * @return JQuery
    */
  def hazntClass(className: java.lang.String): JQuery = js.native
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
  def iz(selector: java.lang.String): JQuery = js.native
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
  def iznt(selector: java.lang.String): JQuery = js.native
  def off(events: ChUIEventInterface): JQuery = js.native
  def off(events: ChUIEventInterface, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): JQuery = js.native
  def off(events: ChUIEventInterface, selector: java.lang.String): JQuery = js.native
  def off(
    events: ChUIEventInterface,
    selector: java.lang.String,
    handler: js.Function1[/* eventObject */ JQueryEventObject, _]
  ): JQuery = js.native
  /**
    * Remove an event handler.
    *
    * @param events One or more space-separated event types and optional namespaces, or just namespaces, such as "click", "keydown.myPlugin", or ".myPlugin".
    * @param selector A selector which should match the one originally passed to .on() when attaching event handlers.
    * @param handler A handler function previously attached for the event(s), or the special value false.
    * @return JQuery
    */
  def off(events: java.lang.String): JQuery = js.native
  /**
    * Remove an event handler.
    *
    * @param events One or more space-separated event types and optional namespaces, or just namespaces, such as "click", "keydown.myPlugin", or ".myPlugin".
    * @param handler A handler function previously attached for the event(s), or the special value false.
    * @return JQuery
    */
  def off(events: java.lang.String, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): JQuery = js.native
  def off(events: java.lang.String, selector: java.lang.String): JQuery = js.native
  def off(
    events: java.lang.String,
    selector: java.lang.String,
    handler: js.Function1[/* eventObject */ JQueryEventObject, _]
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
    selector: java.lang.String,
    data: js.Any,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  def on(
    events: ChUIEventInterface,
    selector: java.lang.String,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
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
    events: java.lang.String,
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
    events: java.lang.String,
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
    events: java.lang.String,
    selector: java.lang.String,
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
    events: java.lang.String,
    selector: java.lang.String,
    handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  def one(
    events: ChUIEventInterface,
    data: js.Object,
    handler: js.Function1[/* eventObject */ JQueryEventObject, _]
  ): JQuery = js.native
  def one(events: ChUIEventInterface, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): JQuery = js.native
  def one(
    events: ChUIEventInterface,
    selector: java.lang.String,
    data: js.Any,
    handler: js.Function1[/* eventObject */ JQueryEventObject, _]
  ): JQuery = js.native
  def one(
    events: ChUIEventInterface,
    selector: java.lang.String,
    handler: js.Function1[/* eventObject */ JQueryEventObject, _]
  ): JQuery = js.native
  /**
    * Attach a handler to an event for the elements. The handler is executed at most once per element per event type.
    *
    * @param events A string containing one or more JavaScript event types, such as "click" or "submit," or custom event names.
    * @param data An object containing data that will be passed to the event handler.
    * @param handler A function to execute at the time the event is triggered.
    * @return JQuery
    */
  def one(
    events: java.lang.String,
    data: js.Object,
    handler: js.Function1[/* eventObject */ JQueryEventObject, _]
  ): JQuery = js.native
  /**
    * Attach a handler to an event for the elements. The handler is executed at most once per element per event type.
    *
    * @param events A string containing one or more JavaScript event types, such as "click" or "submit," or custom event names.
    * @param handler A function to execute at the time the event is triggered.
    * @return JQuery
    */
  def one(events: java.lang.String, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): JQuery = js.native
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
    events: java.lang.String,
    selector: java.lang.String,
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
  def one(
    events: java.lang.String,
    selector: java.lang.String,
    handler: js.Function1[/* eventObject */ JQueryEventObject, _]
  ): JQuery = js.native
  def trigger(eventType: ChUIEventInterface): JQuery = js.native
  def trigger(eventType: ChUIEventInterface, extraParameters: js.Array[_]): JQuery = js.native
  def trigger(eventType: ChUIEventInterface, extraParameters: js.Object): JQuery = js.native
  /**
    * Execute all handlers and behaviors attached to the matched elements for the given event type.
    *
    * @param eventType A string containing a JavaScript event type, such as click or submit.
    * @param extraParameters Additional parameters to pass along to the event handler.
    * @return JQuery
    */
  def trigger(eventType: java.lang.String): JQuery = js.native
  def trigger(eventType: java.lang.String, extraParameters: js.Array[_]): JQuery = js.native
  def trigger(eventType: java.lang.String, extraParameters: js.Object): JQuery = js.native
  def triggerHandler(eventType: ChUIEventInterface, extraParameters: js.Any*): js.Object = js.native
  /**
    * Execute all handlers attached to an element for an event.
    *
    * @param eventType A string containing a JavaScript event type, such as click or submit.
    * @param extraParameters An array of additional parameters to pass along to the event handler.
    * @return Object
    */
  def triggerHandler(eventType: java.lang.String, extraParameters: js.Any*): js.Object = js.native
  /**
    * Remove a previously-attached event handler from the elements.
    *
    * @param eventType A string containing a JavaScript event type, such as click or submit.
    * @param handler The function that is to be no longer executed.
    * @return JQuery
    */
  def unbind(): JQuery = js.native
  def unbind(eventType: ChUIEventInterface): JQuery = js.native
  def unbind(eventType: ChUIEventInterface, fls: scala.Boolean): JQuery = js.native
  def unbind(eventType: ChUIEventInterface, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): JQuery = js.native
  def unbind(eventType: java.lang.String): JQuery = js.native
  /**
    * Remove a previously-attached event handler from the elements.
    *
    * @param eventType A string containing a JavaScript event type, such as click or submit.
    * @param fls Unbinds the corresponding 'return false' function that was bound using .bind( eventType, false ).
    * @return JQuery
    */
  def unbind(eventType: java.lang.String, fls: scala.Boolean): JQuery = js.native
  def unbind(eventType: java.lang.String, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): JQuery = js.native
  def undelegate(selector: ChUIEventInterface, eventType: java.lang.String): JQuery = js.native
  def undelegate(
    selector: ChUIEventInterface,
    eventType: java.lang.String,
    handler: js.Function1[/* eventObject */ JQueryEventObject, _]
  ): JQuery = js.native
  def undelegate(selector: ChUIEventInterface, events: js.Object): JQuery = js.native
  /**
    * Remove a handler from the event for all elements which match the current selector, based upon a specific set of root elements.
    *
    * @param selector A selector which will be used to filter the event results.
    * @param eventType A string containing a JavaScript event type, such as "click" or "keydown"
    * @param handler A function to execute at the time the event is triggered.
    * @return JQuery
    */
  def undelegate(selector: java.lang.String, eventType: java.lang.String): JQuery = js.native
  def undelegate(
    selector: java.lang.String,
    eventType: java.lang.String,
    handler: js.Function1[/* eventObject */ JQueryEventObject, _]
  ): JQuery = js.native
  /**
    * Remove a handler from the event for all elements which match the current selector, based upon a specific set of root elements.
    *
    * @param selector A selector which will be used to filter the event results.
    * @param events An object of one or more event types and previously bound functions to unbind from them.
    * @return JQuery
    */
  def undelegate(selector: java.lang.String, events: js.Object): JQuery = js.native
}

