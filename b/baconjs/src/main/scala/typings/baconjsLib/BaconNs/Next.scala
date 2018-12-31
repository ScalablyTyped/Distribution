package typings
package baconjsLib.BaconNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class Next
  * @augments Bacon.Event
  * @description Next value in an [EventStream]{@link Bacon.EventStream} or a [Property]{@link Bacon.Property}. Call [Event.isNext]{@link Bacon.Event#isNext} to distinguish a Next event from other events.
  * */
@JSGlobal("Bacon.Next")
@js.native
class Next[A] protected () extends Event[A] {
  /**
    * @callback Next#constructor
    * @returns {A}
    */
  /**
    * @constructor Next#constructor
    * @constructs Bacon.Next
    * @description This version is safe only when you know that the actual value in the stream is not a function. The idea in using a function `f` instead of a plain value is that the internals on Bacon.js take advantage of lazy evaluation by deferring the evaluations of values created by `map`, `combine`.
    * @param {Next#constructor} f
    * @example
    * new Bacon.Next(() => "value");
    * */
  def this(f: js.Function0[A]) = this()
  /**
    * @constructor
    * @constructs Bacon.Next
    * @param {A} value
    * @example
    * new Bacon.Next("value");
    * */
  def this(value: A) = this()
}

