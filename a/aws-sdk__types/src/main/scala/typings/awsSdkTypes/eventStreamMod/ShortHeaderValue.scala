package typings.awsSdkTypes.eventStreamMod

import typings.awsSdkTypes.awsSdkTypesStrings.short
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShortHeaderValue extends MessageHeaderValue {
  
  var `type`: short = js.native
  
  var value: Double = js.native
}
object ShortHeaderValue {
  
  @scala.inline
  def apply(`type`: short, value: Double): ShortHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
