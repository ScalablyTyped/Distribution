package typings
package cleanDashCssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AfterAtRule extends js.Object {
  /**
    * Controls if a line break comes after an at-rule; e.g. `@charset`; defaults to `false`
    */
  var afterAtRule: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls if a line break comes after a block begins; e.g. `@media`; defaults to `false`
    */
  var afterBlockBegins: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls if a line break comes after a block ends, defaults to `false`
    */
  var afterBlockEnds: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls if a line break comes after a comment; defaults to `false`
    */
  var afterComment: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls if a line break comes after a property; defaults to `false`
    */
  var afterProperty: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls if a line break comes after a rule begins; defaults to `false`
    */
  var afterRuleBegins: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls if a line break comes after a rule ends; defaults to `false`
    */
  var afterRuleEnds: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls if a line break comes before a block ends; defaults to `false`
    */
  var beforeBlockEnds: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls if a line break comes between selectors; defaults to `false`
    */
  var betweenSelectors: js.UndefOr[scala.Boolean] = js.undefined
}

