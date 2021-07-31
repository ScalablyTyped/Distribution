package typings.awsSdkTypes.eventStreamMod

import typings.awsSdkTypes.awsSdkTypesStrings.binary
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BinaryHeaderValue
  extends StObject
     with MessageHeaderValue {
  
  var `type`: binary
  
  var value: Uint8Array
}
object BinaryHeaderValue {
  
  @scala.inline
  def apply(value: Uint8Array): BinaryHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("binary")
    __obj.asInstanceOf[BinaryHeaderValue]
  }
  
  @scala.inline
  implicit class BinaryHeaderValueMutableBuilder[Self <: BinaryHeaderValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: binary): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
