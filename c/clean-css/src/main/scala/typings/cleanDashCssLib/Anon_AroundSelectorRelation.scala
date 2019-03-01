package typings
package cleanDashCssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AroundSelectorRelation extends js.Object {
  /**
    * Controls if spaces come around selector relations; e.g. `div > a`; defaults to `false`
    */
  var aroundSelectorRelation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls if a space comes before a block begins; e.g. `.block {`; defaults to `false`
    */
  var beforeBlockBegins: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls if a space comes before a value; e.g. `width: 1rem`; defaults to `false`
    */
  var beforeValue: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_AroundSelectorRelation {
  @scala.inline
  def apply(
    aroundSelectorRelation: js.UndefOr[scala.Boolean] = js.undefined,
    beforeBlockBegins: js.UndefOr[scala.Boolean] = js.undefined,
    beforeValue: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_AroundSelectorRelation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(aroundSelectorRelation)) __obj.updateDynamic("aroundSelectorRelation")(aroundSelectorRelation)
    if (!js.isUndefined(beforeBlockBegins)) __obj.updateDynamic("beforeBlockBegins")(beforeBlockBegins)
    if (!js.isUndefined(beforeValue)) __obj.updateDynamic("beforeValue")(beforeValue)
    __obj.asInstanceOf[Anon_AroundSelectorRelation]
  }
}

