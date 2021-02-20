package typings.coinbaseCommerceNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  class Charge protected ()
    extends Resource[CreateCharge]
       with ChargeResource {
    /**
      * Charge constructor.
      */
    def this(data: CreateCharge) = this()
  }
  object Charge {
    
    /**
      * Fetch all charges.
      */
    /* static member */
    @JSImport("coinbase-commerce-node", "resources.Charge.all")
    @js.native
    def all(paginationOptions: PaginationRequest): js.Promise[js.Array[Charge]] = js.native
    @JSImport("coinbase-commerce-node", "resources.Charge.all")
    @js.native
    def all(paginationOptions: PaginationRequest, callback: Callback[js.Array[Charge]]): js.Promise[js.Array[Charge]] = js.native
    
    /**
      * Create a charge.
      */
    /* static member */
    @JSImport("coinbase-commerce-node", "resources.Charge.create")
    @js.native
    def create(chargeData: CreateCharge): js.Promise[Charge] = js.native
    @JSImport("coinbase-commerce-node", "resources.Charge.create")
    @js.native
    def create(chargeData: CreateCharge, callback: Callback[Charge]): js.Promise[Charge] = js.native
    
    /**
      * List charges.
      */
    /* static member */
    @JSImport("coinbase-commerce-node", "resources.Charge.list")
    @js.native
    def list(paginationOptions: PaginationRequest): js.Promise[js.Tuple2[js.Array[Charge], Pagination]] = js.native
    @JSImport("coinbase-commerce-node", "resources.Charge.list")
    @js.native
    def list(paginationOptions: PaginationRequest, callback: PaginationCallback[Charge]): js.Promise[js.Tuple2[js.Array[Charge], Pagination]] = js.native
    
    /**
      * Retrieve a charge by ID.
      */
    /* static member */
    @JSImport("coinbase-commerce-node", "resources.Charge.retrieve")
    @js.native
    def retrieve(chargeId: String): js.Promise[Charge] = js.native
    @JSImport("coinbase-commerce-node", "resources.Charge.retrieve")
    @js.native
    def retrieve(chargeId: String, callback: Callback[Charge]): js.Promise[Charge] = js.native
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
  class Checkout protected ()
    extends Resource[CreateCheckout]
       with CheckoutResource {
    /**
      * Charge constructor.
      */
    def this(data: CreateCheckout) = this()
  }
  object Checkout {
    
    /**
      * Fetch all checkouts.
      */
    /* static member */
    @JSImport("coinbase-commerce-node", "resources.Checkout.all")
    @js.native
    def all(paginationOptions: PaginationRequest): js.Promise[js.Array[Checkout]] = js.native
    @JSImport("coinbase-commerce-node", "resources.Checkout.all")
    @js.native
    def all(paginationOptions: PaginationRequest, callback: Callback[js.Array[Checkout]]): js.Promise[js.Array[Checkout]] = js.native
    
    /**
      * Create a checkout.
      */
    /* static member */
    @JSImport("coinbase-commerce-node", "resources.Checkout.create")
    @js.native
    def create(checkoutData: CreateCheckout): js.Promise[Checkout] = js.native
    @JSImport("coinbase-commerce-node", "resources.Checkout.create")
    @js.native
    def create(checkoutData: CreateCheckout, callback: Callback[Checkout]): js.Promise[Checkout] = js.native
    
    /**
      * Delete a checkout by ID.
      */
    /* static member */
    @JSImport("coinbase-commerce-node", "resources.Checkout.deleteById")
    @js.native
    def deleteById(checkoutId: String): js.Promise[Checkout] = js.native
    @JSImport("coinbase-commerce-node", "resources.Checkout.deleteById")
    @js.native
    def deleteById(checkoutId: String, callback: Callback[Checkout]): js.Promise[Checkout] = js.native
    
    /**
      * List checkouts.
      */
    /* static member */
    @JSImport("coinbase-commerce-node", "resources.Checkout.list")
    @js.native
    def list(paginationOptions: PaginationRequest): js.Promise[js.Tuple2[js.Array[Checkout], Pagination]] = js.native
    @JSImport("coinbase-commerce-node", "resources.Checkout.list")
    @js.native
    def list(paginationOptions: PaginationRequest, callback: PaginationCallback[Checkout]): js.Promise[js.Tuple2[js.Array[Checkout], Pagination]] = js.native
    
    /**
      * Retrieve a checkout by ID.
      */
    /* static member */
    @JSImport("coinbase-commerce-node", "resources.Checkout.retrieve")
    @js.native
    def retrieve(checkoutId: String): js.Promise[Checkout] = js.native
    @JSImport("coinbase-commerce-node", "resources.Checkout.retrieve")
    @js.native
    def retrieve(checkoutId: String, callback: Callback[Checkout]): js.Promise[Checkout] = js.native
    
    /**
      * Update a checkout by ID.
      */
    /* static member */
    @JSImport("coinbase-commerce-node", "resources.Checkout.updateById")
    @js.native
    def updateById(checkoutId: String, update: UpdateCheckout): js.Promise[Checkout] = js.native
    @JSImport("coinbase-commerce-node", "resources.Checkout.updateById")
    @js.native
    def updateById(checkoutId: String, update: UpdateCheckout, callback: Callback[Checkout]): js.Promise[Checkout] = js.native
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
  class Event protected ()
    extends Resource[EventResource[ChargeResource | CheckoutResource]]
       with EventResource[ChargeResource | CheckoutResource] {
    /**
      * Charge constructor.
      */
    def this(data: EventResource[ChargeResource | CheckoutResource]) = this()
  }
  object Event {
    
    /**
      * Fetch all events.
      */
    /* static member */
    @JSImport("coinbase-commerce-node", "resources.Event.all")
    @js.native
    def all(paginationOptions: PaginationRequest): js.Promise[js.Array[Event]] = js.native
    @JSImport("coinbase-commerce-node", "resources.Event.all")
    @js.native
    def all(paginationOptions: PaginationRequest, callback: Callback[js.Array[Event]]): js.Promise[js.Array[Event]] = js.native
    
    /**
      * List events.
      */
    /* static member */
    @JSImport("coinbase-commerce-node", "resources.Event.list")
    @js.native
    def list(paginationOptions: PaginationRequest): js.Promise[js.Tuple2[js.Array[Event], Pagination]] = js.native
    @JSImport("coinbase-commerce-node", "resources.Event.list")
    @js.native
    def list(paginationOptions: PaginationRequest, callback: PaginationCallback[Event]): js.Promise[js.Tuple2[js.Array[Event], Pagination]] = js.native
    
    /**
      * Retrieve a event by ID.
      */
    /* static member */
    @JSImport("coinbase-commerce-node", "resources.Event.retrieve")
    @js.native
    def retrieve(eventId: String): js.Promise[Event] = js.native
    @JSImport("coinbase-commerce-node", "resources.Event.retrieve")
    @js.native
    def retrieve(eventId: String, callback: Callback[Event]): js.Promise[Event] = js.native
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
