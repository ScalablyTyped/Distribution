package typings.babylonjs.legacyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "DataStorage")
@js.native
class DataStorage ()
  extends typings.babylonjs.indexMod.DataStorage
/* static members */
@JSImport("babylonjs/Legacy/legacy", "DataStorage")
@js.native
object DataStorage extends js.Object {
  
  /**
    * Reads a boolean from the data storage
    * @param key The key to read
    * @param defaultValue The value if the key doesn't exist
    * @returns The boolean value
    */
  def ReadBoolean(key: String, defaultValue: Boolean): Boolean = js.native
  
  /**
    * Reads a number from the data storage
    * @param key The key to read
    * @param defaultValue The value if the key doesn't exist
    * @returns The number value
    */
  def ReadNumber(key: String, defaultValue: Double): Double = js.native
  
  /**
    * Reads a string from the data storage
    * @param key The key to read
    * @param defaultValue The value if the key doesn't exist
    * @returns The string value
    */
  def ReadString(key: String, defaultValue: String): String = js.native
  
  /**
    * Writes a boolean to the data storage
    * @param key The key to write
    * @param value The value to write
    */
  def WriteBoolean(key: String, value: Boolean): Unit = js.native
  
  /**
    * Writes a number to the data storage
    * @param key The key to write
    * @param value The value to write
    */
  def WriteNumber(key: String, value: Double): Unit = js.native
  
  /**
    * Writes a string to the data storage
    * @param key The key to write
    * @param value The value to write
    */
  def WriteString(key: String, value: String): Unit = js.native
  
  var _GetStorage: js.Any = js.native
  
  var _Storage: js.Any = js.native
}
