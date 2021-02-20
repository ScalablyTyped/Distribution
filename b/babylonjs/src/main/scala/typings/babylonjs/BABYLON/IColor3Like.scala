package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IColor3Like extends StObject {
  
  var b: float = js.native
  
  var g: float = js.native
  
  var r: float = js.native
}
object IColor3Like {
  
  @scala.inline
  def apply(b: float, g: float, r: float): IColor3Like = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColor3Like]
  }
  
  @scala.inline
  implicit class IColor3LikeMutableBuilder[Self <: IColor3Like] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setB(value: float): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setG(value: float): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR(value: float): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
