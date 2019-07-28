package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Label")
@js.native
class Label () extends js.Object {
  var eyeOffset: Cartesian3 = js.native
  var fillColor: Color = js.native
  var font: String = js.native
  var horizontalOrigin: HorizontalOrigin = js.native
  var id: js.Any = js.native
  var outlineColor: Color = js.native
  var outlineWidth: Double = js.native
  var pixelOffset: Cartesian2 = js.native
  var pixelOffsetScaleByDistance: NearFarScalar = js.native
  var position: Cartesian3 = js.native
  var scale: Double = js.native
  var show: Boolean = js.native
  var style: LabelStyle = js.native
  var text: String = js.native
  var translucencyByDistance: NearFarScalar = js.native
  var verticalOrigin: VerticalOrigin = js.native
  def computeScreenSpacePosition(scene: Scene): Cartesian2 = js.native
  def computeScreenSpacePosition(scene: Scene, result: Cartesian2): Cartesian2 = js.native
  def equals(other: Label): Boolean = js.native
  def isDestroyed(): Boolean = js.native
}

