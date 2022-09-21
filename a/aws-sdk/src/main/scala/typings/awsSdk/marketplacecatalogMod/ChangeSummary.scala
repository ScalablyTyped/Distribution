package typings.awsSdk.marketplacecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeSummary extends StObject {
  
  /**
    * Optional name for the change.
    */
  var ChangeName: js.UndefOr[typings.awsSdk.marketplacecatalogMod.ChangeName] = js.undefined
  
  /**
    * The type of the change.
    */
  var ChangeType: js.UndefOr[typings.awsSdk.marketplacecatalogMod.ChangeType] = js.undefined
  
  /**
    * This object contains details specific to the change type of the requested change.
    */
  var Details: js.UndefOr[Json] = js.undefined
  
  /**
    * The entity to be changed.
    */
  var Entity: js.UndefOr[typings.awsSdk.marketplacecatalogMod.Entity] = js.undefined
  
  /**
    * An array of ErrorDetail objects associated with the change.
    */
  var ErrorDetailList: js.UndefOr[typings.awsSdk.marketplacecatalogMod.ErrorDetailList] = js.undefined
}
object ChangeSummary {
  
  inline def apply(): ChangeSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeSummary]
  }
  
  extension [Self <: ChangeSummary](x: Self) {
    
    inline def setChangeName(value: ChangeName): Self = StObject.set(x, "ChangeName", value.asInstanceOf[js.Any])
    
    inline def setChangeNameUndefined: Self = StObject.set(x, "ChangeName", js.undefined)
    
    inline def setChangeType(value: ChangeType): Self = StObject.set(x, "ChangeType", value.asInstanceOf[js.Any])
    
    inline def setChangeTypeUndefined: Self = StObject.set(x, "ChangeType", js.undefined)
    
    inline def setDetails(value: Json): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "Details", js.undefined)
    
    inline def setEntity(value: Entity): Self = StObject.set(x, "Entity", value.asInstanceOf[js.Any])
    
    inline def setEntityUndefined: Self = StObject.set(x, "Entity", js.undefined)
    
    inline def setErrorDetailList(value: ErrorDetailList): Self = StObject.set(x, "ErrorDetailList", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailListUndefined: Self = StObject.set(x, "ErrorDetailList", js.undefined)
    
    inline def setErrorDetailListVarargs(value: ErrorDetail*): Self = StObject.set(x, "ErrorDetailList", js.Array(value*))
  }
}
