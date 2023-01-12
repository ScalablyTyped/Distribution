package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesApnschannelresponseMod {
  
  trait APNSChannelResponse extends StObject {
    
    /**
      * The ID of the application that the channel applies to.
      */
    var ApplicationId: js.UndefOr[String] = js.undefined
    
    /**
      * The date and time when this channel was created.
      */
    var CreationDate: js.UndefOr[String] = js.undefined
    
    /**
      * The default authentication method used for APNs.
      */
    var DefaultAuthenticationMethod: js.UndefOr[String] = js.undefined
    
    /**
      * If the channel is enabled for sending messages.
      */
    var Enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Not used. Retained for backwards compatibility.
      */
    var HasCredential: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates whether the channel is configured with a key for APNs token authentication. Provide a token key by setting the TokenKey attribute.
      */
    var HasTokenKey: js.UndefOr[Boolean] = js.undefined
    
    /**
      * (Deprecated) An identifier for the channel. Retained for backwards compatibility.
      */
    var Id: js.UndefOr[String] = js.undefined
    
    /**
      * Indicates whether or not the channel is archived.
      */
    var IsArchived: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The user who last updated this channel.
      */
    var LastModifiedBy: js.UndefOr[String] = js.undefined
    
    /**
      * The date and time when this channel was last modified.
      */
    var LastModifiedDate: js.UndefOr[String] = js.undefined
    
    /**
      * The platform type. For this channel, the value is always "ADM."
      */
    var Platform: js.UndefOr[String] = js.undefined
    
    /**
      * The channel version.
      */
    var Version: js.UndefOr[Double] = js.undefined
  }
  object APNSChannelResponse {
    
    inline def apply(): APNSChannelResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[APNSChannelResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: APNSChannelResponse] (val x: Self) extends AnyVal {
      
      inline def setApplicationId(value: String): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
      
      inline def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
      
      inline def setCreationDate(value: String): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
      
      inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
      
      inline def setDefaultAuthenticationMethod(value: String): Self = StObject.set(x, "DefaultAuthenticationMethod", value.asInstanceOf[js.Any])
      
      inline def setDefaultAuthenticationMethodUndefined: Self = StObject.set(x, "DefaultAuthenticationMethod", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
      
      inline def setHasCredential(value: Boolean): Self = StObject.set(x, "HasCredential", value.asInstanceOf[js.Any])
      
      inline def setHasCredentialUndefined: Self = StObject.set(x, "HasCredential", js.undefined)
      
      inline def setHasTokenKey(value: Boolean): Self = StObject.set(x, "HasTokenKey", value.asInstanceOf[js.Any])
      
      inline def setHasTokenKeyUndefined: Self = StObject.set(x, "HasTokenKey", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
      
      inline def setIsArchived(value: Boolean): Self = StObject.set(x, "IsArchived", value.asInstanceOf[js.Any])
      
      inline def setIsArchivedUndefined: Self = StObject.set(x, "IsArchived", js.undefined)
      
      inline def setLastModifiedBy(value: String): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedByUndefined: Self = StObject.set(x, "LastModifiedBy", js.undefined)
      
      inline def setLastModifiedDate(value: String): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
      
      inline def setPlatform(value: String): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "Platform", js.undefined)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
    }
  }
  
  type UnmarshalledAPNSChannelResponse = APNSChannelResponse
}
