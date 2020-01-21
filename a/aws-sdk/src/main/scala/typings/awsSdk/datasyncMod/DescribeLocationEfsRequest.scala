package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLocationEfsRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the EFS location to describe.
    */
  var LocationArn: typings.awsSdk.datasyncMod.LocationArn = js.native
}

object DescribeLocationEfsRequest {
  @scala.inline
  def apply(LocationArn: LocationArn): DescribeLocationEfsRequest = {
    val __obj = js.Dynamic.literal(LocationArn = LocationArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeLocationEfsRequest]
  }
}

