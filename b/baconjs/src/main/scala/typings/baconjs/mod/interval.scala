package typings.baconjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs", "interval")
@js.native
object interval extends js.Object {
  
  def apply[V](delay: Double, value: V): typings.baconjs.observableMod.EventStream[V] = js.native
}
