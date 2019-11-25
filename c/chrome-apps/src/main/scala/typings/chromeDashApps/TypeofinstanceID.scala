package typings.chromeDashApps

import typings.chromeDashApps.chrome.events.Event
import typings.chromeDashApps.chrome.instanceID.DeleteTokenParams
import typings.chromeDashApps.chrome.instanceID.TokenParams
import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofinstanceID extends js.Object {
  /** Fired when all the granted tokens need to be refreshed. */
  val onTokenRefresh: Event[js.Function0[Unit]]
  /**
    * Fired when all the granted tokens need to be refreshed.
    * @param callback Function called when the deletion completes.
    *                 The instance identifier was revoked successfully if runtime.lastError is not set.
    */
  def deleteID(callback: js.Function0[Unit]): Unit
  /**
    * Revokes a granted token.
    * @param deleteTokenParams Parameters for deleteToken.
    * @param callback Function called when the token deletion completes.
    *                 The token was revoked successfully if runtime.lastError is not set.
    */
  def deleteToken(deleteTokenParams: DeleteTokenParams, callback: js.Function0[Unit]): Unit
  /**
    * Retrieves the time when the InstanceID has been generated.
    * The creation time will be returned by the callback.
    * @param callback Function called when the retrieval completes.
    *                 It should check runtime.lastError for error when creationTime is zero.
    *                 Provides `creationTime` (double)
    *                  > The time when the Instance ID has been generated, represented in milliseconds since the epoch.
    */
  def getCreationTime(callback: js.Function1[/* creationTime */ integer, Unit]): Unit
  /**
    * Retrieves an identifier for the app instance.
    * The instance ID will be returned by the callback.
    * The same ID will be returned as long as the application
    * identity has not been revoked or expired.
    * @param callback Function called when the retrieval completes.
    *                 It should check runtime.lastError for error when instanceID is empty.
    *                 Will be provided with instanceID: An Instance ID assigned to the app instance.
    */
  def getID(callback: js.Function1[/* instanceId */ String, Unit]): Unit
  /**
    * Return a token that allows the authorized entity to access the service defined by scope.
    * @param getTokenParams Parameters for getToken.
    * @param callback Function called when the retrieval completes. It should check runtime.lastError for error when token is empty.
    */
  def getToken(getTokenParams: TokenParams, callback: js.Function1[/* token */ String, Unit]): Unit
}

object TypeofinstanceID {
  @scala.inline
  def apply(
    deleteID: js.Function0[Unit] => Unit,
    deleteToken: (DeleteTokenParams, js.Function0[Unit]) => Unit,
    getCreationTime: js.Function1[/* creationTime */ integer, Unit] => Unit,
    getID: js.Function1[/* instanceId */ String, Unit] => Unit,
    getToken: (TokenParams, js.Function1[/* token */ String, Unit]) => Unit,
    onTokenRefresh: Event[js.Function0[Unit]]
  ): TypeofinstanceID = {
    val __obj = js.Dynamic.literal(deleteID = js.Any.fromFunction1(deleteID), deleteToken = js.Any.fromFunction2(deleteToken), getCreationTime = js.Any.fromFunction1(getCreationTime), getID = js.Any.fromFunction1(getID), getToken = js.Any.fromFunction2(getToken), onTokenRefresh = onTokenRefresh.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeofinstanceID]
  }
}

