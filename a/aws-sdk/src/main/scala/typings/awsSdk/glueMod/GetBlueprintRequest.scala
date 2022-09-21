package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBlueprintRequest extends StObject {
  
  /**
    * Specifies whether or not to include the blueprint in the response.
    */
  var IncludeBlueprint: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * Specifies whether or not to include the parameter specification.
    */
  var IncludeParameterSpec: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * The name of the blueprint.
    */
  var Name: NameString
}
object GetBlueprintRequest {
  
  inline def apply(Name: NameString): GetBlueprintRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBlueprintRequest]
  }
  
  extension [Self <: GetBlueprintRequest](x: Self) {
    
    inline def setIncludeBlueprint(value: NullableBoolean): Self = StObject.set(x, "IncludeBlueprint", value.asInstanceOf[js.Any])
    
    inline def setIncludeBlueprintUndefined: Self = StObject.set(x, "IncludeBlueprint", js.undefined)
    
    inline def setIncludeParameterSpec(value: NullableBoolean): Self = StObject.set(x, "IncludeParameterSpec", value.asInstanceOf[js.Any])
    
    inline def setIncludeParameterSpecUndefined: Self = StObject.set(x, "IncludeParameterSpec", js.undefined)
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
