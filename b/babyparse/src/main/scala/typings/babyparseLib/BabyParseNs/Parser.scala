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
  def apply(abort: () => scala.Unit, getCharIndex: () => scala.Double, parse: java.lang.String => js.Any): Parser = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), getCharIndex = js.Any.fromFunction0(getCharIndex), parse = js.Any.fromFunction1(parse))
  
    __obj.asInstanceOf[Parser]
  }
}

