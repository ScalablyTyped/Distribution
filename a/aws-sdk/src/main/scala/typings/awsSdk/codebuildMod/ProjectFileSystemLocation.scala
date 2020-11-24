package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectFileSystemLocation extends js.Object {
  
  /**
    * The name used to access a file system created by Amazon EFS. CodeBuild creates an environment variable by appending the identifier in all capital letters to CODEBUILD_. For example, if you specify my_efs for identifier, a new environment variable is create named CODEBUILD_MY_EFS.   The identifier is used to mount your file system. 
    */
  var identifier: js.UndefOr[String] = js.native
  
  /**
    * A string that specifies the location of the file system created by Amazon EFS. Its format is efs-dns-name:/directory-path. You can find the DNS name of file system when you view it in the AWS EFS console. The directory path is a path to a directory in the file system that CodeBuild mounts. For example, if the DNS name of a file system is fs-abcd1234.efs.us-west-2.amazonaws.com, and its mount directory is my-efs-mount-directory, then the location is fs-abcd1234.efs.us-west-2.amazonaws.com:/my-efs-mount-directory.  The directory path in the format efs-dns-name:/directory-path is optional. If you do not specify a directory path, the location is only the DNS name and CodeBuild mounts the entire file system. 
    */
  var location: js.UndefOr[String] = js.native
  
  /**
    *  The mount options for a file system created by AWS EFS. The default mount options used by CodeBuild are nfsvers=4.1,rsize=1048576,wsize=1048576,hard,timeo=600,retrans=2. For more information, see Recommended NFS Mount Options. 
    */
  var mountOptions: js.UndefOr[String] = js.native
  
  /**
    * The location in the container where you mount the file system. 
    */
  var mountPoint: js.UndefOr[String] = js.native
  
  /**
    *  The type of the file system. The one supported type is EFS. 
    */
  var `type`: js.UndefOr[FileSystemType] = js.native
}
object ProjectFileSystemLocation {
  
  @scala.inline
  def apply(): ProjectFileSystemLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectFileSystemLocation]
  }
  
  @scala.inline
  implicit class ProjectFileSystemLocationOps[Self <: ProjectFileSystemLocation] (val x: Self) extends AnyVal {
    
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
    def setIdentifier(value: String): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setMountOptions(value: String): Self = this.set("mountOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMountOptions: Self = this.set("mountOptions", js.undefined)
    
    @scala.inline
    def setMountPoint(value: String): Self = this.set("mountPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMountPoint: Self = this.set("mountPoint", js.undefined)
    
    @scala.inline
    def setType(value: FileSystemType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
