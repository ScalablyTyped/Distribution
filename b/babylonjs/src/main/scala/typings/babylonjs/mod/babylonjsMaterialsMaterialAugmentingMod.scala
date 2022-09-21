package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsMaterialsMaterialAugmentingMod {
  
  trait Material extends StObject {
    
    /**
      * Plugin manager for this material
      */
    var pluginManager: js.UndefOr[typings.babylonjs.materialPluginManagerMod.MaterialPluginManager] = js.undefined
  }
  object Material {
    
    inline def apply(): typings.babylonjs.mod.babylonjsMaterialsMaterialAugmentingMod.Material = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.babylonjs.mod.babylonjsMaterialsMaterialAugmentingMod.Material]
    }
    
    extension [Self <: typings.babylonjs.mod.babylonjsMaterialsMaterialAugmentingMod.Material](x: Self) {
      
      inline def setPluginManager(value: typings.babylonjs.materialPluginManagerMod.MaterialPluginManager): Self = StObject.set(x, "pluginManager", value.asInstanceOf[js.Any])
      
      inline def setPluginManagerUndefined: Self = StObject.set(x, "pluginManager", js.undefined)
    }
  }
}
