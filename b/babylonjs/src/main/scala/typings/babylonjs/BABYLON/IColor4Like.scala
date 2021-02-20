package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IColor4Like extends StObject {
  
  var a: float = js.native
  
  var b: float = js.native
  
  var g: float = js.native
  
  var r: float = js.native
}
object IColor4Like {
  
  @scala.inline
  def apply(a: float, b: float, g: float, r: float): IColor4Like = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColor4Like]
  }
  
  @scala.inline
  implicit class IColor4LikeMutableBuilder[Self <: IColor4Like] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setA(value: float): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setB(value: float): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setG(value: float): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR(value: float): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
