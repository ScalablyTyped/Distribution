package typings.cleanDashCss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AfterAtRule extends js.Object {
  /**
    * Controls if a line break comes after an at-rule; e.g. `@charset`; defaults to `false`
    */
  var afterAtRule: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls if a line break comes after a block begins; e.g. `@media`; defaults to `false`
    */
  var afterBlockBegins: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls if a line break comes after a block ends, defaults to `false`
    */
  var afterBlockEnds: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls if a line break comes after a comment; defaults to `false`
    */
  var afterComment: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls if a line break comes after a property; defaults to `false`
    */
  var afterProperty: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls if a line break comes after a rule begins; defaults to `false`
    */
  var afterRuleBegins: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls if a line break comes after a rule ends; defaults to `false`
    */
  var afterRuleEnds: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls if a line break comes before a block ends; defaults to `false`
    */
  var beforeBlockEnds: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls if a line break comes between selectors; defaults to `false`
    */
  var betweenSelectors: js.UndefOr[Boolean] = js.undefined
}

object Anon_AfterAtRule {
  @scala.inline
  def apply(
    afterAtRule: js.UndefOr[Boolean] = js.undefined,
    afterBlockBegins: js.UndefOr[Boolean] = js.undefined,
    afterBlockEnds: js.UndefOr[Boolean] = js.undefined,
    afterComment: js.UndefOr[Boolean] = js.undefined,
    afterProperty: js.UndefOr[Boolean] = js.undefined,
    afterRuleBegins: js.UndefOr[Boolean] = js.undefined,
    afterRuleEnds: js.UndefOr[Boolean] = js.undefined,
    beforeBlockEnds: js.UndefOr[Boolean] = js.undefined,
    betweenSelectors: js.UndefOr[Boolean] = js.undefined
  ): Anon_AfterAtRule = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(afterAtRule)) __obj.updateDynamic("afterAtRule")(afterAtRule.asInstanceOf[js.Any])
    if (!js.isUndefined(afterBlockBegins)) __obj.updateDynamic("afterBlockBegins")(afterBlockBegins.asInstanceOf[js.Any])
    if (!js.isUndefined(afterBlockEnds)) __obj.updateDynamic("afterBlockEnds")(afterBlockEnds.asInstanceOf[js.Any])
    if (!js.isUndefined(afterComment)) __obj.updateDynamic("afterComment")(afterComment.asInstanceOf[js.Any])
    if (!js.isUndefined(afterProperty)) __obj.updateDynamic("afterProperty")(afterProperty.asInstanceOf[js.Any])
    if (!js.isUndefined(afterRuleBegins)) __obj.updateDynamic("afterRuleBegins")(afterRuleBegins.asInstanceOf[js.Any])
    if (!js.isUndefined(afterRuleEnds)) __obj.updateDynamic("afterRuleEnds")(afterRuleEnds.asInstanceOf[js.Any])
    if (!js.isUndefined(beforeBlockEnds)) __obj.updateDynamic("beforeBlockEnds")(beforeBlockEnds.asInstanceOf[js.Any])
    if (!js.isUndefined(betweenSelectors)) __obj.updateDynamic("betweenSelectors")(betweenSelectors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AfterAtRule]
  }
}

