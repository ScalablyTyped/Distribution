package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAuditSuppressionsResponse extends StObject {
  
  /**
    *  A token that can be used to retrieve the next set of results, or null if there are no additional results. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    *  List of audit suppressions. 
    */
  var suppressions: js.UndefOr[AuditSuppressionList] = js.undefined
}
object ListAuditSuppressionsResponse {
  
  @scala.inline
  def apply(): ListAuditSuppressionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAuditSuppressionsResponse]
  }
  
  @scala.inline
  implicit class ListAuditSuppressionsResponseMutableBuilder[Self <: ListAuditSuppressionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setSuppressions(value: AuditSuppressionList): Self = StObject.set(x, "suppressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressionsUndefined: Self = StObject.set(x, "suppressions", js.undefined)
    
    @scala.inline
    def setSuppressionsVarargs(value: AuditSuppression*): Self = StObject.set(x, "suppressions", js.Array(value :_*))
  }
}
