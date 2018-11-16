package typings
package d3DashDragLib.d3DashDragMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-drag", JSImport.Namespace)
@js.native
object d3DashDragModMembers extends js.Object {
  def drag[GElement /* <: DraggedElementBaseType */, Datum](): DragBehavior[GElement, Datum, Datum | SubjectPosition] = js.native
  def dragDisable(window: stdLib.Window): scala.Unit = js.native
  def dragEnable(window: stdLib.Window): scala.Unit = js.native
  def dragEnable(window: stdLib.Window, noClick: scala.Boolean): scala.Unit = js.native
  @JSName("drag")
  def drag_GElementDraggedElementBaseTypeDatumSubject[GElement /* <: DraggedElementBaseType */, Datum, Subject](): DragBehavior[GElement, Datum, Subject] = js.native
}

