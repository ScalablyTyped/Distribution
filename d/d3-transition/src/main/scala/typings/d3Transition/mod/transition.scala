package typings.d3Transition.mod

import typings.d3Selection.mod.BaseType
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3-transition", "transition")
@js.native
object transition extends js.Object {
  def apply[OldDatum](): Transition_[HTMLElement, OldDatum, Null, js.UndefOr[scala.Nothing]] = js.native
  def apply[OldDatum](name: String): Transition_[HTMLElement, OldDatum, Null, js.UndefOr[scala.Nothing]] = js.native
  def apply[OldDatum](transition: Transition_[BaseType, _, BaseType, _]): Transition_[HTMLElement, OldDatum, Null, js.UndefOr[scala.Nothing]] = js.native
}

