package typings.d3DashTransition.d3DashTransitionMod

import typings.d3DashSelection.d3DashSelectionMod.BaseType
import typings.d3DashSelection.d3DashSelectionMod.EnterElement
import typings.std.Document
import typings.std.Element
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-transition", "active")
@js.native
object active extends js.Object {
  def apply[Datum, PElement /* <: BaseType */, PDatum](): (Transition[Null, Datum, PElement, PDatum]) | Null = js.native
  def apply[Datum, PElement /* <: BaseType */, PDatum](node: Null, name: String): (Transition[Null, Datum, PElement, PDatum]) | Null = js.native
  def apply[Datum, PElement /* <: BaseType */, PDatum](node: EnterElement): (Transition[EnterElement, Datum, PElement, PDatum]) | Null = js.native
  def apply[Datum, PElement /* <: BaseType */, PDatum](node: EnterElement, name: String): (Transition[EnterElement, Datum, PElement, PDatum]) | Null = js.native
  def apply[Datum, PElement /* <: BaseType */, PDatum](node: Document): (Transition[Document, Datum, PElement, PDatum]) | Null = js.native
  def apply[Datum, PElement /* <: BaseType */, PDatum](node: Document, name: String): (Transition[Document, Datum, PElement, PDatum]) | Null = js.native
  def apply[Datum, PElement /* <: BaseType */, PDatum](node: Element): (Transition[Element, Datum, PElement, PDatum]) | Null = js.native
  def apply[Datum, PElement /* <: BaseType */, PDatum](node: Element, name: String): (Transition[Element, Datum, PElement, PDatum]) | Null = js.native
  def apply[Datum, PElement /* <: BaseType */, PDatum](node: Window): (Transition[Window, Datum, PElement, PDatum]) | Null = js.native
  def apply[Datum, PElement /* <: BaseType */, PDatum](node: Window, name: String): (Transition[Window, Datum, PElement, PDatum]) | Null = js.native
}

