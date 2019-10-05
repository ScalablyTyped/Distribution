package typings.babyparse.BabyParse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parser extends js.Object {
  // Sets the abort flag
  def abort(): Unit
  // Gets the cursor position
  def getCharIndex(): Double
  // Parses the input
  def parse(input: String): js.Any
}

object Parser {
  @scala.inline
  def apply(abort: () => Unit, getCharIndex: () => Double, parse: String => js.Any): Parser = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), getCharIndex = js.Any.fromFunction0(getCharIndex), parse = js.Any.fromFunction1(parse))
  
    __obj.asInstanceOf[Parser]
  }
}

