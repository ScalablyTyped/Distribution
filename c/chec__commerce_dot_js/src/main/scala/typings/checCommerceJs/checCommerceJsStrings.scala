package typings.checCommerceJs

import typings.checCommerceJs.featuresCartMod.RequestMethod
import typings.checCommerceJs.featuresCheckoutMod.IdentifierType
import typings.checCommerceJs.typesCheckoutCaptureResponseMod.FulfillmentStatus
import typings.checCommerceJs.typesCheckoutCaptureResponseMod.PaymentStatus
import typings.checCommerceJs.typesDiscountMod.DiscountType
import typings.checCommerceJs.typesMerchantMod.MerchantStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checCommerceJsStrings {
  
  @js.native
  sealed trait active
    extends StObject
       with MerchantStatus
  inline def active: active = "active".asInstanceOf[active]
  
  @js.native
  sealed trait authorize extends StObject
  inline def authorize: authorize = "authorize".asInstanceOf[authorize]
  
  @js.native
  sealed trait authorized
    extends StObject
       with PaymentStatus
  inline def authorized: authorized = "authorized".asInstanceOf[authorized]
  
  @js.native
  sealed trait braintree extends StObject
  inline def braintree: braintree = "braintree".asInstanceOf[braintree]
  
  @js.native
  sealed trait capture extends StObject
  inline def capture: capture = "capture".asInstanceOf[capture]
  
  @js.native
  sealed trait cart
    extends StObject
       with IdentifierType
  inline def cart: cart = "cart".asInstanceOf[cart]
  
  @js.native
  sealed trait delete
    extends StObject
       with RequestMethod
  inline def delete: delete = "delete".asInstanceOf[delete]
  
  @js.native
  sealed trait fixed
    extends StObject
       with DiscountType
  inline def fixed: fixed = "fixed".asInstanceOf[fixed]
  
  @js.native
  sealed trait fulfilled
    extends StObject
       with FulfillmentStatus
  inline def fulfilled: fulfilled = "fulfilled".asInstanceOf[fulfilled]
  
  @js.native
  sealed trait get
    extends StObject
       with RequestMethod
  inline def get: get = "get".asInstanceOf[get]
  
  @js.native
  sealed trait inactive
    extends StObject
       with MerchantStatus
  inline def inactive: inactive = "inactive".asInstanceOf[inactive]
  
  @js.native
  sealed trait manual extends StObject
  inline def manual: manual = "manual".asInstanceOf[manual]
  
  @js.native
  sealed trait not_fulfilled
    extends StObject
       with FulfillmentStatus
  inline def not_fulfilled: not_fulfilled = "not_fulfilled".asInstanceOf[not_fulfilled]
  
  @js.native
  sealed trait not_paid
    extends StObject
       with PaymentStatus
  inline def not_paid: not_paid = "not_paid".asInstanceOf[not_paid]
  
  @js.native
  sealed trait off_session extends StObject
  inline def off_session: off_session = "off_session".asInstanceOf[off_session]
  
  @js.native
  sealed trait omise extends StObject
  inline def omise: omise = "omise".asInstanceOf[omise]
  
  @js.native
  sealed trait on_session extends StObject
  inline def on_session: on_session = "on_session".asInstanceOf[on_session]
  
  @js.native
  sealed trait paid
    extends StObject
       with PaymentStatus
  inline def paid: paid = "paid".asInstanceOf[paid]
  
  @js.native
  sealed trait partially_fulfilled
    extends StObject
       with FulfillmentStatus
  inline def partially_fulfilled: partially_fulfilled = "partially_fulfilled".asInstanceOf[partially_fulfilled]
  
  @js.native
  sealed trait partially_paid
    extends StObject
       with PaymentStatus
  inline def partially_paid: partially_paid = "partially_paid".asInstanceOf[partially_paid]
  
  @js.native
  sealed trait patch
    extends StObject
       with RequestMethod
  inline def patch: patch = "patch".asInstanceOf[patch]
  
  @js.native
  sealed trait paypal extends StObject
  inline def paypal: paypal = "paypal".asInstanceOf[paypal]
  
  @js.native
  sealed trait percentage
    extends StObject
       with DiscountType
  inline def percentage: percentage = "percentage".asInstanceOf[percentage]
  
  @js.native
  sealed trait permalink
    extends StObject
       with IdentifierType
  inline def permalink: permalink = "permalink".asInstanceOf[permalink]
  
  @js.native
  sealed trait post
    extends StObject
       with RequestMethod
  inline def post: post = "post".asInstanceOf[post]
  
  @js.native
  sealed trait product_id
    extends StObject
       with IdentifierType
  inline def product_id: product_id = "product_id".asInstanceOf[product_id]
  
  @js.native
  sealed trait put
    extends StObject
       with RequestMethod
  inline def put: put = "put".asInstanceOf[put]
  
  @js.native
  sealed trait razorpay extends StObject
  inline def razorpay: razorpay = "razorpay".asInstanceOf[razorpay]
  
  @js.native
  sealed trait refunded
    extends StObject
       with PaymentStatus
  inline def refunded: refunded = "refunded".asInstanceOf[refunded]
  
  @js.native
  sealed trait returned
    extends StObject
       with FulfillmentStatus
  inline def returned: returned = "returned".asInstanceOf[returned]
  
  @js.native
  sealed trait square extends StObject
  inline def square: square = "square".asInstanceOf[square]
  
  @js.native
  sealed trait stripe extends StObject
  inline def stripe: stripe = "stripe".asInstanceOf[stripe]
  
  @js.native
  sealed trait test_gateway extends StObject
  inline def test_gateway: test_gateway = "test_gateway".asInstanceOf[test_gateway]
  
  @js.native
  sealed trait text extends StObject
  inline def text: text = "text".asInstanceOf[text]
}
