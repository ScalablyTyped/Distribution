package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.DataStorage")
@js.native
class DataStorage ()
  extends StObject
     with typings.babylonjs.BABYLON.DataStorage
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
  inline def ReadBoolean(key: String, defaultValue: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ReadBoolean")(key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Reads a number from the data storage
    * @param key The key to read
    * @param defaultValue The value if the key doesn't exist
    * @returns The number value
    */
  inline def ReadNumber(key: String, defaultValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ReadNumber")(key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Reads a string from the data storage
    * @param key The key to read
    * @param defaultValue The value if the key doesn't exist
    * @returns The string value
    */
  inline def ReadString(key: String, defaultValue: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ReadString")(key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Writes a boolean to the data storage
    * @param key The key to write
    * @param value The value to write
    */
  inline def WriteBoolean(key: String, value: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("WriteBoolean")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Writes a number to the data storage
    * @param key The key to write
    * @param value The value to write
    */
  inline def WriteNumber(key: String, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("WriteNumber")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Writes a string to the data storage
    * @param key The key to write
    * @param value The value to write
    */
  inline def WriteString(key: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("WriteString")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSGlobal("BABYLON.DataStorage._GetStorage")
  @js.native
  def _GetStorage: js.Any = js.native
  inline def _GetStorage_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetStorage")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.DataStorage._Storage")
  @js.native
  def _Storage: js.Any = js.native
  inline def _Storage_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Storage")(x.asInstanceOf[js.Any])
}
