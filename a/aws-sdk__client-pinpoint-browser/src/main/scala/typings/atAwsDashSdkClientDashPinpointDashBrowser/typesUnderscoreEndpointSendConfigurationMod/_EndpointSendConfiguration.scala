package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEndpointSendConfigurationMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _EndpointSendConfiguration extends js.Object {
  /**
    * Body override. If specified will override default body.
    */
  var BodyOverride: js.UndefOr[String] = js.undefined
  /**
    * A map of custom attributes to attributes to be attached to the message for this address. This payload is added to the push notification's 'data.pinpoint' object or added to the email/sms delivery receipt event attributes.
    */
  var Context: js.UndefOr[StringDictionary[String] | (Iterable[js.Tuple2[String, String]])] = js.undefined
  /**
    * The Raw JSON formatted string to be used as the payload. This value overrides the message.
    */
  var RawContent: js.UndefOr[String] = js.undefined
  /**
    * A map of substitution values for the message to be merged with the DefaultMessage's substitutions. Substitutions on this map take precedence over the all other substitutions.
    */
  var Substitutions: js.UndefOr[
    (StringDictionary[js.Array[String] | Iterable[String]]) | (Iterable[js.Tuple2[String, js.Array[String] | Iterable[String]]])
  ] = js.undefined
  /**
    * Title override. If specified will override default title if applicable.
    */
  var TitleOverride: js.UndefOr[String] = js.undefined
}

object _EndpointSendConfiguration {
  @scala.inline
  def apply(
    BodyOverride: String = null,
    Context: StringDictionary[String] | (Iterable[js.Tuple2[String, String]]) = null,
    RawContent: String = null,
    Substitutions: (StringDictionary[js.Array[String] | Iterable[String]]) | (Iterable[js.Tuple2[String, js.Array[String] | Iterable[String]]]) = null,
    TitleOverride: String = null
  ): _EndpointSendConfiguration = {
    val __obj = js.Dynamic.literal()
    if (BodyOverride != null) __obj.updateDynamic("BodyOverride")(BodyOverride)
    if (Context != null) __obj.updateDynamic("Context")(Context.asInstanceOf[js.Any])
    if (RawContent != null) __obj.updateDynamic("RawContent")(RawContent)
    if (Substitutions != null) __obj.updateDynamic("Substitutions")(Substitutions.asInstanceOf[js.Any])
    if (TitleOverride != null) __obj.updateDynamic("TitleOverride")(TitleOverride)
    __obj.asInstanceOf[_EndpointSendConfiguration]
  }
}

