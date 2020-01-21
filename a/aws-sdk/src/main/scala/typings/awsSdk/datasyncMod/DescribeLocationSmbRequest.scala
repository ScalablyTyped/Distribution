package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLocationSmbRequest extends js.Object {
  /**
    * The Amazon resource Name (ARN) of the SMB location to describe.
    */
  var LocationArn: typings.awsSdk.datasyncMod.LocationArn = js.native
}

object DescribeLocationSmbRequest {
  @scala.inline
  def apply(LocationArn: LocationArn): DescribeLocationSmbRequest = {
    val __obj = js.Dynamic.literal(LocationArn = LocationArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeLocationSmbRequest]
  }
}

