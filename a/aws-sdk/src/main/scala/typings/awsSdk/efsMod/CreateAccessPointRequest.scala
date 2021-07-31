package typings.awsSdk.efsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAccessPointRequest extends StObject {
  
  /**
    * A string of up to 64 ASCII characters that Amazon EFS uses to ensure idempotent creation.
    */
  var ClientToken: typings.awsSdk.efsMod.ClientToken
  
  /**
    * The ID of the EFS file system that the access point provides access to.
    */
  var FileSystemId: typings.awsSdk.efsMod.FileSystemId
  
  /**
    * The operating system user and group applied to all file system requests made using the access point.
    */
  var PosixUser: js.UndefOr[typings.awsSdk.efsMod.PosixUser] = js.undefined
  
  /**
    * Specifies the directory on the Amazon EFS file system that the access point exposes as the root directory of your file system to NFS clients using the access point. The clients using the access point can only access the root directory and below. If the RootDirectory &gt; Path specified does not exist, EFS creates it and applies the CreationInfo settings when a client connects to an access point. When specifying a RootDirectory, you need to provide the Path, and the CreationInfo is optional.
    */
  var RootDirectory: js.UndefOr[typings.awsSdk.efsMod.RootDirectory] = js.undefined
  
  /**
    * Creates tags associated with the access point. Each tag is a key-value pair.
    */
  var Tags: js.UndefOr[typings.awsSdk.efsMod.Tags] = js.undefined
}
object CreateAccessPointRequest {
  
  @scala.inline
  def apply(ClientToken: ClientToken, FileSystemId: FileSystemId): CreateAccessPointRequest = {
    val __obj = js.Dynamic.literal(ClientToken = ClientToken.asInstanceOf[js.Any], FileSystemId = FileSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccessPointRequest]
  }
  
  @scala.inline
  implicit class CreateAccessPointRequestMutableBuilder[Self <: CreateAccessPointRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosixUser(value: PosixUser): Self = StObject.set(x, "PosixUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosixUserUndefined: Self = StObject.set(x, "PosixUser", js.undefined)
    
    @scala.inline
    def setRootDirectory(value: RootDirectory): Self = StObject.set(x, "RootDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootDirectoryUndefined: Self = StObject.set(x, "RootDirectory", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
