package typings.awsSdk.datapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParameterAttribute extends StObject {
  
  /**
    * The field identifier.
    */
  var key: attributeNameString = js.native
  
  /**
    * The field value, expressed as a String.
    */
  var stringValue: attributeValueString = js.native
}
object ParameterAttribute {
  
  @scala.inline
  def apply(key: attributeNameString, stringValue: attributeValueString): ParameterAttribute = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], stringValue = stringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterAttribute]
  }
  
  @scala.inline
  implicit class ParameterAttributeMutableBuilder[Self <: ParameterAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: attributeNameString): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValue(value: attributeValueString): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
  }
}
