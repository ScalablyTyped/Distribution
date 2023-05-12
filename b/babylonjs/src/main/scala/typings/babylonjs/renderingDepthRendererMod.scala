package typings.babylonjs

import typings.babylonjs.camerasCameraMod.Camera
import typings.babylonjs.materialsMaterialMod.Material
import typings.babylonjs.materialsTexturesRenderTargetTextureMod.RenderTargetTexture
import typings.babylonjs.mathsMathDotcolorMod.Color4
import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typings.babylonjs.meshesSubMeshMod.SubMesh
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderingDepthRendererMod {
  
  @JSImport("babylonjs/Rendering/depthRenderer", "DepthRenderer")
  @js.native
  open class DepthRenderer protected () extends StObject {
    /**
      * Instantiates a depth renderer
      * @param scene The scene the renderer belongs to
      * @param type The texture type of the depth map (default: Engine.TEXTURETYPE_FLOAT)
      * @param camera The camera to be used to render the depth map (default: scene's active camera)
      * @param storeNonLinearDepth Defines whether the depth is stored linearly like in Babylon Shadows or directly like glFragCoord.z
      * @param samplingMode The sampling mode to be used with the render target (Linear, Nearest...) (default: TRILINEAR_SAMPLINGMODE)
      * @param storeCameraSpaceZ Defines whether the depth stored is the Z coordinate in camera space. If true, storeNonLinearDepth has no effect. (Default: false)
      * @param name Name of the render target (default: DepthRenderer)
      */
    def this(
      scene: Scene,
      `type`: js.UndefOr[Double],
      camera: js.UndefOr[Nullable[Camera]],
      storeNonLinearDepth: js.UndefOr[Boolean],
      samplingMode: js.UndefOr[Double],
      storeCameraSpaceZ: js.UndefOr[Boolean],
      name: js.UndefOr[String]
    ) = this()
    
    /* private */ var _camera: Any = js.native
    
    /* private */ var _depthMap: Any = js.native
    
    /* private */ var _scene: Any = js.native
    
    /* private */ val _storeCameraSpaceZ: Any = js.native
    
    /* private */ val _storeNonLinearDepth: Any = js.native
    
    /** Color used to clear the depth texture. Default: (1,0,0,1) */
    var clearColor: Color4 = js.native
    
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
    
    /** If true, reverse the culling of materials before writing to the depth texture.
      * So, basically, when "true", back facing instead of front facing faces are rasterized into the texture
      */
    var reverseCulling: Boolean = js.native
    
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
  /* static members */
  object DepthRenderer {
    
    @JSImport("babylonjs/Rendering/depthRenderer", "DepthRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @internal
      */
    inline def _SceneComponentInitialization(scene: Scene): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_SceneComponentInitialization")(scene.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
