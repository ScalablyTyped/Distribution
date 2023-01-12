package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolyhedronData extends StObject {
  
  var category: String
  
  var edgematch: js.Array[js.Array[Double | String]]
  
  var face: js.Array[js.Array[Double]]
  
  var name: String
  
  var vertex: js.Array[js.Array[Double]]
}
object PolyhedronData {
  
  inline def apply(
    category: String,
    edgematch: js.Array[js.Array[Double | String]],
    face: js.Array[js.Array[Double]],
    name: String,
    vertex: js.Array[js.Array[Double]]
  ): PolyhedronData = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], edgematch = edgematch.asInstanceOf[js.Any], face = face.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], vertex = vertex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolyhedronData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PolyhedronData] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setEdgematch(value: js.Array[js.Array[Double | String]]): Self = StObject.set(x, "edgematch", value.asInstanceOf[js.Any])
    
    inline def setEdgematchVarargs(value: (js.Array[Double | String])*): Self = StObject.set(x, "edgematch", js.Array(value*))
    
    inline def setFace(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "face", value.asInstanceOf[js.Any])
    
    inline def setFaceVarargs(value: js.Array[Double]*): Self = StObject.set(x, "face", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setVertex(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "vertex", value.asInstanceOf[js.Any])
    
    inline def setVertexVarargs(value: js.Array[Double]*): Self = StObject.set(x, "vertex", js.Array(value*))
  }
}
