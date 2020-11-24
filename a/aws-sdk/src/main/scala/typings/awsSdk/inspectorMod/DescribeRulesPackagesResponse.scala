package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRulesPackagesResponse extends js.Object {
  
  /**
    * Rules package details that cannot be described. An error code is provided for each failed item.
    */
  var failedItems: FailedItems = js.native
  
  /**
    * Information about the rules package.
    */
  var rulesPackages: RulesPackageList = js.native
}
object DescribeRulesPackagesResponse {
  
  @scala.inline
  def apply(failedItems: FailedItems, rulesPackages: RulesPackageList): DescribeRulesPackagesResponse = {
    val __obj = js.Dynamic.literal(failedItems = failedItems.asInstanceOf[js.Any], rulesPackages = rulesPackages.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRulesPackagesResponse]
  }
  
  @scala.inline
  implicit class DescribeRulesPackagesResponseOps[Self <: DescribeRulesPackagesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFailedItems(value: FailedItems): Self = this.set("failedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesPackagesVarargs(value: RulesPackage*): Self = this.set("rulesPackages", js.Array(value :_*))
    
    @scala.inline
    def setRulesPackages(value: RulesPackageList): Self = this.set("rulesPackages", value.asInstanceOf[js.Any])
  }
}
