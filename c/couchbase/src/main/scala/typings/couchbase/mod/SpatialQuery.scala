package typings.couchbase.mod

import org.scalablytyped.runtime.TopLevel
import typings.couchbase.mod.SpatialQuery.Update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class for dynamically construction of spatial queries. This class should never be constructed directly, instead you should use SpatialQuery.from to construct this object.
  */
@JSImport("couchbase", "SpatialQuery")
@js.native
class SpatialQuery () extends js.Object {
  /**
    * Specifies a bounding box to query the index for. This value must be an array of exactly 4 numbers which represents the left, top, right and bottom edges of the bounding box (in that order).
    * @param bbox
    */
  def bbox(bbox: js.Array[Double]): SpatialQuery = js.native
  /**
    * Allows you to specify custom view options that may not be available though the fluent interface defined by this class.
    * @param opts
    */
  def custom(opts: js.Any): SpatialQuery = js.native
  /**
    * Specifies the design document and view name to use for this query.
    * @param ddoc
    * @param name
    */
  def from(ddoc: String, name: String): SpatialQuery = js.native
  /**
    * Specifies the maximum number of results to return.
    * @param limit
    */
  def limit(limit: Double): SpatialQuery = js.native
  /**
    * Specifies how many results to skip from the beginning of the result set.
    * @param skip
    */
  def skip(skip: Double): SpatialQuery = js.native
  /**
    * Specifies how this query will affect view indexing, both before and after the query is executed.
    * @param stale
    */
  def stale(stale: Update): SpatialQuery = js.native
}

/* static members */
@JSImport("couchbase", "SpatialQuery")
@js.native
object SpatialQuery extends js.Object {
  @js.native
  sealed trait Update extends js.Object
  
  /**
    * Instantiates a SpatialQuery object for the specified design document and view name.
    * @param ddoc The design document to use.
    * @param name 	The view to use.
    */
  def from(ddoc: String, name: String): SpatialQuery = js.native
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
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Update with Double] = js.native
    /* 2 */ @js.native
    object AFTER extends TopLevel[AFTER with Double]
    
    /* 0 */ @js.native
    object BEFORE extends TopLevel[BEFORE with Double]
    
    /* 1 */ @js.native
    object NONE extends TopLevel[NONE with Double]
    
  }
  
}

