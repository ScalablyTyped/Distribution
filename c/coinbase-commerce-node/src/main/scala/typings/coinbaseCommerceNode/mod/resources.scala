package typings.coinbaseCommerceNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("coinbase-commerce-node", "resources")
@js.native
object resources extends js.Object {
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
       with ChargeResource
  
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
       with CheckoutResource
  
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
       with EventResource[ChargeResource | CheckoutResource]
  
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

