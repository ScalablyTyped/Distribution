package typings.cardValidator.anon

import typings.creditCardType.anon.PartialCreditCardType
import typings.creditCardType.typesMod.CreditCardType
import typings.creditCardType.typesMod.CreditCardTypeCardBrandId
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofcreditCardType extends js.Object {
  @JSName("addCard")
  var addCard_Original: js.Function1[/* config */ CreditCardType, Unit] = js.native
  @JSName("changeOrder")
  var changeOrder_Original: js.Function2[/* name */ String, /* position */ Double, Unit] = js.native
  @JSName("getTypeInfo")
  var getTypeInfo_Original: js.Function1[/* cardType */ String, CreditCardType] = js.native
  @JSName("removeCard")
  var removeCard_Original: js.Function1[/* name */ String, Unit] = js.native
  @JSName("resetModifications")
  var resetModifications_Original: js.Function0[Unit] = js.native
  var types: Record[String, CreditCardTypeCardBrandId] = js.native
  @JSName("updateCard")
  var updateCard_Original: js.Function2[/* cardType */ String, /* updates */ PartialCreditCardType, Unit] = js.native
  def addCard(config: CreditCardType): Unit = js.native
  def changeOrder(name: String, position: Double): Unit = js.native
  def getTypeInfo(cardType: String): CreditCardType = js.native
  def removeCard(name: String): Unit = js.native
  def resetModifications(): Unit = js.native
  def updateCard(cardType: String, updates: PartialCreditCardType): Unit = js.native
}

