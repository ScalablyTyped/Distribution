package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EFSVolumeConfiguration extends StObject {
  
  /**
    * The authorization configuration details for the Amazon EFS file system.
    */
  var authorizationConfig: js.UndefOr[EFSAuthorizationConfig] = js.native
  
  /**
    * The Amazon EFS file system ID to use.
    */
  var fileSystemId: String = js.native
  
  /**
    * The directory within the Amazon EFS file system to mount as the root directory inside the host. If this parameter is omitted, the root of the Amazon EFS volume will be used. Specifying / will have the same effect as omitting this parameter.  If an EFS access point is specified in the authorizationConfig, the root directory parameter must either be omitted or set to / which will enforce the path set on the EFS access point. 
    */
  var rootDirectory: js.UndefOr[String] = js.native
  
  /**
    * Whether or not to enable encryption for Amazon EFS data in transit between the Amazon ECS host and the Amazon EFS server. Transit encryption must be enabled if Amazon EFS IAM authorization is used. If this parameter is omitted, the default value of DISABLED is used. For more information, see Encrypting Data in Transit in the Amazon Elastic File System User Guide.
    */
  var transitEncryption: js.UndefOr[EFSTransitEncryption] = js.native
  
  /**
    * The port to use when sending encrypted data between the Amazon ECS host and the Amazon EFS server. If you do not specify a transit encryption port, it will use the port selection strategy that the Amazon EFS mount helper uses. For more information, see EFS Mount Helper in the Amazon Elastic File System User Guide.
    */
  var transitEncryptionPort: js.UndefOr[BoxedInteger] = js.native
}
object EFSVolumeConfiguration {
  
  @scala.inline
  def apply(fileSystemId: String): EFSVolumeConfiguration = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EFSVolumeConfiguration]
  }
  
  @scala.inline
  implicit class EFSVolumeConfigurationMutableBuilder[Self <: EFSVolumeConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizationConfig(value: EFSAuthorizationConfig): Self = StObject.set(x, "authorizationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationConfigUndefined: Self = StObject.set(x, "authorizationConfig", js.undefined)
    
    @scala.inline
    def setFileSystemId(value: String): Self = StObject.set(x, "fileSystemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootDirectory(value: String): Self = StObject.set(x, "rootDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootDirectoryUndefined: Self = StObject.set(x, "rootDirectory", js.undefined)
    
    @scala.inline
    def setTransitEncryption(value: EFSTransitEncryption): Self = StObject.set(x, "transitEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitEncryptionPort(value: BoxedInteger): Self = StObject.set(x, "transitEncryptionPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitEncryptionPortUndefined: Self = StObject.set(x, "transitEncryptionPort", js.undefined)
    
    @scala.inline
    def setTransitEncryptionUndefined: Self = StObject.set(x, "transitEncryption", js.undefined)
  }
}
