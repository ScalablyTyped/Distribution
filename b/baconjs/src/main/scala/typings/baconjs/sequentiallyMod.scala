package typings.baconjs

import typings.baconjs.eventMod.Event
import typings.baconjs.observableMod.EventStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sequentiallyMod {
  
  @JSImport("baconjs/types/sequentially", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[V](delay: Double, values: js.Array[V | Event[V]]): EventStream[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(delay.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[EventStream[V]]
}
