package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEditSessionOperationParams extends StObject {
  
  var ownerUri: String
}
object IEditSessionOperationParams {
  
  inline def apply(ownerUri: String): IEditSessionOperationParams = {
    val __obj = js.Dynamic.literal(ownerUri = ownerUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditSessionOperationParams]
  }
  
  extension [Self <: IEditSessionOperationParams](x: Self) {
    
    inline def setOwnerUri(value: String): Self = StObject.set(x, "ownerUri", value.asInstanceOf[js.Any])
  }
}
