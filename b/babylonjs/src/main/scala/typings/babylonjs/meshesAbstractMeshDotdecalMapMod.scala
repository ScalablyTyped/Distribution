package typings.babylonjs

import typings.babylonjs.meshesMeshUVSpaceRendererMod.MeshUVSpaceRenderer
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meshesAbstractMeshDotdecalMapMod {
  
  /* augmented module */
  object babylonjsMeshesAbstractMeshAugmentingMod {
    
    trait AbstractMesh extends StObject {
      
      /** @internal */
      var _decalMap: Nullable[MeshUVSpaceRenderer]
      
      /**
        * Gets or sets the decal map for this mesh
        */
      var decalMap: Nullable[MeshUVSpaceRenderer]
    }
    object AbstractMesh {
      
      inline def apply(): AbstractMesh = {
        val __obj = js.Dynamic.literal(_decalMap = null, decalMap = null)
        __obj.asInstanceOf[AbstractMesh]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: AbstractMesh] (val x: Self) extends AnyVal {
        
        inline def setDecalMap(value: Nullable[MeshUVSpaceRenderer]): Self = StObject.set(x, "decalMap", value.asInstanceOf[js.Any])
        
        inline def setDecalMapNull: Self = StObject.set(x, "decalMap", null)
        
        inline def set_decalMap(value: Nullable[MeshUVSpaceRenderer]): Self = StObject.set(x, "_decalMap", value.asInstanceOf[js.Any])
        
        inline def set_decalMapNull: Self = StObject.set(x, "_decalMap", null)
      }
    }
  }
}
