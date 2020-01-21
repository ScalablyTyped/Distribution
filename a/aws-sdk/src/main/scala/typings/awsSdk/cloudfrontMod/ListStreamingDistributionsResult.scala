package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStreamingDistributionsResult extends js.Object {
  /**
    * The StreamingDistributionList type. 
    */
  var StreamingDistributionList: js.UndefOr[typings.awsSdk.cloudfrontMod.StreamingDistributionList] = js.native
}

object ListStreamingDistributionsResult {
  @scala.inline
  def apply(StreamingDistributionList: StreamingDistributionList = null): ListStreamingDistributionsResult = {
    val __obj = js.Dynamic.literal()
    if (StreamingDistributionList != null) __obj.updateDynamic("StreamingDistributionList")(StreamingDistributionList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStreamingDistributionsResult]
  }
}

