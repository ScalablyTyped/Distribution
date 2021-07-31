package typings.awsSdkTypes.eventStreamMod

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
  
  @scala.inline
  def apply(value: Double): ShortHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("short")
    __obj.asInstanceOf[ShortHeaderValue]
  }
  
  @scala.inline
  implicit class ShortHeaderValueMutableBuilder[Self <: ShortHeaderValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: short): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
