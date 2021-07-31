package typings.cesium.mod

import typings.cesium.anon.Shape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PolylineVolumeGraphics")
@js.native
class PolylineVolumeGraphics () extends StObject {
  def this(options: Shape) = this()
  
  def clone(result: PolylineVolumeGraphics): PolylineVolumeGraphics = js.native
  
  var cornerType: Property = js.native
  
  var definitionChanged: Event[js.Array[js.Any]] = js.native
  
  var fill: Property = js.native
  
  var granularity: Property = js.native
  
  var material: MaterialProperty = js.native
  
  def merge(source: PolylineVolumeGraphics): PolylineVolumeGraphics = js.native
  
  var outline: Property = js.native
  
  var outlineColor: Property = js.native
  
  var outlineWidth: Property = js.native
  
  var positions: Property = js.native
  
  var shape: Property = js.native
  
  var show: Property = js.native
}
