package typings.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListJobsByPipelineRequest extends js.Object {
  /**
    *  To list jobs in chronological order by the date and time that they were submitted, enter true. To list jobs in reverse chronological order, enter false. 
    */
  var Ascending: js.UndefOr[typings.awsSdk.elastictranscoderMod.Ascending] = js.native
  /**
    *  When Elastic Transcoder returns more than one page of results, use pageToken in subsequent GET requests to get each successive page of results. 
    */
  var PageToken: js.UndefOr[Id] = js.native
  /**
    * The ID of the pipeline for which you want to get job information.
    */
  var PipelineId: Id = js.native
}

object ListJobsByPipelineRequest {
  @scala.inline
  def apply(PipelineId: Id, Ascending: Ascending = null, PageToken: Id = null): ListJobsByPipelineRequest = {
    val __obj = js.Dynamic.literal(PipelineId = PipelineId.asInstanceOf[js.Any])
    if (Ascending != null) __obj.updateDynamic("Ascending")(Ascending.asInstanceOf[js.Any])
    if (PageToken != null) __obj.updateDynamic("PageToken")(PageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobsByPipelineRequest]
  }
}

