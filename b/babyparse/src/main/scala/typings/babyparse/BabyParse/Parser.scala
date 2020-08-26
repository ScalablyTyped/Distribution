package typings.babyparse.BabyParse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parser extends js.Object {
  // Sets the abort flag
  def abort(): Unit = js.native
  // Gets the cursor position
  def getCharIndex(): Double = js.native
  // Parses the input
  def parse(input: String): js.Any = js.native
}

object Parser {
  @scala.inline
  def apply(abort: () => Unit, getCharIndex: () => Double, parse: String => js.Any): Parser = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), getCharIndex = js.Any.fromFunction0(getCharIndex), parse = js.Any.fromFunction1(parse))
    __obj.asInstanceOf[Parser]
  }
  @scala.inline
  implicit class ParserOps[Self <: Parser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAbort(value: () => Unit): Self = this.set("abort", js.Any.fromFunction0(value))
    @scala.inline
    def setGetCharIndex(value: () => Double): Self = this.set("getCharIndex", js.Any.fromFunction0(value))
    @scala.inline
    def setParse(value: String => js.Any): Self = this.set("parse", js.Any.fromFunction1(value))
  }
  
}

