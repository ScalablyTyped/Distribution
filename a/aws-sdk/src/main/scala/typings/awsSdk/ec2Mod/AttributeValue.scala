package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeValue extends StObject {
  
  /**
    * The attribute value. The value is case-sensitive.
    */
  var Value: js.UndefOr[String] = js.undefined
}
object AttributeValue {
  
  @scala.inline
  def apply(): AttributeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeValue]
  }
  
  @scala.inline
  implicit class AttributeValueMutableBuilder[Self <: AttributeValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
