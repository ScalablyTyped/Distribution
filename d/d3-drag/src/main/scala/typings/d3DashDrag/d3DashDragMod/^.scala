package typings.d3DashDrag.d3DashDragMod

import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-drag", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def drag[GElement /* <: DraggedElementBaseType */, Datum](): DragBehavior[GElement, Datum, Datum | SubjectPosition] = js.native
  def dragDisable(window: Window): Unit = js.native
  def dragEnable(window: Window): Unit = js.native
  def dragEnable(window: Window, noClick: Boolean): Unit = js.native
  @JSName("drag")
  def drag_GElement_DraggedElementBaseTypeDatumSubject[GElement /* <: DraggedElementBaseType */, Datum, Subject](): DragBehavior[GElement, Datum, Subject] = js.native
}

