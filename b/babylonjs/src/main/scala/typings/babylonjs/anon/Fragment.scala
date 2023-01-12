package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fragment extends StObject {
  
  var fragment: String
  
  var rawFragment: String
  
  var rawVertex: String
  
  var vertex: String
}
object Fragment {
  
  inline def apply(fragment: String, rawFragment: String, rawVertex: String, vertex: String): Fragment = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], rawFragment = rawFragment.asInstanceOf[js.Any], rawVertex = rawVertex.asInstanceOf[js.Any], vertex = vertex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fragment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Fragment] (val x: Self) extends AnyVal {
    
    inline def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
    
    inline def setRawFragment(value: String): Self = StObject.set(x, "rawFragment", value.asInstanceOf[js.Any])
    
    inline def setRawVertex(value: String): Self = StObject.set(x, "rawVertex", value.asInstanceOf[js.Any])
    
    inline def setVertex(value: String): Self = StObject.set(x, "vertex", value.asInstanceOf[js.Any])
  }
}
