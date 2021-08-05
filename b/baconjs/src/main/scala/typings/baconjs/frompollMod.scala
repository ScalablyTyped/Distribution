package typings.baconjs

import typings.baconjs.frombinderMod.EventLike
import typings.baconjs.observableMod.EventStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object frompollMod {
  
  @JSImport("baconjs/types/frompoll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[V](delay: Double, poll: PollFunction[V]): EventStream[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(delay.asInstanceOf[js.Any], poll.asInstanceOf[js.Any])).asInstanceOf[EventStream[V]]
  
  type PollFunction[V] = js.Function0[EventLike[V]]
}
