package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLocationEfsResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Amazon EFS file system location that is created.
    */
  var LocationArn: js.UndefOr[typings.awsSdk.datasyncMod.LocationArn] = js.native
}

object CreateLocationEfsResponse {
  @scala.inline
  def apply(LocationArn: LocationArn = null): CreateLocationEfsResponse = {
    val __obj = js.Dynamic.literal()
    if (LocationArn != null) __obj.updateDynamic("LocationArn")(LocationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLocationEfsResponse]
  }
}

