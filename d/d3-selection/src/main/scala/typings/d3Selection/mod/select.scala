package typings.d3Selection.mod

import typings.std.Document
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-selection", "select")
@js.native
object select extends js.Object {
  def apply[OldDatum](node: Null): Selection_[Null, OldDatum, Null, js.UndefOr[scala.Nothing]] = js.native
  def apply[OldDatum](node: EnterElement): Selection_[EnterElement, OldDatum, Null, js.UndefOr[scala.Nothing]] = js.native
  def apply[OldDatum](node: Document): Selection_[Document, OldDatum, Null, js.UndefOr[scala.Nothing]] = js.native
  def apply[OldDatum](node: Element): Selection_[Element, OldDatum, Null, js.UndefOr[scala.Nothing]] = js.native
  def apply[OldDatum](node: Window): Selection_[Window, OldDatum, Null, js.UndefOr[scala.Nothing]] = js.native
  def apply[GElement /* <: BaseType */, OldDatum](selector: String): Selection_[GElement, OldDatum, HTMLElement, _] = js.native
}

