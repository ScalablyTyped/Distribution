package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VariableValue extends StObject {
  
  /**
    * The ID of the hierarchy to query for the property ID. You can use the hierarchy's name instead of the hierarchy's ID. You use a hierarchy ID instead of a model ID because you can have several hierarchies using the same model and therefore the same propertyId. For example, you might have separately grouped assets that come from the same asset model. For more information, see Asset hierarchies in the IoT SiteWise User Guide.
    */
  var hierarchyId: js.UndefOr[Macro] = js.undefined
  
  /**
    * The ID of the property to use as the variable. You can use the property name if it's from the same asset model.
    */
  var propertyId: Macro
}
object VariableValue {
  
  inline def apply(propertyId: Macro): VariableValue = {
    val __obj = js.Dynamic.literal(propertyId = propertyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableValue]
  }
  
  extension [Self <: VariableValue](x: Self) {
    
    inline def setHierarchyId(value: Macro): Self = StObject.set(x, "hierarchyId", value.asInstanceOf[js.Any])
    
    inline def setHierarchyIdUndefined: Self = StObject.set(x, "hierarchyId", js.undefined)
    
    inline def setPropertyId(value: Macro): Self = StObject.set(x, "propertyId", value.asInstanceOf[js.Any])
  }
}
