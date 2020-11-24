package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeImagesResponse extends js.Object {
  
  /**
    * A list of ImageDetail objects that contain data about the image.
    */
  var imageDetails: js.UndefOr[ImageDetailList] = js.native
  
  /**
    * The nextToken value to include in a future DescribeImages request. When the results of a DescribeImages request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object DescribeImagesResponse {
  
  @scala.inline
  def apply(): DescribeImagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeImagesResponse]
  }
  
  @scala.inline
  implicit class DescribeImagesResponseOps[Self <: DescribeImagesResponse] (val x: Self) extends AnyVal {
    
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
    def setImageDetailsVarargs(value: ImageDetail*): Self = this.set("imageDetails", js.Array(value :_*))
    
    @scala.inline
    def setImageDetails(value: ImageDetailList): Self = this.set("imageDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageDetails: Self = this.set("imageDetails", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
