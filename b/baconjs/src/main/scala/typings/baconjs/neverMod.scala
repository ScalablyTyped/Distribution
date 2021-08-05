package typings.baconjs

import typings.baconjs.observableMod.EventStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object neverMod {
  
  @JSImport("baconjs/types/never", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[V](): EventStream[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[EventStream[V]]
}
