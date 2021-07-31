package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeNetworkInterfacesResult extends StObject {
  
  /**
    * Information about one or more network interfaces.
    */
  var NetworkInterfaces: js.UndefOr[NetworkInterfaceList] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeNetworkInterfacesResult {
  
  @scala.inline
  def apply(): DescribeNetworkInterfacesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNetworkInterfacesResult]
  }
  
  @scala.inline
  implicit class DescribeNetworkInterfacesResultMutableBuilder[Self <: DescribeNetworkInterfacesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworkInterfaces(value: NetworkInterfaceList): Self = StObject.set(x, "NetworkInterfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfacesUndefined: Self = StObject.set(x, "NetworkInterfaces", js.undefined)
    
    @scala.inline
    def setNetworkInterfacesVarargs(value: NetworkInterface*): Self = StObject.set(x, "NetworkInterfaces", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
