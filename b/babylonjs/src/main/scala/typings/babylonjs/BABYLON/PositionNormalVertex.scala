package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PositionNormalVertex extends StObject {
  
  /** the normal of the vertex (defaut: 0,1,0) */
  var normal: Vector3 = js.native
  
  /** the position of the vertex (defaut: 0,0,0) */
  var position: Vector3 = js.native
}
object PositionNormalVertex {
  
  @scala.inline
  def apply(normal: Vector3, position: Vector3): PositionNormalVertex = {
    val __obj = js.Dynamic.literal(normal = normal.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionNormalVertex]
  }
  
  @scala.inline
  implicit class PositionNormalVertexMutableBuilder[Self <: PositionNormalVertex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNormal(value: Vector3): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Vector3): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
