package typings
package configstoreLib.configstoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configstore extends js.Object {
  /**
    * Get all items as an object or replace the current config with an object.
    */
  var all: js.Any = js.native
  /**
    * Get the path to the config file. Can be used to show the user
    * where it is, or better, open it for them.
    */
  var path: java.lang.String = js.native
  /**
    * Get the item count
    */
  var size: scala.Double = js.native
  /**
    * Clear the config.
    * Equivalent to <code>Configstore.all = {};</code>
    */
  def clear(): scala.Unit = js.native
  /**
    * Delete an item.
    * @param key The key to delete
    */
  def delete(key: java.lang.String): scala.Unit = js.native
  /**
    * Get an item
    * @param key The string key to get
    * @return The contents of the config from key $key
    */
  def get(key: java.lang.String): js.Any = js.native
  /**
    * Determines if a key is present in the config
    * @param key The string key to test for
    * @return True if the key is present
    */
  def has(key: java.lang.String): scala.Boolean = js.native
  /**
    * Set an item
    * @param key The string key
    * @param val The value to set
    */
  def set(key: java.lang.String, `val`: js.Any): scala.Unit = js.native
  /**
    * Set all key/value pairs declared in $values
    * @param values The values object.
    */
  def set(values: js.Any): scala.Unit = js.native
}

