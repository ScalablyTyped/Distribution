package typings.breeze.breezeNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.core.Enum")
@js.native
class Enum protected () extends IEnum {
  def this(name: String) = this()
  def this(name: String, methodObj: js.Any) = this()
  def addSymbol(): EnumSymbol = js.native
  def addSymbol(propertiesObj: js.Any): EnumSymbol = js.native
  /* CompleteClass */
  override def contains(`object`: js.Any): Boolean = js.native
  /* CompleteClass */
  override def fromName(name: String): EnumSymbol = js.native
  /* CompleteClass */
  override def getNames(): js.Array[String] = js.native
  /* CompleteClass */
  override def getSymbols(): js.Array[EnumSymbol] = js.native
  def resolveSymbols(): Unit = js.native
}

/* static members */
@JSGlobal("breeze.core.Enum")
@js.native
object Enum extends js.Object {
  def isSymbol(`object`: js.Any): Boolean = js.native
}

