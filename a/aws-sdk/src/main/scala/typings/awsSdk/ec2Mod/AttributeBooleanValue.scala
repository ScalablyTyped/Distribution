package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttributeBooleanValue extends StObject {
  
  /**
    * The attribute value. The valid values are true or false.
    */
  var Value: js.UndefOr[Boolean] = js.native
}
object AttributeBooleanValue {
  
  @scala.inline
  def apply(): AttributeBooleanValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeBooleanValue]
  }
  
  @scala.inline
  implicit class AttributeBooleanValueMutableBuilder[Self <: AttributeBooleanValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: Boolean): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
