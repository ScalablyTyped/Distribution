package typings.braintreeWeb

import typings.braintreeWeb.mod.BraintreeError.Types
import typings.braintreeWeb.mod.HostedFieldsHostedFieldsFieldName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object braintreeWebStrings {
  @js.native
  sealed trait CUSTOMER extends Types
  
  @js.native
  sealed trait INTERNAL extends Types
  
  @js.native
  sealed trait MERCHANT extends Types
  
  @js.native
  sealed trait NETWORK extends Types
  
  @js.native
  sealed trait UNKNOWN extends Types
  
  @js.native
  sealed trait cvv extends HostedFieldsHostedFieldsFieldName
  
  @js.native
  sealed trait expirationDate extends HostedFieldsHostedFieldsFieldName
  
  @js.native
  sealed trait expirationMonth extends HostedFieldsHostedFieldsFieldName
  
  @js.native
  sealed trait expirationYear extends HostedFieldsHostedFieldsFieldName
  
  @js.native
  sealed trait number extends HostedFieldsHostedFieldsFieldName
  
  @js.native
  sealed trait postalCode extends HostedFieldsHostedFieldsFieldName
  
  @scala.inline
  def CUSTOMER: CUSTOMER = "CUSTOMER".asInstanceOf[CUSTOMER]
  @scala.inline
  def INTERNAL: INTERNAL = "INTERNAL".asInstanceOf[INTERNAL]
  @scala.inline
  def MERCHANT: MERCHANT = "MERCHANT".asInstanceOf[MERCHANT]
  @scala.inline
  def NETWORK: NETWORK = "NETWORK".asInstanceOf[NETWORK]
  @scala.inline
  def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
  @scala.inline
  def cvv: cvv = "cvv".asInstanceOf[cvv]
  @scala.inline
  def expirationDate: expirationDate = "expirationDate".asInstanceOf[expirationDate]
  @scala.inline
  def expirationMonth: expirationMonth = "expirationMonth".asInstanceOf[expirationMonth]
  @scala.inline
  def expirationYear: expirationYear = "expirationYear".asInstanceOf[expirationYear]
  @scala.inline
  def number: number = "number".asInstanceOf[number]
  @scala.inline
  def postalCode: postalCode = "postalCode".asInstanceOf[postalCode]
}

