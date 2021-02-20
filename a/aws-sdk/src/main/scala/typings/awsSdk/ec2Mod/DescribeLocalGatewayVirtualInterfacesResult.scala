package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeLocalGatewayVirtualInterfacesResult extends StObject {
  
  /**
    * Information about the virtual interfaces.
    */
  var LocalGatewayVirtualInterfaces: js.UndefOr[LocalGatewayVirtualInterfaceSet] = js.native
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeLocalGatewayVirtualInterfacesResult {
  
  @scala.inline
  def apply(): DescribeLocalGatewayVirtualInterfacesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLocalGatewayVirtualInterfacesResult]
  }
  
  @scala.inline
  implicit class DescribeLocalGatewayVirtualInterfacesResultMutableBuilder[Self <: DescribeLocalGatewayVirtualInterfacesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocalGatewayVirtualInterfaces(value: LocalGatewayVirtualInterfaceSet): Self = StObject.set(x, "LocalGatewayVirtualInterfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalGatewayVirtualInterfacesUndefined: Self = StObject.set(x, "LocalGatewayVirtualInterfaces", js.undefined)
    
    @scala.inline
    def setLocalGatewayVirtualInterfacesVarargs(value: LocalGatewayVirtualInterface*): Self = StObject.set(x, "LocalGatewayVirtualInterfaces", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
