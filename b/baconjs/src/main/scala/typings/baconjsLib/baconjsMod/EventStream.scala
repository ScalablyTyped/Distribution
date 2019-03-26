package typings
package baconjsLib.baconjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "EventStream")
@js.native
class EventStreamCls[E, A] protected ()
  extends baconjsLib.BaconNs.EventStream[E, A] {
  /**
    * @callback EventStream#new~subscribe
    * @param {EventStream#new~sink} sink
    * @returns {EventStream#new~unsubscribe}
    */
  /**
    * @callback EventStream#new~sink
    * @param {More|NoMore|(A|Initial<A>|Next<A>|End<A>|Error<E>)|(A|Initial<A>|Next<A>|End<A>|Error<E>)[]} value
    * @returns {void}
    */
  /**
    * @callback EventStream#new~unsubscribe
    * @returns {void}
    */
  /**
    * @constructor EventStream#new
    * @constructs Bacon.EventStream
    * @description Creates an [EventStream]{@link Bacon.EventStream} with the given `subscribe` function.
    * @param {EventStream#new~subscribe} subscribe
    * @returns {EventStream<E, A>}
    */
  def this(subscribe: js.Function1[
      /* sink */ js.Function1[
        /* value */ baconjsLib.BaconNs.More | baconjsLib.BaconNs.NoMore | A | baconjsLib.BaconNs.Initial[A] | baconjsLib.BaconNs.Next[A] | baconjsLib.BaconNs.End[A] | baconjsLib.BaconNs.Error[E] | (js.Array[
          A | baconjsLib.BaconNs.Initial[A] | baconjsLib.BaconNs.Next[A] | baconjsLib.BaconNs.End[A] | baconjsLib.BaconNs.Error[E]
        ]), 
        scala.Unit
      ], 
      js.Function0[scala.Unit]
    ]) = this()
}

