package typings.baconjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs", "once")
@js.native
object once extends js.Object {
  
  def apply[V](value: V): typings.baconjs.observableMod.EventStream[V] = js.native
  def apply[V](value: typings.baconjs.eventMod.Event[V]): typings.baconjs.observableMod.EventStream[V] = js.native
}
