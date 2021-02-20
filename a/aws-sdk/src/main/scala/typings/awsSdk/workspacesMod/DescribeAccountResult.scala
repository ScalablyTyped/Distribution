package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAccountResult extends StObject {
  
  /**
    * The IP address range, specified as an IPv4 CIDR block, used for the management network interface. The management network interface is connected to a secure Amazon WorkSpaces management network. It is used for interactive streaming of the WorkSpace desktop to Amazon WorkSpaces clients, and to allow Amazon WorkSpaces to manage the WorkSpace.
    */
  var DedicatedTenancyManagementCidrRange: js.UndefOr[typings.awsSdk.workspacesMod.DedicatedTenancyManagementCidrRange] = js.native
  
  /**
    * The status of BYOL (whether BYOL is enabled or disabled).
    */
  var DedicatedTenancySupport: js.UndefOr[DedicatedTenancySupportResultEnum] = js.native
}
object DescribeAccountResult {
  
  @scala.inline
  def apply(): DescribeAccountResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountResult]
  }
  
  @scala.inline
  implicit class DescribeAccountResultMutableBuilder[Self <: DescribeAccountResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDedicatedTenancyManagementCidrRange(value: DedicatedTenancyManagementCidrRange): Self = StObject.set(x, "DedicatedTenancyManagementCidrRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDedicatedTenancyManagementCidrRangeUndefined: Self = StObject.set(x, "DedicatedTenancyManagementCidrRange", js.undefined)
    
    @scala.inline
    def setDedicatedTenancySupport(value: DedicatedTenancySupportResultEnum): Self = StObject.set(x, "DedicatedTenancySupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDedicatedTenancySupportUndefined: Self = StObject.set(x, "DedicatedTenancySupport", js.undefined)
  }
}
