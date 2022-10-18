package typings.babylonjs.materialsMaterialPluginEventMod

import typings.babylonjs.materialsMaterialDefinesMod.MaterialDefines
import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaterialPluginPrepareDefines extends StObject {
  
  var defines: MaterialDefines
  
  var mesh: AbstractMesh
}
object MaterialPluginPrepareDefines {
  
  inline def apply(defines: MaterialDefines, mesh: AbstractMesh): MaterialPluginPrepareDefines = {
    val __obj = js.Dynamic.literal(defines = defines.asInstanceOf[js.Any], mesh = mesh.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaterialPluginPrepareDefines]
  }
  
  extension [Self <: MaterialPluginPrepareDefines](x: Self) {
    
    inline def setDefines(value: MaterialDefines): Self = StObject.set(x, "defines", value.asInstanceOf[js.Any])
    
    inline def setMesh(value: AbstractMesh): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
  }
}
