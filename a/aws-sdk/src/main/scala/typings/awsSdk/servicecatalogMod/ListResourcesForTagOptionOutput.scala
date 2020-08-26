package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListResourcesForTagOptionOutput extends js.Object {
  /**
    * The page token for the next set of results. To retrieve the first set of results, use null.
    */
  var PageToken: js.UndefOr[typings.awsSdk.servicecatalogMod.PageToken] = js.native
  /**
    * Information about the resources.
    */
  var ResourceDetails: js.UndefOr[typings.awsSdk.servicecatalogMod.ResourceDetails] = js.native
}

object ListResourcesForTagOptionOutput {
  @scala.inline
  def apply(): ListResourcesForTagOptionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourcesForTagOptionOutput]
  }
  @scala.inline
  implicit class ListResourcesForTagOptionOutputOps[Self <: ListResourcesForTagOptionOutput] (val x: Self) extends AnyVal {
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
    def setResourceDetailsVarargs(value: ResourceDetail*): Self = this.set("ResourceDetails", js.Array(value :_*))
    @scala.inline
    def setResourceDetails(value: ResourceDetails): Self = this.set("ResourceDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceDetails: Self = this.set("ResourceDetails", js.undefined)
  }
  
}

