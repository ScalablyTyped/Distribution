package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectResourceConfigRequest extends StObject {
  
  /**
    * The SQL query SELECT command.
    */
  var Expression: typings.awsSdk.configserviceMod.Expression = js.native
  
  /**
    * The maximum number of query results returned on each page. 
    */
  var Limit: js.UndefOr[typings.awsSdk.configserviceMod.Limit] = js.native
  
  /**
    * The nextToken string returned in a previous request that you use to request the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.native
}
object SelectResourceConfigRequest {
  
  @scala.inline
  def apply(Expression: Expression): SelectResourceConfigRequest = {
    val __obj = js.Dynamic.literal(Expression = Expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectResourceConfigRequest]
  }
  
  @scala.inline
  implicit class SelectResourceConfigRequestMutableBuilder[Self <: SelectResourceConfigRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: Expression): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: Limit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
