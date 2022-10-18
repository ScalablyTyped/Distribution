package typings.awsSdkTypes.distTypesEventStreamMod

import typings.awsSdkTypes.awsSdkTypesStrings.short
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShortHeaderValue
  extends StObject
     with MessageHeaderValue {
  
  var `type`: short
  
  var value: Double
}
object ShortHeaderValue {
  
  inline def apply(value: Double): ShortHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("short")
    __obj.asInstanceOf[ShortHeaderValue]
  }
  
  extension [Self <: ShortHeaderValue](x: Self) {
    
    inline def setType(value: short): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
