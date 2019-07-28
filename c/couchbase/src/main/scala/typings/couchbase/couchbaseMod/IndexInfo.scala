package typings.couchbase.couchbaseMod

import typings.couchbase.couchbaseStrings.gsi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexInfo extends js.Object {
  /**
    * ID for the index.
    */
  var id: String
  /**
    * List of index keys.
    */
  var index_key: js.Array[String]
  /**
    * True if this is a primary index.
    */
  var is_primary: Boolean
  /**
    * ID for the keyspace to which the index belongs.
    */
  var keyspace_id: String
  /**
    * Name for the index.
    */
  var name: String
  /**
    * ID for the namespace to which the index belongs.
    */
  var namespace_id: String
  /**
    * The current state of the index.
    *
    * Values include `online` and `pending`.
    */
  var state: String
  /**
    * ID for the datastore to which the index belongs.
    */
  var store_id: String
  /**
    * The type of view, which will always be `gsi`.
    */
  var using: gsi
}

object IndexInfo {
  @scala.inline
  def apply(
    id: String,
    index_key: js.Array[String],
    is_primary: Boolean,
    keyspace_id: String,
    name: String,
    namespace_id: String,
    state: String,
    store_id: String,
    using: gsi
  ): IndexInfo = {
    val __obj = js.Dynamic.literal(id = id, index_key = index_key, is_primary = is_primary, keyspace_id = keyspace_id, name = name, namespace_id = namespace_id, state = state, store_id = store_id, using = using)
  
    __obj.asInstanceOf[IndexInfo]
  }
}

