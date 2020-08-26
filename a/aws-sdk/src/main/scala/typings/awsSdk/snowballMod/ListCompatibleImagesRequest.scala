package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCompatibleImagesRequest extends js.Object {
  /**
    * The maximum number of results for the list of compatible images. Currently, a Snowball Edge device can store 10 AMIs.
    */
  var MaxResults: js.UndefOr[ListLimit] = js.native
  /**
    * HTTP requests are stateless. To identify what object comes "next" in the list of compatible images, you can specify a value for NextToken as the starting point for your list of returned images.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListCompatibleImagesRequest {
  @scala.inline
  def apply(): ListCompatibleImagesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCompatibleImagesRequest]
  }
  @scala.inline
  implicit class ListCompatibleImagesRequestOps[Self <: ListCompatibleImagesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMaxResults(value: ListLimit): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

