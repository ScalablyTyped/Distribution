package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSmschannelresponseMod {
  
  @js.native
  trait SMSChannelResponse extends StObject {
    
    /**
      * The unique ID of the application to which the SMS channel belongs.
      */
    var ApplicationId: js.UndefOr[String] = js.native
    
    /**
      * The date that the settings were last updated in ISO 8601 format.
      */
    var CreationDate: js.UndefOr[String] = js.native
    
    /**
      * If the channel is enabled for sending messages.
      */
    var Enabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Not used. Retained for backwards compatibility.
      */
    var HasCredential: js.UndefOr[Boolean] = js.native
    
    /**
      * Channel ID. Not used, only for backwards compatibility.
      */
    var Id: js.UndefOr[String] = js.native
    
    /**
      * Is this channel archived
      */
    var IsArchived: js.UndefOr[Boolean] = js.native
    
    /**
      * Who last updated this entry
      */
    var LastModifiedBy: js.UndefOr[String] = js.native
    
    /**
      * Last date this was updated
      */
    var LastModifiedDate: js.UndefOr[String] = js.native
    
    /**
      * Platform type. Will be "SMS"
      */
    var Platform: js.UndefOr[String] = js.native
    
    /**
      * Promotional messages per second that can be sent
      */
    var PromotionalMessagesPerSecond: js.UndefOr[Double] = js.native
    
    /**
      * Sender identifier of your messages.
      */
    var SenderId: js.UndefOr[String] = js.native
    
    /**
      * The short code registered with the phone provider.
      */
    var ShortCode: js.UndefOr[String] = js.native
    
    /**
      * Transactional messages per second that can be sent
      */
    var TransactionalMessagesPerSecond: js.UndefOr[Double] = js.native
    
    /**
      * Version of channel
      */
    var Version: js.UndefOr[Double] = js.native
  }
  object SMSChannelResponse {
    
    @scala.inline
    def apply(): SMSChannelResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SMSChannelResponse]
    }
    
    @scala.inline
    implicit class SMSChannelResponseMutableBuilder[Self <: SMSChannelResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplicationId(value: String): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
      
      @scala.inline
      def setCreationDate(value: String): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
      
      @scala.inline
      def setHasCredential(value: Boolean): Self = StObject.set(x, "HasCredential", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasCredentialUndefined: Self = StObject.set(x, "HasCredential", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
      
      @scala.inline
      def setIsArchived(value: Boolean): Self = StObject.set(x, "IsArchived", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsArchivedUndefined: Self = StObject.set(x, "IsArchived", js.undefined)
      
      @scala.inline
      def setLastModifiedBy(value: String): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModifiedByUndefined: Self = StObject.set(x, "LastModifiedBy", js.undefined)
      
      @scala.inline
      def setLastModifiedDate(value: String): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformUndefined: Self = StObject.set(x, "Platform", js.undefined)
      
      @scala.inline
      def setPromotionalMessagesPerSecond(value: Double): Self = StObject.set(x, "PromotionalMessagesPerSecond", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromotionalMessagesPerSecondUndefined: Self = StObject.set(x, "PromotionalMessagesPerSecond", js.undefined)
      
      @scala.inline
      def setSenderId(value: String): Self = StObject.set(x, "SenderId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSenderIdUndefined: Self = StObject.set(x, "SenderId", js.undefined)
      
      @scala.inline
      def setShortCode(value: String): Self = StObject.set(x, "ShortCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortCodeUndefined: Self = StObject.set(x, "ShortCode", js.undefined)
      
      @scala.inline
      def setTransactionalMessagesPerSecond(value: Double): Self = StObject.set(x, "TransactionalMessagesPerSecond", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactionalMessagesPerSecondUndefined: Self = StObject.set(x, "TransactionalMessagesPerSecond", js.undefined)
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
    }
  }
  
  type UnmarshalledSMSChannelResponse = SMSChannelResponse
}
