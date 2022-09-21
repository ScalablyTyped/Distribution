package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceTargetDefinition extends StObject {
  
  /**
    * Indicates which resource attribute is triggering this update, such as a change in the resource attribute's Metadata, Properties, or Tags.
    */
  var Attribute: js.UndefOr[ResourceAttribute] = js.undefined
  
  /**
    * If the Attribute value is Properties, the name of the property. For all other attributes, the value is null.
    */
  var Name: js.UndefOr[PropertyName] = js.undefined
  
  /**
    * If the Attribute value is Properties, indicates whether a change to this property causes the resource to be recreated. The value can be Never, Always, or Conditionally. To determine the conditions for a Conditionally recreation, see the update behavior for that property in the CloudFormation User Guide.
    */
  var RequiresRecreation: js.UndefOr[typings.awsSdk.cloudformationMod.RequiresRecreation] = js.undefined
}
object ResourceTargetDefinition {
  
  inline def apply(): ResourceTargetDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceTargetDefinition]
  }
  
  extension [Self <: ResourceTargetDefinition](x: Self) {
    
    inline def setAttribute(value: ResourceAttribute): Self = StObject.set(x, "Attribute", value.asInstanceOf[js.Any])
    
    inline def setAttributeUndefined: Self = StObject.set(x, "Attribute", js.undefined)
    
    inline def setName(value: PropertyName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRequiresRecreation(value: RequiresRecreation): Self = StObject.set(x, "RequiresRecreation", value.asInstanceOf[js.Any])
    
    inline def setRequiresRecreationUndefined: Self = StObject.set(x, "RequiresRecreation", js.undefined)
  }
}
