package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "ViewportQuad")
@js.native
class ViewportQuad () extends StObject {
  def this(rectangle: BoundingRectangle) = this()
  def this(rectangle: js.UndefOr[scala.Nothing], material: Material) = this()
  def this(rectangle: BoundingRectangle, material: Material) = this()
  
  def destroy(): Unit = js.native
  
  def isDestroyed(): Boolean = js.native
  
  var material: Material = js.native
  
  var rectangle: BoundingRectangle = js.native
  
  var show: Boolean = js.native
  
  def update(): Unit = js.native
}
