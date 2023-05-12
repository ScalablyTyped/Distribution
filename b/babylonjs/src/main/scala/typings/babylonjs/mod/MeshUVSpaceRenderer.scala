package typings.babylonjs.mod

import typings.babylonjs.meshesMeshUVSpaceRendererMod.IMeshUVSpaceRendererOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "MeshUVSpaceRenderer")
@js.native
open class MeshUVSpaceRenderer protected ()
  extends typings.babylonjs.legacyLegacyMod.MeshUVSpaceRenderer {
  /**
    * Creates a new MeshUVSpaceRenderer
    * @param mesh The mesh used for the source UV space
    * @param scene The scene the mesh belongs to
    * @param options The options to use when creating the texture
    */
  def this(
    mesh: typings.babylonjs.meshesAbstractMeshMod.AbstractMesh,
    scene: typings.babylonjs.sceneMod.Scene
  ) = this()
  def this(
    mesh: typings.babylonjs.meshesAbstractMeshMod.AbstractMesh,
    scene: typings.babylonjs.sceneMod.Scene,
    options: IMeshUVSpaceRendererOptions
  ) = this()
}
/* static members */
object MeshUVSpaceRenderer {
  
  @JSImport("babylonjs", "MeshUVSpaceRenderer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs", "MeshUVSpaceRenderer._GetShader")
  @js.native
  def _GetShader: Any = js.native
  inline def _GetShader_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetShader")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "MeshUVSpaceRenderer._IsRenderTargetTexture")
  @js.native
  def _IsRenderTargetTexture: Any = js.native
  inline def _IsRenderTargetTexture_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsRenderTargetTexture")(x.asInstanceOf[js.Any])
}
