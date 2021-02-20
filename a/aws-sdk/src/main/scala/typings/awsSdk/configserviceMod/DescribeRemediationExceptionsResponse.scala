package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRemediationExceptionsResponse extends StObject {
  
  /**
    * The nextToken string returned in a previous request that you use to request the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * Returns a list of remediation exception objects.
    */
  var RemediationExceptions: js.UndefOr[typings.awsSdk.configserviceMod.RemediationExceptions] = js.native
}
object DescribeRemediationExceptionsResponse {
  
  @scala.inline
  def apply(): DescribeRemediationExceptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRemediationExceptionsResponse]
  }
  
  @scala.inline
  implicit class DescribeRemediationExceptionsResponseMutableBuilder[Self <: DescribeRemediationExceptionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setRemediationExceptions(value: RemediationExceptions): Self = StObject.set(x, "RemediationExceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemediationExceptionsUndefined: Self = StObject.set(x, "RemediationExceptions", js.undefined)
    
    @scala.inline
    def setRemediationExceptionsVarargs(value: RemediationException*): Self = StObject.set(x, "RemediationExceptions", js.Array(value :_*))
  }
}
