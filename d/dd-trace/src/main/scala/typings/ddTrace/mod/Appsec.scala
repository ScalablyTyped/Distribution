package typings.ddTrace.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.OutgoingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Appsec extends StObject {
  
  /**
    * Sends a "blocked" template response based on the request accept header and ends the response.
    * **You should stop processing the request after calling this function!**
    * @param {IncomingMessage} req Can be passed to force which request to act on. Optional.
    * @param {OutgoingMessage} res Can be passed to force which response to act on. Optional.
    * @return {boolean} Indicates if the action was successful.
    *
    * @beta This method is in beta and could change in the future
    */
  def blockRequest(): Boolean = js.native
  def blockRequest(req: Unit, res: OutgoingMessage[IncomingMessage]): Boolean = js.native
  def blockRequest(req: IncomingMessage): Boolean = js.native
  def blockRequest(req: IncomingMessage, res: OutgoingMessage[IncomingMessage]): Boolean = js.native
  
  /**
    * Checks if the passed user should be blocked according to AppSec rules.
    * If no user is linked to the current trace, will link the passed user to it.
    * @param {User} user Properties of the authenticated user. Accepts custom fields.
    * @return {boolean} Indicates whether the user should be blocked.
    *
    * @beta This method is in beta and could change in the future
    */
  def isUserBlocked(user: User): Boolean = js.native
  
  /**
    * Links an authenticated user to the current trace.
    * @param {User} user Properties of the authenticated user. Accepts custom fields.
    *
    * @beta This method is in beta and could change in the future
    */
  def setUser(user: User): Unit = js.native
  
  /**
    * Links a custom event to the current trace.
    * @param {string} eventName The name of the event.
    * @param {[key: string]: string} metadata Custom fields to link to the event.
    *
    * @beta This method is in beta and could change in future versions.
    */
  def trackCustomEvent(eventName: String): Unit = js.native
  def trackCustomEvent(eventName: String, metadata: StringDictionary[String]): Unit = js.native
  
  /**
    * Links a failed login event to the current trace.
    * @param {string} userId The user id of the attemped login.
    * @param {boolean} exists If the user id exists.
    * @param {[key: string]: string} metadata Custom fields to link to the login failure event.
    *
    * @beta This method is in beta and could change in future versions.
    */
  def trackUserLoginFailureEvent(userId: String, exists: Boolean): Unit = js.native
  def trackUserLoginFailureEvent(userId: String, exists: Boolean, metadata: StringDictionary[String]): Unit = js.native
  
  /**
    * Links a successful login event to the current trace. Will link the passed user to the current trace with Appsec.setUser() internally.
    * @param {User} user Properties of the authenticated user. Accepts custom fields.
    * @param {[key: string]: string} metadata Custom fields to link to the login success event.
    *
    * @beta This method is in beta and could change in future versions.
    */
  def trackUserLoginSuccessEvent(user: User): Unit = js.native
  def trackUserLoginSuccessEvent(user: User, metadata: StringDictionary[String]): Unit = js.native
}
