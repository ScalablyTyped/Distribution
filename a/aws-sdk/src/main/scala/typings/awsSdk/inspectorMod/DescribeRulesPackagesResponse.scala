package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRulesPackagesResponse extends StObject {
  
  /**
    * Rules package details that cannot be described. An error code is provided for each failed item.
    */
  var failedItems: FailedItems
  
  /**
    * Information about the rules package.
    */
  var rulesPackages: RulesPackageList
}
object DescribeRulesPackagesResponse {
  
  inline def apply(failedItems: FailedItems, rulesPackages: RulesPackageList): DescribeRulesPackagesResponse = {
    val __obj = js.Dynamic.literal(failedItems = failedItems.asInstanceOf[js.Any], rulesPackages = rulesPackages.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRulesPackagesResponse]
  }
  
  extension [Self <: DescribeRulesPackagesResponse](x: Self) {
    
    inline def setFailedItems(value: FailedItems): Self = StObject.set(x, "failedItems", value.asInstanceOf[js.Any])
    
    inline def setRulesPackages(value: RulesPackageList): Self = StObject.set(x, "rulesPackages", value.asInstanceOf[js.Any])
    
    inline def setRulesPackagesVarargs(value: RulesPackage*): Self = StObject.set(x, "rulesPackages", js.Array(value*))
  }
}
