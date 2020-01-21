package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLocationSmbResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the source SMB file system location that is created.
    */
  var LocationArn: js.UndefOr[typings.awsSdk.datasyncMod.LocationArn] = js.native
}

object CreateLocationSmbResponse {
  @scala.inline
  def apply(LocationArn: LocationArn = null): CreateLocationSmbResponse = {
    val __obj = js.Dynamic.literal()
    if (LocationArn != null) __obj.updateDynamic("LocationArn")(LocationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLocationSmbResponse]
  }
}

