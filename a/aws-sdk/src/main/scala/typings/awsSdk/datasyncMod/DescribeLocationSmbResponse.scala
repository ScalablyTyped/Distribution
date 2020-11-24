package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeLocationSmbResponse extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the source SMB file system location that is created.
    */
  var AgentArns: js.UndefOr[AgentArnList] = js.native
  
  /**
    * The time that the SMB location was created.
    */
  var CreationTime: js.UndefOr[Time] = js.native
  
  /**
    * The name of the Windows domain that the SMB server belongs to.
    */
  var Domain: js.UndefOr[SmbDomain] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the SMB location that was described.
    */
  var LocationArn: js.UndefOr[typings.awsSdk.datasyncMod.LocationArn] = js.native
  
  /**
    * The URL of the source SBM location that was described.
    */
  var LocationUri: js.UndefOr[typings.awsSdk.datasyncMod.LocationUri] = js.native
  
  /**
    * The mount options that are available for DataSync to use to access an SMB location.
    */
  var MountOptions: js.UndefOr[SmbMountOptions] = js.native
  
  /**
    * The user who can mount the share, has the permissions to access files and folders in the SMB share.
    */
  var User: js.UndefOr[SmbUser] = js.native
}
object DescribeLocationSmbResponse {
  
  @scala.inline
  def apply(): DescribeLocationSmbResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLocationSmbResponse]
  }
  
  @scala.inline
  implicit class DescribeLocationSmbResponseOps[Self <: DescribeLocationSmbResponse] (val x: Self) extends AnyVal {
    
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
    def setAgentArnsVarargs(value: AgentArn*): Self = this.set("AgentArns", js.Array(value :_*))
    
    @scala.inline
    def setAgentArns(value: AgentArnList): Self = this.set("AgentArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgentArns: Self = this.set("AgentArns", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Time): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    
    @scala.inline
    def setDomain(value: SmbDomain): Self = this.set("Domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("Domain", js.undefined)
    
    @scala.inline
    def setLocationArn(value: LocationArn): Self = this.set("LocationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationArn: Self = this.set("LocationArn", js.undefined)
    
    @scala.inline
    def setLocationUri(value: LocationUri): Self = this.set("LocationUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationUri: Self = this.set("LocationUri", js.undefined)
    
    @scala.inline
    def setMountOptions(value: SmbMountOptions): Self = this.set("MountOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMountOptions: Self = this.set("MountOptions", js.undefined)
    
    @scala.inline
    def setUser(value: SmbUser): Self = this.set("User", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("User", js.undefined)
  }
}
