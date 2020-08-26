package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagOptionsOutput extends js.Object {
  /**
    * The page token for the next set of results. To retrieve the first set of results, use null.
    */
  var PageToken: js.UndefOr[typings.awsSdk.servicecatalogMod.PageToken] = js.native
  /**
    * Information about the TagOptions.
    */
  var TagOptionDetails: js.UndefOr[typings.awsSdk.servicecatalogMod.TagOptionDetails] = js.native
}

object ListTagOptionsOutput {
  @scala.inline
  def apply(): ListTagOptionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagOptionsOutput]
  }
  @scala.inline
  implicit class ListTagOptionsOutputOps[Self <: ListTagOptionsOutput] (val x: Self) extends AnyVal {
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
    def setPageToken(value: PageToken): Self = this.set("PageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("PageToken", js.undefined)
    @scala.inline
    def setTagOptionDetailsVarargs(value: TagOptionDetail*): Self = this.set("TagOptionDetails", js.Array(value :_*))
    @scala.inline
    def setTagOptionDetails(value: TagOptionDetails): Self = this.set("TagOptionDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagOptionDetails: Self = this.set("TagOptionDetails", js.undefined)
  }
  
}

