package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSmschannelresponseMod {
  
  trait SMSChannelResponse extends StObject {
    
    /**
      * The unique ID of the application to which the SMS channel belongs.
      */
    var ApplicationId: js.UndefOr[String] = js.undefined
    
    /**
      * The date that the settings were last updated in ISO 8601 format.
      */
    var CreationDate: js.UndefOr[String] = js.undefined
    
    /**
      * If the channel is enabled for sending messages.
      */
    var Enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Not used. Retained for backwards compatibility.
      */
    var HasCredential: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Channel ID. Not used, only for backwards compatibility.
      */
    var Id: js.UndefOr[String] = js.undefined
    
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
      * Platform type. Will be "SMS"
      */
    var Platform: js.UndefOr[String] = js.undefined
    
    /**
      * Promotional messages per second that can be sent
      */
    var PromotionalMessagesPerSecond: js.UndefOr[Double] = js.undefined
    
    /**
      * Sender identifier of your messages.
      */
    var SenderId: js.UndefOr[String] = js.undefined
    
    /**
      * The short code registered with the phone provider.
      */
    var ShortCode: js.UndefOr[String] = js.undefined
    
    /**
      * Transactional messages per second that can be sent
      */
    var TransactionalMessagesPerSecond: js.UndefOr[Double] = js.undefined
    
    /**
      * Version of channel
      */
    var Version: js.UndefOr[Double] = js.undefined
  }
  object SMSChannelResponse {
    
    inline def apply(): SMSChannelResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SMSChannelResponse]
    }
    
    extension [Self <: SMSChannelResponse](x: Self) {
      
      inline def setApplicationId(value: String): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
      
      inline def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
      
      inline def setCreationDate(value: String): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
      
      inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
      
      inline def setHasCredential(value: Boolean): Self = StObject.set(x, "HasCredential", value.asInstanceOf[js.Any])
      
      inline def setHasCredentialUndefined: Self = StObject.set(x, "HasCredential", js.undefined)
      
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
      
      inline def setPromotionalMessagesPerSecond(value: Double): Self = StObject.set(x, "PromotionalMessagesPerSecond", value.asInstanceOf[js.Any])
      
      inline def setPromotionalMessagesPerSecondUndefined: Self = StObject.set(x, "PromotionalMessagesPerSecond", js.undefined)
      
      inline def setSenderId(value: String): Self = StObject.set(x, "SenderId", value.asInstanceOf[js.Any])
      
      inline def setSenderIdUndefined: Self = StObject.set(x, "SenderId", js.undefined)
      
      inline def setShortCode(value: String): Self = StObject.set(x, "ShortCode", value.asInstanceOf[js.Any])
      
      inline def setShortCodeUndefined: Self = StObject.set(x, "ShortCode", js.undefined)
      
      inline def setTransactionalMessagesPerSecond(value: Double): Self = StObject.set(x, "TransactionalMessagesPerSecond", value.asInstanceOf[js.Any])
      
      inline def setTransactionalMessagesPerSecondUndefined: Self = StObject.set(x, "TransactionalMessagesPerSecond", js.undefined)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
    }
  }
  
  type UnmarshalledSMSChannelResponse = SMSChannelResponse
}
