package typings.baconjs.mod

import typings.baconjs.observableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs", "combineAsArray")
@js.native
object combineAsArray extends js.Object {
  
  def apply[V](streams: (default[V] | js.Array[default[V]])*): typings.baconjs.observableMod.Property[js.Array[V]] = js.native
}
