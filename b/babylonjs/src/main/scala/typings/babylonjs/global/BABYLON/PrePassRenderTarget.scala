package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IMultiRenderTargetOptions
import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PrePassRenderTarget")
@js.native
open class PrePassRenderTarget protected ()
  extends StObject
     with typings.babylonjs.BABYLON.PrePassRenderTarget {
  def this(
    name: String,
    renderTargetTexture: Nullable[typings.babylonjs.BABYLON.RenderTargetTexture],
    size: Any,
    count: Double
  ) = this()
  def this(
    name: String,
    renderTargetTexture: Nullable[typings.babylonjs.BABYLON.RenderTargetTexture],
    size: Any,
    count: Double,
    scene: typings.babylonjs.BABYLON.Scene
  ) = this()
  def this(
    name: String,
    renderTargetTexture: Nullable[typings.babylonjs.BABYLON.RenderTargetTexture],
    size: Any,
    count: Double,
    scene: Unit,
    options: IMultiRenderTargetOptions
  ) = this()
  def this(
    name: String,
    renderTargetTexture: Nullable[typings.babylonjs.BABYLON.RenderTargetTexture],
    size: Any,
    count: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    options: IMultiRenderTargetOptions
  ) = this()
  
  /**
    * Array of animations
    */
  /* CompleteClass */
  var animations: Nullable[js.Array[typings.babylonjs.BABYLON.Animation]] = js.native
  
  /**
    * Entry point to access the wrapper on a texture.
    */
  /* CompleteClass */
  var renderTarget: Nullable[typings.babylonjs.BABYLON.RenderTargetWrapper] = js.native
}
