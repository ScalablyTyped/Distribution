package typings.awsSdkTypes.eventStreamMod

import typings.awsSdkTypes.awsSdkTypesStrings.long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LongHeaderValue extends MessageHeaderValue {
  
  var `type`: long = js.native
  
  var value: Int64 = js.native
}
object LongHeaderValue {
  
  @scala.inline
  def apply(`type`: long, value: Int64): LongHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongHeaderValue]
  }
  
  @scala.inline
  implicit class LongHeaderValueMutableBuilder[Self <: LongHeaderValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: long): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Int64): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
