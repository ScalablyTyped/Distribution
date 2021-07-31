package typings.baconjs

import typings.baconjs.eventMod.Event
import typings.baconjs.observableMod.EventStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onceMod {
  
  @JSImport("baconjs/types/once", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[V](value: V): EventStream[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[EventStream[V]]
  @scala.inline
  def default[V](value: Event[V]): EventStream[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[EventStream[V]]
}
