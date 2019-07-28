package typings.chrome.chromeNs.castNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.ApiConfig")
@js.native
class ApiConfig protected () extends js.Object {
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
    sessionRequest: SessionRequest,
    sessionListener: js.Function1[/* session */ Session, Unit],
    receiverListener: js.Function1[/* receiverAvailability */ ReceiverAvailability, Unit]
  ) = this()
  def this(
    sessionRequest: SessionRequest,
    sessionListener: js.Function1[/* session */ Session, Unit],
    receiverListener: js.Function1[/* receiverAvailability */ ReceiverAvailability, Unit],
    autoJoinPolicy: AutoJoinPolicy
  ) = this()
  def this(
    sessionRequest: SessionRequest,
    sessionListener: js.Function1[/* session */ Session, Unit],
    receiverListener: js.Function1[/* receiverAvailability */ ReceiverAvailability, Unit],
    autoJoinPolicy: AutoJoinPolicy,
    defaultActionPolicy: DefaultActionPolicy
  ) = this()
  var autoJoinPolicy: js.UndefOr[AutoJoinPolicy] = js.native
  var defaultActionPolicy: DefaultActionPolicy = js.native
  var sessionRequest: SessionRequest = js.native
  def receiverListener(receiverAvailability: ReceiverAvailability): Unit = js.native
  def sessionListener(session: Session): Unit = js.native
}

