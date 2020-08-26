package typings.d3Selection.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-selection", "selectAll")
@js.native
object selectAll extends js.Object {
  def apply(): Selection_[Null, js.UndefOr[scala.Nothing], Null, js.UndefOr[scala.Nothing]] = js.native
  def apply(selector: js.UndefOr[scala.Nothing]): Selection_[Null, js.UndefOr[scala.Nothing], Null, js.UndefOr[scala.Nothing]] = js.native
  def apply(selector: Null): Selection_[Null, js.UndefOr[scala.Nothing], Null, js.UndefOr[scala.Nothing]] = js.native
  def apply[GElement /* <: BaseType */, OldDatum](nodes: js.Array[GElement]): Selection_[GElement, OldDatum, Null, js.UndefOr[scala.Nothing]] = js.native
  def apply[GElement /* <: BaseType */, OldDatum](nodes: ArrayLike[GElement]): Selection_[GElement, OldDatum, Null, js.UndefOr[scala.Nothing]] = js.native
  def apply[GElement /* <: BaseType */, OldDatum](selector: String): Selection_[GElement, OldDatum, HTMLElement, _] = js.native
}

