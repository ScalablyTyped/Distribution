package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackCreationTime extends js.Object {
  /** Fired when all the granted tokens need to be refreshed. */
  val onTokenRefresh: chromeDashAppsLib.chromeNs.eventsNs.Event[js.Function0[scala.Unit]]
  /**
    * Fired when all the granted tokens need to be refreshed.
    * @param callback Function called when the deletion completes.
    *                 The instance identifier was revoked successfully if runtime.lastError is not set.
    */
  def deleteID(callback: js.Function0[scala.Unit]): scala.Unit
  /**
    * Revokes a granted token.
    * @param deleteTokenParams Parameters for deleteToken.
    * @param callback Function called when the token deletion completes.
    *                 The token was revoked successfully if runtime.lastError is not set.
    */
  def deleteToken(
    deleteTokenParams: chromeDashAppsLib.chromeNs.instanceIDNs.DeleteTokenParams,
    callback: js.Function0[scala.Unit]
  ): scala.Unit
  /**
    * Retrieves the time when the InstanceID has been generated.
    * The creation time will be returned by the callback.
    * @param callback Function called when the retrieval completes.
    *                 It should check runtime.lastError for error when creationTime is zero.
    *                 Provides `creationTime` (double)
    *                  > The time when the Instance ID has been generated, represented in milliseconds since the epoch.
    */
  def getCreationTime(callback: js.Function1[/* creationTime */ chromeDashAppsLib.chromeNs.integer, scala.Unit]): scala.Unit
  /**
    * Retrieves an identifier for the app instance.
    * The instance ID will be returned by the callback.
    * The same ID will be returned as long as the application
    * identity has not been revoked or expired.
    * @param callback Function called when the retrieval completes.
    *                 It should check runtime.lastError for error when instanceID is empty.
    *                 Will be provided with instanceID: An Instance ID assigned to the app instance.
    */
  def getID(callback: js.Function1[/* instanceId */ java.lang.String, scala.Unit]): scala.Unit
  /**
    * Return a token that allows the authorized entity to access the service defined by scope.
    * @param getTokenParams Parameters for getToken.
    * @param callback Function called when the retrieval completes. It should check runtime.lastError for error when token is empty.
    */
  def getToken(
    getTokenParams: chromeDashAppsLib.chromeNs.instanceIDNs.TokenParams,
    callback: js.Function1[/* token */ java.lang.String, scala.Unit]
  ): scala.Unit
}

object Anon_CallbackCreationTime {
  @scala.inline
  def apply(
    deleteID: js.Function1[js.Function0[scala.Unit], scala.Unit],
    deleteToken: js.Function2[
      chromeDashAppsLib.chromeNs.instanceIDNs.DeleteTokenParams, 
      js.Function0[scala.Unit], 
      scala.Unit
    ],
    getCreationTime: js.Function1[
      js.Function1[/* creationTime */ chromeDashAppsLib.chromeNs.integer, scala.Unit], 
      scala.Unit
    ],
    getID: js.Function1[js.Function1[/* instanceId */ java.lang.String, scala.Unit], scala.Unit],
    getToken: js.Function2[
      chromeDashAppsLib.chromeNs.instanceIDNs.TokenParams, 
      js.Function1[/* token */ java.lang.String, scala.Unit], 
      scala.Unit
    ],
    onTokenRefresh: chromeDashAppsLib.chromeNs.eventsNs.Event[js.Function0[scala.Unit]]
  ): Anon_CallbackCreationTime = {
    val __obj = js.Dynamic.literal(deleteID = deleteID, deleteToken = deleteToken, getCreationTime = getCreationTime, getID = getID, getToken = getToken, onTokenRefresh = onTokenRefresh)
  
    __obj.asInstanceOf[Anon_CallbackCreationTime]
  }
}

