package typings.babylonjs.legacyLegacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsMaterialsMaterialAugmentingMod {
  
  trait Material extends StObject {
    
    /**
      * Plugin manager for this material
      */
    var pluginManager: js.UndefOr[typings.babylonjs.materialsMaterialPluginManagerMod.MaterialPluginManager] = js.undefined
  }
  object Material {
    
    inline def apply(): typings.babylonjs.legacyLegacyMod.babylonjsMaterialsMaterialAugmentingMod.Material = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.babylonjs.legacyLegacyMod.babylonjsMaterialsMaterialAugmentingMod.Material]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.babylonjs.legacyLegacyMod.babylonjsMaterialsMaterialAugmentingMod.Material] (val x: Self) extends AnyVal {
      
      inline def setPluginManager(value: typings.babylonjs.materialsMaterialPluginManagerMod.MaterialPluginManager): Self = StObject.set(x, "pluginManager", value.asInstanceOf[js.Any])
      
      inline def setPluginManagerUndefined: Self = StObject.set(x, "pluginManager", js.undefined)
    }
  }
}
