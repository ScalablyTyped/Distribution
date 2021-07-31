package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLocalGatewayVirtualInterfaceGroupsResult extends StObject {
  
  /**
    * The virtual interface groups.
    */
  var LocalGatewayVirtualInterfaceGroups: js.UndefOr[LocalGatewayVirtualInterfaceGroupSet] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeLocalGatewayVirtualInterfaceGroupsResult {
  
  @scala.inline
  def apply(): DescribeLocalGatewayVirtualInterfaceGroupsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLocalGatewayVirtualInterfaceGroupsResult]
  }
  
  @scala.inline
  implicit class DescribeLocalGatewayVirtualInterfaceGroupsResultMutableBuilder[Self <: DescribeLocalGatewayVirtualInterfaceGroupsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocalGatewayVirtualInterfaceGroups(value: LocalGatewayVirtualInterfaceGroupSet): Self = StObject.set(x, "LocalGatewayVirtualInterfaceGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalGatewayVirtualInterfaceGroupsUndefined: Self = StObject.set(x, "LocalGatewayVirtualInterfaceGroups", js.undefined)
    
    @scala.inline
    def setLocalGatewayVirtualInterfaceGroupsVarargs(value: LocalGatewayVirtualInterfaceGroup*): Self = StObject.set(x, "LocalGatewayVirtualInterfaceGroups", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
