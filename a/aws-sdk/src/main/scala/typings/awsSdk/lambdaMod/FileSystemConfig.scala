package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSystemConfig extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Amazon EFS access point that provides access to the file system.
    */
  var Arn: FileSystemArn = js.native
  /**
    * The path where the function can access the file system, starting with /mnt/.
    */
  var LocalMountPath: typings.awsSdk.lambdaMod.LocalMountPath = js.native
}

object FileSystemConfig {
  @scala.inline
  def apply(Arn: FileSystemArn, LocalMountPath: LocalMountPath): FileSystemConfig = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], LocalMountPath = LocalMountPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemConfig]
  }
}

