package typings.creditCardType

import typings.creditCardType.anon.PartialCreditCardType
import typings.creditCardType.typesMod.CreditCardType
import typings.creditCardType.typesMod.CreditCardTypeCardBrandId
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(cardNumber: String): js.Array[CreditCardType] = ^.asInstanceOf[js.Dynamic].apply(cardNumber.asInstanceOf[js.Any]).asInstanceOf[js.Array[CreditCardType]]
  
  @JSImport("credit-card-type", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("credit-card-type", "addCard")
  @js.native
  def addCard: js.Function1[/* config */ CreditCardType, Unit] = js.native
  inline def addCard_=(x: js.Function1[/* config */ CreditCardType, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addCard")(x.asInstanceOf[js.Any])
  
  @JSImport("credit-card-type", "changeOrder")
  @js.native
  def changeOrder: js.Function2[/* name */ String, /* position */ Double, Unit] = js.native
  inline def changeOrder_=(x: js.Function2[/* name */ String, /* position */ Double, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("changeOrder")(x.asInstanceOf[js.Any])
  
  @JSImport("credit-card-type", "getTypeInfo")
  @js.native
  def getTypeInfo: js.Function1[/* cardType */ String, CreditCardType] = js.native
  inline def getTypeInfo_=(x: js.Function1[/* cardType */ String, CreditCardType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getTypeInfo")(x.asInstanceOf[js.Any])
  
  @JSImport("credit-card-type", "removeCard")
  @js.native
  def removeCard: js.Function1[/* name */ String, Unit] = js.native
  inline def removeCard_=(x: js.Function1[/* name */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeCard")(x.asInstanceOf[js.Any])
  
  @JSImport("credit-card-type", "resetModifications")
  @js.native
  def resetModifications: js.Function0[Unit] = js.native
  inline def resetModifications_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resetModifications")(x.asInstanceOf[js.Any])
  
  @JSImport("credit-card-type", "types")
  @js.native
  def types: Record[String, CreditCardTypeCardBrandId] = js.native
  inline def types_=(x: Record[String, CreditCardTypeCardBrandId]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("types")(x.asInstanceOf[js.Any])
  
  @JSImport("credit-card-type", "updateCard")
  @js.native
  def updateCard: js.Function2[/* cardType */ String, /* updates */ PartialCreditCardType, Unit] = js.native
  inline def updateCard_=(x: js.Function2[/* cardType */ String, /* updates */ PartialCreditCardType, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("updateCard")(x.asInstanceOf[js.Any])
}
