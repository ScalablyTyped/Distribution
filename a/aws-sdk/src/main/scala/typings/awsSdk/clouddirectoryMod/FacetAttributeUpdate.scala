package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FacetAttributeUpdate extends StObject {
  
  /**
    * The action to perform when updating the attribute.
    */
  var Action: js.UndefOr[UpdateActionType] = js.undefined
  
  /**
    * The attribute to update.
    */
  var Attribute: js.UndefOr[FacetAttribute] = js.undefined
}
object FacetAttributeUpdate {
  
  @scala.inline
  def apply(): FacetAttributeUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FacetAttributeUpdate]
  }
  
  @scala.inline
  implicit class FacetAttributeUpdateMutableBuilder[Self <: FacetAttributeUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: UpdateActionType): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    @scala.inline
    def setAttribute(value: FacetAttribute): Self = StObject.set(x, "Attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeUndefined: Self = StObject.set(x, "Attribute", js.undefined)
  }
}
