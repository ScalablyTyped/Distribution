package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectFileSystemLocation extends js.Object {
  /**
    *  The name used to access a file system created by Amazon EFS. CodeBuild creates an environment variable by appending the identifier in all capital letters to CODEBUILD_. For example, if you specify my-efs for identifier, a new environment variable is create named CODEBUILD_MY-EFS.   The identifier is used to mount your file system. 
    */
  var identifier: js.UndefOr[String] = js.native
  /**
    *  A string that specifies the location of the file system created by Amazon EFS. Its format is efs-dns-name:/directory-path. You can find the DNS name of file system when you view it in the AWS EFS console. The directory path is a path to a directory in the file system that CodeBuild mounts. For example, if the DNS name of a file system is fs-abcd1234.efs.us-west-2.amazonaws.com, and its mount directory is my-efs-mount-directory, then the location is fs-abcd1234.efs.us-west-2.amazonaws.com:/my-efs-mount-directory.   The directory path in the format efs-dns-name:/directory-path is optional. If you do not specify a directory path, the location is only the DNS name and CodeBuild mounts the entire file system. 
    */
  var location: js.UndefOr[String] = js.native
  /**
    *  The mount options for a file system created by AWS EFS. The default mount options used by CodeBuild are nfsvers=4.1,rsize=1048576,wsize=1048576,hard,timeo=600,retrans=2. For more information, see Recommended NFS Mount Options. 
    */
  var mountOptions: js.UndefOr[String] = js.native
  /**
    *  The location in the container where you mount the file system. 
    */
  var mountPoint: js.UndefOr[String] = js.native
  /**
    *  The type of the file system. The one supported type is EFS. 
    */
  var `type`: js.UndefOr[FileSystemType] = js.native
}

object ProjectFileSystemLocation {
  @scala.inline
  def apply(
    identifier: String = null,
    location: String = null,
    mountOptions: String = null,
    mountPoint: String = null,
    `type`: FileSystemType = null
  ): ProjectFileSystemLocation = {
    val __obj = js.Dynamic.literal()
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (mountOptions != null) __obj.updateDynamic("mountOptions")(mountOptions.asInstanceOf[js.Any])
    if (mountPoint != null) __obj.updateDynamic("mountPoint")(mountPoint.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectFileSystemLocation]
  }
}

