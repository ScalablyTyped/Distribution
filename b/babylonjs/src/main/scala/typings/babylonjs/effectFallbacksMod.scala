package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.iEffectFallbacksMod.IEffectFallbacks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object effectFallbacksMod {
  
  @JSImport("babylonjs/Materials/effectFallbacks", "EffectFallbacks")
  @js.native
  class EffectFallbacks () extends IEffectFallbacks {
    
    var _currentRank: js.Any = js.native
    
    var _defines: js.Any = js.native
    
    var _maxRank: js.Any = js.native
    
    var _mesh: js.Any = js.native
    
    /**
      * Sets the mesh to use CPU skinning when needing to fallback.
      * @param rank The rank of the fallback (Lower ranks will be fallbacked to first)
      * @param mesh The mesh to use the fallbacks.
      */
    def addCPUSkinningFallback(rank: Double, mesh: AbstractMesh): Unit = js.native
    
    /**
      * Adds a fallback on the specified property.
      * @param rank The rank of the fallback (Lower ranks will be fallbacked to first)
      * @param define The name of the define in the shader
      */
    def addFallback(rank: Double, define: String): Unit = js.native
    
    /**
      * Checks to see if more fallbacks are still availible.
      */
    @JSName("hasMoreFallbacks")
    def hasMoreFallbacks_MEffectFallbacks: Boolean = js.native
  }
}
