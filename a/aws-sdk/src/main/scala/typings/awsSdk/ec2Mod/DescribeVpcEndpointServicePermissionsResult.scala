package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVpcEndpointServicePermissionsResult extends StObject {
  
  /**
    * Information about one or more allowed principals.
    */
  var AllowedPrincipals: js.UndefOr[AllowedPrincipalSet] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeVpcEndpointServicePermissionsResult {
  
  inline def apply(): DescribeVpcEndpointServicePermissionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcEndpointServicePermissionsResult]
  }
  
  extension [Self <: DescribeVpcEndpointServicePermissionsResult](x: Self) {
    
    inline def setAllowedPrincipals(value: AllowedPrincipalSet): Self = StObject.set(x, "AllowedPrincipals", value.asInstanceOf[js.Any])
    
    inline def setAllowedPrincipalsUndefined: Self = StObject.set(x, "AllowedPrincipals", js.undefined)
    
    inline def setAllowedPrincipalsVarargs(value: AllowedPrincipal*): Self = StObject.set(x, "AllowedPrincipals", js.Array(value :_*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
