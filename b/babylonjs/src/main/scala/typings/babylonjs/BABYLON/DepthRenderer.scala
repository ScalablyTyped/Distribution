package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DepthRenderer extends StObject {
  
  /* private */ var _camera: Any = js.native
  
  /* private */ val _clearColor: Any = js.native
  
  /* private */ var _depthMap: Any = js.native
  
  /* private */ var _scene: Any = js.native
  
  /* private */ val _storeNonLinearDepth: Any = js.native
  
  /**
    * Disposes of the depth renderer.
    */
  def dispose(): Unit = js.native
  
  /** Enable or disable the depth renderer. When disabled, the depth texture is not updated */
  var enabled: Boolean = js.native
  
  /** Force writing the transparent objects into the depth map */
  var forceDepthWriteTransparentMeshes: Boolean = js.native
  
  /**
    * Gets the texture which the depth map will be written to.
    * @returns The depth map texture
    */
  def getDepthMap(): RenderTargetTexture = js.native
  
  /** Get if the depth renderer is using packed depth or not */
  val isPacked: Boolean = js.native
  
  /**
    * Creates the depth rendering effect and checks if the effect is ready.
    * @param subMesh The submesh to be used to render the depth map of
    * @param useInstances If multiple world instances should be used
    * @returns if the depth renderer is ready to render the depth map
    */
  def isReady(subMesh: SubMesh, useInstances: Boolean): Boolean = js.native
  
  def setMaterialForRendering(mesh: js.Array[AbstractMesh]): Unit = js.native
  def setMaterialForRendering(mesh: js.Array[AbstractMesh], material: Material): Unit = js.native
  /**
    * Sets a specific material to be used to render a mesh/a list of meshes by the depth renderer
    * @param mesh mesh or array of meshes
    * @param material material to use by the depth render when rendering the mesh(es). If undefined is passed, the specific material created by the depth renderer will be used.
    */
  def setMaterialForRendering(mesh: AbstractMesh): Unit = js.native
  def setMaterialForRendering(mesh: AbstractMesh, material: Material): Unit = js.native
  
  /**
    * Specifies that the depth renderer will only be used within
    * the camera it is created for.
    * This can help forcing its rendering during the camera processing.
    */
  var useOnlyInActiveCamera: Boolean = js.native
}
