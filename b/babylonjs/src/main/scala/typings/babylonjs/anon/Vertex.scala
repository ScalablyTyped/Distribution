package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Vertex extends StObject {
  
  var fragment: js.UndefOr[String] = js.undefined
  
  var ubo: js.UndefOr[js.Array[ArraySize]] = js.undefined
  
  var vertex: js.UndefOr[String] = js.undefined
}
object Vertex {
  
  inline def apply(): Vertex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Vertex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Vertex] (val x: Self) extends AnyVal {
    
    inline def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
    
    inline def setFragmentUndefined: Self = StObject.set(x, "fragment", js.undefined)
    
    inline def setUbo(value: js.Array[ArraySize]): Self = StObject.set(x, "ubo", value.asInstanceOf[js.Any])
    
    inline def setUboUndefined: Self = StObject.set(x, "ubo", js.undefined)
    
    inline def setUboVarargs(value: ArraySize*): Self = StObject.set(x, "ubo", js.Array(value*))
    
    inline def setVertex(value: String): Self = StObject.set(x, "vertex", value.asInstanceOf[js.Any])
    
    inline def setVertexUndefined: Self = StObject.set(x, "vertex", js.undefined)
  }
}
