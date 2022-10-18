package typings.awsSdkTypes.distTypesEventStreamMod

import typings.awsSdkTypes.awsSdkTypesStrings.byte
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ByteHeaderValue
  extends StObject
     with MessageHeaderValue {
  
  var `type`: byte
  
  var value: Double
}
object ByteHeaderValue {
  
  inline def apply(value: Double): ByteHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("byte")
    __obj.asInstanceOf[ByteHeaderValue]
  }
  
  extension [Self <: ByteHeaderValue](x: Self) {
    
    inline def setType(value: byte): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
