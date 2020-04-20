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
}

