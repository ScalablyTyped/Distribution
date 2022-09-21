package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBlueprintResponse extends StObject {
  
  /**
    * Returns the name of the blueprint that was updated.
    */
  var Name: js.UndefOr[NameString] = js.undefined
}
object UpdateBlueprintResponse {
  
  inline def apply(): UpdateBlueprintResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateBlueprintResponse]
  }
  
  extension [Self <: UpdateBlueprintResponse](x: Self) {
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
