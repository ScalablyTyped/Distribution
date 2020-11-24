package typings.cesium.mod

import typings.cesium.anon.OutlineWidth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PolylineOutlineMaterialProperty")
@js.native
class PolylineOutlineMaterialProperty () extends MaterialProperty {
  def this(options: OutlineWidth) = this()
  
  var color: Color = js.native
  
  var outlineColor: Color = js.native
  
  var outlineWidth: Property = js.native
}
