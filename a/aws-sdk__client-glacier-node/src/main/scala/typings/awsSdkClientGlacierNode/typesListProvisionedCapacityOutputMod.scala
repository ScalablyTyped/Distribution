package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesProvisionedCapacityDescriptionMod.UnmarshalledProvisionedCapacityDescription
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListProvisionedCapacityOutputMod {
  
  trait ListProvisionedCapacityOutput
    extends StObject
       with _OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>The response body contains the following JSON fields.</p>
      */
    var ProvisionedCapacityList: js.UndefOr[js.Array[UnmarshalledProvisionedCapacityDescription]] = js.undefined
  }
  object ListProvisionedCapacityOutput {
    
    inline def apply($metadata: ResponseMetadata): ListProvisionedCapacityOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListProvisionedCapacityOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListProvisionedCapacityOutput] (val x: Self) extends AnyVal {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setProvisionedCapacityList(value: js.Array[UnmarshalledProvisionedCapacityDescription]): Self = StObject.set(x, "ProvisionedCapacityList", value.asInstanceOf[js.Any])
      
      inline def setProvisionedCapacityListUndefined: Self = StObject.set(x, "ProvisionedCapacityList", js.undefined)
      
      inline def setProvisionedCapacityListVarargs(value: UnmarshalledProvisionedCapacityDescription*): Self = StObject.set(x, "ProvisionedCapacityList", js.Array(value*))
    }
  }
}
