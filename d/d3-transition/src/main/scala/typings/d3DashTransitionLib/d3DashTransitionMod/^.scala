package typings
package d3DashTransitionLib.d3DashTransitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-transition", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def active[Datum, PElement /* <: d3DashSelectionLib.d3DashSelectionMod.BaseType */, PDatum](): (Transition[scala.Null, Datum, PElement, PDatum]) | scala.Null = js.native
  def active[Datum, PElement /* <: d3DashSelectionLib.d3DashSelectionMod.BaseType */, PDatum](node: d3DashSelectionLib.d3DashSelectionMod.EnterElement): (Transition[d3DashSelectionLib.d3DashSelectionMod.EnterElement, Datum, PElement, PDatum]) | scala.Null = js.native
  def active[Datum, PElement /* <: d3DashSelectionLib.d3DashSelectionMod.BaseType */, PDatum](node: d3DashSelectionLib.d3DashSelectionMod.EnterElement, name: java.lang.String): (Transition[d3DashSelectionLib.d3DashSelectionMod.EnterElement, Datum, PElement, PDatum]) | scala.Null = js.native
  def active[Datum, PElement /* <: d3DashSelectionLib.d3DashSelectionMod.BaseType */, PDatum](node: scala.Null, name: java.lang.String): (Transition[scala.Null, Datum, PElement, PDatum]) | scala.Null = js.native
  def active[Datum, PElement /* <: d3DashSelectionLib.d3DashSelectionMod.BaseType */, PDatum](node: stdLib.Document): (Transition[stdLib.Document, Datum, PElement, PDatum]) | scala.Null = js.native
  def active[Datum, PElement /* <: d3DashSelectionLib.d3DashSelectionMod.BaseType */, PDatum](node: stdLib.Document, name: java.lang.String): (Transition[stdLib.Document, Datum, PElement, PDatum]) | scala.Null = js.native
  def active[Datum, PElement /* <: d3DashSelectionLib.d3DashSelectionMod.BaseType */, PDatum](node: stdLib.Element): (Transition[stdLib.Element, Datum, PElement, PDatum]) | scala.Null = js.native
  def active[Datum, PElement /* <: d3DashSelectionLib.d3DashSelectionMod.BaseType */, PDatum](node: stdLib.Element, name: java.lang.String): (Transition[stdLib.Element, Datum, PElement, PDatum]) | scala.Null = js.native
  def active[Datum, PElement /* <: d3DashSelectionLib.d3DashSelectionMod.BaseType */, PDatum](node: stdLib.Window): (Transition[stdLib.Window, Datum, PElement, PDatum]) | scala.Null = js.native
  def active[Datum, PElement /* <: d3DashSelectionLib.d3DashSelectionMod.BaseType */, PDatum](node: stdLib.Window, name: java.lang.String): (Transition[stdLib.Window, Datum, PElement, PDatum]) | scala.Null = js.native
  def interrupt(node: d3DashSelectionLib.d3DashSelectionMod.BaseType): scala.Unit = js.native
  def interrupt(node: d3DashSelectionLib.d3DashSelectionMod.BaseType, name: java.lang.String): scala.Unit = js.native
  def transition[OldDatum](): Transition[stdLib.HTMLElement, OldDatum, scala.Null, js.UndefOr[scala.Nothing]] = js.native
  def transition[OldDatum](name: java.lang.String): Transition[stdLib.HTMLElement, OldDatum, scala.Null, js.UndefOr[scala.Nothing]] = js.native
  def transition[OldDatum](
    transition: Transition[
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      _, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      _
    ]
  ): Transition[stdLib.HTMLElement, OldDatum, scala.Null, js.UndefOr[scala.Nothing]] = js.native
}

