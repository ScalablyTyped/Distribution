package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDRTAccessResponse extends js.Object {
  /**
    * The list of Amazon S3 buckets accessed by the DRT.
    */
  var LogBucketList: js.UndefOr[typings.awsSdk.shieldMod.LogBucketList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the role the DRT used to access your AWS account.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.shieldMod.RoleArn] = js.native
}

object DescribeDRTAccessResponse {
  @scala.inline
  def apply(LogBucketList: LogBucketList = null, RoleArn: RoleArn = null): DescribeDRTAccessResponse = {
    val __obj = js.Dynamic.literal()
    if (LogBucketList != null) __obj.updateDynamic("LogBucketList")(LogBucketList.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDRTAccessResponse]
  }
}

