package typings.atAwsDashSdkClientDashGlacierDashNode

import typings.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreGlacierJobDescriptionMod._UnmarshalledGlacierJobDescription
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/types/ListJobsOutput", JSImport.Namespace)
@js.native
object typesListJobsOutputMod extends js.Object {
  @js.native
  trait ListJobsOutput extends _OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>A list of job objects. Each job object contains metadata describing the job.</p>
      */
    var JobList: js.UndefOr[js.Array[_UnmarshalledGlacierJobDescription]] = js.native
    /**
      * <p> An opaque string used for pagination that specifies the job at which the listing of jobs should begin. You get the <code>marker</code> value from a previous List Jobs response. You only need to include the marker if you are continuing the pagination of the results started in a previous List Jobs request. </p>
      */
    var Marker: js.UndefOr[String] = js.native
  }
  
}

