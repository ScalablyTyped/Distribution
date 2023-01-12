package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FragmentCode extends StObject {
  
  var fragmentCode: String
  
  var vertexCode: String
}
object FragmentCode {
  
  inline def apply(fragmentCode: String, vertexCode: String): FragmentCode = {
    val __obj = js.Dynamic.literal(fragmentCode = fragmentCode.asInstanceOf[js.Any], vertexCode = vertexCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentCode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FragmentCode] (val x: Self) extends AnyVal {
    
    inline def setFragmentCode(value: String): Self = StObject.set(x, "fragmentCode", value.asInstanceOf[js.Any])
    
    inline def setVertexCode(value: String): Self = StObject.set(x, "vertexCode", value.asInstanceOf[js.Any])
  }
}
