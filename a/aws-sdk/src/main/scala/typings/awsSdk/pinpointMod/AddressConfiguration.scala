package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddressConfiguration extends StObject {
  
  /**
    * The message body to use instead of the default message body. This value overrides the default message body.
    */
  var BodyOverride: js.UndefOr[string] = js.undefined
  
  /**
    * The channel to use when sending the message.
    */
  var ChannelType: js.UndefOr[typings.awsSdk.pinpointMod.ChannelType] = js.undefined
  
  /**
    * An object that maps custom attributes to attributes for the address and is attached to the message. Attribute names are case sensitive. For a push notification, this payload is added to the data.pinpoint object. For an email or text message, this payload is added to email/SMS delivery receipt event attributes.
    */
  var Context: js.UndefOr[MapOfString] = js.undefined
  
  /**
    * The raw, JSON-formatted string to use as the payload for the message. If specified, this value overrides all other values for the message.
    */
  var RawContent: js.UndefOr[string] = js.undefined
  
  /**
    * A map of the message variables to merge with the variables specified by properties of the DefaultMessage object. The variables specified in this map take precedence over all other variables.
    */
  var Substitutions: js.UndefOr[MapOfListOfString] = js.undefined
  
  /**
    * The message title to use instead of the default message title. This value overrides the default message title.
    */
  var TitleOverride: js.UndefOr[string] = js.undefined
}
object AddressConfiguration {
  
  @scala.inline
  def apply(): AddressConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddressConfiguration]
  }
  
  @scala.inline
  implicit class AddressConfigurationMutableBuilder[Self <: AddressConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBodyOverride(value: string): Self = StObject.set(x, "BodyOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyOverrideUndefined: Self = StObject.set(x, "BodyOverride", js.undefined)
    
    @scala.inline
    def setChannelType(value: ChannelType): Self = StObject.set(x, "ChannelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelTypeUndefined: Self = StObject.set(x, "ChannelType", js.undefined)
    
    @scala.inline
    def setContext(value: MapOfString): Self = StObject.set(x, "Context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "Context", js.undefined)
    
    @scala.inline
    def setRawContent(value: string): Self = StObject.set(x, "RawContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawContentUndefined: Self = StObject.set(x, "RawContent", js.undefined)
    
    @scala.inline
    def setSubstitutions(value: MapOfListOfString): Self = StObject.set(x, "Substitutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubstitutionsUndefined: Self = StObject.set(x, "Substitutions", js.undefined)
    
    @scala.inline
    def setTitleOverride(value: string): Self = StObject.set(x, "TitleOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleOverrideUndefined: Self = StObject.set(x, "TitleOverride", js.undefined)
  }
}
