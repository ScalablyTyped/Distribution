package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebXRFeature extends IDisposable {
  
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
    * Is this feature attached
    */
  var attached: Boolean = js.native
  
  /**
    * A list of (Babylon WebXR) features this feature depends on
    */
  var dependsOn: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Detach the feature from the session
    * Will usually be called by the features manager
    *
    * @returns true if successful.
    */
  def detach(): Boolean = js.native
  
  /**
    * Should auto-attach be disabled?
    */
  var disableAutoAttach: Boolean = js.native
  
  /**
    * This function will be executed during before enabling the feature and can be used to not-allow enabling it.
    * Note that at this point the session has NOT started, so this is purely checking if the browser supports it
    *
    * @returns whether or not the feature is compatible in this environment
    */
  def isCompatible(): Boolean = js.native
  
  /**
    * Was this feature disposed;
    */
  var isDisposed: Boolean = js.native
  
  /**
    * The name of the native xr feature name, if applicable (like anchor, hit-test, or hand-tracking)
    */
  var xrNativeFeatureName: js.UndefOr[String] = js.native
}
