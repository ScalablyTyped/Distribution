package typings.awsSdkTypes.eventStreamMod

import typings.awsSdkTypes.awsSdkTypesStrings.byte
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ByteHeaderValue extends MessageHeaderValue {
  
  var `type`: byte = js.native
  
  var value: Double = js.native
}
object ByteHeaderValue {
  
  @scala.inline
  def apply(`type`: byte, value: Double): ByteHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ByteHeaderValue]
  }
  
  @scala.inline
  implicit class ByteHeaderValueMutableBuilder[Self <: ByteHeaderValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: byte): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
