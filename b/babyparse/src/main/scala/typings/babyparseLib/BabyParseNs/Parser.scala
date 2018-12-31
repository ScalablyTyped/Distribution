package typings
package babyparseLib.BabyParseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parser extends js.Object {
  // Sets the abort flag
  def abort(): scala.Unit
  // Gets the cursor position
  def getCharIndex(): scala.Double
  // Parses the input
  def parse(input: java.lang.String): js.Any
}

