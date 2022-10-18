package typings.awsSdkTypes.distTypesEventStreamMod

import typings.awsSdkTypes.awsSdkTypesStrings.boolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BooleanHeaderValue
  extends StObject
     with MessageHeaderValue {
  
  var `type`: boolean
  
  var value: Boolean
}
object BooleanHeaderValue {
  
  inline def apply(value: Boolean): BooleanHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("boolean")
    __obj.asInstanceOf[BooleanHeaderValue]
  }
  
  extension [Self <: BooleanHeaderValue](x: Self) {
    
    inline def setType(value: boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
