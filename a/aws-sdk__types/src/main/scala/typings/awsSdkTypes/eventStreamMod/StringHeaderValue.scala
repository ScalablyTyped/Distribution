package typings.awsSdkTypes.eventStreamMod

import typings.awsSdkTypes.awsSdkTypesStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringHeaderValue
  extends StObject
     with MessageHeaderValue {
  
  var `type`: string
  
  var value: String
}
object StringHeaderValue {
  
  @scala.inline
  def apply(value: String): StringHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[StringHeaderValue]
  }
  
  @scala.inline
  implicit class StringHeaderValueMutableBuilder[Self <: StringHeaderValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
