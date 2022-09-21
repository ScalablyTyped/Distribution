package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateContextRequest extends StObject {
  
  /**
    * The name of the context to update.
    */
  var ContextName: ExperimentEntityName
  
  /**
    * The new description for the context.
    */
  var Description: js.UndefOr[ExperimentDescription] = js.undefined
  
  /**
    * The new list of properties. Overwrites the current property list.
    */
  var Properties: js.UndefOr[LineageEntityParameters] = js.undefined
  
  /**
    * A list of properties to remove.
    */
  var PropertiesToRemove: js.UndefOr[ListLineageEntityParameterKey] = js.undefined
}
object UpdateContextRequest {
  
  inline def apply(ContextName: ExperimentEntityName): UpdateContextRequest = {
    val __obj = js.Dynamic.literal(ContextName = ContextName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateContextRequest]
  }
  
  extension [Self <: UpdateContextRequest](x: Self) {
    
    inline def setContextName(value: ExperimentEntityName): Self = StObject.set(x, "ContextName", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: ExperimentDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setProperties(value: LineageEntityParameters): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesToRemove(value: ListLineageEntityParameterKey): Self = StObject.set(x, "PropertiesToRemove", value.asInstanceOf[js.Any])
    
    inline def setPropertiesToRemoveUndefined: Self = StObject.set(x, "PropertiesToRemove", js.undefined)
    
    inline def setPropertiesToRemoveVarargs(value: StringParameterValue*): Self = StObject.set(x, "PropertiesToRemove", js.Array(value*))
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "Properties", js.undefined)
  }
}
