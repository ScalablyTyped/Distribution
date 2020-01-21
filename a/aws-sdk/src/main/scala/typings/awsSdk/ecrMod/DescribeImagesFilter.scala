package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeImagesFilter extends js.Object {
  /**
    * The tag status with which to filter your DescribeImages results. You can filter results based on whether they are TAGGED or UNTAGGED.
    */
  var tagStatus: js.UndefOr[TagStatus] = js.native
}

object DescribeImagesFilter {
  @scala.inline
  def apply(tagStatus: TagStatus = null): DescribeImagesFilter = {
    val __obj = js.Dynamic.literal()
    if (tagStatus != null) __obj.updateDynamic("tagStatus")(tagStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeImagesFilter]
  }
}

