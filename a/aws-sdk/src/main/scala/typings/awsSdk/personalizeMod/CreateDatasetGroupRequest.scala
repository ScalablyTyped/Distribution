package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDatasetGroupRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of a KMS key used to encrypt the datasets.
    */
  var kmsKeyArn: js.UndefOr[KmsKeyArn] = js.native
  /**
    * The name for the new dataset group.
    */
  var name: Name = js.native
  /**
    * The ARN of the IAM role that has permissions to access the KMS key. Supplying an IAM role is only valid when also specifying a KMS key.
    */
  var roleArn: js.UndefOr[RoleArn] = js.native
}

object CreateDatasetGroupRequest {
  @scala.inline
  def apply(name: Name): CreateDatasetGroupRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDatasetGroupRequest]
  }
  @scala.inline
  implicit class CreateDatasetGroupRequestOps[Self <: CreateDatasetGroupRequest] (val x: Self) extends AnyVal {
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
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setKmsKeyArn(value: KmsKeyArn): Self = this.set("kmsKeyArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyArn: Self = this.set("kmsKeyArn", js.undefined)
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
  }
  
}

