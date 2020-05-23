package typings.cqrsDomain.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// endregion
// region defineBusinessRule
trait DefineBusinessRuleOptions extends js.Object {
  /**
    * optional
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * optional, default is file name without extension
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * optional, default Infinity, all business rules will be sorted by this value
    */
  var priority: js.UndefOr[Double] = js.undefined
}

object DefineBusinessRuleOptions {
  @scala.inline
  def apply(description: String = null, name: String = null, priority: js.UndefOr[Double] = js.undefined): DefineBusinessRuleOptions = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineBusinessRuleOptions]
  }
}

