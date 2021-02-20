package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IMultiRenderTargetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.MultiRenderTarget")
@js.native
class MultiRenderTarget protected ()
  extends typings.babylonjs.BABYLON.MultiRenderTarget {
  /**
    * Instantiate a new multi render target texture.
    * A multi render target, like a render target provides the ability to render to a texture.
    * Unlike the render target, it can render to several draw buffers in one draw.
    * This is specially interesting in deferred rendering or for any effects requiring more than
    * just one color from a single pass.
    * @param name Define the name of the texture
    * @param size Define the size of the buffers to render to
    * @param count Define the number of target we are rendering into
    * @param scene Define the scene the texture belongs to
    * @param options Define the options used to create the multi render target
    */
  def this(name: String, size: js.Any, count: Double, scene: typings.babylonjs.BABYLON.Scene) = this()
  def this(
    name: String,
    size: js.Any,
    count: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    options: IMultiRenderTargetOptions
  ) = this()
}
