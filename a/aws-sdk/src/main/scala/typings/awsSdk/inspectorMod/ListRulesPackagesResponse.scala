package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRulesPackagesResponse extends StObject {
  
  /**
    *  When a response is generated, if there is more data to be listed, this parameter is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The list of ARNs that specifies the rules packages returned by the action.
    */
  var rulesPackageArns: ListReturnedArnList
}
object ListRulesPackagesResponse {
  
  @scala.inline
  def apply(rulesPackageArns: ListReturnedArnList): ListRulesPackagesResponse = {
    val __obj = js.Dynamic.literal(rulesPackageArns = rulesPackageArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRulesPackagesResponse]
  }
  
  @scala.inline
  implicit class ListRulesPackagesResponseMutableBuilder[Self <: ListRulesPackagesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setRulesPackageArns(value: ListReturnedArnList): Self = StObject.set(x, "rulesPackageArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesPackageArnsVarargs(value: Arn*): Self = StObject.set(x, "rulesPackageArns", js.Array(value :_*))
  }
}
