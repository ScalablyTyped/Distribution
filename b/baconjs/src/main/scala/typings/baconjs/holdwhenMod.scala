package typings.baconjs

import typings.baconjs.observableMod.EventStream
import typings.baconjs.observableMod.Property
import typings.baconjs.observableMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object holdwhenMod {
  
  @JSImport("baconjs/types/holdwhen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def holdWhen[V](src: default[V], valve: Property[Boolean]): EventStream[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("holdWhen")(src.asInstanceOf[js.Any], valve.asInstanceOf[js.Any])).asInstanceOf[EventStream[V]]
}
