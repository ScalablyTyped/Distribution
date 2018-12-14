package typings
package creditDashCardDashTypeLib.creditDashCardDashTypeMod.creditCardTypeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreditCardType extends js.Object {
  var types: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  def apply(number: java.lang.String): js.Array[CreditCardTypeInfo] = js.native
  def getTypeInfo(`type`: java.lang.String): CreditCardTypeInfo = js.native
}

