package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceAssociationOutputUrl extends js.Object {
  /**
    * The URL of S3 bucket where you want to store the results of this request.
    */
  var S3OutputUrl: js.UndefOr[typings.awsSdk.ssmMod.S3OutputUrl] = js.native
}

object InstanceAssociationOutputUrl {
  @scala.inline
  def apply(S3OutputUrl: S3OutputUrl = null): InstanceAssociationOutputUrl = {
    val __obj = js.Dynamic.literal()
    if (S3OutputUrl != null) __obj.updateDynamic("S3OutputUrl")(S3OutputUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceAssociationOutputUrl]
  }
}

