package typings.babylonjs.meshesIndexMod

import typings.babylonjs.meshesMeshUVSpaceRendererMod.IMeshUVSpaceRendererOptions
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Meshes/index", "MeshUVSpaceRenderer")
@js.native
open class MeshUVSpaceRenderer protected ()
  extends typings.babylonjs.meshesMeshUVSpaceRendererMod.MeshUVSpaceRenderer {
  /**
    * Creates a new MeshUVSpaceRenderer
    * @param mesh The mesh used for the source UV space
    * @param scene The scene the mesh belongs to
    * @param options The options to use when creating the texture
    */
  def this(mesh: typings.babylonjs.meshesAbstractMeshMod.AbstractMesh, scene: Scene) = this()
  def this(
    mesh: typings.babylonjs.meshesAbstractMeshMod.AbstractMesh,
    scene: Scene,
    options: IMeshUVSpaceRendererOptions
  ) = this()
}
/* static members */
object MeshUVSpaceRenderer {
  
  @JSImport("babylonjs/Meshes/index", "MeshUVSpaceRenderer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Meshes/index", "MeshUVSpaceRenderer._GetShader")
  @js.native
  def _GetShader: Any = js.native
  inline def _GetShader_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetShader")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Meshes/index", "MeshUVSpaceRenderer._IsRenderTargetTexture")
  @js.native
  def _IsRenderTargetTexture: Any = js.native
  inline def _IsRenderTargetTexture_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsRenderTargetTexture")(x.asInstanceOf[js.Any])
}
