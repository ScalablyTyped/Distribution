package typings.baconjs.mod

import typings.baconjs.observableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs", "groupSimultaneous")
@js.native
object groupSimultaneous extends js.Object {
  
  def apply[V](streams: (default[V] | js.Array[default[V]])*): typings.baconjs.observableMod.EventStream[js.Array[js.Array[V]]] = js.native
}
