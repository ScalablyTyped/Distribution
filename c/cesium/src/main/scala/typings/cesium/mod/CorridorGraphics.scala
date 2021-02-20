package typings.cesium.mod

import typings.cesium.anon.Fill
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "CorridorGraphics")
@js.native
class CorridorGraphics () extends StObject {
  def this(options: Fill) = this()
  
  def clone(result: CorridorGraphics): CorridorGraphics = js.native
  
  var cornerType: Property = js.native
  
  var definitionChanged: Event[js.Array[_]] = js.native
  
  var extrudedHeight: Property = js.native
  
  var fill: Property = js.native
  
  var granularity: Property = js.native
  
  var height: Property = js.native
  
  var material: MaterialProperty = js.native
  
  def merge(source: CorridorGraphics): CorridorGraphics = js.native
  
  var outline: Property = js.native
  
  var outlineColor: Property = js.native
  
  var outlineWidth: Property = js.native
  
  var positions: Property = js.native
  
  var show: Property = js.native
  
  var width: Property = js.native
}
