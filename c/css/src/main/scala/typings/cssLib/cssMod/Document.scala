package typings
package cssLib.cssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Document extends Node {
  /** The part following @document. */
  var document: js.UndefOr[java.lang.String] = js.undefined
  /** Array of nodes with the types rule, comment and any of the at-rule types. */
  var rules: js.UndefOr[js.Array[Rule | Comment | AtRule]] = js.undefined
  /** The vendor prefix in @document, or undefined if there is none. */
  var vendor: js.UndefOr[java.lang.String] = js.undefined
}

