package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceAssociationOutputLocation extends js.Object {
  /**
    * An S3 bucket where you want to store the results of this request.
    */
  var S3Location: js.UndefOr[S3OutputLocation] = js.native
}

object InstanceAssociationOutputLocation {
  @scala.inline
  def apply(S3Location: S3OutputLocation = null): InstanceAssociationOutputLocation = {
    val __obj = js.Dynamic.literal()
    if (S3Location != null) __obj.updateDynamic("S3Location")(S3Location.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceAssociationOutputLocation]
  }
}

