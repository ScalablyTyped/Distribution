package typings.atAwsDashSdkClientDashGlacierDashNode.typesListJobsOutputMod

import typings.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreGlacierJobDescriptionMod._UnmarshalledGlacierJobDescription
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListJobsOutput extends _OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>A list of job objects. Each job object contains metadata describing the job.</p>
    */
  var JobList: js.UndefOr[js.Array[_UnmarshalledGlacierJobDescription]] = js.undefined
  /**
    * <p> An opaque string used for pagination that specifies the job at which the listing of jobs should begin. You get the <code>marker</code> value from a previous List Jobs response. You only need to include the marker if you are continuing the pagination of the results started in a previous List Jobs request. </p>
    */
  var Marker: js.UndefOr[String] = js.undefined
}

object ListJobsOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    JobList: js.Array[_UnmarshalledGlacierJobDescription] = null,
    Marker: String = null
  ): ListJobsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (JobList != null) __obj.updateDynamic("JobList")(JobList.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobsOutput]
  }
}

