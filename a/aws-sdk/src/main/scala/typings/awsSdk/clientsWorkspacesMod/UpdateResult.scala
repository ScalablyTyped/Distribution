package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateResult extends StObject {
  
  /**
    * A description of whether updates for the WorkSpace image are pending or available.
    */
  var Description: js.UndefOr[UpdateDescription] = js.undefined
  
  /**
    * Indicates whether updated drivers or other components are available for the specified WorkSpace image.
    */
  var UpdateAvailable: js.UndefOr[BooleanObject] = js.undefined
}
object UpdateResult {
  
  inline def apply(): UpdateResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateResult] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: UpdateDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setUpdateAvailable(value: BooleanObject): Self = StObject.set(x, "UpdateAvailable", value.asInstanceOf[js.Any])
    
    inline def setUpdateAvailableUndefined: Self = StObject.set(x, "UpdateAvailable", js.undefined)
  }
}
