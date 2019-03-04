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
    contains: js.Function1[js.Any, scala.Boolean],
    fromName: js.Function1[java.lang.String, EnumSymbol],
    getNames: js.Function0[js.Array[java.lang.String]],
    getSymbols: js.Function0[js.Array[EnumSymbol]]
  ): IEnum = {
    val __obj = js.Dynamic.literal(contains = contains, fromName = fromName, getNames = getNames, getSymbols = getSymbols)
  
    __obj.asInstanceOf[IEnum]
  }
}

