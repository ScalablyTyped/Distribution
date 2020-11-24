package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointSendConfiguration extends js.Object {
  
  /**
    * The body of the message. If specified, this value overrides the default message body.
    */
  var BodyOverride: js.UndefOr[string] = js.native
  
  /**
    * A map of custom attributes to attach to the message for the address. Attribute names are case sensitive. For a push notification, this payload is added to the data.pinpoint object. For an email or text message, this payload is added to email/SMS delivery receipt event attributes.
    */
  var Context: js.UndefOr[MapOfString] = js.native
  
  /**
    * The raw, JSON-formatted string to use as the payload for the message. If specified, this value overrides all other values for the message.
    */
  var RawContent: js.UndefOr[string] = js.native
  
  /**
    * A map of the message variables to merge with the variables specified for the default message (DefaultMessage.Substitutions). The variables specified in this map take precedence over all other variables.
    */
  var Substitutions: js.UndefOr[MapOfListOfString] = js.native
  
  /**
    * The title or subject line of the message. If specified, this value overrides the default message title or subject line.
    */
  var TitleOverride: js.UndefOr[string] = js.native
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
    def setBodyOverride(value: string): Self = this.set("BodyOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyOverride: Self = this.set("BodyOverride", js.undefined)
    
    @scala.inline
    def setContext(value: MapOfString): Self = this.set("Context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("Context", js.undefined)
    
    @scala.inline
    def setRawContent(value: string): Self = this.set("RawContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRawContent: Self = this.set("RawContent", js.undefined)
    
    @scala.inline
    def setSubstitutions(value: MapOfListOfString): Self = this.set("Substitutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubstitutions: Self = this.set("Substitutions", js.undefined)
    
    @scala.inline
    def setTitleOverride(value: string): Self = this.set("TitleOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleOverride: Self = this.set("TitleOverride", js.undefined)
  }
}
