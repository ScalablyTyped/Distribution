package typings
package cssLib.cssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Media extends Node {
  /** The part following @media. */
  var media: js.UndefOr[java.lang.String] = js.undefined
  /** Array of nodes with the types rule, comment and any of the at-rule types. */
  var rules: js.UndefOr[js.Array[Rule | Comment | AtRule]] = js.undefined
}

