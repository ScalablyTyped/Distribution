package typings.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutLifecycleConfigurationRequest extends js.Object {
  /**
    * The ID of the file system for which you are creating the LifecycleConfiguration object (String).
    */
  var FileSystemId: typings.awsSdk.efsMod.FileSystemId = js.native
  /**
    * An array of LifecyclePolicy objects that define the file system's LifecycleConfiguration object. A LifecycleConfiguration object tells lifecycle management when to transition files from the Standard storage class to the Infrequent Access storage class.
    */
  var LifecyclePolicies: typings.awsSdk.efsMod.LifecyclePolicies = js.native
}

object PutLifecycleConfigurationRequest {
  @scala.inline
  def apply(FileSystemId: FileSystemId, LifecyclePolicies: LifecyclePolicies): PutLifecycleConfigurationRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any], LifecyclePolicies = LifecyclePolicies.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutLifecycleConfigurationRequest]
  }
  @scala.inline
  implicit class PutLifecycleConfigurationRequestOps[Self <: PutLifecycleConfigurationRequest] (val x: Self) extends AnyVal {
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
    def setFileSystemId(value: FileSystemId): Self = this.set("FileSystemId", value.asInstanceOf[js.Any])
    @scala.inline
    def setLifecyclePoliciesVarargs(value: LifecyclePolicy*): Self = this.set("LifecyclePolicies", js.Array(value :_*))
    @scala.inline
    def setLifecyclePolicies(value: LifecyclePolicies): Self = this.set("LifecyclePolicies", value.asInstanceOf[js.Any])
  }
  
}

