package typings.awsSdkTypes.eventStreamMod

import typings.awsSdkTypes.awsSdkTypesStrings.boolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BooleanHeaderValue extends MessageHeaderValue {
  
  var `type`: boolean = js.native
  
  var value: Boolean = js.native
}
object BooleanHeaderValue {
  
  @scala.inline
  def apply(`type`: boolean, value: Boolean): BooleanHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BooleanHeaderValue]
  }
  
  @scala.inline
  implicit class BooleanHeaderValueMutableBuilder[Self <: BooleanHeaderValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
