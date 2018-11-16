package typings
package cssLib.cssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Page extends Node {
  /** Array of nodes with the types declaration and comment. */
  var declarations: js.UndefOr[js.Array[Declaration | Comment]] = js.undefined
  /** The list of selectors of the rule, split on commas. Each selector is trimmed from whitespace and comments. */
  var selectors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

