package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSMSMessageMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.PROMOTIONAL
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.TRANSACTIONAL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledSMSMessage extends _SMSMessage {
  /**
    * Default message substitutions. Can be overridden by individual address substitutions.
    */
  @JSName("Substitutions")
  var Substitutions__UnmarshalledSMSMessage: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
}

object _UnmarshalledSMSMessage {
  @scala.inline
  def apply(
    Body: String = null,
    Keyword: String = null,
    MessageType: TRANSACTIONAL | PROMOTIONAL | String = null,
    OriginationNumber: String = null,
    SenderId: String = null,
    Substitutions: StringDictionary[js.Array[String]] = null
  ): _UnmarshalledSMSMessage = {
    val __obj = js.Dynamic.literal()
    if (Body != null) __obj.updateDynamic("Body")(Body.asInstanceOf[js.Any])
    if (Keyword != null) __obj.updateDynamic("Keyword")(Keyword.asInstanceOf[js.Any])
    if (MessageType != null) __obj.updateDynamic("MessageType")(MessageType.asInstanceOf[js.Any])
    if (OriginationNumber != null) __obj.updateDynamic("OriginationNumber")(OriginationNumber.asInstanceOf[js.Any])
    if (SenderId != null) __obj.updateDynamic("SenderId")(SenderId.asInstanceOf[js.Any])
    if (Substitutions != null) __obj.updateDynamic("Substitutions")(Substitutions.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledSMSMessage]
  }
}

