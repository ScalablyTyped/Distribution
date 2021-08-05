package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEmailChannelResponseMod {
  
  trait EmailChannelResponse extends StObject {
    
    /**
      * The unique ID of the application to which the email channel belongs.
      */
    var ApplicationId: js.UndefOr[String] = js.undefined
    
    /**
      * The configuration set that you want to use when you send email using the Pinpoint Email API.
      */
    var ConfigurationSet: js.UndefOr[String] = js.undefined
    
    /**
      * The date that the settings were last updated in ISO 8601 format.
      */
    var CreationDate: js.UndefOr[String] = js.undefined
    
    /**
      * If the channel is enabled for sending messages.
      */
    var Enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The email address used to send emails from.
      */
    var FromAddress: js.UndefOr[String] = js.undefined
    
    /**
      * Not used. Retained for backwards compatibility.
      */
    var HasCredential: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Channel ID. Not used, only for backwards compatibility.
      */
    var Id: js.UndefOr[String] = js.undefined
    
    /**
      * The ARN of an identity verified with SES.
      */
    var Identity: js.UndefOr[String] = js.undefined
    
    /**
      * Is this channel archived
      */
    var IsArchived: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Who last updated this entry
      */
    var LastModifiedBy: js.UndefOr[String] = js.undefined
    
    /**
      * Last date this was updated
      */
    var LastModifiedDate: js.UndefOr[String] = js.undefined
    
    /**
      * Messages per second that can be sent
      */
    var MessagesPerSecond: js.UndefOr[Double] = js.undefined
    
    /**
      * Platform type. Will be "EMAIL"
      */
    var Platform: js.UndefOr[String] = js.undefined
    
    /**
      * The ARN of an IAM Role used to submit events to Mobile Analytics' event ingestion service
      */
    var RoleArn: js.UndefOr[String] = js.undefined
    
    /**
      * Version of channel
      */
    var Version: js.UndefOr[Double] = js.undefined
  }
  object EmailChannelResponse {
    
    inline def apply(): EmailChannelResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmailChannelResponse]
    }
    
    extension [Self <: EmailChannelResponse](x: Self) {
      
      inline def setApplicationId(value: String): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
      
      inline def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
      
      inline def setConfigurationSet(value: String): Self = StObject.set(x, "ConfigurationSet", value.asInstanceOf[js.Any])
      
      inline def setConfigurationSetUndefined: Self = StObject.set(x, "ConfigurationSet", js.undefined)
      
      inline def setCreationDate(value: String): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
      
      inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
      
      inline def setFromAddress(value: String): Self = StObject.set(x, "FromAddress", value.asInstanceOf[js.Any])
      
      inline def setFromAddressUndefined: Self = StObject.set(x, "FromAddress", js.undefined)
      
      inline def setHasCredential(value: Boolean): Self = StObject.set(x, "HasCredential", value.asInstanceOf[js.Any])
      
      inline def setHasCredentialUndefined: Self = StObject.set(x, "HasCredential", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
      
      inline def setIdentity(value: String): Self = StObject.set(x, "Identity", value.asInstanceOf[js.Any])
      
      inline def setIdentityUndefined: Self = StObject.set(x, "Identity", js.undefined)
      
      inline def setIsArchived(value: Boolean): Self = StObject.set(x, "IsArchived", value.asInstanceOf[js.Any])
      
      inline def setIsArchivedUndefined: Self = StObject.set(x, "IsArchived", js.undefined)
      
      inline def setLastModifiedBy(value: String): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedByUndefined: Self = StObject.set(x, "LastModifiedBy", js.undefined)
      
      inline def setLastModifiedDate(value: String): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
      
      inline def setMessagesPerSecond(value: Double): Self = StObject.set(x, "MessagesPerSecond", value.asInstanceOf[js.Any])
      
      inline def setMessagesPerSecondUndefined: Self = StObject.set(x, "MessagesPerSecond", js.undefined)
      
      inline def setPlatform(value: String): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "Platform", js.undefined)
      
      inline def setRoleArn(value: String): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
      
      inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
    }
  }
  
  type UnmarshalledEmailChannelResponse = EmailChannelResponse
}
