package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Internal interface used to track InternalTexture already bound to the GL context
  */
trait IInternalTextureTracker extends js.Object {
  /**
    * Gets or set the next tracker in the list
    */
  var next: Nullable[IInternalTextureTracker]
  /**
    * Gets or set the previous tracker in the list
    */
  var previous: Nullable[IInternalTextureTracker]
}

