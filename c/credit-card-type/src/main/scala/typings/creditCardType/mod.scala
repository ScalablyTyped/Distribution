package typings.creditCardType

import typings.creditCardType.anon.PartialCreditCardType
import typings.creditCardType.typesMod.CreditCardType
import typings.creditCardType.typesMod.CreditCardTypeCardBrandId
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("credit-card-type", JSImport.Namespace)
@js.native
object mod extends js.Object {
  var addCard: js.Function1[/* config */ CreditCardType, Unit] = js.native
  var changeOrder: js.Function2[/* name */ String, /* position */ Double, Unit] = js.native
  var getTypeInfo: js.Function1[/* cardType */ String, CreditCardType] = js.native
  var removeCard: js.Function1[/* name */ String, Unit] = js.native
  var resetModifications: js.Function0[Unit] = js.native
  var types: Record[String, CreditCardTypeCardBrandId] = js.native
  var updateCard: js.Function2[/* cardType */ String, /* updates */ PartialCreditCardType, Unit] = js.native
  def apply(cardNumber: String): js.Array[CreditCardType] = js.native
}

