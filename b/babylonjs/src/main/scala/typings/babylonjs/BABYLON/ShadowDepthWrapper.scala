package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShadowDepthWrapper extends StObject {
  
  /* private */ var _baseMaterial: Any = js.native
  
  /* private */ var _makeEffect: Any = js.native
  
  /* private */ var _meshes: Any = js.native
  
  /* private */ var _onEffectCreatedObserver: Any = js.native
  
  /* private */ var _options: Any = js.native
  
  /* private */ var _scene: Any = js.native
  
  /* private */ var _subMeshToDepthWrapper: Any = js.native
  
  /* private */ var _subMeshToEffect: Any = js.native
  
  /** Gets the base material the wrapper is built upon */
  def baseMaterial: Material = js.native
  
  /**
    * Disposes the resources
    */
  def dispose(): Unit = js.native
  
  /** Gets the doNotInjectCode status of the wrapper */
  def doNotInjectCode: Boolean = js.native
  
  /**
    * Gets the effect to use to generate the depth map
    * @param subMesh subMesh to get the effect for
    * @param shadowGenerator shadow generator to get the effect for
    * @param passIdForDrawWrapper Id of the pass for which the effect from the draw wrapper must be retrieved from
    * @returns the effect to use to generate the depth map for the subMesh + shadow generator specified
    */
  def getEffect(subMesh: Nullable[SubMesh], shadowGenerator: ShadowGenerator, passIdForDrawWrapper: Double): Nullable[DrawWrapper] = js.native
  
  /**
    * Specifies that the submesh is ready to be used for depth rendering
    * @param subMesh submesh to check
    * @param defines the list of defines to take into account when checking the effect
    * @param shadowGenerator combined with subMesh, it defines the effect to check
    * @param useInstances specifies that instances should be used
    * @param passIdForDrawWrapper Id of the pass for which the draw wrapper should be created
    * @returns a boolean indicating that the submesh is ready or not
    */
  def isReadyForSubMesh(
    subMesh: SubMesh,
    defines: js.Array[String],
    shadowGenerator: ShadowGenerator,
    useInstances: Boolean,
    passIdForDrawWrapper: Double
  ): Boolean = js.native
  
  /** Gets the standalone status of the wrapper */
  def standalone: Boolean = js.native
}
