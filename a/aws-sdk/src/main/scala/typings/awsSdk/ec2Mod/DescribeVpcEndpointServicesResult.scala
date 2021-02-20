package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeVpcEndpointServicesResult extends StObject {
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * Information about the service.
    */
  var ServiceDetails: js.UndefOr[ServiceDetailSet] = js.native
  
  /**
    * A list of supported services.
    */
  var ServiceNames: js.UndefOr[ValueStringList] = js.native
}
object DescribeVpcEndpointServicesResult {
  
  @scala.inline
  def apply(): DescribeVpcEndpointServicesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcEndpointServicesResult]
  }
  
  @scala.inline
  implicit class DescribeVpcEndpointServicesResultMutableBuilder[Self <: DescribeVpcEndpointServicesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setServiceDetails(value: ServiceDetailSet): Self = StObject.set(x, "ServiceDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceDetailsUndefined: Self = StObject.set(x, "ServiceDetails", js.undefined)
    
    @scala.inline
    def setServiceDetailsVarargs(value: ServiceDetail*): Self = StObject.set(x, "ServiceDetails", js.Array(value :_*))
    
    @scala.inline
    def setServiceNames(value: ValueStringList): Self = StObject.set(x, "ServiceNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNamesUndefined: Self = StObject.set(x, "ServiceNames", js.undefined)
    
    @scala.inline
    def setServiceNamesVarargs(value: String*): Self = StObject.set(x, "ServiceNames", js.Array(value :_*))
  }
}
