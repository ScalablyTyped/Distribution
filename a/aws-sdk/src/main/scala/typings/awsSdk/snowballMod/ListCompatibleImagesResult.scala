package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCompatibleImagesResult extends js.Object {
  /**
    * A JSON-formatted object that describes a compatible AMI, including the ID and name for a Snowball Edge AMI.
    */
  var CompatibleImages: js.UndefOr[CompatibleImageList] = js.native
  /**
    * Because HTTP requests are stateless, this is the starting point for your next list of returned images.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListCompatibleImagesResult {
  @scala.inline
  def apply(CompatibleImages: CompatibleImageList = null, NextToken: String = null): ListCompatibleImagesResult = {
    val __obj = js.Dynamic.literal()
    if (CompatibleImages != null) __obj.updateDynamic("CompatibleImages")(CompatibleImages.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCompatibleImagesResult]
  }
}

