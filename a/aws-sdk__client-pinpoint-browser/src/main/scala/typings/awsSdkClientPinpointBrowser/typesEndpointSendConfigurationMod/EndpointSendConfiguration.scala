package typings.awsSdkClientPinpointBrowser.typesEndpointSendConfigurationMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointSendConfiguration extends js.Object {
  /**
    * Body override. If specified will override default body.
    */
  var BodyOverride: js.UndefOr[String] = js.native
  /**
    * A map of custom attributes to attributes to be attached to the message for this address. This payload is added to the push notification's 'data.pinpoint' object or added to the email/sms delivery receipt event attributes.
    */
  var Context: js.UndefOr[StringDictionary[String] | (Iterable[js.Tuple2[String, String]])] = js.native
  /**
    * The Raw JSON formatted string to be used as the payload. This value overrides the message.
    */
  var RawContent: js.UndefOr[String] = js.native
  /**
    * A map of substitution values for the message to be merged with the DefaultMessage's substitutions. Substitutions on this map take precedence over the all other substitutions.
    */
  var Substitutions: js.UndefOr[
    (StringDictionary[js.Array[String] | Iterable[String]]) | (Iterable[js.Tuple2[String, js.Array[String] | Iterable[String]]])
  ] = js.native
  /**
    * Title override. If specified will override default title if applicable.
    */
  var TitleOverride: js.UndefOr[String] = js.native
}

object EndpointSendConfiguration {
  @scala.inline
  def apply(): EndpointSendConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointSendConfiguration]
  }
  @scala.inline
  implicit class EndpointSendConfigurationOps[Self <: EndpointSendConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBodyOverride(value: String): Self = this.set("BodyOverride", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyOverride: Self = this.set("BodyOverride", js.undefined)
    @scala.inline
    def setContext(value: StringDictionary[String] | (Iterable[js.Tuple2[String, String]])): Self = this.set("Context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("Context", js.undefined)
    @scala.inline
    def setRawContent(value: String): Self = this.set("RawContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRawContent: Self = this.set("RawContent", js.undefined)
    @scala.inline
    def setSubstitutions(
      value: (StringDictionary[js.Array[String] | Iterable[String]]) | (Iterable[js.Tuple2[String, js.Array[String] | Iterable[String]]])
    ): Self = this.set("Substitutions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubstitutions: Self = this.set("Substitutions", js.undefined)
    @scala.inline
    def setTitleOverride(value: String): Self = this.set("TitleOverride", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleOverride: Self = this.set("TitleOverride", js.undefined)
  }
  
}

