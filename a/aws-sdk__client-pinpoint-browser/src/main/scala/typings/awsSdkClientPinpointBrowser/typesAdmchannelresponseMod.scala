package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAdmchannelresponseMod {
  
  trait ADMChannelResponse extends StObject {
    
    /**
      * The ID of the application to which the channel applies.
      */
    var ApplicationId: js.UndefOr[String] = js.undefined
    
    /**
      * The date and time when this channel was created.
      */
    var CreationDate: js.UndefOr[String] = js.undefined
    
    /**
      * Indicates whether or not the channel is enabled for sending messages.
      */
    var Enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Not used. Retained for backwards compatibility.
      */
    var HasCredential: js.UndefOr[Boolean] = js.undefined
    
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
  object ADMChannelResponse {
    
    @scala.inline
    def apply(): ADMChannelResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ADMChannelResponse]
    }
    
    @scala.inline
    implicit class ADMChannelResponseMutableBuilder[Self <: ADMChannelResponse] (val x: Self) extends AnyVal {
      
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
      def setVersion(value: Double): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
    }
  }
  
  type UnmarshalledADMChannelResponse = ADMChannelResponse
}
