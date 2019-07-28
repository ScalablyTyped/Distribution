package typings.couchbase.couchbaseMod

import typings.couchbase.couchbaseMod.ViewQueryNs.ErrorMode
import typings.couchbase.couchbaseMod.ViewQueryNs.Order
import typings.couchbase.couchbaseMod.ViewQueryNs.Update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("couchbase", "ViewQuery")
@js.native
object ViewQueryNs extends js.Object {
  @js.native
  sealed trait ErrorMode extends js.Object
  
  @js.native
  sealed trait Order extends js.Object
  
  @js.native
  sealed trait Update extends js.Object
  
  /**
    * Enumeration for specifying on_error behaviour.
    */
  @js.native
  object ErrorMode extends js.Object {
    /**
      * Continues querying when an error occurs.
      */
    @js.native
    sealed trait CONTINUE extends ErrorMode
    
    /**
      * Stops and errors query when an error occurs.
      */
    @js.native
    sealed trait STOP extends ErrorMode
    
    /* 0 */ val CONTINUE: typings.couchbase.couchbaseMod.ViewQueryNs.ErrorMode.CONTINUE with Double = js.native
    /* 1 */ val STOP: typings.couchbase.couchbaseMod.ViewQueryNs.ErrorMode.STOP with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ErrorMode with Double] = js.native
  }
  
  /**
    * Enumeration for specifying view result ordering.
    */
  @js.native
  object Order extends js.Object {
    /**
      * Orders with lower values first and higher values last.
      */
    @js.native
    sealed trait ASCENDING extends Order
    
    /**
      * Orders with higher values first and lower values last.
      */
    @js.native
    sealed trait DESCENDING extends Order
    
    /* 0 */ val ASCENDING: typings.couchbase.couchbaseMod.ViewQueryNs.Order.ASCENDING with Double = js.native
    /* 1 */ val DESCENDING: typings.couchbase.couchbaseMod.ViewQueryNs.Order.DESCENDING with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Order with Double] = js.native
  }
  
  /**
    * Enumeration for specifying view update semantics.
    */
  @js.native
  object Update extends js.Object {
    /**
      * Forces the view to be indexed after the results of this query has been fetched.
      */
    @js.native
    sealed trait AFTER extends Update
    
    /**
      * Causes the view to be fully indexed before results are retrieved.
      */
    @js.native
    sealed trait BEFORE extends Update
    
    /**
      * Allows the index to stay in whatever state it is already in prior retrieval of the query results.
      */
    @js.native
    sealed trait NONE extends Update
    
    /* 2 */ val AFTER: typings.couchbase.couchbaseMod.ViewQueryNs.Update.AFTER with Double = js.native
    /* 0 */ val BEFORE: typings.couchbase.couchbaseMod.ViewQueryNs.Update.BEFORE with Double = js.native
    /* 1 */ val NONE: typings.couchbase.couchbaseMod.ViewQueryNs.Update.NONE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Update with Double] = js.native
  }
  
}

