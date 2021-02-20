package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceTargetDefinition extends StObject {
  
  /**
    * The attribute to be changed.
    */
  var Attribute: js.UndefOr[ResourceAttribute] = js.native
  
  /**
    * If the attribute is Properties, the value is the name of the property. Otherwise, the value is null.
    */
  var Name: js.UndefOr[PropertyName] = js.native
  
  /**
    * If the attribute is Properties, indicates whether a change to this property causes the resource to be re-created.
    */
  var RequiresRecreation: js.UndefOr[typings.awsSdk.servicecatalogMod.RequiresRecreation] = js.native
}
object ResourceTargetDefinition {
  
  @scala.inline
  def apply(): ResourceTargetDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceTargetDefinition]
  }
  
  @scala.inline
  implicit class ResourceTargetDefinitionMutableBuilder[Self <: ResourceTargetDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribute(value: ResourceAttribute): Self = StObject.set(x, "Attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeUndefined: Self = StObject.set(x, "Attribute", js.undefined)
    
    @scala.inline
    def setName(value: PropertyName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setRequiresRecreation(value: RequiresRecreation): Self = StObject.set(x, "RequiresRecreation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiresRecreationUndefined: Self = StObject.set(x, "RequiresRecreation", js.undefined)
  }
}
