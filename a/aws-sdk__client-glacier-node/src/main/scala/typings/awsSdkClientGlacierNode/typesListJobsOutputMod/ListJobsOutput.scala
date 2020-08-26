package typings.awsSdkClientGlacierNode.typesListJobsOutputMod

import typings.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesGlacierJobDescriptionMod.UnmarshalledGlacierJobDescription
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var JobList: js.UndefOr[js.Array[UnmarshalledGlacierJobDescription]] = js.native
  /**
    * <p> An opaque string used for pagination that specifies the job at which the listing of jobs should begin. You get the <code>marker</code> value from a previous List Jobs response. You only need to include the marker if you are continuing the pagination of the results started in a previous List Jobs request. </p>
    */
  var Marker: js.UndefOr[String] = js.native
}

object ListJobsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): ListJobsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobsOutput]
  }
  @scala.inline
  implicit class ListJobsOutputOps[Self <: ListJobsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set$metadata(value: ResponseMetadata): Self = this.set("$metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setJobListVarargs(value: UnmarshalledGlacierJobDescription*): Self = this.set("JobList", js.Array(value :_*))
    @scala.inline
    def setJobList(value: js.Array[UnmarshalledGlacierJobDescription]): Self = this.set("JobList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobList: Self = this.set("JobList", js.undefined)
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
  }
  
}

