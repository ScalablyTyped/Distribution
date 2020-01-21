package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

