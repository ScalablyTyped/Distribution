package typings.babylonjs

import typings.babylonjs.materialsMaterialDotdecalMapConfigurationMod.DecalMapConfiguration
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsPbrPbrMaterialDotdecalMapMod {
  
  /* augmented module */
  object babylonjsMaterialsPBRPbrBaseMaterialAugmentingMod {
    
    trait PBRBaseMaterial extends StObject {
      
      /** @internal */
      var _decalMap: Nullable[DecalMapConfiguration]
      
      /**
        * Defines the decal map parameters for the material.
        */
      var decalMap: Nullable[DecalMapConfiguration]
    }
    object PBRBaseMaterial {
      
      inline def apply(): PBRBaseMaterial = {
        val __obj = js.Dynamic.literal(_decalMap = null, decalMap = null)
        __obj.asInstanceOf[PBRBaseMaterial]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: PBRBaseMaterial] (val x: Self) extends AnyVal {
        
        inline def setDecalMap(value: Nullable[DecalMapConfiguration]): Self = StObject.set(x, "decalMap", value.asInstanceOf[js.Any])
        
        inline def setDecalMapNull: Self = StObject.set(x, "decalMap", null)
        
        inline def set_decalMap(value: Nullable[DecalMapConfiguration]): Self = StObject.set(x, "_decalMap", value.asInstanceOf[js.Any])
        
        inline def set_decalMapNull: Self = StObject.set(x, "_decalMap", null)
      }
    }
  }
}
