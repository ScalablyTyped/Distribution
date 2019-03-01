package typings
package cqrsDashDomainLib.cqrsDashDomainMod.DomainNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// endregion
// region defineBusinessRule
trait DefineBusinessRuleOptions extends js.Object {
  /**
    * optional
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * optional, default is file name without extension
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * optional, default Infinity, all business rules will be sorted by this value
    */
  var priority: js.UndefOr[scala.Double] = js.undefined
}

object DefineBusinessRuleOptions {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    name: java.lang.String = null,
    priority: scala.Int | scala.Double = null
  ): DefineBusinessRuleOptions = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (name != null) __obj.updateDynamic("name")(name)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineBusinessRuleOptions]
  }
}

