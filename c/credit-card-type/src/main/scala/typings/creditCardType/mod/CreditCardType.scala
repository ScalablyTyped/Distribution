package typings.creditCardType.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreditCardType extends js.Object {
  var types: StringDictionary[String] = js.native
  def apply(number: String): js.Array[CreditCardTypeInfo] = js.native
  def getTypeInfo(`type`: String): CreditCardTypeInfo = js.native
}

