package typings.couchbase.couchbaseMod

import typings.couchbase.couchbaseMod.SpatialQueryNs.Update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("couchbase", "SpatialQuery")
@js.native
object SpatialQueryNs extends js.Object {
  @js.native
  sealed trait Update extends js.Object
  
  /**
    * Enumeration for specifying view update semantics.
    */
  @js.native
  object Update extends js.Object {
    /**
      * 	Forces the view to be indexed after the results of this query has been fetched.
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
    
    /* 2 */ val AFTER: typings.couchbase.couchbaseMod.SpatialQueryNs.Update.AFTER with Double = js.native
    /* 0 */ val BEFORE: typings.couchbase.couchbaseMod.SpatialQueryNs.Update.BEFORE with Double = js.native
    /* 1 */ val NONE: typings.couchbase.couchbaseMod.SpatialQueryNs.Update.NONE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Update with Double] = js.native
  }
  
}

