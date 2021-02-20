package typings.baconjs

import typings.baconjs.eventMod.Event
import typings.baconjs.observableMod.EventStream
import typings.baconjs.replyMod.Reply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @JSImport("baconjs/types/types", "nullSink")
  @js.native
  val nullSink: Sink[js.Any] = js.native
  
  @JSImport("baconjs/types/types", "nullVoidSink")
  @js.native
  val nullVoidSink: VoidSink = js.native
  
  type EventSink[V] = js.Function1[/* event */ Event[V], Reply]
  
  type EventStreamDelay[V] = js.Function1[/* stream */ EventStream[V], EventStream[V]]
  
  type Function0[R] = js.Function0[R]
  
  type Function1[T1, R] = js.Function1[/* t1 */ T1, R]
  
  type Function2[T1, T2, R] = js.Function2[/* t1 */ T1, /* t2 */ T2, R]
  
  type Function3[T1, T2, T3, R] = js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R]
  
  type Function4[T1, T2, T3, T4, R] = js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, R]
  
  type Function5[T1, T2, T3, T4, T5, R] = js.Function5[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* t5 */ T5, R]
  
  type Function6[T1, T2, T3, T4, T5, T6, R] = js.Function6[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* t5 */ T5, /* t6 */ T6, R]
  
  type Sink[V] = js.Function1[/* value */ V, Reply]
  
  type Subscribe[T] = js.Function1[/* arg */ EventSink[T], Unsub]
  
  type Unsub = js.Function0[Unit]
  
  type VoidSink = js.Function0[Reply]
}
