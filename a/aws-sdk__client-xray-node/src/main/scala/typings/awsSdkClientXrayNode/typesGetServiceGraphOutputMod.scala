package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.typesServiceMod.UnmarshalledService
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetServiceGraphOutputMod {
  
  trait GetServiceGraphOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>The end of the time frame for which the graph was generated.</p>
      */
    var EndTime: js.UndefOr[js.Date] = js.undefined
    
    /**
      * <p>Pagination token. Not used.</p>
      */
    var NextToken: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The services that have processed a traced request during the specified time frame.</p>
      */
    var Services: js.UndefOr[js.Array[UnmarshalledService]] = js.undefined
    
    /**
      * <p>The start of the time frame for which the graph was generated.</p>
      */
    var StartTime: js.UndefOr[js.Date] = js.undefined
  }
  object GetServiceGraphOutput {
    
    inline def apply($metadata: ResponseMetadata): GetServiceGraphOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetServiceGraphOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetServiceGraphOutput] (val x: Self) extends AnyVal {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
      
      inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
      
      inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
      
      inline def setServices(value: js.Array[UnmarshalledService]): Self = StObject.set(x, "Services", value.asInstanceOf[js.Any])
      
      inline def setServicesUndefined: Self = StObject.set(x, "Services", js.undefined)
      
      inline def setServicesVarargs(value: UnmarshalledService*): Self = StObject.set(x, "Services", js.Array(value*))
      
      inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
      
      inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    }
  }
}
