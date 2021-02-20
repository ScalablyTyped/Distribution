package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVector3Like extends StObject {
  
  var x: float = js.native
  
  var y: float = js.native
  
  var z: float = js.native
}
object IVector3Like {
  
  @scala.inline
  def apply(x: float, y: float, z: float): IVector3Like = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVector3Like]
  }
  
  @scala.inline
  implicit class IVector3LikeMutableBuilder[Self <: IVector3Like] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: float): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: float): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZ(value: float): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
