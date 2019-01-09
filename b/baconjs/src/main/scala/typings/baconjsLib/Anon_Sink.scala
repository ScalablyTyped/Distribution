package typings
package baconjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Sink
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
org.scalablytyped.runtime.Instantiable1[
      /* subscribe */ js.Function1[
        /* sink */ js.Function1[
          /* value */ baconjsLib.BaconNs.More | baconjsLib.BaconNs.NoMore | js.Object | baconjsLib.BaconNs.Initial[js.Object] | baconjsLib.BaconNs.Next[js.Object] | baconjsLib.BaconNs.End[js.Object] | baconjsLib.BaconNs.Error[js.Object] | (js.Array[
            js.Object | baconjsLib.BaconNs.Initial[js.Object] | baconjsLib.BaconNs.Next[js.Object] | baconjsLib.BaconNs.End[js.Object] | baconjsLib.BaconNs.Error[js.Object]
          ]), 
          scala.Unit
        ], 
        js.Function0[scala.Unit]
      ], 
      baconjsLib.BaconNs.EventStream[js.Object, js.Object]
    ]

