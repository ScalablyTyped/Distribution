package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLocationSmbRequest extends StObject {
  
  /**
    * The Amazon Resource Names (ARNs) of agents to use for a Simple Message Block (SMB) location. 
    */
  var AgentArns: AgentArnList
  
  /**
    * The name of the Windows domain that the SMB server belongs to.
    */
  var Domain: js.UndefOr[SmbDomain] = js.undefined
  
  /**
    * The mount options used by DataSync to access the SMB server.
    */
  var MountOptions: js.UndefOr[SmbMountOptions] = js.undefined
  
  /**
    * The password of the user who can mount the share, has the permissions to access files and folders in the SMB share.
    */
  var Password: SmbPassword
  
  /**
    * The name of the SMB server. This value is the IP address or Domain Name Service (DNS) name of the SMB server. An agent that is installed on-premises uses this hostname to mount the SMB server in a network.  This name must either be DNS-compliant or must be an IP version 4 (IPv4) address. 
    */
  var ServerHostname: typings.awsSdk.datasyncMod.ServerHostname
  
  /**
    * The subdirectory in the SMB file system that is used to read data from the SMB source location or write data to the SMB destination. The SMB path should be a path that's exported by the SMB server, or a subdirectory of that path. The path should be such that it can be mounted by other SMB clients in your network.   Subdirectory must be specified with forward slashes. For example, /path/to/folder.  To transfer all the data in the folder you specified, DataSync needs to have permissions to mount the SMB share, as well as to access all the data in that share. To ensure this, either ensure that the user/password specified belongs to the user who can mount the share, and who has the appropriate permissions for all of the files and directories that you want DataSync to access, or use credentials of a member of the Backup Operators group to mount the share. Doing either enables the agent to access the data. For the agent to access directories, you must additionally enable all execute access.
    */
  var Subdirectory: SmbSubdirectory
  
  /**
    * The key-value pair that represents the tag that you want to add to the location. The value can be an empty string. We recommend using tags to name your resources.
    */
  var Tags: js.UndefOr[InputTagList] = js.undefined
  
  /**
    * The user who can mount the share, has the permissions to access files and folders in the SMB share.
    */
  var User: SmbUser
}
object CreateLocationSmbRequest {
  
  @scala.inline
  def apply(
    AgentArns: AgentArnList,
    Password: SmbPassword,
    ServerHostname: ServerHostname,
    Subdirectory: SmbSubdirectory,
    User: SmbUser
  ): CreateLocationSmbRequest = {
    val __obj = js.Dynamic.literal(AgentArns = AgentArns.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], ServerHostname = ServerHostname.asInstanceOf[js.Any], Subdirectory = Subdirectory.asInstanceOf[js.Any], User = User.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLocationSmbRequest]
  }
  
  @scala.inline
  implicit class CreateLocationSmbRequestMutableBuilder[Self <: CreateLocationSmbRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgentArns(value: AgentArnList): Self = StObject.set(x, "AgentArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentArnsVarargs(value: AgentArn*): Self = StObject.set(x, "AgentArns", js.Array(value :_*))
    
    @scala.inline
    def setDomain(value: SmbDomain): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    @scala.inline
    def setMountOptions(value: SmbMountOptions): Self = StObject.set(x, "MountOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMountOptionsUndefined: Self = StObject.set(x, "MountOptions", js.undefined)
    
    @scala.inline
    def setPassword(value: SmbPassword): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerHostname(value: ServerHostname): Self = StObject.set(x, "ServerHostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubdirectory(value: SmbSubdirectory): Self = StObject.set(x, "Subdirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: InputTagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: TagListEntry*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setUser(value: SmbUser): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
  }
}
