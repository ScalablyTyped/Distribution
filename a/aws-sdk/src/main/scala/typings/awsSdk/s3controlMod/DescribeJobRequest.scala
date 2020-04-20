package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeJobRequest extends js.Object {
  /**
    * 
    */
  var AccountId: typings.awsSdk.s3controlMod.AccountId = js.native
  /**
    * The ID for the job whose information you want to retrieve.
    */
  var JobId: typings.awsSdk.s3controlMod.JobId = js.native
}

object DescribeJobRequest {
  @scala.inline
  def apply(AccountId: AccountId, JobId: JobId): DescribeJobRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeJobRequest]
  }
}

