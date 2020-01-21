package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTagOptionOutput extends js.Object {
  /**
    * Information about the TagOption.
    */
  var TagOptionDetail: js.UndefOr[typings.awsSdk.servicecatalogMod.TagOptionDetail] = js.native
}

object CreateTagOptionOutput {
  @scala.inline
  def apply(TagOptionDetail: TagOptionDetail = null): CreateTagOptionOutput = {
    val __obj = js.Dynamic.literal()
    if (TagOptionDetail != null) __obj.updateDynamic("TagOptionDetail")(TagOptionDetail.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTagOptionOutput]
  }
}

