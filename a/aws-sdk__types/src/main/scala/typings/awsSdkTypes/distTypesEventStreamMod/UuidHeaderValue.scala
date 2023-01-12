package typings.awsSdkTypes.distTypesEventStreamMod

import typings.awsSdkTypes.awsSdkTypesStrings.uuid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UuidHeaderValue
  extends StObject
     with MessageHeaderValue {
  
  var `type`: uuid
  
  var value: String
}
object UuidHeaderValue {
  
  inline def apply(value: String): UuidHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("uuid")
    __obj.asInstanceOf[UuidHeaderValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UuidHeaderValue] (val x: Self) extends AnyVal {
    
    inline def setType(value: uuid): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
