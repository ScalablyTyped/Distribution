package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the interface used by display changed events
  */
trait IDisplayChangedEventArgs extends js.Object {
  /** Gets the vrDisplay object (if any) */
  var vrDisplay: Nullable[_]
  /** Gets a boolean indicating if webVR is supported */
  var vrSupported: scala.Boolean
}

object IDisplayChangedEventArgs {
  @scala.inline
  def apply(vrDisplay: Nullable[_], vrSupported: scala.Boolean): IDisplayChangedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("vrDisplay")(vrDisplay.asInstanceOf[js.Any])
    __obj.updateDynamic("vrSupported")(vrSupported)
    __obj.asInstanceOf[IDisplayChangedEventArgs]
  }
}

