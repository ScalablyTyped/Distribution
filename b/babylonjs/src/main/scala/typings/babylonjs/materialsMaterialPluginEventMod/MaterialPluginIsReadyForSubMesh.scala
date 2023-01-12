package typings.babylonjs.materialsMaterialPluginEventMod

import typings.babylonjs.materialsMaterialDefinesMod.MaterialDefines
import typings.babylonjs.meshesSubMeshMod.SubMesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaterialPluginIsReadyForSubMesh extends StObject {
  
  var defines: MaterialDefines
  
  var isReadyForSubMesh: Boolean
  
  var subMesh: SubMesh
}
object MaterialPluginIsReadyForSubMesh {
  
  inline def apply(defines: MaterialDefines, isReadyForSubMesh: Boolean, subMesh: SubMesh): MaterialPluginIsReadyForSubMesh = {
    val __obj = js.Dynamic.literal(defines = defines.asInstanceOf[js.Any], isReadyForSubMesh = isReadyForSubMesh.asInstanceOf[js.Any], subMesh = subMesh.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaterialPluginIsReadyForSubMesh]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaterialPluginIsReadyForSubMesh] (val x: Self) extends AnyVal {
    
    inline def setDefines(value: MaterialDefines): Self = StObject.set(x, "defines", value.asInstanceOf[js.Any])
    
    inline def setIsReadyForSubMesh(value: Boolean): Self = StObject.set(x, "isReadyForSubMesh", value.asInstanceOf[js.Any])
    
    inline def setSubMesh(value: SubMesh): Self = StObject.set(x, "subMesh", value.asInstanceOf[js.Any])
  }
}
