package typings.baconjs.mod

import typings.baconjs.observableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs", "repeat")
@js.native
object repeat extends js.Object {
  
  def apply[V](generator: js.Function1[/* iteration */ Double, js.UndefOr[default[V]]]): typings.baconjs.observableMod.EventStream[V] = js.native
}
