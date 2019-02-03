package typings
package couchbaseLib.couchbaseMod

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
  def bbox(bbox: js.Array[scala.Double]): SpatialQuery = js.native
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
  def from(ddoc: java.lang.String, name: java.lang.String): SpatialQuery = js.native
  /**
    * Specifies the maximum number of results to return.
    * @param limit
    */
  def limit(limit: scala.Double): SpatialQuery = js.native
  /**
    * Specifies how many results to skip from the beginning of the result set.
    * @param skip
    */
  def skip(skip: scala.Double): SpatialQuery = js.native
  /**
    * Specifies how this query will affect view indexing, both before and after the query is executed.
    * @param stale
    */
  def stale(stale: couchbaseLib.couchbaseMod.SpatialQueryNs.Update): SpatialQuery = js.native
}

/* static members */
@JSImport("couchbase", "SpatialQuery")
@js.native
object SpatialQuery extends js.Object {
  /**
    * Instantiates a SpatialQuery object for the specified design document and view name.
    * @param ddoc The design document to use.
    * @param name 	The view to use.
    */
  def from(ddoc: java.lang.String, name: java.lang.String): couchbaseLib.couchbaseMod.SpatialQuery = js.native
}

