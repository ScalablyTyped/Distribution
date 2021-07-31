package typings.cesium.mod

import typings.cesium.anon.OutlineColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "EllipsoidGraphics")
@js.native
class EllipsoidGraphics () extends StObject {
  def this(options: OutlineColor) = this()
  
  def clone(result: EllipsoidGraphics): EllipsoidGraphics = js.native
  
  var definitionChanged: Event[js.Array[js.Any]] = js.native
  
  var fill: Property = js.native
  
  var material: MaterialProperty = js.native
  
  def merge(source: EllipsoidGraphics): EllipsoidGraphics = js.native
  
  var outline: Property = js.native
  
  var outlineColor: Property = js.native
  
  var outlineWidth: Property = js.native
  
  var radii: Property = js.native
  
  var show: Property = js.native
  
  var slicePartitions: Property = js.native
  
  var stackPartitions: Property = js.native
  
  var subdivisions: Property = js.native
}
