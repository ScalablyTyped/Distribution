package typings.d3DashZoom.d3DashZoomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-zoom", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val zoomIdentity: ZoomTransform = js.native
  def zoom[ZoomRefElement /* <: ZoomedElementBaseType */, Datum](): ZoomBehavior[ZoomRefElement, Datum] = js.native
  def zoomTransform(node: ZoomedElementBaseType): ZoomTransform = js.native
}

