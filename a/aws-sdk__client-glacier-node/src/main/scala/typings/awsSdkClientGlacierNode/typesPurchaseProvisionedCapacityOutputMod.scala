package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPurchaseProvisionedCapacityOutputMod {
  
  trait PurchaseProvisionedCapacityOutput
    extends StObject
       with _OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>The ID that identifies the provisioned capacity unit.</p>
      */
    var capacityId: js.UndefOr[String] = js.undefined
  }
  object PurchaseProvisionedCapacityOutput {
    
    inline def apply($metadata: ResponseMetadata): PurchaseProvisionedCapacityOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[PurchaseProvisionedCapacityOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PurchaseProvisionedCapacityOutput] (val x: Self) extends AnyVal {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setCapacityId(value: String): Self = StObject.set(x, "capacityId", value.asInstanceOf[js.Any])
      
      inline def setCapacityIdUndefined: Self = StObject.set(x, "capacityId", js.undefined)
    }
  }
}
