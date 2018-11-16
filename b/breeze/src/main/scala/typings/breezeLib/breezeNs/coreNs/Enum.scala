package typings
package breezeLib.breezeNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.core.Enum")
@js.native
class Enum protected () extends IEnum {
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, methodObj: js.Any) = this()
  def addSymbol(): EnumSymbol = js.native
  def addSymbol(propertiesObj: js.Any): EnumSymbol = js.native
  /* CompleteClass */
  override def contains(`object`: js.Any): scala.Boolean = js.native
  /* CompleteClass */
  override def fromName(name: java.lang.String): EnumSymbol = js.native
  /* CompleteClass */
  override def getNames(): js.Array[java.lang.String] = js.native
  /* CompleteClass */
  override def getSymbols(): js.Array[EnumSymbol] = js.native
  def resolveSymbols(): scala.Unit = js.native
}

@JSGlobal("breeze.core.Enum")
@js.native
object Enum extends js.Object {
  def isSymbol(`object`: js.Any): scala.Boolean = js.native
}

