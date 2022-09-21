package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBlueprintResponse extends StObject {
  
  /**
    * Returns a Blueprint object.
    */
  var Blueprint: js.UndefOr[typings.awsSdk.glueMod.Blueprint] = js.undefined
}
object GetBlueprintResponse {
  
  inline def apply(): GetBlueprintResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBlueprintResponse]
  }
  
  extension [Self <: GetBlueprintResponse](x: Self) {
    
    inline def setBlueprint(value: Blueprint): Self = StObject.set(x, "Blueprint", value.asInstanceOf[js.Any])
    
    inline def setBlueprintUndefined: Self = StObject.set(x, "Blueprint", js.undefined)
  }
}
