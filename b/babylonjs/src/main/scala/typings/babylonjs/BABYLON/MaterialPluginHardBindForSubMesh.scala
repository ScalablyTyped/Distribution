package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaterialPluginHardBindForSubMesh extends StObject {
  
  var subMesh: SubMesh
}
object MaterialPluginHardBindForSubMesh {
  
  inline def apply(subMesh: SubMesh): MaterialPluginHardBindForSubMesh = {
    val __obj = js.Dynamic.literal(subMesh = subMesh.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaterialPluginHardBindForSubMesh]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaterialPluginHardBindForSubMesh] (val x: Self) extends AnyVal {
    
    inline def setSubMesh(value: SubMesh): Self = StObject.set(x, "subMesh", value.asInstanceOf[js.Any])
  }
}
