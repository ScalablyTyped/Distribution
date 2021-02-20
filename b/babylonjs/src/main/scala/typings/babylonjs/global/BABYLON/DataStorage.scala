package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.DataStorage")
@js.native
class DataStorage ()
  extends typings.babylonjs.BABYLON.DataStorage
/* static members */
object DataStorage {
  
  @JSGlobal("BABYLON.DataStorage")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Reads a boolean from the data storage
    * @param key The key to read
    * @param defaultValue The value if the key doesn't exist
    * @returns The boolean value
    */
  @JSGlobal("BABYLON.DataStorage.ReadBoolean")
  @js.native
  def ReadBoolean(key: String, defaultValue: Boolean): Boolean = js.native
  
  /**
    * Reads a number from the data storage
    * @param key The key to read
    * @param defaultValue The value if the key doesn't exist
    * @returns The number value
    */
  @JSGlobal("BABYLON.DataStorage.ReadNumber")
  @js.native
  def ReadNumber(key: String, defaultValue: Double): Double = js.native
  
  /**
    * Reads a string from the data storage
    * @param key The key to read
    * @param defaultValue The value if the key doesn't exist
    * @returns The string value
    */
  @JSGlobal("BABYLON.DataStorage.ReadString")
  @js.native
  def ReadString(key: String, defaultValue: String): String = js.native
  
  /**
    * Writes a boolean to the data storage
    * @param key The key to write
    * @param value The value to write
    */
  @JSGlobal("BABYLON.DataStorage.WriteBoolean")
  @js.native
  def WriteBoolean(key: String, value: Boolean): Unit = js.native
  
  /**
    * Writes a number to the data storage
    * @param key The key to write
    * @param value The value to write
    */
  @JSGlobal("BABYLON.DataStorage.WriteNumber")
  @js.native
  def WriteNumber(key: String, value: Double): Unit = js.native
  
  /**
    * Writes a string to the data storage
    * @param key The key to write
    * @param value The value to write
    */
  @JSGlobal("BABYLON.DataStorage.WriteString")
  @js.native
  def WriteString(key: String, value: String): Unit = js.native
  
  @JSGlobal("BABYLON.DataStorage._GetStorage")
  @js.native
  def _GetStorage: js.Any = js.native
  @scala.inline
  def _GetStorage_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetStorage")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.DataStorage._Storage")
  @js.native
  def _Storage: js.Any = js.native
  @scala.inline
  def _Storage_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Storage")(x.asInstanceOf[js.Any])
}
