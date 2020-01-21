package typings.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLifecycleConfigurationRequest extends js.Object {
  /**
    * The ID of the file system whose LifecycleConfiguration object you want to retrieve (String).
    */
  var FileSystemId: typings.awsSdk.efsMod.FileSystemId = js.native
}

object DescribeLifecycleConfigurationRequest {
  @scala.inline
  def apply(FileSystemId: FileSystemId): DescribeLifecycleConfigurationRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeLifecycleConfigurationRequest]
  }
}

