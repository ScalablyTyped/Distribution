package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.typesServiceMod.UnmarshalledService
import typings.awsSdkTypes.responseMod.ResponseMetadata
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetServiceGraphOutputMod {
  
  @js.native
  trait GetServiceGraphOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>The end of the time frame for which the graph was generated.</p>
      */
    var EndTime: js.UndefOr[Date] = js.native
    
    /**
      * <p>Pagination token. Not used.</p>
      */
    var NextToken: js.UndefOr[String] = js.native
    
    /**
      * <p>The services that have processed a traced request during the specified time frame.</p>
      */
    var Services: js.UndefOr[js.Array[UnmarshalledService]] = js.native
    
    /**
      * <p>The start of the time frame for which the graph was generated.</p>
      */
    var StartTime: js.UndefOr[Date] = js.native
  }
  object GetServiceGraphOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): GetServiceGraphOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetServiceGraphOutput]
    }
    
    @scala.inline
    implicit class GetServiceGraphOutputMutableBuilder[Self <: GetServiceGraphOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndTime(value: Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
      
      @scala.inline
      def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
      
      @scala.inline
      def setServices(value: js.Array[UnmarshalledService]): Self = StObject.set(x, "Services", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServicesUndefined: Self = StObject.set(x, "Services", js.undefined)
      
      @scala.inline
      def setServicesVarargs(value: UnmarshalledService*): Self = StObject.set(x, "Services", js.Array(value :_*))
      
      @scala.inline
      def setStartTime(value: Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    }
  }
}
