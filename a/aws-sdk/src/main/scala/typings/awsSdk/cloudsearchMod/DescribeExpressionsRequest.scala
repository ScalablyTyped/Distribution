package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeExpressionsRequest extends StObject {
  
  /**
    * Whether to display the deployed configuration (true) or include any pending changes (false). Defaults to false.
    */
  var Deployed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the domain you want to describe.
    */
  var DomainName: typings.awsSdk.cloudsearchMod.DomainName
  
  /**
    * Limits the DescribeExpressions response to the specified expressions. If not specified, all expressions are shown.
    */
  var ExpressionNames: js.UndefOr[StandardNameList] = js.undefined
}
object DescribeExpressionsRequest {
  
  @scala.inline
  def apply(DomainName: DomainName): DescribeExpressionsRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeExpressionsRequest]
  }
  
  @scala.inline
  implicit class DescribeExpressionsRequestMutableBuilder[Self <: DescribeExpressionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeployed(value: Boolean): Self = StObject.set(x, "Deployed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeployedUndefined: Self = StObject.set(x, "Deployed", js.undefined)
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionNames(value: StandardNameList): Self = StObject.set(x, "ExpressionNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionNamesUndefined: Self = StObject.set(x, "ExpressionNames", js.undefined)
    
    @scala.inline
    def setExpressionNamesVarargs(value: StandardName*): Self = StObject.set(x, "ExpressionNames", js.Array(value :_*))
  }
}
