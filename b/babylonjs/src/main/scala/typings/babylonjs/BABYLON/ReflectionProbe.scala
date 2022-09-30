package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReflectionProbe extends StObject {
  
  /* private */ var _add: Any = js.native
  
  /* private */ var _attachedMesh: Any = js.native
  
  /* private */ var _currentSceneUBO: Any = js.native
  
  /* private */ var _invertYAxis: Any = js.native
  
  /** @internal */
  var _parentContainer: Nullable[AbstractScene] = js.native
  
  /* private */ var _projectionMatrix: Any = js.native
  
  /* private */ var _renderTargetTexture: Any = js.native
  
  /* private */ var _scene: Any = js.native
  
  /* private */ var _sceneUBOs: Any = js.native
  
  /* private */ var _target: Any = js.native
  
  /* private */ var _viewMatrix: Any = js.native
  
  /**
    * Attach the probe to a specific mesh (Rendering will be done from attached mesh's position)
    * @param mesh defines the mesh to attach to
    */
  def attachToMesh(mesh: Nullable[AbstractMesh]): Unit = js.native
  
  /** Gets the internal CubeTexture used to render to */
  def cubeTexture: RenderTargetTexture = js.native
  
  /**
    * Clean all associated resources
    */
  def dispose(): Unit = js.native
  
  /**
    * Get the class name of the refection probe.
    * @returns "ReflectionProbe"
    */
  def getClassName(): String = js.native
  
  /**
    * Gets the hosting scene
    * @returns a Scene
    */
  def getScene(): Scene = js.native
  
  /**
    * Gets or sets an object used to store user defined information for the reflection probe.
    */
  var metadata: Any = js.native
  
  /** defines the name of the probe */
  var name: String = js.native
  
  /** Gets or sets probe position (center of the cube map) */
  var position: Vector3 = js.native
  
  /** Gets or sets the refresh rate to use (on every frame by default) */
  def refreshRate: Double = js.native
  def refreshRate_=(value: Double): Unit = js.native
  
  /** Gets the list of meshes to render */
  def renderList: Nullable[js.Array[AbstractMesh]] = js.native
  
  /** Gets or sets the number of samples to use for multi-sampling (0 by default). Required WebGL2 */
  def samples: Double = js.native
  def samples_=(value: Double): Unit = js.native
  
  /**
    * Serialize the reflection probe to a JSON representation we can easily use in the respective Parse function.
    * @returns The JSON representation of the texture
    */
  def serialize(): Any = js.native
  
  /**
    * Specifies whether or not the stencil and depth buffer are cleared between two rendering groups
    * @param renderingGroupId The rendering group id corresponding to its index
    * @param autoClearDepthStencil Automatically clears depth and stencil between groups if true.
    */
  def setRenderingAutoClearDepthStencil(renderingGroupId: Double, autoClearDepthStencil: Boolean): Unit = js.native
  
  def toString(fullDetails: Boolean): String = js.native
}
