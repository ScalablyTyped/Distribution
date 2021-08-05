package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait APNSSandboxChannelResponse extends StObject {
  
  /**
    * The unique identifier for the application that the APNs sandbox channel applies to.
    */
  var ApplicationId: js.UndefOr[string] = js.undefined
  
  /**
    * The date and time when the APNs sandbox channel was enabled.
    */
  var CreationDate: js.UndefOr[string] = js.undefined
  
  /**
    * The default authentication method that Amazon Pinpoint uses to authenticate with the APNs sandbox environment for this channel, key or certificate.
    */
  var DefaultAuthenticationMethod: js.UndefOr[string] = js.undefined
  
  /**
    * Specifies whether the APNs sandbox channel is enabled for the application.
    */
  var Enabled: js.UndefOr[boolean] = js.undefined
  
  /**
    * (Not used) This property is retained only for backward compatibility.
    */
  var HasCredential: js.UndefOr[boolean] = js.undefined
  
  /**
    * Specifies whether the APNs sandbox channel is configured to communicate with APNs by using APNs tokens. To provide an authentication key for APNs tokens, set the TokenKey property of the channel.
    */
  var HasTokenKey: js.UndefOr[boolean] = js.undefined
  
  /**
    * (Deprecated) An identifier for the APNs sandbox channel. This property is retained only for backward compatibility.
    */
  var Id: js.UndefOr[string] = js.undefined
  
  /**
    * Specifies whether the APNs sandbox channel is archived.
    */
  var IsArchived: js.UndefOr[boolean] = js.undefined
  
  /**
    * The user who last modified the APNs sandbox channel.
    */
  var LastModifiedBy: js.UndefOr[string] = js.undefined
  
  /**
    * The date and time when the APNs sandbox channel was last modified.
    */
  var LastModifiedDate: js.UndefOr[string] = js.undefined
  
  /**
    * The type of messaging or notification platform for the channel. For the APNs sandbox channel, this value is APNS_SANDBOX.
    */
  var Platform: string
  
  /**
    * The current version of the APNs sandbox channel.
    */
  var Version: js.UndefOr[integer] = js.undefined
}
object APNSSandboxChannelResponse {
  
  inline def apply(Platform: string): APNSSandboxChannelResponse = {
    val __obj = js.Dynamic.literal(Platform = Platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[APNSSandboxChannelResponse]
  }
  
  extension [Self <: APNSSandboxChannelResponse](x: Self) {
    
    inline def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
    
    inline def setCreationDate(value: string): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setDefaultAuthenticationMethod(value: string): Self = StObject.set(x, "DefaultAuthenticationMethod", value.asInstanceOf[js.Any])
    
    inline def setDefaultAuthenticationMethodUndefined: Self = StObject.set(x, "DefaultAuthenticationMethod", js.undefined)
    
    inline def setEnabled(value: boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setHasCredential(value: boolean): Self = StObject.set(x, "HasCredential", value.asInstanceOf[js.Any])
    
    inline def setHasCredentialUndefined: Self = StObject.set(x, "HasCredential", js.undefined)
    
    inline def setHasTokenKey(value: boolean): Self = StObject.set(x, "HasTokenKey", value.asInstanceOf[js.Any])
    
    inline def setHasTokenKeyUndefined: Self = StObject.set(x, "HasTokenKey", js.undefined)
    
    inline def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setIsArchived(value: boolean): Self = StObject.set(x, "IsArchived", value.asInstanceOf[js.Any])
    
    inline def setIsArchivedUndefined: Self = StObject.set(x, "IsArchived", js.undefined)
    
    inline def setLastModifiedBy(value: string): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByUndefined: Self = StObject.set(x, "LastModifiedBy", js.undefined)
    
    inline def setLastModifiedDate(value: string): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    inline def setPlatform(value: string): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: integer): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
