package typings.babylonjs.materialsMaterialPluginEventMod

import typings.babylonjs.meshesSubMeshMod.SubMesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaterialPluginBindForSubMesh extends StObject {
  
  var subMesh: SubMesh
}
object MaterialPluginBindForSubMesh {
  
  inline def apply(subMesh: SubMesh): MaterialPluginBindForSubMesh = {
    val __obj = js.Dynamic.literal(subMesh = subMesh.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaterialPluginBindForSubMesh]
  }
  
  extension [Self <: MaterialPluginBindForSubMesh](x: Self) {
    
    inline def setSubMesh(value: SubMesh): Self = StObject.set(x, "subMesh", value.asInstanceOf[js.Any])
  }
}
