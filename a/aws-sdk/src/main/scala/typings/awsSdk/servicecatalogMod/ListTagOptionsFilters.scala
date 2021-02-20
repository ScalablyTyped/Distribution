package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTagOptionsFilters extends StObject {
  
  /**
    * The active state.
    */
  var Active: js.UndefOr[TagOptionActive] = js.native
  
  /**
    * The TagOption key.
    */
  var Key: js.UndefOr[TagOptionKey] = js.native
  
  /**
    * The TagOption value.
    */
  var Value: js.UndefOr[TagOptionValue] = js.native
}
object ListTagOptionsFilters {
  
  @scala.inline
  def apply(): ListTagOptionsFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagOptionsFilters]
  }
  
  @scala.inline
  implicit class ListTagOptionsFiltersMutableBuilder[Self <: ListTagOptionsFilters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: TagOptionActive): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "Active", js.undefined)
    
    @scala.inline
    def setKey(value: TagOptionKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    @scala.inline
    def setValue(value: TagOptionValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
