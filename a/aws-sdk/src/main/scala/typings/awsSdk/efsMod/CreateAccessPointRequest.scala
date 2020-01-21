package typings.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAccessPointRequest extends js.Object {
  /**
    * A string of up to 64 ASCII characters that Amazon EFS uses to ensure idempotent creation.
    */
  var ClientToken: typings.awsSdk.efsMod.ClientToken = js.native
  /**
    * The ID of the EFS file system that the access point provides access to.
    */
  var FileSystemId: typings.awsSdk.efsMod.FileSystemId = js.native
  /**
    * The operating system user and group applied to all file system requests made using the access point.
    */
  var PosixUser: js.UndefOr[typings.awsSdk.efsMod.PosixUser] = js.native
  /**
    * Specifies the directory on the Amazon EFS file system that the access point exposes as the root directory of your file system to NFS clients using the access point. The clients using the access point can only access the root directory and below. If the RootDirectory &gt; Path specified does not exist, EFS creates it and applies the CreationInfo settings when a client connects to an access point. When specifying a RootDirectory, you need to provide the Path, and the CreationInfo is optional.
    */
  var RootDirectory: js.UndefOr[typings.awsSdk.efsMod.RootDirectory] = js.native
  /**
    * Creates tags associated with the access point. Each tag is a key-value pair.
    */
  var Tags: js.UndefOr[typings.awsSdk.efsMod.Tags] = js.native
}

object CreateAccessPointRequest {
  @scala.inline
  def apply(
    ClientToken: ClientToken,
    FileSystemId: FileSystemId,
    PosixUser: PosixUser = null,
    RootDirectory: RootDirectory = null,
    Tags: Tags = null
  ): CreateAccessPointRequest = {
    val __obj = js.Dynamic.literal(ClientToken = ClientToken.asInstanceOf[js.Any], FileSystemId = FileSystemId.asInstanceOf[js.Any])
    if (PosixUser != null) __obj.updateDynamic("PosixUser")(PosixUser.asInstanceOf[js.Any])
    if (RootDirectory != null) __obj.updateDynamic("RootDirectory")(RootDirectory.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccessPointRequest]
  }
}

