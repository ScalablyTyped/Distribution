package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Right extends StObject {
  
  var left: js.Array[String]
  
  var right: js.Array[String]
}
object Right {
  
  inline def apply(left: js.Array[String], right: js.Array[String]): Right = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[Right]
  }
  
  extension [Self <: Right](x: Self) {
    
    inline def setLeft(value: js.Array[String]): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftVarargs(value: String*): Self = StObject.set(x, "left", js.Array(value :_*))
    
    inline def setRight(value: js.Array[String]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightVarargs(value: String*): Self = StObject.set(x, "right", js.Array(value :_*))
  }
}
