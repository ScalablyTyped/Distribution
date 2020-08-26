package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTagOptionOutput extends js.Object {
  /**
    * Information about the TagOption.
    */
  var TagOptionDetail: js.UndefOr[typings.awsSdk.servicecatalogMod.TagOptionDetail] = js.native
}

object DescribeTagOptionOutput {
  @scala.inline
  def apply(): DescribeTagOptionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTagOptionOutput]
  }
  @scala.inline
  implicit class DescribeTagOptionOutputOps[Self <: DescribeTagOptionOutput] (val x: Self) extends AnyVal {
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
    def setTagOptionDetail(value: TagOptionDetail): Self = this.set("TagOptionDetail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagOptionDetail: Self = this.set("TagOptionDetail", js.undefined)
  }
  
}

