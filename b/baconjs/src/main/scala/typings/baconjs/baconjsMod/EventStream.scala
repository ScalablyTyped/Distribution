package typings.baconjs.baconjsMod

import org.scalablytyped.runtime.Instantiable1
import typings.baconjs.BaconNs.More
import typings.baconjs.BaconNs.NoMore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "EventStream")
@js.native
class EventStreamCls[E, A] protected ()
  extends typings.baconjs.BaconNs.EventStream[E, A] {
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
          /* value */ More | NoMore | A | typings.baconjs.BaconNs.Initial[A] | typings.baconjs.BaconNs.Next[A] | typings.baconjs.BaconNs.End[A] | typings.baconjs.BaconNs.Error[E] | (js.Array[
            A | typings.baconjs.BaconNs.Initial[A] | typings.baconjs.BaconNs.Next[A] | typings.baconjs.BaconNs.End[A] | typings.baconjs.BaconNs.Error[E]
          ]), 
          Unit
        ], 
        js.Function0[Unit]
      ]) = this()
}

@JSImport("baconjs", "EventStream")
@js.native
object EventStream
  extends /**
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
Instantiable1[
      /* subscribe */ js.Function1[
        /* sink */ js.Function1[
          /* value */ More | NoMore | js.Object | typings.baconjs.BaconNs.Initial[js.Object] | typings.baconjs.BaconNs.Next[js.Object] | typings.baconjs.BaconNs.End[js.Object] | typings.baconjs.BaconNs.Error[js.Object] | (js.Array[
            js.Object | typings.baconjs.BaconNs.Initial[js.Object] | typings.baconjs.BaconNs.Next[js.Object] | typings.baconjs.BaconNs.End[js.Object] | typings.baconjs.BaconNs.Error[js.Object]
          ]), 
          Unit
        ], 
        js.Function0[Unit]
      ], 
      typings.baconjs.BaconNs.EventStream[js.Object, js.Object]
    ]

