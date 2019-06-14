package typings
package couchbaseLib.couchbaseMod

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
    sealed trait CONTINUE
      extends couchbaseLib.couchbaseMod.ViewQueryNs.ErrorMode
    
    /**
      * Stops and errors query when an error occurs.
      */
    @js.native
    sealed trait STOP
      extends couchbaseLib.couchbaseMod.ViewQueryNs.ErrorMode
    
    /* 0 */ val CONTINUE: CONTINUE with scala.Double = js.native
    /* 1 */ val STOP: STOP with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[couchbaseLib.couchbaseMod.ViewQueryNs.ErrorMode with scala.Double] = js.native
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
    sealed trait ASCENDING
      extends couchbaseLib.couchbaseMod.ViewQueryNs.Order
    
    /**
      * Orders with higher values first and lower values last.
      */
    @js.native
    sealed trait DESCENDING
      extends couchbaseLib.couchbaseMod.ViewQueryNs.Order
    
    /* 0 */ val ASCENDING: ASCENDING with scala.Double = js.native
    /* 1 */ val DESCENDING: DESCENDING with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[couchbaseLib.couchbaseMod.ViewQueryNs.Order with scala.Double] = js.native
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
    sealed trait AFTER
      extends couchbaseLib.couchbaseMod.ViewQueryNs.Update
    
    /**
      * Causes the view to be fully indexed before results are retrieved.
      */
    @js.native
    sealed trait BEFORE
      extends couchbaseLib.couchbaseMod.ViewQueryNs.Update
    
    /**
      * Allows the index to stay in whatever state it is already in prior retrieval of the query results.
      */
    @js.native
    sealed trait NONE
      extends couchbaseLib.couchbaseMod.ViewQueryNs.Update
    
    /* 2 */ val AFTER: AFTER with scala.Double = js.native
    /* 0 */ val BEFORE: BEFORE with scala.Double = js.native
    /* 1 */ val NONE: NONE with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[couchbaseLib.couchbaseMod.ViewQueryNs.Update with scala.Double] = js.native
  }
  
}

