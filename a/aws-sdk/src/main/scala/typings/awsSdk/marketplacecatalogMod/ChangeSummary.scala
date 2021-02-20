package typings.awsSdk.marketplacecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeSummary extends StObject {
  
  /**
    * The type of the change.
    */
  var ChangeType: js.UndefOr[typings.awsSdk.marketplacecatalogMod.ChangeType] = js.native
  
  /**
    * This object contains details specific to the change type of the requested change.
    */
  var Details: js.UndefOr[Json] = js.native
  
  /**
    * The entity to be changed.
    */
  var Entity: js.UndefOr[typings.awsSdk.marketplacecatalogMod.Entity] = js.native
  
  /**
    * An array of ErrorDetail objects associated with the change.
    */
  var ErrorDetailList: js.UndefOr[typings.awsSdk.marketplacecatalogMod.ErrorDetailList] = js.native
}
object ChangeSummary {
  
  @scala.inline
  def apply(): ChangeSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeSummary]
  }
  
  @scala.inline
  implicit class ChangeSummaryMutableBuilder[Self <: ChangeSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeType(value: ChangeType): Self = StObject.set(x, "ChangeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeTypeUndefined: Self = StObject.set(x, "ChangeType", js.undefined)
    
    @scala.inline
    def setDetails(value: Json): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "Details", js.undefined)
    
    @scala.inline
    def setEntity(value: Entity): Self = StObject.set(x, "Entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityUndefined: Self = StObject.set(x, "Entity", js.undefined)
    
    @scala.inline
    def setErrorDetailList(value: ErrorDetailList): Self = StObject.set(x, "ErrorDetailList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailListUndefined: Self = StObject.set(x, "ErrorDetailList", js.undefined)
    
    @scala.inline
    def setErrorDetailListVarargs(value: ErrorDetail*): Self = StObject.set(x, "ErrorDetailList", js.Array(value :_*))
  }
}
