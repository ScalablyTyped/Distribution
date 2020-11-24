package typings.chrome.global.chrome.cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("chrome.cast.ApiConfig")
@js.native
class ApiConfig protected ()
  extends typings.chrome.chrome.cast.ApiConfig {
  /**
    * @param {!chrome.cast.SessionRequest} sessionRequest
    * @param {function(!chrome.cast.Session)} sessionListener
    * @param {function(!chrome.cast.ReceiverAvailability,Array<Object>)}
    *     receiverListener
    * @param {chrome.cast.AutoJoinPolicy=} opt_autoJoinPolicy
    * @param {chrome.cast.DefaultActionPolicy=} opt_defaultActionPolicy
    * @constructor
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.ApiConfig
    */
  def this(
    sessionRequest: typings.chrome.chrome.cast.SessionRequest,
    sessionListener: js.Function1[/* session */ typings.chrome.chrome.cast.Session, Unit],
    receiverListener: js.Function1[/* receiverAvailability */ typings.chrome.chrome.cast.ReceiverAvailability, Unit]
  ) = this()
  def this(
    sessionRequest: typings.chrome.chrome.cast.SessionRequest,
    sessionListener: js.Function1[/* session */ typings.chrome.chrome.cast.Session, Unit],
    receiverListener: js.Function1[/* receiverAvailability */ typings.chrome.chrome.cast.ReceiverAvailability, Unit],
    autoJoinPolicy: typings.chrome.chrome.cast.AutoJoinPolicy
  ) = this()
  def this(
    sessionRequest: typings.chrome.chrome.cast.SessionRequest,
    sessionListener: js.Function1[/* session */ typings.chrome.chrome.cast.Session, Unit],
    receiverListener: js.Function1[/* receiverAvailability */ typings.chrome.chrome.cast.ReceiverAvailability, Unit],
    autoJoinPolicy: js.UndefOr[scala.Nothing],
    defaultActionPolicy: typings.chrome.chrome.cast.DefaultActionPolicy
  ) = this()
  def this(
    sessionRequest: typings.chrome.chrome.cast.SessionRequest,
    sessionListener: js.Function1[/* session */ typings.chrome.chrome.cast.Session, Unit],
    receiverListener: js.Function1[/* receiverAvailability */ typings.chrome.chrome.cast.ReceiverAvailability, Unit],
    autoJoinPolicy: typings.chrome.chrome.cast.AutoJoinPolicy,
    defaultActionPolicy: typings.chrome.chrome.cast.DefaultActionPolicy
  ) = this()
}
