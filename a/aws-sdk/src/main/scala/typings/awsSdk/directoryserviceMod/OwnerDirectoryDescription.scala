package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OwnerDirectoryDescription extends StObject {
  
  /**
    * Identifier of the directory owner account.
    */
  var AccountId: js.UndefOr[CustomerId] = js.native
  
  /**
    * Identifier of the AWS Managed Microsoft AD directory in the directory owner account.
    */
  var DirectoryId: js.UndefOr[typings.awsSdk.directoryserviceMod.DirectoryId] = js.native
  
  /**
    * IP address of the directory’s domain controllers.
    */
  var DnsIpAddrs: js.UndefOr[typings.awsSdk.directoryserviceMod.DnsIpAddrs] = js.native
  
  /**
    * A RadiusSettings object that contains information about the RADIUS server.
    */
  var RadiusSettings: js.UndefOr[typings.awsSdk.directoryserviceMod.RadiusSettings] = js.native
  
  /**
    * Information about the status of the RADIUS server.
    */
  var RadiusStatus: js.UndefOr[typings.awsSdk.directoryserviceMod.RadiusStatus] = js.native
  
  /**
    * Information about the VPC settings for the directory.
    */
  var VpcSettings: js.UndefOr[DirectoryVpcSettingsDescription] = js.native
}
object OwnerDirectoryDescription {
  
  @scala.inline
  def apply(): OwnerDirectoryDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OwnerDirectoryDescription]
  }
  
  @scala.inline
  implicit class OwnerDirectoryDescriptionMutableBuilder[Self <: OwnerDirectoryDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: CustomerId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryIdUndefined: Self = StObject.set(x, "DirectoryId", js.undefined)
    
    @scala.inline
    def setDnsIpAddrs(value: DnsIpAddrs): Self = StObject.set(x, "DnsIpAddrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsIpAddrsUndefined: Self = StObject.set(x, "DnsIpAddrs", js.undefined)
    
    @scala.inline
    def setDnsIpAddrsVarargs(value: IpAddr*): Self = StObject.set(x, "DnsIpAddrs", js.Array(value :_*))
    
    @scala.inline
    def setRadiusSettings(value: RadiusSettings): Self = StObject.set(x, "RadiusSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusSettingsUndefined: Self = StObject.set(x, "RadiusSettings", js.undefined)
    
    @scala.inline
    def setRadiusStatus(value: RadiusStatus): Self = StObject.set(x, "RadiusStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusStatusUndefined: Self = StObject.set(x, "RadiusStatus", js.undefined)
    
    @scala.inline
    def setVpcSettings(value: DirectoryVpcSettingsDescription): Self = StObject.set(x, "VpcSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcSettingsUndefined: Self = StObject.set(x, "VpcSettings", js.undefined)
  }
}
