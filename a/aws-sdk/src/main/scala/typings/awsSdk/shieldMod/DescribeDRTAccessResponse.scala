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
  def apply(): DescribeDRTAccessResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDRTAccessResponse]
  }
  @scala.inline
  implicit class DescribeDRTAccessResponseOps[Self <: DescribeDRTAccessResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLogBucketListVarargs(value: LogBucket*): Self = this.set("LogBucketList", js.Array(value :_*))
    @scala.inline
    def setLogBucketList(value: LogBucketList): Self = this.set("LogBucketList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogBucketList: Self = this.set("LogBucketList", js.undefined)
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleArn: Self = this.set("RoleArn", js.undefined)
  }
  
}

