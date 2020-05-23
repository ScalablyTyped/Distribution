package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDisplayChangedEventArgs extends js.Object {
  /** Gets the vrDisplay object (if any) */
  var vrDisplay: Nullable[_]
  /** Gets a boolean indicating if webVR is supported */
  var vrSupported: Boolean
}

object IDisplayChangedEventArgs {
  @scala.inline
  def apply(vrSupported: Boolean, vrDisplay: Nullable[_] = null): IDisplayChangedEventArgs = {
    val __obj = js.Dynamic.literal(vrSupported = vrSupported.asInstanceOf[js.Any], vrDisplay = vrDisplay.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDisplayChangedEventArgs]
  }
}

