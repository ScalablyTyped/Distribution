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

