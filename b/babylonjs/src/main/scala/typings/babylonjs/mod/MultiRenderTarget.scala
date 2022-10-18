package typings.babylonjs.mod

import typings.babylonjs.materialsTexturesMultiRenderTargetMod.IMultiRenderTargetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "MultiRenderTarget")
@js.native
open class MultiRenderTarget protected ()
  extends typings.babylonjs.legacyLegacyMod.MultiRenderTarget {
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
    * @param textureNames Define the names to set to the textures (if count > 0 - optional)
    */
  def this(name: String, size: Any, count: Double) = this()
  def this(name: String, size: Any, count: Double, scene: typings.babylonjs.sceneMod.Scene) = this()
  def this(name: String, size: Any, count: Double, scene: Unit, options: IMultiRenderTargetOptions) = this()
  def this(
    name: String,
    size: Any,
    count: Double,
    scene: typings.babylonjs.sceneMod.Scene,
    options: IMultiRenderTargetOptions
  ) = this()
  def this(name: String, size: Any, count: Double, scene: Unit, options: Unit, textureNames: js.Array[String]) = this()
  def this(
    name: String,
    size: Any,
    count: Double,
    scene: Unit,
    options: IMultiRenderTargetOptions,
    textureNames: js.Array[String]
  ) = this()
  def this(
    name: String,
    size: Any,
    count: Double,
    scene: typings.babylonjs.sceneMod.Scene,
    options: Unit,
    textureNames: js.Array[String]
  ) = this()
  def this(
    name: String,
    size: Any,
    count: Double,
    scene: typings.babylonjs.sceneMod.Scene,
    options: IMultiRenderTargetOptions,
    textureNames: js.Array[String]
  ) = this()
}
