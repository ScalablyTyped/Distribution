package typings.baconjs

import typings.baconjs.observableMod.Observable
import typings.baconjs.typesMod.Subscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncwrapsubscribeMod {
  
  @JSImport("baconjs/types/internal/asyncwrapsubscribe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[V](obs: Observable[V], subscribe: Subscribe[V]): Subscribe[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(obs.asInstanceOf[js.Any], subscribe.asInstanceOf[js.Any])).asInstanceOf[Subscribe[V]]
}
