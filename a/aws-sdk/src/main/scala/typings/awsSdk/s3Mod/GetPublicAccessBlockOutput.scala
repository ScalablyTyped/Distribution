package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPublicAccessBlockOutput extends js.Object {
  /**
    * The PublicAccessBlock configuration currently in effect for this Amazon S3 bucket.
    */
  var PublicAccessBlockConfiguration: js.UndefOr[typings.awsSdk.s3Mod.PublicAccessBlockConfiguration] = js.native
}

object GetPublicAccessBlockOutput {
  @scala.inline
  def apply(PublicAccessBlockConfiguration: PublicAccessBlockConfiguration = null): GetPublicAccessBlockOutput = {
    val __obj = js.Dynamic.literal()
    if (PublicAccessBlockConfiguration != null) __obj.updateDynamic("PublicAccessBlockConfiguration")(PublicAccessBlockConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPublicAccessBlockOutput]
  }
}

