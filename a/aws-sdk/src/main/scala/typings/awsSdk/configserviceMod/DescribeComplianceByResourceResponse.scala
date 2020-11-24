package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeComplianceByResourceResponse extends js.Object {
  
  /**
    * Indicates whether the specified AWS resource complies with all of the AWS Config rules that evaluate it.
    */
  var ComplianceByResources: js.UndefOr[typings.awsSdk.configserviceMod.ComplianceByResources] = js.native
  
  /**
    * The string that you use in a subsequent request to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.native
}
object DescribeComplianceByResourceResponse {
  
  @scala.inline
  def apply(): DescribeComplianceByResourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeComplianceByResourceResponse]
  }
  
  @scala.inline
  implicit class DescribeComplianceByResourceResponseOps[Self <: DescribeComplianceByResourceResponse] (val x: Self) extends AnyVal {
    
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
    def setComplianceByResourcesVarargs(value: ComplianceByResource*): Self = this.set("ComplianceByResources", js.Array(value :_*))
    
    @scala.inline
    def setComplianceByResources(value: ComplianceByResources): Self = this.set("ComplianceByResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComplianceByResources: Self = this.set("ComplianceByResources", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
