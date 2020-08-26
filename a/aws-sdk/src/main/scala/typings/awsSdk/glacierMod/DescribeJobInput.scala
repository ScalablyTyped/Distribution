package typings.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeJobInput extends js.Object {
  /**
    * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon S3 Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID. 
    */
  var accountId: String = js.native
  /**
    * The ID of the job to describe.
    */
  var jobId: String = js.native
  /**
    * The name of the vault.
    */
  var vaultName: String = js.native
}

object DescribeJobInput {
  @scala.inline
  def apply(accountId: String, jobId: String, vaultName: String): DescribeJobInput = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeJobInput]
  }
  @scala.inline
  implicit class DescribeJobInputOps[Self <: DescribeJobInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setJobId(value: String): Self = this.set("jobId", value.asInstanceOf[js.Any])
    @scala.inline
    def setVaultName(value: String): Self = this.set("vaultName", value.asInstanceOf[js.Any])
  }
  
}

