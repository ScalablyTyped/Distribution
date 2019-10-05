package typings.baconjs.baconjsMod

import org.scalablytyped.runtime.Instantiable1
import typings.baconjs.Bacon.More
import typings.baconjs.Bacon.NoMore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
          /* value */ More | NoMore | js.Object | typings.baconjs.Bacon.Initial[js.Object] | typings.baconjs.Bacon.Next[js.Object] | typings.baconjs.Bacon.End[js.Object] | typings.baconjs.Bacon.Error[js.Object] | (js.Array[
            js.Object | typings.baconjs.Bacon.Initial[js.Object] | typings.baconjs.Bacon.Next[js.Object] | typings.baconjs.Bacon.End[js.Object] | typings.baconjs.Bacon.Error[js.Object]
          ]), 
          Unit
        ], 
        js.Function0[Unit]
      ], 
      typings.baconjs.Bacon.EventStream[js.Object, js.Object]
    ]

