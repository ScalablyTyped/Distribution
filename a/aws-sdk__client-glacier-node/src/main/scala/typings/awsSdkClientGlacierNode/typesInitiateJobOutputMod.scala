package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInitiateJobOutputMod {
  
  @js.native
  trait InitiateJobOutput extends _OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>The ID of the job.</p>
      */
    var jobId: js.UndefOr[String] = js.native
    
    /**
      * <p>The path to the location of where the select results are stored.</p>
      */
    var jobOutputPath: js.UndefOr[String] = js.native
    
    /**
      * <p>The relative URI path of the job.</p>
      */
    var location: js.UndefOr[String] = js.native
  }
  object InitiateJobOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): InitiateJobOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitiateJobOutput]
    }
    
    @scala.inline
    implicit class InitiateJobOutputMutableBuilder[Self <: InitiateJobOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
      
      @scala.inline
      def setJobOutputPath(value: String): Self = StObject.set(x, "jobOutputPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJobOutputPathUndefined: Self = StObject.set(x, "jobOutputPath", js.undefined)
      
      @scala.inline
      def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    }
  }
}
