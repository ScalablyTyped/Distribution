package typings.d3.mod

import typings.d3Selection.mod.BaseType
import typings.d3Selection.mod.EnterElement
import typings.d3Transition.mod.Transition_
import typings.std.Document
import typings.std.Element
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "active")
@js.native
object active extends js.Object {
  def apply[Datum, PElement /* <: BaseType */, PDatum](): (Transition_[Null, Datum, PElement, PDatum]) | Null = js.native
  def apply[Datum, PElement /* <: BaseType */, PDatum](node: Null, name: String): (Transition_[Null, Datum, PElement, PDatum]) | Null = js.native
  def apply[Datum, PElement /* <: BaseType */, PDatum](node: EnterElement): (Transition_[EnterElement, Datum, PElement, PDatum]) | Null = js.native
  def apply[Datum, PElement /* <: BaseType */, PDatum](node: EnterElement, name: String): (Transition_[EnterElement, Datum, PElement, PDatum]) | Null = js.native
  def apply[Datum, PElement /* <: BaseType */, PDatum](node: Document): (Transition_[Document, Datum, PElement, PDatum]) | Null = js.native
  def apply[Datum, PElement /* <: BaseType */, PDatum](node: Document, name: String): (Transition_[Document, Datum, PElement, PDatum]) | Null = js.native
  def apply[Datum, PElement /* <: BaseType */, PDatum](node: Element): (Transition_[Element, Datum, PElement, PDatum]) | Null = js.native
  def apply[Datum, PElement /* <: BaseType */, PDatum](node: Element, name: String): (Transition_[Element, Datum, PElement, PDatum]) | Null = js.native
  def apply[Datum, PElement /* <: BaseType */, PDatum](node: Window): (Transition_[Window, Datum, PElement, PDatum]) | Null = js.native
  def apply[Datum, PElement /* <: BaseType */, PDatum](node: Window, name: String): (Transition_[Window, Datum, PElement, PDatum]) | Null = js.native
}

