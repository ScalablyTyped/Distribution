package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IpRouteInfo extends StObject {
  
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
  implicit class IpRouteInfoMutableBuilder[Self <: IpRouteInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddedDateTime(value: AddedDateTime): Self = StObject.set(x, "AddedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddedDateTimeUndefined: Self = StObject.set(x, "AddedDateTime", js.undefined)
    
    @scala.inline
    def setCidrIp(value: CidrIp): Self = StObject.set(x, "CidrIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrIpUndefined: Self = StObject.set(x, "CidrIp", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryIdUndefined: Self = StObject.set(x, "DirectoryId", js.undefined)
    
    @scala.inline
    def setIpRouteStatusMsg(value: IpRouteStatusMsg): Self = StObject.set(x, "IpRouteStatusMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpRouteStatusMsgUndefined: Self = StObject.set(x, "IpRouteStatusMsg", js.undefined)
    
    @scala.inline
    def setIpRouteStatusReason(value: IpRouteStatusReason): Self = StObject.set(x, "IpRouteStatusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpRouteStatusReasonUndefined: Self = StObject.set(x, "IpRouteStatusReason", js.undefined)
  }
}
