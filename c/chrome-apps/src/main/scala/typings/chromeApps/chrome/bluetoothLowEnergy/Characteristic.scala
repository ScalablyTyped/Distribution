package typings.chromeApps.chrome.bluetoothLowEnergy

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Characteristic extends js.Object {
  
  /** Returns the identifier assigned to this characteristic. Use the instance ID to distinguish between characteristics from a peripheral with the same UUID and to make function calls that take in a characteristic identifier. Present, if this instance represents a remote characteristic. */
  var instanceId: js.UndefOr[String] = js.native
  
  /** The properties of this characteristic. */
  var properties: js.Array[CharacteristicProperties] = js.native
  
  /** The GATT service this characteristic belongs to. */
  var service: js.UndefOr[Service] = js.native
  
  /** The UUID of the characteristic, e.g. 00002a37-0000-1000-8000-00805f9b34fb. */
  var uuid: String = js.native
  
  /** The currently cached characteristic value. This value gets updated when the value of the characteristic is read or updated via a notification or indication. */
  var value: js.UndefOr[ArrayBuffer] = js.native
}
object Characteristic {
  
  @scala.inline
  def apply(properties: js.Array[CharacteristicProperties], uuid: String): Characteristic = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Characteristic]
  }
  
  @scala.inline
  implicit class CharacteristicOps[Self <: Characteristic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPropertiesVarargs(value: CharacteristicProperties*): Self = this.set("properties", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: js.Array[CharacteristicProperties]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: String): Self = this.set("instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceId: Self = this.set("instanceId", js.undefined)
    
    @scala.inline
    def setService(value: Service): Self = this.set("service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
    
    @scala.inline
    def setValue(value: ArrayBuffer): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
