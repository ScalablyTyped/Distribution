package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLocationNfsRequest extends js.Object {
  /**
    * The Amazon resource Name (ARN) of the NFS location to describe.
    */
  var LocationArn: typings.awsSdk.datasyncMod.LocationArn = js.native
}

object DescribeLocationNfsRequest {
  @scala.inline
  def apply(LocationArn: LocationArn): DescribeLocationNfsRequest = {
    val __obj = js.Dynamic.literal(LocationArn = LocationArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeLocationNfsRequest]
  }
}

