package typings
package breezeLib.breezeNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEnum extends js.Object {
  def contains(`object`: js.Any): scala.Boolean
  def fromName(name: java.lang.String): EnumSymbol
  def getNames(): js.Array[java.lang.String]
  def getSymbols(): js.Array[EnumSymbol]
}

object IEnum {
  @scala.inline
  def apply(
    contains: js.Any => scala.Boolean,
    fromName: java.lang.String => EnumSymbol,
    getNames: () => js.Array[java.lang.String],
    getSymbols: () => js.Array[EnumSymbol]
  ): IEnum = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), fromName = js.Any.fromFunction1(fromName), getNames = js.Any.fromFunction0(getNames), getSymbols = js.Any.fromFunction0(getSymbols))
  
    __obj.asInstanceOf[IEnum]
  }
}

