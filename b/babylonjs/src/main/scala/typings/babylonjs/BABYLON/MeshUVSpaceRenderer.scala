package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeshUVSpaceRenderer extends StObject {
  
  /* private */ var _createDiffuseRTT: Any = js.native
  
  /* private */ var _createProjectionMatrix: Any = js.native
  
  /* private */ var _createRenderTargetTexture: Any = js.native
  
  /* private */ var _mesh: Any = js.native
  
  /* private */ var _options: Any = js.native
  
  /* private */ var _scene: Any = js.native
  
  /* private */ var _textureCreatedInternally: Any = js.native
  
  /**
    * Clears the texture map
    */
  def clear(): Unit = js.native
  
  /**
    * Clear color of the texture
    */
  var clearColor: Color4 = js.native
  
  /**
    * Disposes of the ressources
    */
  def dispose(): Unit = js.native
  
  /**
    * Checks if the texture is ready to be used
    * @returns true if the texture is ready to be used
    */
  def isReady(): Boolean = js.native
  
  /**
    * Projects and renders a texture in the mesh UV space
    * @param texture The texture
    * @param position The position of the center of projection (world space coordinates)
    * @param normal The direction of the projection (world space coordinates)
    * @param size The size of the projection
    * @param angle The rotation angle around the direction of the projection
    */
  def renderTexture(texture: BaseTexture, position: Vector3, normal: Vector3, size: Vector3): Unit = js.native
  def renderTexture(texture: BaseTexture, position: Vector3, normal: Vector3, size: Vector3, angle: Double): Unit = js.native
  
  /**
    * Target texture used for rendering
    * If you don't set the property, a RenderTargetTexture will be created internally given the options provided to the constructor.
    * If you provide a RenderTargetTexture, it will be used directly.
    */
  var texture: Texture = js.native
}
