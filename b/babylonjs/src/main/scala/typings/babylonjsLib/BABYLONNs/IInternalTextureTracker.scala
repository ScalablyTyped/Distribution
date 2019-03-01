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

object IInternalTextureTracker {
  @scala.inline
  def apply(next: Nullable[IInternalTextureTracker], previous: Nullable[IInternalTextureTracker]): IInternalTextureTracker = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    __obj.updateDynamic("previous")(previous.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInternalTextureTracker]
  }
}

