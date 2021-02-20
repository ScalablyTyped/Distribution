package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IViewportLike extends StObject {
  
  var height: float = js.native
  
  var width: float = js.native
  
  var x: float = js.native
  
  var y: float = js.native
}
object IViewportLike {
  
  @scala.inline
  def apply(height: float, width: float, x: float, y: float): IViewportLike = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[IViewportLike]
  }
  
  @scala.inline
  implicit class IViewportLikeMutableBuilder[Self <: IViewportLike] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: float): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: float): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: float): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: float): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
