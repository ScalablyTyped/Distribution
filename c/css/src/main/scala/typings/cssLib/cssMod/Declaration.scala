package typings
package cssLib.cssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Declaration extends Node {
  /** The property name, trimmed from whitespace and comments. May not be empty. */
  var property: js.UndefOr[java.lang.String] = js.undefined
  /** The value of the property, trimmed from whitespace and comments. Empty values are allowed. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

