package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Billboard")
@js.native
class Billboard () extends js.Object {
  var alignedAxis: Cartesian3 = js.native
  var color: Color = js.native
  var disableDepthTestDistance: scala.Double = js.native
  var distanceDisplayCondition: DistanceDisplayCondition = js.native
  var eyeOffset: Cartesian3 = js.native
  var height: scala.Double = js.native
  var heightReference: HeightReference = js.native
  var horizontalOrigin: HorizontalOrigin = js.native
  var id: js.Any = js.native
  var image: java.lang.String = js.native
  var pixelOffset: Cartesian2 = js.native
  var pixelOffsetScaleByDistance: NearFarScalar = js.native
  var position: Cartesian3 = js.native
  val ready: scala.Boolean = js.native
  var rotation: scala.Double = js.native
  var scale: scala.Double = js.native
  var scaleByDistance: NearFarScalar = js.native
  var show: scala.Boolean = js.native
  var sizeInMeters: scala.Boolean = js.native
  var translucencyByDistance: NearFarScalar = js.native
  var verticalOrigin: VerticalOrigin = js.native
  var width: scala.Double = js.native
  def computeScreenSpacePosition(scene: Scene): Cartesian2 = js.native
  def computeScreenSpacePosition(scene: Scene, result: Cartesian2): Cartesian2 = js.native
  def equals(other: Billboard): scala.Boolean = js.native
  def setImage(id: java.lang.String, image: cesiumLib.cesiumMod.BillboardNs.CreateImageCallback): scala.Unit = js.native
  def setImage(id: java.lang.String, image: java.lang.String): scala.Unit = js.native
  def setImage(id: java.lang.String, image: stdLib.HTMLCanvasElement): scala.Unit = js.native
  def setImage(id: java.lang.String, image: stdLib.HTMLImageElement): scala.Unit = js.native
  def setImageSubRegion(id: java.lang.String, subRegion: BoundingRectangle): scala.Unit = js.native
}

