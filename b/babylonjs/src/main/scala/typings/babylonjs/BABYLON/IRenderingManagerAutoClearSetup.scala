package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRenderingManagerAutoClearSetup extends js.Object {
  /**
    * Defines whether or not autoclear is enable.
    */
  var autoClear: Boolean
  /**
    * Defines whether or not to autoclear the depth buffer.
    */
  var depth: Boolean
  /**
    * Defines whether or not to autoclear the stencil buffer.
    */
  var stencil: Boolean
}

object IRenderingManagerAutoClearSetup {
  @scala.inline
  def apply(autoClear: Boolean, depth: Boolean, stencil: Boolean): IRenderingManagerAutoClearSetup = {
    val __obj = js.Dynamic.literal(autoClear = autoClear.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], stencil = stencil.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IRenderingManagerAutoClearSetup]
  }
}

