package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVector4Like extends StObject {
  
  var w: float = js.native
  
  var x: float = js.native
  
  var y: float = js.native
  
  var z: float = js.native
}
object IVector4Like {
  
  @scala.inline
  def apply(w: float, x: float, y: float, z: float): IVector4Like = {
    val __obj = js.Dynamic.literal(w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVector4Like]
  }
  
  @scala.inline
  implicit class IVector4LikeMutableBuilder[Self <: IVector4Like] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setW(value: float): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: float): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: float): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZ(value: float): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
