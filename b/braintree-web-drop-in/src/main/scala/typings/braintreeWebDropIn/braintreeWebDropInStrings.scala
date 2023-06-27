package typings.braintreeWebDropIn

import typings.braintreeWebDropIn.mod.ActiveView
import typings.braintreeWebDropIn.mod.HostedFieldsStateEvents
import typings.braintreeWebDropIn.mod.UpdatableConfigurationOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object braintreeWebDropInStrings {
  
  @js.native
  sealed trait AndroidPayCard extends StObject
  inline def AndroidPayCard: AndroidPayCard = "AndroidPayCard".asInstanceOf[AndroidPayCard]
  
  @js.native
  sealed trait ApplePayCard extends StObject
  inline def ApplePayCard: ApplePayCard = "ApplePayCard".asInstanceOf[ApplePayCard]
  
  @js.native
  sealed trait CreditCard extends StObject
  inline def CreditCard: CreditCard = "CreditCard".asInstanceOf[CreditCard]
  
  @js.native
  sealed trait No extends StObject
  inline def No: No = "No".asInstanceOf[No]
  
  @js.native
  sealed trait PayPalAccount extends StObject
  inline def PayPalAccount: PayPalAccount = "PayPalAccount".asInstanceOf[PayPalAccount]
  
  @js.native
  sealed trait Unknown extends StObject
  inline def Unknown: Unknown = "Unknown".asInstanceOf[Unknown]
  
  @js.native
  sealed trait VenmoAccount extends StObject
  inline def VenmoAccount: VenmoAccount = "VenmoAccount".asInstanceOf[VenmoAccount]
  
  @js.native
  sealed trait Yes extends StObject
  inline def Yes: Yes = "Yes".asInstanceOf[Yes]
  
  @js.native
  sealed trait applePay
    extends StObject
       with ActiveView
       with UpdatableConfigurationOption
  inline def applePay: applePay = "applePay".asInstanceOf[applePay]
  
  @js.native
  sealed trait black extends StObject
  inline def black: black = "black".asInstanceOf[black]
  
  @js.native
  sealed trait card
    extends StObject
       with ActiveView
  inline def card: card = "card".asInstanceOf[card]
  
  @js.native
  sealed trait cardColonbinAvailable
    extends StObject
       with HostedFieldsStateEvents
  inline def cardColonbinAvailable: cardColonbinAvailable = "card:binAvailable".asInstanceOf[cardColonbinAvailable]
  
  @js.native
  sealed trait cardColonblur
    extends StObject
       with HostedFieldsStateEvents
  inline def cardColonblur: cardColonblur = "card:blur".asInstanceOf[cardColonblur]
  
  @js.native
  sealed trait cardColoncardTypeChange
    extends StObject
       with HostedFieldsStateEvents
  inline def cardColoncardTypeChange: cardColoncardTypeChange = "card:cardTypeChange".asInstanceOf[cardColoncardTypeChange]
  
  @js.native
  sealed trait cardColonempty
    extends StObject
       with HostedFieldsStateEvents
  inline def cardColonempty: cardColonempty = "card:empty".asInstanceOf[cardColonempty]
  
  @js.native
  sealed trait cardColonfocus
    extends StObject
       with HostedFieldsStateEvents
  inline def cardColonfocus: cardColonfocus = "card:focus".asInstanceOf[cardColonfocus]
  
  @js.native
  sealed trait cardColoninputSubmitRequest
    extends StObject
       with HostedFieldsStateEvents
  inline def cardColoninputSubmitRequest: cardColoninputSubmitRequest = "card:inputSubmitRequest".asInstanceOf[cardColoninputSubmitRequest]
  
  @js.native
  sealed trait cardColonnotEmpty
    extends StObject
       with HostedFieldsStateEvents
  inline def cardColonnotEmpty: cardColonnotEmpty = "card:notEmpty".asInstanceOf[cardColonnotEmpty]
  
  @js.native
  sealed trait cardColonvalidityChange
    extends StObject
       with HostedFieldsStateEvents
  inline def cardColonvalidityChange: cardColonvalidityChange = "card:validityChange".asInstanceOf[cardColonvalidityChange]
  
  @js.native
  sealed trait changeActiveView extends StObject
  inline def changeActiveView: changeActiveView = "changeActiveView".asInstanceOf[changeActiveView]
  
  @js.native
  sealed trait checkout extends StObject
  inline def checkout: checkout = "checkout".asInstanceOf[checkout]
  
  @js.native
  sealed trait `delete-confirmation`
    extends StObject
       with ActiveView
  inline def `delete-confirmation`: `delete-confirmation` = "delete-confirmation".asInstanceOf[`delete-confirmation`]
  
  @js.native
  sealed trait googlePay
    extends StObject
       with ActiveView
       with UpdatableConfigurationOption
  inline def googlePay: googlePay = "googlePay".asInstanceOf[googlePay]
  
  @js.native
  sealed trait methods
    extends StObject
       with ActiveView
  inline def methods: methods = "methods".asInstanceOf[methods]
  
  @js.native
  sealed trait noPaymentMethodRequestable extends StObject
  inline def noPaymentMethodRequestable: noPaymentMethodRequestable = "noPaymentMethodRequestable".asInstanceOf[noPaymentMethodRequestable]
  
  @js.native
  sealed trait options
    extends StObject
       with ActiveView
  inline def options: options = "options".asInstanceOf[options]
  
  @js.native
  sealed trait paymentMethodRequestable extends StObject
  inline def paymentMethodRequestable: paymentMethodRequestable = "paymentMethodRequestable".asInstanceOf[paymentMethodRequestable]
  
  @js.native
  sealed trait paymentOptionSelected extends StObject
  inline def paymentOptionSelected: paymentOptionSelected = "paymentOptionSelected".asInstanceOf[paymentOptionSelected]
  
  @js.native
  sealed trait paypal
    extends StObject
       with ActiveView
       with UpdatableConfigurationOption
  inline def paypal: paypal = "paypal".asInstanceOf[paypal]
  
  @js.native
  sealed trait paypalCredit
    extends StObject
       with ActiveView
       with UpdatableConfigurationOption
  inline def paypalCredit: paypalCredit = "paypalCredit".asInstanceOf[paypalCredit]
  
  @js.native
  sealed trait threeDSecure
    extends StObject
       with UpdatableConfigurationOption
  inline def threeDSecure: threeDSecure = "threeDSecure".asInstanceOf[threeDSecure]
  
  @js.native
  sealed trait vault extends StObject
  inline def vault: vault = "vault".asInstanceOf[vault]
  
  @js.native
  sealed trait venmo
    extends StObject
       with ActiveView
  inline def venmo: venmo = "venmo".asInstanceOf[venmo]
  
  @js.native
  sealed trait white extends StObject
  inline def white: white = "white".asInstanceOf[white]
  
  @js.native
  sealed trait `white-outline` extends StObject
  inline def `white-outline`: `white-outline` = "white-outline".asInstanceOf[`white-outline`]
}
