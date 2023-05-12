package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegistrationMetadataItem extends StObject {
  
  /**
    * Reserved for internal use.
    */
  var Key: RegistrationMetadataKey
  
  /**
    * Reserved for internal use.
    */
  var Value: RegistrationMetadataValue
}
object RegistrationMetadataItem {
  
  inline def apply(Key: RegistrationMetadataKey, Value: RegistrationMetadataValue): RegistrationMetadataItem = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegistrationMetadataItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegistrationMetadataItem] (val x: Self) extends AnyVal {
    
    inline def setKey(value: RegistrationMetadataKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: RegistrationMetadataValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
