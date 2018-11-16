package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A multi render target, like a render target provides the ability to render to a texture.
     * Unlike the render target, it can render to several draw buffers in one draw.
     * This is specially interesting in deferred rendering or for any effects requiring more than
     * just one color from a single pass.
     */
@JSImport("babylonjs", "MultiRenderTarget")
@js.native
class MultiRenderTarget protected ()
  extends babylonjsLib.BABYLONNs.MultiRenderTarget {
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
  def this(name: java.lang.String, size: js.Any, count: scala.Double, scene: babylonjsLib.BABYLONNs.Scene) = this()
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
  def this(name: java.lang.String, size: js.Any, count: scala.Double, scene: babylonjsLib.BABYLONNs.Scene, options: babylonjsLib.BABYLONNs.IMultiRenderTargetOptions) = this()
}

