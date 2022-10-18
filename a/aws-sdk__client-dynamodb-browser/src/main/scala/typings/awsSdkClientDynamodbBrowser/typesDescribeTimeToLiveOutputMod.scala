package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesTimeToLiveDescriptionMod.UnmarshalledTimeToLiveDescription
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDescribeTimeToLiveOutputMod {
  
  trait DescribeTimeToLiveOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p/>
      */
    var TimeToLiveDescription: js.UndefOr[UnmarshalledTimeToLiveDescription] = js.undefined
  }
  object DescribeTimeToLiveOutput {
    
    inline def apply($metadata: ResponseMetadata): DescribeTimeToLiveOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeTimeToLiveOutput]
    }
    
    extension [Self <: DescribeTimeToLiveOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setTimeToLiveDescription(value: UnmarshalledTimeToLiveDescription): Self = StObject.set(x, "TimeToLiveDescription", value.asInstanceOf[js.Any])
      
      inline def setTimeToLiveDescriptionUndefined: Self = StObject.set(x, "TimeToLiveDescription", js.undefined)
    }
  }
}
