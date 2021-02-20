package typings.awsSdk.comprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmappedAttribute extends StObject {
  
  /**
    *  The specific attribute that has been extracted but not mapped to an entity. 
    */
  var Attribute: js.UndefOr[typings.awsSdk.comprehendmedicalMod.Attribute] = js.native
  
  /**
    *  The type of the attribute, could be one of the following values: "MEDICATION", "MEDICAL_CONDITION", "ANATOMY", "TEST_AND_TREATMENT_PROCEDURE" or "PROTECTED_HEALTH_INFORMATION". 
    */
  var Type: js.UndefOr[EntityType] = js.native
}
object UnmappedAttribute {
  
  @scala.inline
  def apply(): UnmappedAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmappedAttribute]
  }
  
  @scala.inline
  implicit class UnmappedAttributeMutableBuilder[Self <: UnmappedAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribute(value: Attribute): Self = StObject.set(x, "Attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeUndefined: Self = StObject.set(x, "Attribute", js.undefined)
    
    @scala.inline
    def setType(value: EntityType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
