package typings.babylonjs.anon

import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filename extends StObject {
  
  var filename: String
  
  var meshes: js.Array[AbstractMesh]
  
  var path: String
}
object Filename {
  
  inline def apply(filename: String, meshes: js.Array[AbstractMesh], path: String): Filename = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], meshes = meshes.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filename]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Filename] (val x: Self) extends AnyVal {
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setMeshes(value: js.Array[AbstractMesh]): Self = StObject.set(x, "meshes", value.asInstanceOf[js.Any])
    
    inline def setMeshesVarargs(value: AbstractMesh*): Self = StObject.set(x, "meshes", js.Array(value*))
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
