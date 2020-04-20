package typings.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeHarvestJobRequest extends js.Object {
  /**
    * The ID of the HarvestJob.
    */
  var Id: string = js.native
}

object DescribeHarvestJobRequest {
  @scala.inline
  def apply(Id: string): DescribeHarvestJobRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHarvestJobRequest]
  }
}

