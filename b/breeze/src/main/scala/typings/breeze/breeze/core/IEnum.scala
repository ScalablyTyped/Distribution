package typings.breeze.breeze.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEnum extends js.Object {
  def contains(`object`: js.Any): Boolean
  def fromName(name: String): EnumSymbol
  def getNames(): js.Array[String]
  def getSymbols(): js.Array[EnumSymbol]
}

object IEnum {
  @scala.inline
  def apply(
    contains: js.Any => Boolean,
    fromName: String => EnumSymbol,
    getNames: () => js.Array[String],
    getSymbols: () => js.Array[EnumSymbol]
  ): IEnum = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), fromName = js.Any.fromFunction1(fromName), getNames = js.Any.fromFunction0(getNames), getSymbols = js.Any.fromFunction0(getSymbols))
    __obj.asInstanceOf[IEnum]
  }
}

