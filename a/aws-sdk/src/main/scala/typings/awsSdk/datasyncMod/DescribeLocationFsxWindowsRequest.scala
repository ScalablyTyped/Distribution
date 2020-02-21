package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLocationFsxWindowsRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the FSx for Windows location to describe.
    */
  var LocationArn: typings.awsSdk.datasyncMod.LocationArn = js.native
}

object DescribeLocationFsxWindowsRequest {
  @scala.inline
  def apply(LocationArn: LocationArn): DescribeLocationFsxWindowsRequest = {
    val __obj = js.Dynamic.literal(LocationArn = LocationArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeLocationFsxWindowsRequest]
  }
}

