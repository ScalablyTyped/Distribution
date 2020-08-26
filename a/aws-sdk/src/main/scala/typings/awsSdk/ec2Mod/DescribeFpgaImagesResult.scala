package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFpgaImagesResult extends js.Object {
  /**
    * Information about the FPGA images.
    */
  var FpgaImages: js.UndefOr[FpgaImageList] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.native
}

object DescribeFpgaImagesResult {
  @scala.inline
  def apply(): DescribeFpgaImagesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFpgaImagesResult]
  }
  @scala.inline
  implicit class DescribeFpgaImagesResultOps[Self <: DescribeFpgaImagesResult] (val x: Self) extends AnyVal {
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
    def setFpgaImagesVarargs(value: FpgaImage*): Self = this.set("FpgaImages", js.Array(value :_*))
    @scala.inline
    def setFpgaImages(value: FpgaImageList): Self = this.set("FpgaImages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFpgaImages: Self = this.set("FpgaImages", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

