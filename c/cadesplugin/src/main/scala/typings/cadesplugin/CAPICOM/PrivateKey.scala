package typings.cadesplugin.CAPICOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrivateKey extends StObject {
  
  var CachePin: Boolean
  
  def ChangePin(): Unit
  
  val ContainerName: String
  
  var KeyPin: String
  
  val KeySpec: CAPICOM_KEY_SPEC
  
  val ProviderName: String
  
  val ProviderType: CAPICOM_PROV_TYPE
  
  val UniqueContainerName: String
}
object PrivateKey {
  
  inline def apply(
    CachePin: Boolean,
    ChangePin: () => Unit,
    ContainerName: String,
    KeyPin: String,
    KeySpec: CAPICOM_KEY_SPEC,
    ProviderName: String,
    ProviderType: CAPICOM_PROV_TYPE,
    UniqueContainerName: String
  ): PrivateKey = {
    val __obj = js.Dynamic.literal(CachePin = CachePin.asInstanceOf[js.Any], ChangePin = js.Any.fromFunction0(ChangePin), ContainerName = ContainerName.asInstanceOf[js.Any], KeyPin = KeyPin.asInstanceOf[js.Any], KeySpec = KeySpec.asInstanceOf[js.Any], ProviderName = ProviderName.asInstanceOf[js.Any], ProviderType = ProviderType.asInstanceOf[js.Any], UniqueContainerName = UniqueContainerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateKey]
  }
  
  extension [Self <: PrivateKey](x: Self) {
    
    inline def setCachePin(value: Boolean): Self = StObject.set(x, "CachePin", value.asInstanceOf[js.Any])
    
    inline def setChangePin(value: () => Unit): Self = StObject.set(x, "ChangePin", js.Any.fromFunction0(value))
    
    inline def setContainerName(value: String): Self = StObject.set(x, "ContainerName", value.asInstanceOf[js.Any])
    
    inline def setKeyPin(value: String): Self = StObject.set(x, "KeyPin", value.asInstanceOf[js.Any])
    
    inline def setKeySpec(value: CAPICOM_KEY_SPEC): Self = StObject.set(x, "KeySpec", value.asInstanceOf[js.Any])
    
    inline def setProviderName(value: String): Self = StObject.set(x, "ProviderName", value.asInstanceOf[js.Any])
    
    inline def setProviderType(value: CAPICOM_PROV_TYPE): Self = StObject.set(x, "ProviderType", value.asInstanceOf[js.Any])
    
    inline def setUniqueContainerName(value: String): Self = StObject.set(x, "UniqueContainerName", value.asInstanceOf[js.Any])
  }
}
