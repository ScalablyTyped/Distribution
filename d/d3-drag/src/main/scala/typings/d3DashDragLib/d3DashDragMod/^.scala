package typings
package d3DashDragLib.d3DashDragMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-drag", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def drag[GElement /* <: d3DashDragLib.d3DashDragMod.DraggedElementBaseType */, Datum](): d3DashDragLib.d3DashDragMod.DragBehavior[GElement, Datum, Datum | d3DashDragLib.d3DashDragMod.SubjectPosition] = js.native
  def dragDisable(window: stdLib.Window): scala.Unit = js.native
  def dragEnable(window: stdLib.Window): scala.Unit = js.native
  def dragEnable(window: stdLib.Window, noClick: scala.Boolean): scala.Unit = js.native
  @JSName("drag")
  def drag_GElementDraggedElementBaseTypeDatumSubject[GElement /* <: d3DashDragLib.d3DashDragMod.DraggedElementBaseType */, Datum, Subject](): d3DashDragLib.d3DashDragMod.DragBehavior[GElement, Datum, Subject] = js.native
}

