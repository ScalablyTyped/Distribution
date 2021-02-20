package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShadowDepthWrapper extends StObject {
  
  var _baseMaterial: js.Any = js.native
  
  var _makeEffect: js.Any = js.native
  
  /** @hidden */
  var _matriceNames: js.Any = js.native
  
  var _meshes: js.Any = js.native
  
  var _onEffectCreatedObserver: js.Any = js.native
  
  var _options: js.Any = js.native
  
  var _scene: js.Any = js.native
  
  var _subMeshToDepthEffect: js.Any = js.native
  
  var _subMeshToEffect: js.Any = js.native
  
  /** Gets the base material the wrapper is built upon */
  def baseMaterial: Material = js.native
  
  /**
    * Disposes the resources
    */
  def dispose(): Unit = js.native
  
  /**
    * Gets the effect to use to generate the depth map
    * @param subMesh subMesh to get the effect for
    * @param shadowGenerator shadow generator to get the effect for
    * @returns the effect to use to generate the depth map for the subMesh + shadow generator specified
    */
  def getEffect(subMesh: Nullable[SubMesh], shadowGenerator: ShadowGenerator): Nullable[Effect] = js.native
  
  /**
    * Specifies that the submesh is ready to be used for depth rendering
    * @param subMesh submesh to check
    * @param defines the list of defines to take into account when checking the effect
    * @param shadowGenerator combined with subMesh, it defines the effect to check
    * @param useInstances specifies that instances should be used
    * @returns a boolean indicating that the submesh is ready or not
    */
  def isReadyForSubMesh(
    subMesh: SubMesh,
    defines: js.Array[String],
    shadowGenerator: ShadowGenerator,
    useInstances: Boolean
  ): Boolean = js.native
  
  /** Gets the standalone status of the wrapper */
  def standalone: Boolean = js.native
}
