package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeLocationSmbResponse extends StObject {
  
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
  implicit class DescribeLocationSmbResponseMutableBuilder[Self <: DescribeLocationSmbResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgentArns(value: AgentArnList): Self = StObject.set(x, "AgentArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentArnsUndefined: Self = StObject.set(x, "AgentArns", js.undefined)
    
    @scala.inline
    def setAgentArnsVarargs(value: AgentArn*): Self = StObject.set(x, "AgentArns", js.Array(value :_*))
    
    @scala.inline
    def setCreationTime(value: Time): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setDomain(value: SmbDomain): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    @scala.inline
    def setLocationArn(value: LocationArn): Self = StObject.set(x, "LocationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationArnUndefined: Self = StObject.set(x, "LocationArn", js.undefined)
    
    @scala.inline
    def setLocationUri(value: LocationUri): Self = StObject.set(x, "LocationUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUriUndefined: Self = StObject.set(x, "LocationUri", js.undefined)
    
    @scala.inline
    def setMountOptions(value: SmbMountOptions): Self = StObject.set(x, "MountOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMountOptionsUndefined: Self = StObject.set(x, "MountOptions", js.undefined)
    
    @scala.inline
    def setUser(value: SmbUser): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
  }
}
