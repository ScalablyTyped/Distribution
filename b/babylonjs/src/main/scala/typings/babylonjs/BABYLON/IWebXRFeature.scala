package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWebXRFeature extends IDisposable {
  /**
    * Is this feature attached
    */
  var attached: Boolean = js.native
  /**
    * Should auto-attach be disabled?
    */
  var disableAutoAttach: Boolean = js.native
  /**
    * Attach the feature to the session
    * Will usually be called by the features manager
    *
    * @param force should attachment be forced (even when already attached)
    * @returns true if successful.
    */
  def attach(): Boolean = js.native
  def attach(force: Boolean): Boolean = js.native
  /**
    * Detach the feature from the session
    * Will usually be called by the features manager
    *
    * @returns true if successful.
    */
  def detach(): Boolean = js.native
}

