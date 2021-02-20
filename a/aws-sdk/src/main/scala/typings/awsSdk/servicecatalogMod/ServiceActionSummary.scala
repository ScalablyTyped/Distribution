package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceActionSummary extends StObject {
  
  /**
    * The self-service action definition type. For example, SSM_AUTOMATION.
    */
  var DefinitionType: js.UndefOr[ServiceActionDefinitionType] = js.native
  
  /**
    * The self-service action description.
    */
  var Description: js.UndefOr[ServiceActionDescription] = js.native
  
  /**
    * The self-service action identifier.
    */
  var Id: js.UndefOr[typings.awsSdk.servicecatalogMod.Id] = js.native
  
  /**
    * The self-service action name.
    */
  var Name: js.UndefOr[ServiceActionName] = js.native
}
object ServiceActionSummary {
  
  @scala.inline
  def apply(): ServiceActionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceActionSummary]
  }
  
  @scala.inline
  implicit class ServiceActionSummaryMutableBuilder[Self <: ServiceActionSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefinitionType(value: ServiceActionDefinitionType): Self = StObject.set(x, "DefinitionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionTypeUndefined: Self = StObject.set(x, "DefinitionType", js.undefined)
    
    @scala.inline
    def setDescription(value: ServiceActionDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setName(value: ServiceActionName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
