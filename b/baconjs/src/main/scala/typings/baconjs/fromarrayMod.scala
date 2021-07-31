package typings.baconjs

import typings.baconjs.eventMod.Event
import typings.baconjs.observableMod.EventStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromarrayMod {
  
  @JSImport("baconjs/types/fromarray", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T](values: js.Array[T | Event[T]]): EventStream[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(values.asInstanceOf[js.Any]).asInstanceOf[EventStream[T]]
}
