package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPurchaseProvisionedCapacityOutputMod {
  
  @js.native
  trait PurchaseProvisionedCapacityOutput extends _OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>The ID that identifies the provisioned capacity unit.</p>
      */
    var capacityId: js.UndefOr[String] = js.native
  }
  object PurchaseProvisionedCapacityOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): PurchaseProvisionedCapacityOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[PurchaseProvisionedCapacityOutput]
    }
    
    @scala.inline
    implicit class PurchaseProvisionedCapacityOutputMutableBuilder[Self <: PurchaseProvisionedCapacityOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCapacityId(value: String): Self = StObject.set(x, "capacityId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCapacityIdUndefined: Self = StObject.set(x, "capacityId", js.undefined)
    }
  }
}
