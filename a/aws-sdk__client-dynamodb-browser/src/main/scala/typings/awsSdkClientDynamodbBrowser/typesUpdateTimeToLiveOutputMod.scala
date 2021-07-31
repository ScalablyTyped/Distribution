package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesTimeToLiveSpecificationMod.UnmarshalledTimeToLiveSpecification
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUpdateTimeToLiveOutputMod {
  
  trait UpdateTimeToLiveOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>Represents the output of an <code>UpdateTimeToLive</code> operation.</p>
      */
    var TimeToLiveSpecification: js.UndefOr[UnmarshalledTimeToLiveSpecification] = js.undefined
  }
  object UpdateTimeToLiveOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): UpdateTimeToLiveOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateTimeToLiveOutput]
    }
    
    @scala.inline
    implicit class UpdateTimeToLiveOutputMutableBuilder[Self <: UpdateTimeToLiveOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeToLiveSpecification(value: UnmarshalledTimeToLiveSpecification): Self = StObject.set(x, "TimeToLiveSpecification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeToLiveSpecificationUndefined: Self = StObject.set(x, "TimeToLiveSpecification", js.undefined)
    }
  }
}
