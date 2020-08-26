package typings.chromeApps.global.chrome

import typings.chromeApps.chrome.instanceID.DeleteTokenParams
import typings.chromeApps.chrome.instanceID.TokenParams
import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #region chrome.instanceID
////////////////
// InstanceID //
////////////////
/**
  * Use chrome.instanceID to access the Instance ID service.
  * @requires Permissions: 'gcm'
  * @since Chrome 46
  */
@JSGlobal("chrome.instanceID")
@js.native
object instanceID extends js.Object {
  /** Fired when all the granted tokens need to be refreshed. */
  val onTokenRefresh: typings.chromeApps.chrome.events.Event[js.Function0[Unit]] = js.native
  /**
    * Fired when all the granted tokens need to be refreshed.
    * @param callback Function called when the deletion completes.
    *                 The instance identifier was revoked successfully if runtime.lastError is not set.
    */
  def deleteID(callback: js.Function0[Unit]): Unit = js.native
  /**
    * Revokes a granted token.
    * @param deleteTokenParams Parameters for deleteToken.
    * @param callback Function called when the token deletion completes.
    *                 The token was revoked successfully if runtime.lastError is not set.
    */
  def deleteToken(deleteTokenParams: DeleteTokenParams, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Retrieves the time when the InstanceID has been generated.
    * The creation time will be returned by the callback.
    * @param callback Function called when the retrieval completes.
    *                 It should check runtime.lastError for error when creationTime is zero.
    *                 Provides `creationTime` (double)
    *                  > The time when the Instance ID has been generated, represented in milliseconds since the epoch.
    */
  def getCreationTime(callback: js.Function1[/* creationTime */ integer, Unit]): Unit = js.native
  /**
    * Retrieves an identifier for the app instance.
    * The instance ID will be returned by the callback.
    * The same ID will be returned as long as the application
    * identity has not been revoked or expired.
    * @param callback Function called when the retrieval completes.
    *                 It should check runtime.lastError for error when instanceID is empty.
    *                 Will be provided with instanceID: An Instance ID assigned to the app instance.
    */
  def getID(callback: js.Function1[/* instanceId */ String, Unit]): Unit = js.native
  /**
    * Return a token that allows the authorized entity to access the service defined by scope.
    * @param getTokenParams Parameters for getToken.
    * @param callback Function called when the retrieval completes. It should check runtime.lastError for error when token is empty.
    */
  def getToken(getTokenParams: TokenParams, callback: js.Function1[/* token */ String, Unit]): Unit = js.native
}

