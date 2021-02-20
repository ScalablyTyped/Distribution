package typings.cesium.mod

import typings.cesium.anon.Dimensions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "BoxGraphics")
@js.native
class BoxGraphics () extends StObject {
  def this(options: Dimensions) = this()
  
  def clone(result: BoxGraphics): BoxGraphics = js.native
  
  var definitionChanged: Event[js.Array[_]] = js.native
  
  var dimensions: Property = js.native
  
  var fill: Property = js.native
  
  var material: MaterialProperty = js.native
  
  def merge(source: BoxGraphics): BoxGraphics = js.native
  
  var outline: Property = js.native
  
  var outlineColor: Property = js.native
  
  var outlineWidth: Property = js.native
  
  var show: Property = js.native
}
