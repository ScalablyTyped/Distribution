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
  def apply(FpgaImages: FpgaImageList = null, NextToken: NextToken = null): DescribeFpgaImagesResult = {
    val __obj = js.Dynamic.literal()
    if (FpgaImages != null) __obj.updateDynamic("FpgaImages")(FpgaImages.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFpgaImagesResult]
  }
}

