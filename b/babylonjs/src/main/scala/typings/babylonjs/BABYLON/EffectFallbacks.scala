package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EffectFallbacks
  extends StObject
     with IEffectFallbacks {
  
  /* private */ var _currentRank: Any = js.native
  
  /* private */ var _defines: Any = js.native
  
  /* private */ var _maxRank: Any = js.native
  
  /* private */ var _mesh: Any = js.native
  
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
    * Checks to see if more fallbacks are still available.
    */
  @JSName("hasMoreFallbacks")
  def hasMoreFallbacks_MEffectFallbacks: Boolean = js.native
}
