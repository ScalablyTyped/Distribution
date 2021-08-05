package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInitiateJobOutputMod {
  
  trait InitiateJobOutput
    extends StObject
       with _OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>The ID of the job.</p>
      */
    var jobId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The path to the location of where the select results are stored.</p>
      */
    var jobOutputPath: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The relative URI path of the job.</p>
      */
    var location: js.UndefOr[String] = js.undefined
  }
  object InitiateJobOutput {
    
    inline def apply($metadata: ResponseMetadata): InitiateJobOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitiateJobOutput]
    }
    
    extension [Self <: InitiateJobOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
      
      inline def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
      
      inline def setJobOutputPath(value: String): Self = StObject.set(x, "jobOutputPath", value.asInstanceOf[js.Any])
      
      inline def setJobOutputPathUndefined: Self = StObject.set(x, "jobOutputPath", js.undefined)
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    }
  }
}
