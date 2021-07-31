package typings.awsSdkTypes.eventStreamMod

import typings.awsSdkTypes.awsSdkTypesStrings.timestamp
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimestampHeaderValue
  extends StObject
     with MessageHeaderValue {
  
  var `type`: timestamp
  
  var value: Date
}
object TimestampHeaderValue {
  
  @scala.inline
  def apply(value: Date): TimestampHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("timestamp")
    __obj.asInstanceOf[TimestampHeaderValue]
  }
  
  @scala.inline
  implicit class TimestampHeaderValueMutableBuilder[Self <: TimestampHeaderValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: timestamp): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
