package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Label")
@js.native
class Label () extends js.Object {
  var backgroundColor: Color = js.native
  var backgroundPadding: Color = js.native
  var definitionChanged: Event[js.Array[_]] = js.native
  var disableDepthTestDistance: Double = js.native
  var distanceDisplayCondition: DistanceDisplayCondition = js.native
  var eyeOffset: Property = js.native
  var fillColor: Color = js.native
  var font: String = js.native
  var heightReference: HeightReference = js.native
  var horizontalOrigin: Property = js.native
  var id: js.Any = js.native
  var outlineColor: Color = js.native
  var outlineWidth: Double = js.native
  var pixelOffset: Property = js.native
  var pixelOffsetScaleByDistance: NearFarScalar = js.native
  var position: Cartesian3 = js.native
  var scale: Property = js.native
  var show: Boolean = js.native
  var style: Property = js.native
  var text: String = js.native
  var totalScale: Double = js.native
  var translucencyByDistance: NearFarScalar = js.native
  var verticalOrigin: Property = js.native
  def computeScreenSpacePosition(scene: Scene): Cartesian2 = js.native
  def computeScreenSpacePosition(scene: Scene, result: Cartesian2): Cartesian2 = js.native
  def equals(other: Label): Boolean = js.native
  def isDestroyed(): Boolean = js.native
}

/* static members */
@JSImport("cesium", "Label")
@js.native
object Label extends js.Object {
  var enableRightToLeftDetection: Boolean = js.native
}

