package typings.d3DashTransition.d3DashTransitionMod

import typings.d3DashSelection.d3DashSelectionMod.BaseType
import typings.d3DashSelection.d3DashSelectionMod.EnterElement
import typings.std.Document
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-transition", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def active[Datum, PElement /* <: BaseType */, PDatum](): (Transition[Null, Datum, PElement, PDatum]) | Null = js.native
  def active[Datum, PElement /* <: BaseType */, PDatum](node: Null, name: String): (Transition[Null, Datum, PElement, PDatum]) | Null = js.native
  def active[Datum, PElement /* <: BaseType */, PDatum](node: EnterElement): (Transition[EnterElement, Datum, PElement, PDatum]) | Null = js.native
  def active[Datum, PElement /* <: BaseType */, PDatum](node: EnterElement, name: String): (Transition[EnterElement, Datum, PElement, PDatum]) | Null = js.native
  def active[Datum, PElement /* <: BaseType */, PDatum](node: Document): (Transition[Document, Datum, PElement, PDatum]) | Null = js.native
  def active[Datum, PElement /* <: BaseType */, PDatum](node: Document, name: String): (Transition[Document, Datum, PElement, PDatum]) | Null = js.native
  def active[Datum, PElement /* <: BaseType */, PDatum](node: Element): (Transition[Element, Datum, PElement, PDatum]) | Null = js.native
  def active[Datum, PElement /* <: BaseType */, PDatum](node: Element, name: String): (Transition[Element, Datum, PElement, PDatum]) | Null = js.native
  def active[Datum, PElement /* <: BaseType */, PDatum](node: Window): (Transition[Window, Datum, PElement, PDatum]) | Null = js.native
  def active[Datum, PElement /* <: BaseType */, PDatum](node: Window, name: String): (Transition[Window, Datum, PElement, PDatum]) | Null = js.native
  def interrupt(node: BaseType): Unit = js.native
  def interrupt(node: BaseType, name: String): Unit = js.native
  def transition[OldDatum](): Transition[HTMLElement, OldDatum, Null, js.UndefOr[scala.Nothing]] = js.native
  def transition[OldDatum](name: String): Transition[HTMLElement, OldDatum, Null, js.UndefOr[scala.Nothing]] = js.native
  def transition[OldDatum](transition: Transition[BaseType, _, BaseType, _]): Transition[HTMLElement, OldDatum, Null, js.UndefOr[scala.Nothing]] = js.native
}

