package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IMeshUVSpaceRendererOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.MeshUVSpaceRenderer")
@js.native
open class MeshUVSpaceRenderer protected ()
  extends StObject
     with typings.babylonjs.BABYLON.MeshUVSpaceRenderer {
  /**
    * Creates a new MeshUVSpaceRenderer
    * @param mesh The mesh used for the source UV space
    * @param scene The scene the mesh belongs to
    * @param options The options to use when creating the texture
    */
  def this(mesh: typings.babylonjs.BABYLON.AbstractMesh, scene: typings.babylonjs.BABYLON.Scene) = this()
  def this(
    mesh: typings.babylonjs.BABYLON.AbstractMesh,
    scene: typings.babylonjs.BABYLON.Scene,
    options: IMeshUVSpaceRendererOptions
  ) = this()
}
/* static members */
object MeshUVSpaceRenderer {
  
  @JSGlobal("BABYLON.MeshUVSpaceRenderer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.MeshUVSpaceRenderer._GetShader")
  @js.native
  def _GetShader: Any = js.native
  inline def _GetShader_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetShader")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.MeshUVSpaceRenderer._IsRenderTargetTexture")
  @js.native
  def _IsRenderTargetTexture: Any = js.native
  inline def _IsRenderTargetTexture_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsRenderTargetTexture")(x.asInstanceOf[js.Any])
}
