package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLocationS3Request extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Amazon S3 bucket location to describe.
    */
  var LocationArn: typings.awsSdk.datasyncMod.LocationArn = js.native
}

object DescribeLocationS3Request {
  @scala.inline
  def apply(LocationArn: LocationArn): DescribeLocationS3Request = {
    val __obj = js.Dynamic.literal(LocationArn = LocationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLocationS3Request]
  }
}

