package typings.awsSdk.cloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LookupAttribute extends StObject {
  
  /**
    * Specifies an attribute on which to filter the events returned.
    */
  var AttributeKey: LookupAttributeKey = js.native
  
  /**
    * Specifies a value for the specified AttributeKey.
    */
  var AttributeValue: String = js.native
}
object LookupAttribute {
  
  @scala.inline
  def apply(AttributeKey: LookupAttributeKey, AttributeValue: String): LookupAttribute = {
    val __obj = js.Dynamic.literal(AttributeKey = AttributeKey.asInstanceOf[js.Any], AttributeValue = AttributeValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupAttribute]
  }
  
  @scala.inline
  implicit class LookupAttributeMutableBuilder[Self <: LookupAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeKey(value: LookupAttributeKey): Self = StObject.set(x, "AttributeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeValue(value: String): Self = StObject.set(x, "AttributeValue", value.asInstanceOf[js.Any])
  }
}
