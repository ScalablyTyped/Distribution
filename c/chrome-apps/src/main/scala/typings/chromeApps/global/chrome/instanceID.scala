package typings.chromeApps.global.chrome

import typings.chromeApps.chrome.instanceID.DeleteTokenParams
import typings.chromeApps.chrome.instanceID.TokenParams
import typings.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object instanceID {
  
  @JSGlobal("chrome.instanceID")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Fired when all the granted tokens need to be refreshed.
    * @param callback Function called when the deletion completes.
    *                 The instance identifier was revoked successfully if runtime.lastError is not set.
    */
  @scala.inline
  def deleteID(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteID")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Revokes a granted token.
    * @param deleteTokenParams Parameters for deleteToken.
    * @param callback Function called when the token deletion completes.
    *                 The token was revoked successfully if runtime.lastError is not set.
    */
  @scala.inline
  def deleteToken(deleteTokenParams: DeleteTokenParams, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteToken")(deleteTokenParams.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Retrieves the time when the InstanceID has been generated.
    * The creation time will be returned by the callback.
    * @param callback Function called when the retrieval completes.
    *                 It should check runtime.lastError for error when creationTime is zero.
    *                 Provides `creationTime` (double)
    *                  > The time when the Instance ID has been generated, represented in milliseconds since the epoch.
    */
  @scala.inline
  def getCreationTime(callback: js.Function1[/* creationTime */ integer, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getCreationTime")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Retrieves an identifier for the app instance.
    * The instance ID will be returned by the callback.
    * The same ID will be returned as long as the application
    * identity has not been revoked or expired.
    * @param callback Function called when the retrieval completes.
    *                 It should check runtime.lastError for error when instanceID is empty.
    *                 Will be provided with instanceID: An Instance ID assigned to the app instance.
    */
  @scala.inline
  def getID(callback: js.Function1[/* instanceId */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getID")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Return a token that allows the authorized entity to access the service defined by scope.
    * @param getTokenParams Parameters for getToken.
    * @param callback Function called when the retrieval completes. It should check runtime.lastError for error when token is empty.
    */
  @scala.inline
  def getToken(getTokenParams: TokenParams, callback: js.Function1[/* token */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getToken")(getTokenParams.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** Fired when all the granted tokens need to be refreshed. */
  @JSGlobal("chrome.instanceID.onTokenRefresh")
  @js.native
  val onTokenRefresh: typings.chromeApps.chrome.events.Event[js.Function0[Unit]] = js.native
}
