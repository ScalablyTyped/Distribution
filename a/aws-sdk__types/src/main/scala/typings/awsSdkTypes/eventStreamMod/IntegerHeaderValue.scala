package typings.awsSdkTypes.eventStreamMod

import typings.awsSdkTypes.awsSdkTypesStrings.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntegerHeaderValue extends MessageHeaderValue {
  
  var `type`: integer = js.native
  
  var value: Double = js.native
}
object IntegerHeaderValue {
  
  @scala.inline
  def apply(`type`: integer, value: Double): IntegerHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegerHeaderValue]
  }
  
  @scala.inline
  implicit class IntegerHeaderValueMutableBuilder[Self <: IntegerHeaderValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: integer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
