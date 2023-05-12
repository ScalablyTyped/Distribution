package typings.babylonjs

import typings.babylonjs.materialsMaterialDotdecalMapConfigurationMod.DecalMapConfiguration
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsStandardMaterialDotdecalMapMod {
  
  /* augmented module */
  object babylonjsMaterialsStandardMaterialAugmentingMod {
    
    trait StandardMaterial extends StObject {
      
      /** @internal */
      var _decalMap: Nullable[DecalMapConfiguration]
      
      /**
        * Defines the decal map parameters for the material.
        */
      var decalMap: Nullable[DecalMapConfiguration]
    }
    object StandardMaterial {
      
      inline def apply(): StandardMaterial = {
        val __obj = js.Dynamic.literal(_decalMap = null, decalMap = null)
        __obj.asInstanceOf[StandardMaterial]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: StandardMaterial] (val x: Self) extends AnyVal {
        
        inline def setDecalMap(value: Nullable[DecalMapConfiguration]): Self = StObject.set(x, "decalMap", value.asInstanceOf[js.Any])
        
        inline def setDecalMapNull: Self = StObject.set(x, "decalMap", null)
        
        inline def set_decalMap(value: Nullable[DecalMapConfiguration]): Self = StObject.set(x, "_decalMap", value.asInstanceOf[js.Any])
        
        inline def set_decalMapNull: Self = StObject.set(x, "_decalMap", null)
      }
    }
  }
}
