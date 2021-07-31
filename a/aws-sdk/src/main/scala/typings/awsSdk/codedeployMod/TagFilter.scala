package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagFilter extends StObject {
  
  /**
    * The on-premises instance tag filter key.
    */
  var Key: js.UndefOr[typings.awsSdk.codedeployMod.Key] = js.undefined
  
  /**
    * The on-premises instance tag filter type:   KEY_ONLY: Key only.   VALUE_ONLY: Value only.   KEY_AND_VALUE: Key and value.  
    */
  var Type: js.UndefOr[TagFilterType] = js.undefined
  
  /**
    * The on-premises instance tag filter value.
    */
  var Value: js.UndefOr[typings.awsSdk.codedeployMod.Value] = js.undefined
}
object TagFilter {
  
  @scala.inline
  def apply(): TagFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagFilter]
  }
  
  @scala.inline
  implicit class TagFilterMutableBuilder[Self <: TagFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: Key): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    @scala.inline
    def setType(value: TagFilterType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setValue(value: Value): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
