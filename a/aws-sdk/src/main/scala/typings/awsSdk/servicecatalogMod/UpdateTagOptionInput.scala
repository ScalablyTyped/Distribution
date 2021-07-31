package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTagOptionInput extends StObject {
  
  /**
    * The updated active state.
    */
  var Active: js.UndefOr[TagOptionActive] = js.undefined
  
  /**
    * The TagOption identifier.
    */
  var Id: TagOptionId
  
  /**
    * The updated value.
    */
  var Value: js.UndefOr[TagOptionValue] = js.undefined
}
object UpdateTagOptionInput {
  
  @scala.inline
  def apply(Id: TagOptionId): UpdateTagOptionInput = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTagOptionInput]
  }
  
  @scala.inline
  implicit class UpdateTagOptionInputMutableBuilder[Self <: UpdateTagOptionInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: TagOptionActive): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "Active", js.undefined)
    
    @scala.inline
    def setId(value: TagOptionId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: TagOptionValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
