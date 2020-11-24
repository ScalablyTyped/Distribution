package typings.cesium.mod

import typings.cesium.anon.DepthFailMaterial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PolylineGraphics")
@js.native
class PolylineGraphics () extends js.Object {
  def this(options: DepthFailMaterial) = this()
  
  var arcType: Property = js.native
  
  var clampToGround: Property = js.native
  
  var classificationType: Property = js.native
  
  def clone(result: PolylineGraphics): PolylineGraphics = js.native
  
  val definitionChanged: Event[js.Array[_]] = js.native
  
  var depthFailMaterial: MaterialProperty = js.native
  
  var distanceDisplayCondition: Property = js.native
  
  var followSurface: Property = js.native
  
  var granularity: Property = js.native
  
  var material: MaterialProperty = js.native
  
  def merge(source: PolylineGraphics): PolylineGraphics = js.native
  
  var positions: Property = js.native
  
  var shadows: Property = js.native
  
  var show: Property = js.native
  
  var width: Property | Double = js.native
  
  var zIndex: ConstantProperty = js.native
}
