package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDimensionRequest extends StObject {
  
  /**
    * The unique identifier for the dimension that you want to delete.
    */
  var name: DimensionName
}
object DeleteDimensionRequest {
  
  inline def apply(name: DimensionName): DeleteDimensionRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDimensionRequest]
  }
  
  extension [Self <: DeleteDimensionRequest](x: Self) {
    
    inline def setName(value: DimensionName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
