package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesGlacierJobDescriptionMod.UnmarshalledGlacierJobDescription
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListJobsOutputMod {
  
  trait ListJobsOutput
    extends StObject
       with _OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>A list of job objects. Each job object contains metadata describing the job.</p>
      */
    var JobList: js.UndefOr[js.Array[UnmarshalledGlacierJobDescription]] = js.undefined
    
    /**
      * <p> An opaque string used for pagination that specifies the job at which the listing of jobs should begin. You get the <code>marker</code> value from a previous List Jobs response. You only need to include the marker if you are continuing the pagination of the results started in a previous List Jobs request. </p>
      */
    var Marker: js.UndefOr[String] = js.undefined
  }
  object ListJobsOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): ListJobsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListJobsOutput]
    }
    
    @scala.inline
    implicit class ListJobsOutputMutableBuilder[Self <: ListJobsOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJobList(value: js.Array[UnmarshalledGlacierJobDescription]): Self = StObject.set(x, "JobList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJobListUndefined: Self = StObject.set(x, "JobList", js.undefined)
      
      @scala.inline
      def setJobListVarargs(value: UnmarshalledGlacierJobDescription*): Self = StObject.set(x, "JobList", js.Array(value :_*))
      
      @scala.inline
      def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    }
  }
}
