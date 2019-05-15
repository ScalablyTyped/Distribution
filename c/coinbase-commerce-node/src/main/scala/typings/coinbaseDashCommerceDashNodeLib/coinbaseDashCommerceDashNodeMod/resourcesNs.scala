package typings
package coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod

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
    extends Resource[coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.CreateCharge]
       with coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.ChargeResource {
    /**
      * Set of addresses associated with the charge.
      */
    /* CompleteClass */
    override var addresses: stdLib.Partial[
        stdLib.Record[
          coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.CryptoName, 
          java.lang.String
        ]
      ] = js.native
    /**
      * User fiendly primary key.
      */
    /* CompleteClass */
    override var code: java.lang.String = js.native
    /**
      * Charge creation time.
      */
    /* CompleteClass */
    override var created_at: coinbaseDashCommerceDashNodeLib.Timestamp = js.native
    /**
      * More detailed description of the charge.
      * 200 characters or less.
      */
    /* CompleteClass */
    override var description: java.lang.String = js.native
    /**
      * Charge expiration time.
      */
    /* CompleteClass */
    override var expires_at: coinbaseDashCommerceDashNodeLib.Timestamp = js.native
    /**
      * Hosted charge URL.
      */
    /* CompleteClass */
    override var hosted_url: java.lang.String = js.native
    /**
      * Charge UUID
      */
    /* CompleteClass */
    override var id: java.lang.String = js.native
    /**
      * Charge metadata provided by you, the developer.
      */
    /* CompleteClass */
    @JSName("metadata")
    override var metadata_ChargeResource: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.KeyVal = js.native
    /**
      * Charge name.
      * 100 characters or less.
      */
    /* CompleteClass */
    override var name: java.lang.String = js.native
    /**
      * Array of charge payment objects.
      */
    /* CompleteClass */
    override var payments: js.Array[coinbaseDashCommerceDashNodeLib.Anon_Block] = js.native
    /**
      * Charge price information object.
      */
    /* CompleteClass */
    override var pricing: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.Pricing = js.native
    /**
      * Charge pricing type.
      */
    /* CompleteClass */
    override var pricing_type: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.PricingType = js.native
    /**
      * Resource name.
      */
    /* CompleteClass */
    override var resource: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.charge = js.native
    /**
      * Array of status update objects.
      */
    /* CompleteClass */
    override var timeline: js.Array[coinbaseDashCommerceDashNodeLib.Anon_Context] = js.native
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
    extends Resource[coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.CreateCheckout]
       with coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.CheckoutResource {
    /**
      * More detailed description.
      * 200 characters or less.
      */
    /* CompleteClass */
    override var description: java.lang.String = js.native
    /**
      * Checkout UUID.
      */
    /* CompleteClass */
    override var id: java.lang.String = js.native
    /**
      * Checkout name.
      * 100 characters or less.
      */
    /* CompleteClass */
    override var name: java.lang.String = js.native
    /**
      * Checkout pricing type.
      */
    /* CompleteClass */
    override var pricing_type: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.PricingType = js.native
    /**
      * Resource name.
      */
    /* CompleteClass */
    override var resource: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.checkout = js.native
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
    extends Resource[coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.EventResource]
       with coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.EventResource {
    /**
      * API version of the `data` payload.
      */
    /* CompleteClass */
    override var api_version: java.lang.String = js.native
    /**
      * Event creation time.
      */
    /* CompleteClass */
    override var created_at: coinbaseDashCommerceDashNodeLib.Timestamp = js.native
    /**
      * Event Payload.
      * Resource of the associated object at the time of the event.
      */
    /* CompleteClass */
    override var data: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.ChargeResource | coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.CheckoutResource = js.native
    /**
      * Event UUID.
      */
    /* CompleteClass */
    override var id: java.lang.String = js.native
    /**
      * Resource name.
      */
    /* CompleteClass */
    override var resource: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.event = js.native
    /**
      * Event type.
      */
    /* CompleteClass */
    override var `type`: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.`charge:created` | coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.`charge:confirmed` | coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.`charge:failed` | coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.`charge:delayed` | coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.`charge:pending` = js.native
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
    def delete(callback: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.Callback[this.type]): js.Promise[this.type] = js.native
    /**
      * Save new resource to Coinbase Commerce.
      */
    def insert(): js.Promise[this.type] = js.native
    def insert(callback: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.Callback[this.type]): js.Promise[this.type] = js.native
    /**
      * Save the current resource.
      * Creates a new resource if it doesn't already exist in Coinbase Commerce's systems.
      */
    def save(): js.Promise[this.type] = js.native
    def save(callback: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.Callback[this.type]): js.Promise[this.type] = js.native
    /**
      * Update the current resource.
      */
    def update(): js.Promise[this.type] = js.native
    def update(callback: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.Callback[this.type]): js.Promise[this.type] = js.native
  }
  
  /* static members */
  @js.native
  object Charge extends js.Object {
    /**
      * Fetch all charges.
      */
    def all(
      paginationOptions: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.PaginationRequest
    ): js.Promise[
        js.Array[
          coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.resourcesNs.Charge
        ]
      ] = js.native
    def all(
      paginationOptions: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.PaginationRequest,
      callback: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.Callback[
          js.Array[
            coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.resourcesNs.Charge
          ]
        ]
    ): js.Promise[
        js.Array[
          coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.resourcesNs.Charge
        ]
      ] = js.native
    /**
      * Create a charge.
      */
    def create(chargeData: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.CreateCharge): js.Promise[
        coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.resourcesNs.Charge
      ] = js.native
    def create(
      chargeData: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.CreateCharge,
      callback: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.Callback[
          coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.resourcesNs.Charge
        ]
    ): js.Promise[
        coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.resourcesNs.Charge
      ] = js.native
    /**
      * List charges.
      */
    def list(
      paginationOptions: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.PaginationRequest
    ): js.Promise[
        js.Tuple2[
          js.Array[
            coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.resourcesNs.Charge
          ], 
          coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.Pagination
        ]
      ] = js.native
    def list(
      paginationOptions: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.PaginationRequest,
      callback: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.PaginationCallback[
          coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.resourcesNs.Charge
        ]
    ): js.Promise[
        js.Tuple2[
          js.Array[
            coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.resourcesNs.Charge
          ], 
          coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.Pagination
        ]
      ] = js.native
    /**
      * Retrieve a charge by ID.
      */
    def retrieve(chargeId: java.lang.String): js.Promise[
        coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.resourcesNs.Charge
      ] = js.native
    def retrieve(
      chargeId: java.lang.String,
      callback: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.Callback[
          coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.resourcesNs.Charge
        ]
    ): js.Promise[
        coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.resourcesNs.Charge
      ] = js.native
  }
  
  /* static members */
  @js.native
  object Checkout extends js.Object {
    /**
      * Fetch all checkouts.
      */
    def all(
      paginationOptions: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.PaginationRequest
    ): js.Promise[
        js.Array[
          coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.resourcesNs.Checkout
        ]
      ] = js.native
    def all(
      paginationOptions: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.PaginationRequest,
      callback: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.Callback[
          js.Array[
            coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.resourcesNs.Checkout
          ]
        ]
    ): js.Promise[
        js.Array[
          coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.resourcesNs.Checkout
        ]
      ] = js.native
    /**
      * Create a checkout.
      */
    def create(checkoutData: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.CreateCheckout): js.Promise[
        coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.resourcesNs.Checkout
      ] = js.native
    def create(
      checkoutData: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.CreateCheckout,
      callback: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.Callback[
          coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.resourcesNs.Checkout
        ]
    ): js.Promise[
        coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.resourcesNs.Checkout
      ] = js.native
    /**
      * Delete a checkout by ID.
      */
    def deleteById(checkoutId: java.lang.String): js.Promise[
        coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.resourcesNs.Checkout
      ] = js.native
    def deleteById(
      checkoutId: java.lang.String,
      callback: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.Callback[
          coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.resourcesNs.Checkout
        ]
    ): js.Promise[
        coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.resourcesNs.Checkout
      ] = js.native
    /**
      * List checkouts.
      */
    def list(
      paginationOptions: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.PaginationRequest
    ): js.Promise[
        js.Tuple2[
          js.Array[
            coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.resourcesNs.Checkout
          ], 
          coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.Pagination
        ]
      ] = js.native
    def list(
      paginationOptions: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.PaginationRequest,
      callback: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.PaginationCallback[
          coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.resourcesNs.Checkout
        ]
    ): js.Promise[
        js.Tuple2[
          js.Array[
            coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.resourcesNs.Checkout
          ], 
          coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.Pagination
        ]
      ] = js.native
    /**
      * Retrieve a checkout by ID.
      */
    def retrieve(checkoutId: java.lang.String): js.Promise[
        coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.resourcesNs.Checkout
      ] = js.native
    def retrieve(
      checkoutId: java.lang.String,
      callback: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.Callback[
          coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.resourcesNs.Checkout
        ]
    ): js.Promise[
        coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.resourcesNs.Checkout
      ] = js.native
    /**
      * Update a checkout by ID.
      */
    def updateById(
      checkoutId: java.lang.String,
      update: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.UpdateCheckout
    ): js.Promise[
        coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.resourcesNs.Checkout
      ] = js.native
    def updateById(
      checkoutId: java.lang.String,
      update: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.UpdateCheckout,
      callback: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.Callback[
          coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.resourcesNs.Checkout
        ]
    ): js.Promise[
        coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.resourcesNs.Checkout
      ] = js.native
  }
  
  /* static members */
  @js.native
  object Event extends js.Object {
    /**
      * Fetch all events.
      */
    def all(
      paginationOptions: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.PaginationRequest
    ): js.Promise[
        js.Array[
          coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.resourcesNs.Event
        ]
      ] = js.native
    def all(
      paginationOptions: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.PaginationRequest,
      callback: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.Callback[
          js.Array[
            coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.resourcesNs.Event
          ]
        ]
    ): js.Promise[
        js.Array[
          coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.resourcesNs.Event
        ]
      ] = js.native
    /**
      * List events.
      */
    def list(
      paginationOptions: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.PaginationRequest
    ): js.Promise[
        js.Tuple2[
          js.Array[
            coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.resourcesNs.Event
          ], 
          coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.Pagination
        ]
      ] = js.native
    def list(
      paginationOptions: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.PaginationRequest,
      callback: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.PaginationCallback[
          coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.resourcesNs.Event
        ]
    ): js.Promise[
        js.Tuple2[
          js.Array[
            coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.resourcesNs.Event
          ], 
          coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.Pagination
        ]
      ] = js.native
    /**
      * Retrieve a event by ID.
      */
    def retrieve(eventId: java.lang.String): js.Promise[
        coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.resourcesNs.Event
      ] = js.native
    def retrieve(
      eventId: java.lang.String,
      callback: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.Callback[
          coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.resourcesNs.Event
        ]
    ): js.Promise[
        coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod.resourcesNs.Event
      ] = js.native
  }
  
  /**
    * Webhook class.
    *
    * @link https://github.com/coinbase/coinbase-commerce-node#webhooks
    */
  @JSName("Webhook")
  @js.native
  object WebhookNs extends js.Object {
    /**
      * Verify a signature header.
      *
      * @link https://github.com/coinbase/coinbase-commerce-node#verify-signature-header
      */
    def verifySigHeader(rawBody: java.lang.String, signature: java.lang.String, sharedSecret: java.lang.String): scala.Unit = js.native
  }
  
}

