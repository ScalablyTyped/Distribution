package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEditSessionOperationParams extends StObject {
  
  var ownerUri: String = js.native
}
object IEditSessionOperationParams {
  
  @scala.inline
  def apply(ownerUri: String): IEditSessionOperationParams = {
    val __obj = js.Dynamic.literal(ownerUri = ownerUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditSessionOperationParams]
  }
  
  @scala.inline
  implicit class IEditSessionOperationParamsMutableBuilder[Self <: IEditSessionOperationParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwnerUri(value: String): Self = StObject.set(x, "ownerUri", value.asInstanceOf[js.Any])
  }
}
