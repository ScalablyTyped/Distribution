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

