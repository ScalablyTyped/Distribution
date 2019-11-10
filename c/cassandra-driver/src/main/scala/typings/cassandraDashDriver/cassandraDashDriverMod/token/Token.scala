package typings.cassandraDashDriver.cassandraDashDriverMod.token

import typings.cassandraDashDriver.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  def compare(other: Token): Double
  def equals(other: Token): Boolean
  def getType(): Anon_Code
  def getValue(): js.Any
}

object Token {
  @scala.inline
  def apply(
    compare: Token => Double,
    equals: Token => Boolean,
    getType: () => Anon_Code,
    getValue: () => js.Any
  ): Token = {
    val __obj = js.Dynamic.literal(compare = js.Any.fromFunction1(compare), equals = js.Any.fromFunction1(equals), getType = js.Any.fromFunction0(getType), getValue = js.Any.fromFunction0(getValue))
  
    __obj.asInstanceOf[Token]
  }
}

