package typings.awsSdkTypes.distTypesEventStreamMod

import typings.awsSdkTypes.awsSdkTypesStrings.long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LongHeaderValue
  extends StObject
     with MessageHeaderValue {
  
  var `type`: long
  
  var value: Int64
}
object LongHeaderValue {
  
  inline def apply(value: Int64): LongHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("long")
    __obj.asInstanceOf[LongHeaderValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LongHeaderValue] (val x: Self) extends AnyVal {
    
    inline def setType(value: long): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Int64): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
