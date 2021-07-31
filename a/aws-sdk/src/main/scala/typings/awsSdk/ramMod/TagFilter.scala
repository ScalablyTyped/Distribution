package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagFilter extends StObject {
  
  /**
    * The tag key.
    */
  var tagKey: js.UndefOr[TagKey] = js.undefined
  
  /**
    * The tag values.
    */
  var tagValues: js.UndefOr[TagValueList] = js.undefined
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
    def setTagKey(value: TagKey): Self = StObject.set(x, "tagKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeyUndefined: Self = StObject.set(x, "tagKey", js.undefined)
    
    @scala.inline
    def setTagValues(value: TagValueList): Self = StObject.set(x, "tagValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagValuesUndefined: Self = StObject.set(x, "tagValues", js.undefined)
    
    @scala.inline
    def setTagValuesVarargs(value: TagValue*): Self = StObject.set(x, "tagValues", js.Array(value :_*))
  }
}
