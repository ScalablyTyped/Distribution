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

