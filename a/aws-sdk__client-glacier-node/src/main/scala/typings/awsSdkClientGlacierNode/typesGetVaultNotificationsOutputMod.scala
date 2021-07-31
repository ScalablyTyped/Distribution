package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesVaultNotificationConfigMod.UnmarshalledVaultNotificationConfig
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetVaultNotificationsOutputMod {
  
  trait GetVaultNotificationsOutput
    extends StObject
       with _OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>Returns the notification configuration set on the vault.</p>
      */
    var vaultNotificationConfig: js.UndefOr[UnmarshalledVaultNotificationConfig] = js.undefined
  }
  object GetVaultNotificationsOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): GetVaultNotificationsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetVaultNotificationsOutput]
    }
    
    @scala.inline
    implicit class GetVaultNotificationsOutputMutableBuilder[Self <: GetVaultNotificationsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVaultNotificationConfig(value: UnmarshalledVaultNotificationConfig): Self = StObject.set(x, "vaultNotificationConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVaultNotificationConfigUndefined: Self = StObject.set(x, "vaultNotificationConfig", js.undefined)
    }
  }
}
