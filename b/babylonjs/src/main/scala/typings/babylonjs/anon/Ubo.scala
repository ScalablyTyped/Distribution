package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ubo extends StObject {
  
  var fragment: js.UndefOr[String] = js.undefined
  
  var ubo: js.UndefOr[js.Array[Type]] = js.undefined
  
  var vertex: js.UndefOr[String] = js.undefined
}
object Ubo {
  
  inline def apply(): Ubo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ubo]
  }
  
  extension [Self <: Ubo](x: Self) {
    
    inline def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
    
    inline def setFragmentUndefined: Self = StObject.set(x, "fragment", js.undefined)
    
    inline def setUbo(value: js.Array[Type]): Self = StObject.set(x, "ubo", value.asInstanceOf[js.Any])
    
    inline def setUboUndefined: Self = StObject.set(x, "ubo", js.undefined)
    
    inline def setUboVarargs(value: Type*): Self = StObject.set(x, "ubo", js.Array(value*))
    
    inline def setVertex(value: String): Self = StObject.set(x, "vertex", value.asInstanceOf[js.Any])
    
    inline def setVertexUndefined: Self = StObject.set(x, "vertex", js.undefined)
  }
}
