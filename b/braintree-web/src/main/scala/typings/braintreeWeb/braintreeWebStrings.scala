package typings.braintreeWeb

import typings.braintreeWeb.modulesApplePayMod.ApplePayLineItemType
import typings.braintreeWeb.modulesApplePayMod.ApplePayPaymentTiming
import typings.braintreeWeb.modulesApplePayMod.ApplePayRecurringPaymentDateUnit
import typings.braintreeWeb.modulesApplePayMod.ApplePayTokenizeValues
import typings.braintreeWeb.modulesCoreMod.BraintreeErrorTypes
import typings.braintreeWeb.modulesGooglePaymentMod.GooglePaymentTokenizeValues
import typings.braintreeWeb.modulesHostedFieldsMod.HostedFieldAttributeName
import typings.braintreeWeb.modulesHostedFieldsMod.HostedFieldEventType
import typings.braintreeWeb.modulesHostedFieldsMod.HostedFieldsHostedFieldsFieldName
import typings.braintreeWeb.modulesLocalPaymentMod.LocalPaymentTypes
import typings.braintreeWeb.modulesThreeDSecureMod.ThreeDSecureEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object braintreeWebStrings {
  
  @js.native
  sealed trait `1` extends StObject
  inline def `1`: `1` = "1".asInstanceOf[`1`]
  
  @js.native
  sealed trait `2` extends StObject
  inline def `2`: `2` = "2".asInstanceOf[`2`]
  
  @js.native
  sealed trait `2-bootstrap3-modal` extends StObject
  inline def `2-bootstrap3-modal`: `2-bootstrap3-modal` = "2-bootstrap3-modal".asInstanceOf[`2-bootstrap3-modal`]
  
  @js.native
  sealed trait `2-inline-iframe` extends StObject
  inline def `2-inline-iframe`: `2-inline-iframe` = "2-inline-iframe".asInstanceOf[`2-inline-iframe`]
  
  @js.native
  sealed trait CUSTOMER
    extends StObject
       with BraintreeErrorTypes
  inline def CUSTOMER: CUSTOMER = "CUSTOMER".asInstanceOf[CUSTOMER]
  
  @js.native
  sealed trait INTERNAL
    extends StObject
       with BraintreeErrorTypes
  inline def INTERNAL: INTERNAL = "INTERNAL".asInstanceOf[INTERNAL]
  
  @js.native
  sealed trait MERCHANT
    extends StObject
       with BraintreeErrorTypes
  inline def MERCHANT: MERCHANT = "MERCHANT".asInstanceOf[MERCHANT]
  
  @js.native
  sealed trait NETWORK
    extends StObject
       with BraintreeErrorTypes
  inline def NETWORK: NETWORK = "NETWORK".asInstanceOf[NETWORK]
  
  @js.native
  sealed trait No
    extends StObject
       with ApplePayTokenizeValues
       with GooglePaymentTokenizeValues
  inline def No: No = "No".asInstanceOf[No]
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with BraintreeErrorTypes
  inline def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
  
  @js.native
  sealed trait Unknown_
    extends StObject
       with ApplePayTokenizeValues
       with GooglePaymentTokenizeValues
  inline def Unknown_ : Unknown_ = "Unknown".asInstanceOf[Unknown_]
  
  @js.native
  sealed trait Yes
    extends StObject
       with ApplePayTokenizeValues
       with GooglePaymentTokenizeValues
  inline def Yes: Yes = "Yes".asInstanceOf[Yes]
  
  @js.native
  sealed trait `aria-invalid`
    extends StObject
       with HostedFieldAttributeName
  inline def `aria-invalid`: `aria-invalid` = "aria-invalid".asInstanceOf[`aria-invalid`]
  
  @js.native
  sealed trait `aria-required`
    extends StObject
       with HostedFieldAttributeName
  inline def `aria-required`: `aria-required` = "aria-required".asInstanceOf[`aria-required`]
  
  @js.native
  sealed trait `authentication-iframe-available`
    extends StObject
       with ThreeDSecureEvent
  inline def `authentication-iframe-available`: `authentication-iframe-available` = "authentication-iframe-available".asInstanceOf[`authentication-iframe-available`]
  
  @js.native
  sealed trait `authentication-modal-close`
    extends StObject
       with ThreeDSecureEvent
  inline def `authentication-modal-close`: `authentication-modal-close` = "authentication-modal-close".asInstanceOf[`authentication-modal-close`]
  
  @js.native
  sealed trait `authentication-modal-render`
    extends StObject
       with ThreeDSecureEvent
  inline def `authentication-modal-render`: `authentication-modal-render` = "authentication-modal-render".asInstanceOf[`authentication-modal-render`]
  
  @js.native
  sealed trait authorize extends StObject
  inline def authorize: authorize = "authorize".asInstanceOf[authorize]
  
  @js.native
  sealed trait automaticReload
    extends StObject
       with ApplePayPaymentTiming
  inline def automaticReload: automaticReload = "automaticReload".asInstanceOf[automaticReload]
  
  @js.native
  sealed trait bancontact
    extends StObject
       with LocalPaymentTypes
  inline def bancontact: bancontact = "bancontact".asInstanceOf[bancontact]
  
  @js.native
  sealed trait binAvailable
    extends StObject
       with HostedFieldEventType
  inline def binAvailable: binAvailable = "binAvailable".asInstanceOf[binAvailable]
  
  @js.native
  sealed trait blik
    extends StObject
       with LocalPaymentTypes
  inline def blik: blik = "blik".asInstanceOf[blik]
  
  @js.native
  sealed trait blur
    extends StObject
       with HostedFieldEventType
  inline def blur: blur = "blur".asInstanceOf[blur]
  
  @js.native
  sealed trait buttons extends StObject
  inline def buttons: buttons = "buttons".asInstanceOf[buttons]
  
  @js.native
  sealed trait buttonsCommamessages extends StObject
  inline def buttonsCommamessages: buttonsCommamessages = "buttons,messages".asInstanceOf[buttonsCommamessages]
  
  @js.native
  sealed trait capture extends StObject
  inline def capture: capture = "capture".asInstanceOf[capture]
  
  @js.native
  sealed trait cardTypeChange
    extends StObject
       with HostedFieldEventType
  inline def cardTypeChange: cardTypeChange = "cardTypeChange".asInstanceOf[cardTypeChange]
  
  @js.native
  sealed trait cardholderName
    extends StObject
       with HostedFieldsHostedFieldsFieldName
  inline def cardholderName: cardholderName = "cardholderName".asInstanceOf[cardholderName]
  
  @js.native
  sealed trait `customer-canceled`
    extends StObject
       with ThreeDSecureEvent
  inline def `customer-canceled`: `customer-canceled` = "customer-canceled".asInstanceOf[`customer-canceled`]
  
  @js.native
  sealed trait cvv
    extends StObject
       with HostedFieldsHostedFieldsFieldName
  inline def cvv: cvv = "cvv".asInstanceOf[cvv]
  
  @js.native
  sealed trait day
    extends StObject
       with ApplePayRecurringPaymentDateUnit
  inline def day: day = "day".asInstanceOf[day]
  
  @js.native
  sealed trait deferred
    extends StObject
       with ApplePayPaymentTiming
  inline def deferred: deferred = "deferred".asInstanceOf[deferred]
  
  @js.native
  sealed trait disabled
    extends StObject
       with HostedFieldAttributeName
  inline def disabled: disabled = "disabled".asInstanceOf[disabled]
  
  @js.native
  sealed trait empty
    extends StObject
       with HostedFieldEventType
  inline def empty: empty = "empty".asInstanceOf[empty]
  
  @js.native
  sealed trait eps
    extends StObject
       with LocalPaymentTypes
  inline def eps: eps = "eps".asInstanceOf[eps]
  
  @js.native
  sealed trait expirationDate
    extends StObject
       with HostedFieldsHostedFieldsFieldName
  inline def expirationDate: expirationDate = "expirationDate".asInstanceOf[expirationDate]
  
  @js.native
  sealed trait expirationMonth
    extends StObject
       with HostedFieldsHostedFieldsFieldName
  inline def expirationMonth: expirationMonth = "expirationMonth".asInstanceOf[expirationMonth]
  
  @js.native
  sealed trait expirationYear
    extends StObject
       with HostedFieldsHostedFieldsFieldName
  inline def expirationYear: expirationYear = "expirationYear".asInstanceOf[expirationYear]
  
  @js.native
  sealed trait `final`
    extends StObject
       with ApplePayLineItemType
  inline def `final`: `final` = "final".asInstanceOf[`final`]
  
  @js.native
  sealed trait focus
    extends StObject
       with HostedFieldEventType
  inline def focus: focus = "focus".asInstanceOf[focus]
  
  @js.native
  sealed trait giropay
    extends StObject
       with LocalPaymentTypes
  inline def giropay: giropay = "giropay".asInstanceOf[giropay]
  
  @js.native
  sealed trait hour
    extends StObject
       with ApplePayRecurringPaymentDateUnit
  inline def hour: hour = "hour".asInstanceOf[hour]
  
  @js.native
  sealed trait ideal
    extends StObject
       with LocalPaymentTypes
  inline def ideal: ideal = "ideal".asInstanceOf[ideal]
  
  @js.native
  sealed trait immediate
    extends StObject
       with ApplePayPaymentTiming
  inline def immediate: immediate = "immediate".asInstanceOf[immediate]
  
  @js.native
  sealed trait inputSubmitRequest
    extends StObject
       with HostedFieldEventType
  inline def inputSubmitRequest: inputSubmitRequest = "inputSubmitRequest".asInstanceOf[inputSubmitRequest]
  
  @js.native
  sealed trait `lookup-complete`
    extends StObject
       with ThreeDSecureEvent
  inline def `lookup-complete`: `lookup-complete` = "lookup-complete".asInstanceOf[`lookup-complete`]
  
  @js.native
  sealed trait messages extends StObject
  inline def messages: messages = "messages".asInstanceOf[messages]
  
  @js.native
  sealed trait minute
    extends StObject
       with ApplePayRecurringPaymentDateUnit
  inline def minute: minute = "minute".asInstanceOf[minute]
  
  @js.native
  sealed trait month
    extends StObject
       with ApplePayRecurringPaymentDateUnit
  inline def month: month = "month".asInstanceOf[month]
  
  @js.native
  sealed trait mybank
    extends StObject
       with LocalPaymentTypes
  inline def mybank: mybank = "mybank".asInstanceOf[mybank]
  
  @js.native
  sealed trait notEmpty
    extends StObject
       with HostedFieldEventType
  inline def notEmpty: notEmpty = "notEmpty".asInstanceOf[notEmpty]
  
  @js.native
  sealed trait number
    extends StObject
       with HostedFieldsHostedFieldsFieldName
  inline def number: number = "number".asInstanceOf[number]
  
  @js.native
  sealed trait p24
    extends StObject
       with LocalPaymentTypes
  inline def p24: p24 = "p24".asInstanceOf[p24]
  
  @js.native
  sealed trait pending
    extends StObject
       with ApplePayLineItemType
  inline def pending: pending = "pending".asInstanceOf[pending]
  
  @js.native
  sealed trait placeholder
    extends StObject
       with HostedFieldAttributeName
  inline def placeholder: placeholder = "placeholder".asInstanceOf[placeholder]
  
  @js.native
  sealed trait postalCode
    extends StObject
       with HostedFieldsHostedFieldsFieldName
  inline def postalCode: postalCode = "postalCode".asInstanceOf[postalCode]
  
  @js.native
  sealed trait psd2 extends StObject
  inline def psd2: psd2 = "psd2".asInstanceOf[psd2]
  
  @js.native
  sealed trait recurring
    extends StObject
       with ApplePayPaymentTiming
  inline def recurring: recurring = "recurring".asInstanceOf[recurring]
  
  @js.native
  sealed trait sale extends StObject
  inline def sale: sale = "sale".asInstanceOf[sale]
  
  @js.native
  sealed trait sofort
    extends StObject
       with LocalPaymentTypes
  inline def sofort: sofort = "sofort".asInstanceOf[sofort]
  
  @js.native
  sealed trait tokenize extends StObject
  inline def tokenize: tokenize = "tokenize".asInstanceOf[tokenize]
  
  @js.native
  sealed trait trustly
    extends StObject
       with LocalPaymentTypes
  inline def trustly: trustly = "trustly".asInstanceOf[trustly]
  
  @js.native
  sealed trait unavailable extends StObject
  inline def unavailable: unavailable = "unavailable".asInstanceOf[unavailable]
  
  @js.native
  sealed trait unregulated extends StObject
  inline def unregulated: unregulated = "unregulated".asInstanceOf[unregulated]
  
  @js.native
  sealed trait validityChange
    extends StObject
       with HostedFieldEventType
  inline def validityChange: validityChange = "validityChange".asInstanceOf[validityChange]
  
  @js.native
  sealed trait year
    extends StObject
       with ApplePayRecurringPaymentDateUnit
  inline def year: year = "year".asInstanceOf[year]
}
