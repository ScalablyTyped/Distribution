package typings.coinbaseCommerceNode.mod

import typings.coinbaseCommerceNode.anon.Block
import typings.coinbaseCommerceNode.anon.Context
import typings.coinbaseCommerceNode.anon.PartialRecordCryptoNamest
import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.charge
import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.chargeColonconfirmed
import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.chargeColoncreated
import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.chargeColondelayed
import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.chargeColonfailed
import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.chargeColonpending
import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.chargeColonresolved
import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.checkout
import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resources {
  
  /**
    * Merge CreateACharge with Charge class.
    */
  /**
    * Charge Class
    *
    * @link https://github.com/coinbase/coinbase-commerce-node#charges
    */
  @JSImport("coinbase-commerce-node", "resources.Charge")
  @js.native
  open class Charge protected ()
    extends Resource[CreateCharge]
       with ChargeResource {
    /**
      * Charge constructor.
      */
    def this(data: CreateCharge) = this()
    
    /**
      * Set of addresses associated with the charge.
      */
    /* CompleteClass */
    var addresses: PartialRecordCryptoNamest = js.native
    
    /**
      * User fiendly primary key.
      */
    /* CompleteClass */
    var code: String = js.native
    
    /**
      * Charge creation time.
      */
    /* CompleteClass */
    var created_at: Timestamp = js.native
    
    /**
      * More detailed description of the charge.
      * 200 characters or less.
      */
    /* CompleteClass */
    var description: String = js.native
    
    /**
      * Charge expiration time.
      */
    /* CompleteClass */
    var expires_at: Timestamp = js.native
    
    /**
      * Hosted charge URL.
      */
    /* CompleteClass */
    var hosted_url: String = js.native
    
    /**
      * Charge UUID
      */
    /* CompleteClass */
    var id: String = js.native
    
    /**
      * Charge metadata provided by you, the developer.
      */
    /* CompleteClass */
    @JSName("metadata")
    var metadata_ChargeResource: KeyVal = js.native
    
    /**
      * Charge name.
      * 100 characters or less.
      */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * Array of charge payment objects.
      */
    /* CompleteClass */
    var payments: js.Array[Block] = js.native
    
    /**
      * Charge price information object.
      */
    /* CompleteClass */
    var pricing: Pricing = js.native
    
    /**
      * Charge pricing type.
      */
    /* CompleteClass */
    var pricing_type: PricingType = js.native
    
    /**
      * Resource name.
      */
    /* CompleteClass */
    var resource: charge = js.native
    
    /**
      * Array of status update objects.
      */
    /* CompleteClass */
    var timeline: js.Array[Context] = js.native
  }
  object Charge {
    
    @JSImport("coinbase-commerce-node", "resources.Charge")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Fetch all charges.
      */
    /* static member */
    inline def all(paginationOptions: PaginationRequest): js.Promise[js.Array[Charge]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(paginationOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Charge]]]
    inline def all(paginationOptions: PaginationRequest, callback: Callback[js.Array[Charge]]): js.Promise[js.Array[Charge]] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(paginationOptions.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Charge]]]
    
    /**
      * Create a charge.
      */
    /* static member */
    inline def create(chargeData: CreateCharge): js.Promise[Charge] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(chargeData.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Charge]]
    inline def create(chargeData: CreateCharge, callback: Callback[Charge]): js.Promise[Charge] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(chargeData.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Charge]]
    
    /**
      * List charges.
      */
    /* static member */
    inline def list(paginationOptions: PaginationRequest): js.Promise[js.Tuple2[js.Array[Charge], Pagination]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(paginationOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Tuple2[js.Array[Charge], Pagination]]]
    inline def list(paginationOptions: PaginationRequest, callback: PaginationCallback[Charge]): js.Promise[js.Tuple2[js.Array[Charge], Pagination]] = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(paginationOptions.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[js.Array[Charge], Pagination]]]
    
    /**
      * Retrieve a charge by ID.
      */
    /* static member */
    inline def retrieve(chargeId: String): js.Promise[Charge] = ^.asInstanceOf[js.Dynamic].applyDynamic("retrieve")(chargeId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Charge]]
    inline def retrieve(chargeId: String, callback: Callback[Charge]): js.Promise[Charge] = (^.asInstanceOf[js.Dynamic].applyDynamic("retrieve")(chargeId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Charge]]
  }
  
  /**
    * Merge CheckoutResource with Checkout class.
    */
  /**
    * Checkout class.
    *
    * @link https://github.com/coinbase/coinbase-commerce-node#checkouts
    */
  @JSImport("coinbase-commerce-node", "resources.Checkout")
  @js.native
  open class Checkout protected ()
    extends Resource[CreateCheckout]
       with CheckoutResource {
    /**
      * Charge constructor.
      */
    def this(data: CreateCheckout) = this()
    
    /**
      * More detailed description.
      * 200 characters or less.
      */
    /* CompleteClass */
    var description: String = js.native
    
    /**
      * Checkout UUID.
      */
    /* CompleteClass */
    var id: String = js.native
    
    /**
      * Checkout name.
      * 100 characters or less.
      */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * Checkout pricing type.
      */
    /* CompleteClass */
    var pricing_type: PricingType = js.native
    
    /**
      * Resource name.
      */
    /* CompleteClass */
    var resource: checkout = js.native
  }
  object Checkout {
    
    @JSImport("coinbase-commerce-node", "resources.Checkout")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Fetch all checkouts.
      */
    /* static member */
    inline def all(paginationOptions: PaginationRequest): js.Promise[js.Array[Checkout]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(paginationOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Checkout]]]
    inline def all(paginationOptions: PaginationRequest, callback: Callback[js.Array[Checkout]]): js.Promise[js.Array[Checkout]] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(paginationOptions.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Checkout]]]
    
    /**
      * Create a checkout.
      */
    /* static member */
    inline def create(checkoutData: CreateCheckout): js.Promise[Checkout] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(checkoutData.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Checkout]]
    inline def create(checkoutData: CreateCheckout, callback: Callback[Checkout]): js.Promise[Checkout] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(checkoutData.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Checkout]]
    
    /**
      * Delete a checkout by ID.
      */
    /* static member */
    inline def deleteById(checkoutId: String): js.Promise[Checkout] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteById")(checkoutId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Checkout]]
    inline def deleteById(checkoutId: String, callback: Callback[Checkout]): js.Promise[Checkout] = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteById")(checkoutId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Checkout]]
    
    /**
      * List checkouts.
      */
    /* static member */
    inline def list(paginationOptions: PaginationRequest): js.Promise[js.Tuple2[js.Array[Checkout], Pagination]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(paginationOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Tuple2[js.Array[Checkout], Pagination]]]
    inline def list(paginationOptions: PaginationRequest, callback: PaginationCallback[Checkout]): js.Promise[js.Tuple2[js.Array[Checkout], Pagination]] = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(paginationOptions.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[js.Array[Checkout], Pagination]]]
    
    /**
      * Retrieve a checkout by ID.
      */
    /* static member */
    inline def retrieve(checkoutId: String): js.Promise[Checkout] = ^.asInstanceOf[js.Dynamic].applyDynamic("retrieve")(checkoutId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Checkout]]
    inline def retrieve(checkoutId: String, callback: Callback[Checkout]): js.Promise[Checkout] = (^.asInstanceOf[js.Dynamic].applyDynamic("retrieve")(checkoutId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Checkout]]
    
    /**
      * Update a checkout by ID.
      */
    /* static member */
    inline def updateById(checkoutId: String, update: UpdateCheckout): js.Promise[Checkout] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateById")(checkoutId.asInstanceOf[js.Any], update.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Checkout]]
    inline def updateById(checkoutId: String, update: UpdateCheckout, callback: Callback[Checkout]): js.Promise[Checkout] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateById")(checkoutId.asInstanceOf[js.Any], update.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Checkout]]
  }
  
  /**
    * Merge EventResource with Event class.
    */
  /**
    * Event class.
    *
    * @link https://github.com/coinbase/coinbase-commerce-node#events
    */
  @JSImport("coinbase-commerce-node", "resources.Event")
  @js.native
  open class Event protected ()
    extends Resource[EventResource[ChargeResource | CheckoutResource]]
       with EventResource[ChargeResource | CheckoutResource] {
    /**
      * Charge constructor.
      */
    def this(data: EventResource[ChargeResource | CheckoutResource]) = this()
    
    /**
      * API version of the `data` payload.
      */
    /* CompleteClass */
    var api_version: String = js.native
    
    /**
      * Event creation time.
      */
    /* CompleteClass */
    var created_at: Timestamp = js.native
    
    /**
      * Event Payload.
      * Resource of the associated object at the time of the event.
      */
    /* CompleteClass */
    var data: ChargeResource | CheckoutResource = js.native
    
    /**
      * Event UUID.
      */
    /* CompleteClass */
    var id: String = js.native
    
    /**
      * Resource name.
      */
    /* CompleteClass */
    var resource: event = js.native
    
    /**
      * Event type.
      */
    /* CompleteClass */
    var `type`: chargeColoncreated | chargeColonconfirmed | chargeColonfailed | chargeColondelayed | chargeColonpending | chargeColonresolved = js.native
  }
  object Event {
    
    @JSImport("coinbase-commerce-node", "resources.Event")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Fetch all events.
      */
    /* static member */
    inline def all(paginationOptions: PaginationRequest): js.Promise[js.Array[Event]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(paginationOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Event]]]
    inline def all(paginationOptions: PaginationRequest, callback: Callback[js.Array[Event]]): js.Promise[js.Array[Event]] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(paginationOptions.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Event]]]
    
    /**
      * List events.
      */
    /* static member */
    inline def list(paginationOptions: PaginationRequest): js.Promise[js.Tuple2[js.Array[Event], Pagination]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(paginationOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Tuple2[js.Array[Event], Pagination]]]
    inline def list(paginationOptions: PaginationRequest, callback: PaginationCallback[Event]): js.Promise[js.Tuple2[js.Array[Event], Pagination]] = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(paginationOptions.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[js.Array[Event], Pagination]]]
    
    /**
      * Retrieve a event by ID.
      */
    /* static member */
    inline def retrieve(eventId: String): js.Promise[Event] = ^.asInstanceOf[js.Dynamic].applyDynamic("retrieve")(eventId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Event]]
    inline def retrieve(eventId: String, callback: Callback[Event]): js.Promise[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("retrieve")(eventId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Event]]
  }
  
  /**
    * Resource object
    * All coinbase-commerce-node resources implement the following static methods.
    *
    * @link https://github.com/coinbase/coinbase-commerce-node#documentation
    */
  @JSImport("coinbase-commerce-node", "resources.Resource")
  @js.native
  abstract class Resource[Request] protected () extends StObject {
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
}
