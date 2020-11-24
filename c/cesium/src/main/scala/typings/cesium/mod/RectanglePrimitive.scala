package typings.cesium.mod

import typings.cesium.anon.TextureRotationAngle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "RectanglePrimitive")
@js.native
class RectanglePrimitive () extends js.Object {
  def this(options: TextureRotationAngle) = this()
  
  var asynchronous: Boolean = js.native
  
  var debugShowBoundingVolume: Boolean = js.native
  
  def destroy(): Unit = js.native
  
  var ellipsoid: Ellipsoid = js.native
  
  var granularity: Double = js.native
  
  var height: Double = js.native
  
  var id: js.Any = js.native
  
  def isDestroyed(): Boolean = js.native
  
  var material: Material = js.native
  
  var rectangle: Rectangle = js.native
  
  var rotation: Double = js.native
  
  var show: Boolean = js.native
  
  var textureRotationAngle: Double = js.native
  
  def update(): Unit = js.native
}
