package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaAttribute extends StObject {
  
  /**
    * The name of the dataset field.
    */
  var AttributeName: js.UndefOr[Name] = js.native
  
  /**
    * The data type of the field.
    */
  var AttributeType: js.UndefOr[typings.awsSdk.forecastserviceMod.AttributeType] = js.native
}
object SchemaAttribute {
  
  @scala.inline
  def apply(): SchemaAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttribute]
  }
  
  @scala.inline
  implicit class SchemaAttributeMutableBuilder[Self <: SchemaAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeName(value: Name): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeNameUndefined: Self = StObject.set(x, "AttributeName", js.undefined)
    
    @scala.inline
    def setAttributeType(value: AttributeType): Self = StObject.set(x, "AttributeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeTypeUndefined: Self = StObject.set(x, "AttributeType", js.undefined)
  }
}
