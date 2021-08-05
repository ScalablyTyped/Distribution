package typings.braintreeWeb

import typings.braintreeWeb.coreMod.BraintreeErrorTypes
import typings.braintreeWeb.googlePaymentMod.GooglePaymentTokenizeValues
import typings.braintreeWeb.hostedFieldsMod.HostedFieldEventType
import typings.braintreeWeb.hostedFieldsMod.HostedFieldsHostedFieldsFieldName
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
       with GooglePaymentTokenizeValues
  inline def Unknown_ : Unknown_ = "Unknown".asInstanceOf[Unknown_]
  
  @js.native
  sealed trait Yes
    extends StObject
       with GooglePaymentTokenizeValues
  inline def Yes: Yes = "Yes".asInstanceOf[Yes]
  
  @js.native
  sealed trait blur
    extends StObject
       with HostedFieldEventType
  inline def blur: blur = "blur".asInstanceOf[blur]
  
  @js.native
  sealed trait cardTypeChange
    extends StObject
       with HostedFieldEventType
  inline def cardTypeChange: cardTypeChange = "cardTypeChange".asInstanceOf[cardTypeChange]
  
  @js.native
  sealed trait cvv
    extends StObject
       with HostedFieldsHostedFieldsFieldName
  inline def cvv: cvv = "cvv".asInstanceOf[cvv]
  
  @js.native
  sealed trait empty
    extends StObject
       with HostedFieldEventType
  inline def empty: empty = "empty".asInstanceOf[empty]
  
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
  sealed trait focus
    extends StObject
       with HostedFieldEventType
  inline def focus: focus = "focus".asInstanceOf[focus]
  
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
  sealed trait postalCode
    extends StObject
       with HostedFieldsHostedFieldsFieldName
  inline def postalCode: postalCode = "postalCode".asInstanceOf[postalCode]
  
  @js.native
  sealed trait validityChange
    extends StObject
       with HostedFieldEventType
  inline def validityChange: validityChange = "validityChange".asInstanceOf[validityChange]
}
