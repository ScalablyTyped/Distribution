package typings.awsSdk.resourcegroupstaggingapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagFilter extends StObject {
  
  /**
    * One part of a key-value pair that makes up a tag. A key is a general label that acts like a category for more specific tag values.
    */
  var Key: js.UndefOr[TagKey] = js.undefined
  
  /**
    * One part of a key-value pair that make up a tag. A value acts as a descriptor within a tag category (key). The value can be empty or null.
    */
  var Values: js.UndefOr[TagValueList] = js.undefined
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
    def setKey(value: TagKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    @scala.inline
    def setValues(value: TagValueList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: TagValue*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
