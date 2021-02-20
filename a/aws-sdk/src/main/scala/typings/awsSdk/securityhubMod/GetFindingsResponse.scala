package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFindingsResponse extends StObject {
  
  /**
    * The findings that matched the filters specified in the request.
    */
  var Findings: AwsSecurityFindingList = js.native
  
  /**
    * The pagination token to use to request the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.securityhubMod.NextToken] = js.native
}
object GetFindingsResponse {
  
  @scala.inline
  def apply(Findings: AwsSecurityFindingList): GetFindingsResponse = {
    val __obj = js.Dynamic.literal(Findings = Findings.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFindingsResponse]
  }
  
  @scala.inline
  implicit class GetFindingsResponseMutableBuilder[Self <: GetFindingsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFindings(value: AwsSecurityFindingList): Self = StObject.set(x, "Findings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingsVarargs(value: AwsSecurityFinding*): Self = StObject.set(x, "Findings", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
