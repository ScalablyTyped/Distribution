package typings.awsSdkTypes.eventStreamMod

import typings.awsSdkTypes.awsSdkTypesStrings.uuid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UuidHeaderValue extends MessageHeaderValue {
  
  var `type`: uuid = js.native
  
  var value: String = js.native
}
object UuidHeaderValue {
  
  @scala.inline
  def apply(`type`: uuid, value: String): UuidHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UuidHeaderValue]
  }
  
  @scala.inline
  implicit class UuidHeaderValueMutableBuilder[Self <: UuidHeaderValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: uuid): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
