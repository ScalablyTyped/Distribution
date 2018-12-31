package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface describing the different options available in the rendering manager
  * regarding Auto Clear between groups.
  */
trait IRenderingManagerAutoClearSetup extends js.Object {
  /**
    * Defines whether or not autoclear is enable.
    */
  var autoClear: scala.Boolean
  /**
    * Defines whether or not to autoclear the depth buffer.
    */
  var depth: scala.Boolean
  /**
    * Defines whether or not to autoclear the stencil buffer.
    */
  var stencil: scala.Boolean
}

