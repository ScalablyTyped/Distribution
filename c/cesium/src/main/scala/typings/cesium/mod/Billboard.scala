package typings.cesium.mod

import typings.cesium.mod.Billboard.CreateImageCallback
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Billboard")
@js.native
class Billboard () extends js.Object {
  
  var alignedAxis: Cartesian3 = js.native
  
  var color: Color = js.native
  
  def computeScreenSpacePosition(scene: Scene): Cartesian2 = js.native
  def computeScreenSpacePosition(scene: Scene, result: Cartesian2): Cartesian2 = js.native
  
  var disableDepthTestDistance: Double = js.native
  
  var distanceDisplayCondition: DistanceDisplayCondition = js.native
  
  def equals(other: Billboard): Boolean = js.native
  
  var eyeOffset: Cartesian3 = js.native
  
  var height: Double = js.native
  
  var heightReference: HeightReference = js.native
  
  var horizontalOrigin: HorizontalOrigin = js.native
  
  var id: js.Any = js.native
  
  var image: String = js.native
  
  var pixelOffset: Cartesian2 = js.native
  
  var pixelOffsetScaleByDistance: NearFarScalar = js.native
  
  var position: Cartesian3 = js.native
  
  val ready: Boolean = js.native
  
  var rotation: Double = js.native
  
  var scale: Double = js.native
  
  var scaleByDistance: NearFarScalar = js.native
  
  def setImage(id: String, image: String): Unit = js.native
  def setImage(id: String, image: CreateImageCallback): Unit = js.native
  def setImage(id: String, image: HTMLCanvasElement): Unit = js.native
  def setImage(id: String, image: HTMLImageElement): Unit = js.native
  
  def setImageSubRegion(id: String, subRegion: BoundingRectangle): Unit = js.native
  
  var show: Boolean = js.native
  
  var sizeInMeters: Boolean = js.native
  
  var translucencyByDistance: NearFarScalar = js.native
  
  var verticalOrigin: VerticalOrigin = js.native
  
  var width: Double = js.native
}
@JSImport("cesium", "Billboard")
@js.native
object Billboard extends js.Object {
  
  type CreateImageCallback = js.Function1[
    /* id */ String, 
    HTMLImageElement | HTMLCanvasElement | (js.Promise[HTMLImageElement | HTMLCanvasElement])
  ]
}
