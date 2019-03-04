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

object Parser {
  @scala.inline
  def apply(
    abort: js.Function0[scala.Unit],
    getCharIndex: js.Function0[scala.Double],
    parse: js.Function1[java.lang.String, js.Any]
  ): Parser = {
    val __obj = js.Dynamic.literal(abort = abort, getCharIndex = getCharIndex, parse = parse)
  
    __obj.asInstanceOf[Parser]
  }
}

