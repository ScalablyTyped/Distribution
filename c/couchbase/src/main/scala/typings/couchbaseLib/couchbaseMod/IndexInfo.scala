package typings
package couchbaseLib.couchbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexInfo extends js.Object {
  /**
    * ID for the index.
    */
  var id: java.lang.String
  /**
    * List of index keys.
    */
  var index_key: js.Array[java.lang.String]
  /**
    * True if this is a primary index.
    */
  var is_primary: scala.Boolean
  /**
    * ID for the keyspace to which the index belongs.
    */
  var keyspace_id: java.lang.String
  /**
    * Name for the index.
    */
  var name: java.lang.String
  /**
    * ID for the namespace to which the index belongs.
    */
  var namespace_id: java.lang.String
  /**
    * The current state of the index.
    *
    * Values include `online` and `pending`.
    */
  var state: java.lang.String
  /**
    * ID for the datastore to which the index belongs.
    */
  var store_id: java.lang.String
  /**
    * The type of view, which will always be `gsi`.
    */
  var using: couchbaseLib.couchbaseLibStrings.gsi
}

object IndexInfo {
  @scala.inline
  def apply(
    id: java.lang.String,
    index_key: js.Array[java.lang.String],
    is_primary: scala.Boolean,
    keyspace_id: java.lang.String,
    name: java.lang.String,
    namespace_id: java.lang.String,
    state: java.lang.String,
    store_id: java.lang.String,
    using: couchbaseLib.couchbaseLibStrings.gsi
  ): IndexInfo = {
    val __obj = js.Dynamic.literal(id = id, index_key = index_key, is_primary = is_primary, keyspace_id = keyspace_id, name = name, namespace_id = namespace_id, state = state, store_id = store_id, using = using)
  
    __obj.asInstanceOf[IndexInfo]
  }
}

