package typings.baconjs

import typings.baconjs.observableMod.EventStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object laterMod {
  
  @JSImport("baconjs/types/later", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[V](delay: Double, value: V): EventStream[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(delay.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[EventStream[V]]
}
