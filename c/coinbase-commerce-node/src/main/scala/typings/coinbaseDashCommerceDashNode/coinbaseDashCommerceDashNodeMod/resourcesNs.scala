package typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeMod

import typings.coinbaseDashCommerceDashNode.Anon_Block
import typings.coinbaseDashCommerceDashNode.Anon_Context
import typings.coinbaseDashCommerceDashNode.Timestamp
import typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeMod.resourcesNs.Charge
import typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeMod.resourcesNs.Checkout
import typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeMod.resourcesNs.Event
import typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeMod.resourcesNs.Resource
import typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.`charge:confirmed`
import typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.`charge:created`
import typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.`charge:delayed`
import typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.`charge:failed`
import typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.`charge:pending`
import typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.`charge:resolved`
import typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.charge
import typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.checkout
import typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.event
import typings.std.Partial
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("coinbase-commerce-node", "resources")
@js.native
object resourcesNs extends js.Object {
  /**
    * Merge CreateACharge with Charge class.
    */
  /**
    * Charge Class
    *
    * @link https://github.com/coinbase/coinbase-commerce-node#charges
    */
  @js.native
  class Charge ()
    extends Resource[CreateCharge]
       with ChargeResource {
    /**
      * Set of addresses associated with the charge.
      */
    /* CompleteClass */
    override var addresses: Partial[Record[CryptoName, String]] = js.native
    /**
      * User fiendly primary key.
      */
    /* CompleteClass */
    override var code: String = js.native
    /**
      * Charge creation time.
      */
    /* CompleteClass */
    override var created_at: Timestamp = js.native
    /**
      * More detailed description of the charge.
      * 200 characters or less.
      */
    /* CompleteClass */
    override var description: String = js.native
    /**
      * Charge expiration time.
      */
    /* CompleteClass */
    override var expires_at: Timestamp = js.native
    /**
      * Hosted charge URL.
      */
    /* CompleteClass */
    override var hosted_url: String = js.native
    /**
      * Charge UUID
      */
    /* CompleteClass */
    override var id: String = js.native
    /**
      * Charge metadata provided by you, the developer.
      */
    /* CompleteClass */
    @JSName("metadata")
    override var metadata_ChargeResource: KeyVal = js.native
    /**
      * Charge name.
      * 100 characters or less.
      */
    /* CompleteClass */
    override var name: String = js.native
    /**
      * Array of charge payment objects.
      */
    /* CompleteClass */
    override var payments: js.Array[Anon_Block] = js.native
    /**
      * Charge price information object.
      */
    /* CompleteClass */
    override var pricing: Pricing = js.native
    /**
      * Charge pricing type.
      */
    /* CompleteClass */
    override var pricing_type: PricingType = js.native
    /**
      * Resource name.
      */
    /* CompleteClass */
    override var resource: charge = js.native
    /**
      * Array of status update objects.
      */
    /* CompleteClass */
    override var timeline: js.Array[Anon_Context] = js.native
  }
  
  /**
    * Merge CheckoutResource with Checkout class.
    */
  /**
    * Checkout class.
    *
    * @link https://github.com/coinbase/coinbase-commerce-node#checkouts
    */
  @js.native
  class Checkout ()
    extends Resource[CreateCheckout]
       with CheckoutResource {
    /**
      * More detailed description.
      * 200 characters or less.
      */
    /* CompleteClass */
    override var description: String = js.native
    /**
      * Checkout UUID.
      */
    /* CompleteClass */
    override var id: String = js.native
    /**
      * Checkout name.
      * 100 characters or less.
      */
    /* CompleteClass */
    override var name: String = js.native
    /**
      * Checkout pricing type.
      */
    /* CompleteClass */
    override var pricing_type: PricingType = js.native
    /**
      * Resource name.
      */
    /* CompleteClass */
    override var resource: checkout = js.native
  }
  
  /**
    * Merge EventResource with Event class.
    */
  /**
    * Event class.
    *
    * @link https://github.com/coinbase/coinbase-commerce-node#events
    */
  @js.native
  class Event ()
    extends Resource[EventResource[ChargeResource | CheckoutResource]]
       with EventResource[ChargeResource | CheckoutResource] {
    /**
      * API version of the `data` payload.
      */
    /* CompleteClass */
    override var api_version: String = js.native
    /**
      * Event creation time.
      */
    /* CompleteClass */
    override var created_at: Timestamp = js.native
    /**
      * Event Payload.
      * Resource of the associated object at the time of the event.
      */
    /* CompleteClass */
    override var data: ChargeResource | CheckoutResource = js.native
    /**
      * Event UUID.
      */
    /* CompleteClass */
    override var id: String = js.native
    /**
      * Resource name.
      */
    /* CompleteClass */
    override var resource: event = js.native
    /**
      * Event type.
      */
    /* CompleteClass */
    override var `type`: `charge:created` | `charge:confirmed` | `charge:failed` | `charge:delayed` | `charge:pending` | `charge:resolved` = js.native
  }
  
  /**
    * Resource object
    * All coinbase-commerce-node resources implement the following static methods.
    *
    * @link https://github.com/coinbase/coinbase-commerce-node#documentation
    */
  @js.native
  abstract class Resource[Request] protected () extends js.Object {
    /**
      * Charge constructor.
      */
    def this(data: Request) = this()
    /**
      * Delete the current resource.
      */
    def delete(): js.Promise[this.type] = js.native
    def delete(callback: Callback[this.type]): js.Promise[this.type] = js.native
    /**
      * Save new resource to Coinbase Commerce.
      */
    def insert(): js.Promise[this.type] = js.native
    def insert(callback: Callback[this.type]): js.Promise[this.type] = js.native
    /**
      * Save the current resource.
      * Creates a new resource if it doesn't already exist in Coinbase Commerce's systems.
      */
    def save(): js.Promise[this.type] = js.native
    def save(callback: Callback[this.type]): js.Promise[this.type] = js.native
    /**
      * Update the current resource.
      */
    def update(): js.Promise[this.type] = js.native
    def update(callback: Callback[this.type]): js.Promise[this.type] = js.native
  }
  
  /* static members */
  @js.native
  object Charge extends js.Object {
    /**
      * Fetch all charges.
      */
    def all(paginationOptions: PaginationRequest): js.Promise[js.Array[Charge]] = js.native
    def all(paginationOptions: PaginationRequest, callback: Callback[js.Array[Charge]]): js.Promise[js.Array[Charge]] = js.native
    /**
      * Create a charge.
      */
    def create(chargeData: CreateCharge): js.Promise[Charge] = js.native
    def create(chargeData: CreateCharge, callback: Callback[Charge]): js.Promise[Charge] = js.native
    /**
      * List charges.
      */
    def list(paginationOptions: PaginationRequest): js.Promise[js.Tuple2[js.Array[Charge], Pagination]] = js.native
    def list(paginationOptions: PaginationRequest, callback: PaginationCallback[Charge]): js.Promise[js.Tuple2[js.Array[Charge], Pagination]] = js.native
    /**
      * Retrieve a charge by ID.
      */
    def retrieve(chargeId: String): js.Promise[Charge] = js.native
    def retrieve(chargeId: String, callback: Callback[Charge]): js.Promise[Charge] = js.native
  }
  
  /* static members */
  @js.native
  object Checkout extends js.Object {
    /**
      * Fetch all checkouts.
      */
    def all(paginationOptions: PaginationRequest): js.Promise[js.Array[Checkout]] = js.native
    def all(paginationOptions: PaginationRequest, callback: Callback[js.Array[Checkout]]): js.Promise[js.Array[Checkout]] = js.native
    /**
      * Create a checkout.
      */
    def create(checkoutData: CreateCheckout): js.Promise[Checkout] = js.native
    def create(checkoutData: CreateCheckout, callback: Callback[Checkout]): js.Promise[Checkout] = js.native
    /**
      * Delete a checkout by ID.
      */
    def deleteById(checkoutId: String): js.Promise[Checkout] = js.native
    def deleteById(checkoutId: String, callback: Callback[Checkout]): js.Promise[Checkout] = js.native
    /**
      * List checkouts.
      */
    def list(paginationOptions: PaginationRequest): js.Promise[js.Tuple2[js.Array[Checkout], Pagination]] = js.native
    def list(paginationOptions: PaginationRequest, callback: PaginationCallback[Checkout]): js.Promise[js.Tuple2[js.Array[Checkout], Pagination]] = js.native
    /**
      * Retrieve a checkout by ID.
      */
    def retrieve(checkoutId: String): js.Promise[Checkout] = js.native
    def retrieve(checkoutId: String, callback: Callback[Checkout]): js.Promise[Checkout] = js.native
    /**
      * Update a checkout by ID.
      */
    def updateById(checkoutId: String, update: UpdateCheckout): js.Promise[Checkout] = js.native
    def updateById(checkoutId: String, update: UpdateCheckout, callback: Callback[Checkout]): js.Promise[Checkout] = js.native
  }
  
  /* static members */
  @js.native
  object Event extends js.Object {
    /**
      * Fetch all events.
      */
    def all(paginationOptions: PaginationRequest): js.Promise[js.Array[Event]] = js.native
    def all(paginationOptions: PaginationRequest, callback: Callback[js.Array[Event]]): js.Promise[js.Array[Event]] = js.native
    /**
      * List events.
      */
    def list(paginationOptions: PaginationRequest): js.Promise[js.Tuple2[js.Array[Event], Pagination]] = js.native
    def list(paginationOptions: PaginationRequest, callback: PaginationCallback[Event]): js.Promise[js.Tuple2[js.Array[Event], Pagination]] = js.native
    /**
      * Retrieve a event by ID.
      */
    def retrieve(eventId: String): js.Promise[Event] = js.native
    def retrieve(eventId: String, callback: Callback[Event]): js.Promise[Event] = js.native
  }
  
}

