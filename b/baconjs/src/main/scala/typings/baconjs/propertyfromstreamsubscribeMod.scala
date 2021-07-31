package typings.baconjs

import typings.baconjs.describeMod.Desc
import typings.baconjs.observableMod.Property
import typings.baconjs.typesMod.Subscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object propertyfromstreamsubscribeMod {
  
  @JSImport("baconjs/types/internal/propertyfromstreamsubscribe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[V](desc: Desc, subscribe: Subscribe[V]): Property[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(desc.asInstanceOf[js.Any], subscribe.asInstanceOf[js.Any])).asInstanceOf[Property[V]]
}
