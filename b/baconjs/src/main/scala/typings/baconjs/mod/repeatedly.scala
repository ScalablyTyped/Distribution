package typings.baconjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs", "repeatedly")
@js.native
object repeatedly extends js.Object {
  
  def apply[V](delay: Double, values: js.Array[V | typings.baconjs.eventMod.Event[V]]): typings.baconjs.observableMod.EventStream[V] = js.native
}
