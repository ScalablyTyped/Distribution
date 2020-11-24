package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IpRouteInfo extends js.Object {
  
  /**
    * The date and time the address block was added to the directory.
    */
  var AddedDateTime: js.UndefOr[typings.awsSdk.directoryserviceMod.AddedDateTime] = js.native
  
  /**
    * IP address block in the IpRoute.
    */
  var CidrIp: js.UndefOr[typings.awsSdk.directoryserviceMod.CidrIp] = js.native
  
  /**
    * Description of the IpRouteInfo.
    */
  var Description: js.UndefOr[typings.awsSdk.directoryserviceMod.Description] = js.native
  
  /**
    * Identifier (ID) of the directory associated with the IP addresses.
    */
  var DirectoryId: js.UndefOr[typings.awsSdk.directoryserviceMod.DirectoryId] = js.native
  
  /**
    * The status of the IP address block.
    */
  var IpRouteStatusMsg: js.UndefOr[typings.awsSdk.directoryserviceMod.IpRouteStatusMsg] = js.native
  
  /**
    * The reason for the IpRouteStatusMsg.
    */
  var IpRouteStatusReason: js.UndefOr[typings.awsSdk.directoryserviceMod.IpRouteStatusReason] = js.native
}
object IpRouteInfo {
  
  @scala.inline
  def apply(): IpRouteInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpRouteInfo]
  }
  
  @scala.inline
  implicit class IpRouteInfoOps[Self <: IpRouteInfo] (val x: Self) extends AnyVal {
    
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
    def setAddedDateTime(value: AddedDateTime): Self = this.set("AddedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddedDateTime: Self = this.set("AddedDateTime", js.undefined)
    
    @scala.inline
    def setCidrIp(value: CidrIp): Self = this.set("CidrIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCidrIp: Self = this.set("CidrIp", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = this.set("DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectoryId: Self = this.set("DirectoryId", js.undefined)
    
    @scala.inline
    def setIpRouteStatusMsg(value: IpRouteStatusMsg): Self = this.set("IpRouteStatusMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpRouteStatusMsg: Self = this.set("IpRouteStatusMsg", js.undefined)
    
    @scala.inline
    def setIpRouteStatusReason(value: IpRouteStatusReason): Self = this.set("IpRouteStatusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpRouteStatusReason: Self = this.set("IpRouteStatusReason", js.undefined)
  }
}
