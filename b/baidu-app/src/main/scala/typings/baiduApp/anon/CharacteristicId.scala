package typings.baiduApp.anon

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CharacteristicId extends StObject {
  
  /**
    * 蓝牙设备特征值的 uuid
    */
  var characteristicId: String
  
  /**
    * 蓝牙设备特征值对应服务的 uuid
    */
  var serviceId: String
  
  /**
    * 蓝牙设备特征值对应的二进制值
    */
  var value: ArrayBuffer
}
object CharacteristicId {
  
  @scala.inline
  def apply(characteristicId: String, serviceId: String, value: ArrayBuffer): CharacteristicId = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharacteristicId]
  }
  
  @scala.inline
  implicit class CharacteristicIdMutableBuilder[Self <: CharacteristicId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharacteristicId(value: String): Self = StObject.set(x, "characteristicId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: ArrayBuffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
