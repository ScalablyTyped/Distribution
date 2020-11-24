package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeVpcEndpointServicePermissionsResult extends js.Object {
  
  /**
    * Information about one or more allowed principals.
    */
  var AllowedPrincipals: js.UndefOr[AllowedPrincipalSet] = js.native
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeVpcEndpointServicePermissionsResult {
  
  @scala.inline
  def apply(): DescribeVpcEndpointServicePermissionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcEndpointServicePermissionsResult]
  }
  
  @scala.inline
  implicit class DescribeVpcEndpointServicePermissionsResultOps[Self <: DescribeVpcEndpointServicePermissionsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowedPrincipalsVarargs(value: AllowedPrincipal*): Self = this.set("AllowedPrincipals", js.Array(value :_*))
    
    @scala.inline
    def setAllowedPrincipals(value: AllowedPrincipalSet): Self = this.set("AllowedPrincipals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedPrincipals: Self = this.set("AllowedPrincipals", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
