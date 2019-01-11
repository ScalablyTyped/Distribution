package typings
package d3DashTransitionLib.d3DashTransitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-transition", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def active[GElement /* <: d3DashSelectionLib.d3DashSelectionMod.BaseType */, Datum, PElement /* <: d3DashSelectionLib.d3DashSelectionMod.BaseType */, PDatum](node: GElement): (d3DashTransitionLib.d3DashTransitionMod.Transition[GElement, Datum, PElement, PDatum]) | scala.Null = js.native
  def active[GElement /* <: d3DashSelectionLib.d3DashSelectionMod.BaseType */, Datum, PElement /* <: d3DashSelectionLib.d3DashSelectionMod.BaseType */, PDatum](node: GElement, name: java.lang.String): (d3DashTransitionLib.d3DashTransitionMod.Transition[GElement, Datum, PElement, PDatum]) | scala.Null = js.native
  def interrupt(node: d3DashSelectionLib.d3DashSelectionMod.BaseType): scala.Unit = js.native
  def interrupt(node: d3DashSelectionLib.d3DashSelectionMod.BaseType, name: java.lang.String): scala.Unit = js.native
  def transition[OldDatum](): d3DashTransitionLib.d3DashTransitionMod.Transition[stdLib.HTMLElement, OldDatum, scala.Null, js.UndefOr[scala.Nothing]] = js.native
  def transition[OldDatum](name: java.lang.String): d3DashTransitionLib.d3DashTransitionMod.Transition[stdLib.HTMLElement, OldDatum, scala.Null, js.UndefOr[scala.Nothing]] = js.native
  def transition[OldDatum](
    transition: d3DashTransitionLib.d3DashTransitionMod.Transition[
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      _, 
      d3DashSelectionLib.d3DashSelectionMod.BaseType, 
      _
    ]
  ): d3DashTransitionLib.d3DashTransitionMod.Transition[stdLib.HTMLElement, OldDatum, scala.Null, js.UndefOr[scala.Nothing]] = js.native
}

