package typings
package cleanDashCssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdjacentSpace extends js.Object {
  /**
    * Controls extra space before `nav` element; defaults to `false`
    */
  var adjacentSpace: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls removal of IE7 selector hacks, e.g. `*+html...`; defaults to `true`
    */
  var ie7Hack: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls maximum number of selectors in a single rule (since 4.1.0); defaults to `8191`
    */
  var mergeLimit: scala.Double
  /**
    * Controls a whitelist of mergeable pseudo classes; defaults to `[':active', ...]`
    */
  var mergeablePseudoClasses: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Controls a whitelist of mergeable pseudo elements; defaults to `['::after', ...]`
    */
  var mergeablePseudoElements: js.Array[java.lang.String]
  /**
    * Controls merging of rules with multiple pseudo classes / elements (since 4.1.0); defaults to `true`
    */
  var multiplePseudoMerging: scala.Boolean
}

