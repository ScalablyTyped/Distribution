package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait APNSVoipChannelResponse extends StObject {
  
  /**
    * The unique identifier for the application that the APNs VoIP channel applies to.
    */
  var ApplicationId: js.UndefOr[string] = js.undefined
  
  /**
    * The date and time when the APNs VoIP channel was enabled.
    */
  var CreationDate: js.UndefOr[string] = js.undefined
  
  /**
    * The default authentication method that Amazon Pinpoint uses to authenticate with APNs for this channel, key or certificate.
    */
  var DefaultAuthenticationMethod: js.UndefOr[string] = js.undefined
  
  /**
    * Specifies whether the APNs VoIP channel is enabled for the application.
    */
  var Enabled: js.UndefOr[boolean] = js.undefined
  
  /**
    * (Not used) This property is retained only for backward compatibility.
    */
  var HasCredential: js.UndefOr[boolean] = js.undefined
  
  /**
    * Specifies whether the APNs VoIP channel is configured to communicate with APNs by using APNs tokens. To provide an authentication key for APNs tokens, set the TokenKey property of the channel.
    */
  var HasTokenKey: js.UndefOr[boolean] = js.undefined
  
  /**
    * (Deprecated) An identifier for the APNs VoIP channel. This property is retained only for backward compatibility.
    */
  var Id: js.UndefOr[string] = js.undefined
  
  /**
    * Specifies whether the APNs VoIP channel is archived.
    */
  var IsArchived: js.UndefOr[boolean] = js.undefined
  
  /**
    * The user who last modified the APNs VoIP channel.
    */
  var LastModifiedBy: js.UndefOr[string] = js.undefined
  
  /**
    * The date and time when the APNs VoIP channel was last modified.
    */
  var LastModifiedDate: js.UndefOr[string] = js.undefined
  
  /**
    * The type of messaging or notification platform for the channel. For the APNs VoIP channel, this value is APNS_VOIP.
    */
  var Platform: string
  
  /**
    * The current version of the APNs VoIP channel.
    */
  var Version: js.UndefOr[integer] = js.undefined
}
object APNSVoipChannelResponse {
  
  @scala.inline
  def apply(Platform: string): APNSVoipChannelResponse = {
    val __obj = js.Dynamic.literal(Platform = Platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[APNSVoipChannelResponse]
  }
  
  @scala.inline
  implicit class APNSVoipChannelResponseMutableBuilder[Self <: APNSVoipChannelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
    
    @scala.inline
    def setCreationDate(value: string): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setDefaultAuthenticationMethod(value: string): Self = StObject.set(x, "DefaultAuthenticationMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultAuthenticationMethodUndefined: Self = StObject.set(x, "DefaultAuthenticationMethod", js.undefined)
    
    @scala.inline
    def setEnabled(value: boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    @scala.inline
    def setHasCredential(value: boolean): Self = StObject.set(x, "HasCredential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasCredentialUndefined: Self = StObject.set(x, "HasCredential", js.undefined)
    
    @scala.inline
    def setHasTokenKey(value: boolean): Self = StObject.set(x, "HasTokenKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasTokenKeyUndefined: Self = StObject.set(x, "HasTokenKey", js.undefined)
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setIsArchived(value: boolean): Self = StObject.set(x, "IsArchived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsArchivedUndefined: Self = StObject.set(x, "IsArchived", js.undefined)
    
    @scala.inline
    def setLastModifiedBy(value: string): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedByUndefined: Self = StObject.set(x, "LastModifiedBy", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: string): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    @scala.inline
    def setPlatform(value: string): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: integer): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
