package typings.awsSdkTypes.distTypesEventStreamMod

import typings.awsSdkTypes.awsSdkTypesStrings.binary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BinaryHeaderValue
  extends StObject
     with MessageHeaderValue {
  
  var `type`: binary
  
  var value: js.typedarray.Uint8Array
}
object BinaryHeaderValue {
  
  inline def apply(value: js.typedarray.Uint8Array): BinaryHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("binary")
    __obj.asInstanceOf[BinaryHeaderValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BinaryHeaderValue] (val x: Self) extends AnyVal {
    
    inline def setType(value: binary): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.typedarray.Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
