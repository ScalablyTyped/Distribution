package typings.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPresetsRequest extends js.Object {
  /**
    * To list presets in chronological order by the date and time that they were created, enter true. To list presets in reverse chronological order, enter false.
    */
  var Ascending: js.UndefOr[typings.awsSdk.elastictranscoderMod.Ascending] = js.native
  /**
    * When Elastic Transcoder returns more than one page of results, use pageToken in subsequent GET requests to get each successive page of results. 
    */
  var PageToken: js.UndefOr[Id] = js.native
}

object ListPresetsRequest {
  @scala.inline
  def apply(Ascending: Ascending = null, PageToken: Id = null): ListPresetsRequest = {
    val __obj = js.Dynamic.literal()
    if (Ascending != null) __obj.updateDynamic("Ascending")(Ascending.asInstanceOf[js.Any])
    if (PageToken != null) __obj.updateDynamic("PageToken")(PageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPresetsRequest]
  }
}

