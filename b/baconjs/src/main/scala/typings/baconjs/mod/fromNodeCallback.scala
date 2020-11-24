package typings.baconjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs", "fromNodeCallback")
@js.native
object fromNodeCallback extends js.Object {
  
  def apply[V](f: js.Function, args: js.Any*): typings.baconjs.observableMod.EventStream[V] = js.native
}
