package typings
package couchbaseLib.couchbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Class for dynamically construction of view queries. This class should never be constructed directly, instead you should use ViewQuery.from to construct this object.
 */
@JSImport("couchbase", "ViewQuery")
@js.native
class ViewQuery () extends js.Object {
  /**
       * Allows you to specify custom view options that may not be available though the fluent interface defined by this class.
       * @param opts
       */
  def custom(opts: js.Any): ViewQuery = js.native
  /**
       * Specifies the design document and view name to use for this query.
       * @param ddoc The design document to use.
       * @param name The view to use.
       */
  def from(ddoc: java.lang.String, name: java.lang.String): ViewQuery = js.native
  /**
       * Flag to request a view request accross all nodes in the case of a development view.
       * @param full_set
       */
  def full_set(full_set: scala.Boolean): ViewQuery = js.native
  /**
       * Specifies whether to preform grouping during view execution.
       * @param group
       */
  def group(group: scala.Boolean): ViewQuery = js.native
  /**
       * Specifies the level at which to perform view grouping.
       * @param group_level
       */
  def group_level(group_level: scala.Double): ViewQuery = js.native
  /**
       * Specifies a range of document id's to retrieve from the index.
       * @param start
       * @param end
       */
  def id_range(start: js.Any, end: js.Any): ViewQuery = js.native
  /**
       * Flag to request a view request include the full document value.
       * @param include_docs
       */
  def include_docs(include_docs: scala.Boolean): ViewQuery = js.native
  /**
       * Specifies a specified key to retrieve from the index.
       * @param key
       */
  def key(key: js.Any): ViewQuery = js.native
  /**
       * Specifies a list of keys you wish to retrieve from the index.
       * @param keys
       */
  def keys(key: js.Array[_]): ViewQuery = js.native
  /**
       * Specifies the maximum number of results to return.
       * @param limit
       */
  def limit(limit: scala.Double): ViewQuery = js.native
  /**
       * Sets the error handling mode for this query.
       * @param mode
       */
  def on_error(mode: couchbaseLib.couchbaseMod.ViewQueryNs.ErrorMode): ViewQuery = js.native
  /**
       * Specifies the desired ordering for the results.
       * @param order
       */
  def order(order: couchbaseLib.couchbaseMod.ViewQueryNs.Order): ViewQuery = js.native
  /**
       * Specifies a range of keys to retrieve from the index. You may specify both a start and an end point and additionally specify whether or not the end value is inclusive or exclusive.
       * @param start
       * @param end
       * @param inclusive_end
       */
  def range(start: js.Any, end: js.Any): ViewQuery = js.native
  /**
       * Specifies a range of keys to retrieve from the index. You may specify both a start and an end point and additionally specify whether or not the end value is inclusive or exclusive.
       * @param start
       * @param end
       * @param inclusive_end
       */
  def range(start: js.Any, end: js.Any, inclusive_end: scala.Boolean): ViewQuery = js.native
  /**
       * Specifies a range of keys to retrieve from the index. You may specify both a start and an end point and additionally specify whether or not the end value is inclusive or exclusive.
       * @param start
       * @param end
       * @param inclusive_end
       */
  def range(start: js.Any, end: js.Array[_]): ViewQuery = js.native
  /**
       * Specifies a range of keys to retrieve from the index. You may specify both a start and an end point and additionally specify whether or not the end value is inclusive or exclusive.
       * @param start
       * @param end
       * @param inclusive_end
       */
  def range(start: js.Any, end: js.Array[_], inclusive_end: scala.Boolean): ViewQuery = js.native
  /**
       * Specifies a range of keys to retrieve from the index. You may specify both a start and an end point and additionally specify whether or not the end value is inclusive or exclusive.
       * @param start
       * @param end
       * @param inclusive_end
       */
  def range(start: js.Array[_], end: js.Any): ViewQuery = js.native
  /**
       * Specifies a range of keys to retrieve from the index. You may specify both a start and an end point and additionally specify whether or not the end value is inclusive or exclusive.
       * @param start
       * @param end
       * @param inclusive_end
       */
  def range(start: js.Array[_], end: js.Any, inclusive_end: scala.Boolean): ViewQuery = js.native
  /**
       * Specifies a range of keys to retrieve from the index. You may specify both a start and an end point and additionally specify whether or not the end value is inclusive or exclusive.
       * @param start
       * @param end
       * @param inclusive_end
       */
  def range(start: js.Array[_], end: js.Array[_]): ViewQuery = js.native
  /**
       * Specifies a range of keys to retrieve from the index. You may specify both a start and an end point and additionally specify whether or not the end value is inclusive or exclusive.
       * @param start
       * @param end
       * @param inclusive_end
       */
  def range(start: js.Array[_], end: js.Array[_], inclusive_end: scala.Boolean): ViewQuery = js.native
  /**
       * Specifies whether to execute the map-reduce reduce step.
       * @param reduce
       */
  def reduce(reduce: scala.Boolean): ViewQuery = js.native
  /**
       * Specifies how many results to skip from the beginning of the result set.
       * @param skip
       */
  def skip(skip: scala.Double): ViewQuery = js.native
  /**
       * Specifies how this query will affect view indexing, both before and after the query is executed.
       * @param stale
       */
  def stale(stale: couchbaseLib.couchbaseMod.ViewQueryNs.Update): ViewQuery = js.native
}

/**
 * Class for dynamically construction of view queries. This class should never be constructed directly, instead you should use ViewQuery.from to construct this object.
 */
@JSImport("couchbase", "ViewQuery")
@js.native
object ViewQuery extends js.Object {
  /**
       * Instantiates a ViewQuery object for the specified design document and view name.
       * @param ddoc The design document to use.
       * @param name The view to use.
       */
  def from(ddoc: java.lang.String, name: java.lang.String): couchbaseLib.couchbaseMod.ViewQuery = js.native
}

