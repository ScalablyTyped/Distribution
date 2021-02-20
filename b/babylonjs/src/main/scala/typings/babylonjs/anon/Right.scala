package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Right extends StObject {
  
  var left: js.Array[String] = js.native
  
  var right: js.Array[String] = js.native
}
object Right {
  
  @scala.inline
  def apply(left: js.Array[String], right: js.Array[String]): Right = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[Right]
  }
  
  @scala.inline
  implicit class RightMutableBuilder[Self <: Right] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeft(value: js.Array[String]): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftVarargs(value: String*): Self = StObject.set(x, "left", js.Array(value :_*))
    
    @scala.inline
    def setRight(value: js.Array[String]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightVarargs(value: String*): Self = StObject.set(x, "right", js.Array(value :_*))
  }
}
