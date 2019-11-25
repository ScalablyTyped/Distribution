package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEndpointSendConfigurationMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledEndpointSendConfiguration extends _EndpointSendConfiguration {
  /**
    * A map of custom attributes to attributes to be attached to the message for this address. This payload is added to the push notification's 'data.pinpoint' object or added to the email/sms delivery receipt event attributes.
    */
  @JSName("Context")
  var Context__UnmarshalledEndpointSendConfiguration: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * A map of substitution values for the message to be merged with the DefaultMessage's substitutions. Substitutions on this map take precedence over the all other substitutions.
    */
  @JSName("Substitutions")
  var Substitutions__UnmarshalledEndpointSendConfiguration: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
}

object _UnmarshalledEndpointSendConfiguration {
  @scala.inline
  def apply(
    BodyOverride: String = null,
    Context: StringDictionary[String] = null,
    RawContent: String = null,
    Substitutions: StringDictionary[js.Array[String]] = null,
    TitleOverride: String = null
  ): _UnmarshalledEndpointSendConfiguration = {
    val __obj = js.Dynamic.literal()
    if (BodyOverride != null) __obj.updateDynamic("BodyOverride")(BodyOverride.asInstanceOf[js.Any])
    if (Context != null) __obj.updateDynamic("Context")(Context.asInstanceOf[js.Any])
    if (RawContent != null) __obj.updateDynamic("RawContent")(RawContent.asInstanceOf[js.Any])
    if (Substitutions != null) __obj.updateDynamic("Substitutions")(Substitutions.asInstanceOf[js.Any])
    if (TitleOverride != null) __obj.updateDynamic("TitleOverride")(TitleOverride.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledEndpointSendConfiguration]
  }
}

