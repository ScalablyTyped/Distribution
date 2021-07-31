package typings.cesium.mod

import typings.cesium.anon.Width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Polyline")
@js.native
class Polyline () extends StObject {
  def this(options: Width) = this()
  
  var id: js.Any = js.native
  
  var loop: Boolean = js.native
  
  var material: Material = js.native
  
  var positions: js.Array[Cartesian3] = js.native
  
  var show: Boolean = js.native
  
  var width: Double = js.native
}
