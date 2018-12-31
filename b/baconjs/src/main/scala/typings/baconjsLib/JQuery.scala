package typings
package baconjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
    * @method
    * @description Creates an [EventStream]{@link Bacon.EventStream} from events on a jQuery or Zepto.js object.
    * @param {string} eventName
    * @returns {EventStream<ErrorEvent, JQueryEventObject>}
    * @example
    * $("#my-div").asEventStream("click");
    */
  def asEventStream(eventName: java.lang.String): baconjsLib.BaconNs.EventStream[stdLib.ErrorEvent, jqueryLib.JQueryEventObject] = js.native
  /**
    * @method
    * @description Creates an [EventStream]{@link Bacon.EventStream} from events on a jQuery or Zepto.js object. You can pass an argument to add a jQuery live `selector`.
    * @param {string} eventName
    * @param {string} selector
    * @returns {EventStream<ErrorEvent, JQueryEventObject>}
    * @example
    * $("#my-div").asEventStream("click", ".more-specific-selector");
    */
  def asEventStream(eventName: java.lang.String, selector: java.lang.String): baconjsLib.BaconNs.EventStream[stdLib.ErrorEvent, jqueryLib.JQueryEventObject] = js.native
  /**
    * @callback JQuery#asEventStream1~f
    * @param {JQueryEventObject} event
    * @param {*[]} args
    * @returns {A}
    */
  /**
    * @method JQuery#asEventStream1
    * @description Creates an [EventStream]{@link Bacon.EventStream} from events on a jQuery or Zepto.js object. You can pass an argument to add a function `f` that processes the jQuery event and its parameters.
    * @param {string} eventName
    * @param {JQuery#asEventStream1~f} f
    * @returns {EventStream<ErrorEvent, A>}
    * @example
    * $("#my-div").asEventStream("click", (event, args) => args[0]);
    */
  def asEventStream[A](
    eventName: java.lang.String,
    f: js.Function2[/* event */ jqueryLib.JQueryEventObject, /* args */ js.Array[_], A]
  ): baconjsLib.BaconNs.EventStream[stdLib.ErrorEvent, A] = js.native
  /**
    * @callback JQuery#asEventStream2~f
    * @param {JQueryEventObject} event
    * @param {*[]} args
    * @returns {A}
    */
  /**
    * @method JQuery#asEventStream2
    * @description Creates an [EventStream]{@link Bacon.EventStream} from events on a jQuery or Zepto.js object. You can pass an argument to add a jQuery live `selector` and a function `f` that processes the jQuery event and its parameters.
    * @param {string} eventName
    * @param {string} selector
    * @param {JQuery#asEventStream2~f} f
    * @returns {Bacon.EventStream<ErrorEvent, A>}
    * @example
    * $("#my-div").asEventStream("click", ".more-specific-selector", (event, args) => args[0]);
    */
  def asEventStream[A](
    eventName: java.lang.String,
    selector: java.lang.String,
    f: js.Function2[/* event */ jqueryLib.JQueryEventObject, /* args */ js.Array[_], A]
  ): baconjsLib.BaconNs.EventStream[stdLib.ErrorEvent, A] = js.native
}

