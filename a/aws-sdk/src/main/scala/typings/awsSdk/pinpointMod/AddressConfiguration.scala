package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddressConfiguration extends js.Object {
  /**
    * The message body to use instead of the default message body. This value overrides the default message body.
    */
  var BodyOverride: js.UndefOr[string] = js.native
  /**
    * The channel to use when sending the message.
    */
  var ChannelType: js.UndefOr[typings.awsSdk.pinpointMod.ChannelType] = js.native
  /**
    * An object that maps custom attributes to attributes for the address and is attached to the message. For a push notification, this payload is added to the data.pinpoint object. For an email or text message, this payload is added to email/SMS delivery receipt event attributes.
    */
  var Context: js.UndefOr[MapOfString] = js.native
  /**
    * The raw, JSON-formatted string to use as the payload for the message. If specified, this value overrides all other values for the message.
    */
  var RawContent: js.UndefOr[string] = js.native
  /**
    * A map of the message variables to merge with the variables specified by properties of the DefaultMessage object. The variables specified in this map take precedence over all other variables.
    */
  var Substitutions: js.UndefOr[MapOfListOfString] = js.native
  /**
    * The message title to use instead of the default message title. This value overrides the default message title.
    */
  var TitleOverride: js.UndefOr[string] = js.native
}

object AddressConfiguration {
  @scala.inline
  def apply(
    BodyOverride: string = null,
    ChannelType: ChannelType = null,
    Context: MapOfString = null,
    RawContent: string = null,
    Substitutions: MapOfListOfString = null,
    TitleOverride: string = null
  ): AddressConfiguration = {
    val __obj = js.Dynamic.literal()
    if (BodyOverride != null) __obj.updateDynamic("BodyOverride")(BodyOverride.asInstanceOf[js.Any])
    if (ChannelType != null) __obj.updateDynamic("ChannelType")(ChannelType.asInstanceOf[js.Any])
    if (Context != null) __obj.updateDynamic("Context")(Context.asInstanceOf[js.Any])
    if (RawContent != null) __obj.updateDynamic("RawContent")(RawContent.asInstanceOf[js.Any])
    if (Substitutions != null) __obj.updateDynamic("Substitutions")(Substitutions.asInstanceOf[js.Any])
    if (TitleOverride != null) __obj.updateDynamic("TitleOverride")(TitleOverride.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressConfiguration]
  }
}

