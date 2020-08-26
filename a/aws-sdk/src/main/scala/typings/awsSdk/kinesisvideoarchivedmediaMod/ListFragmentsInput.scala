package typings.awsSdk.kinesisvideoarchivedmediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFragmentsInput extends js.Object {
  /**
    * Describes the timestamp range and timestamp origin for the range of fragments to return.
    */
  var FragmentSelector: js.UndefOr[typings.awsSdk.kinesisvideoarchivedmediaMod.FragmentSelector] = js.native
  /**
    * The total number of fragments to return. If the total number of fragments available is more than the value specified in max-results, then a ListFragmentsOutput$NextToken is provided in the output that you can use to resume pagination.
    */
  var MaxResults: js.UndefOr[PageLimit] = js.native
  /**
    * A token to specify where to start paginating. This is the ListFragmentsOutput$NextToken from a previously truncated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.kinesisvideoarchivedmediaMod.NextToken] = js.native
  /**
    * The name of the stream from which to retrieve a fragment list.
    */
  var StreamName: typings.awsSdk.kinesisvideoarchivedmediaMod.StreamName = js.native
}

object ListFragmentsInput {
  @scala.inline
  def apply(StreamName: StreamName): ListFragmentsInput = {
    val __obj = js.Dynamic.literal(StreamName = StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFragmentsInput]
  }
  @scala.inline
  implicit class ListFragmentsInputOps[Self <: ListFragmentsInput] (val x: Self) extends AnyVal {
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
    def setStreamName(value: StreamName): Self = this.set("StreamName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFragmentSelector(value: FragmentSelector): Self = this.set("FragmentSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFragmentSelector: Self = this.set("FragmentSelector", js.undefined)
    @scala.inline
    def setMaxResults(value: PageLimit): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

