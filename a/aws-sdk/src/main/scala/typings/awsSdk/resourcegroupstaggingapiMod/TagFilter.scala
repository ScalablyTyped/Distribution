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
  
  inline def apply(): TagFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagFilter]
  }
  
  extension [Self <: TagFilter](x: Self) {
    
    inline def setKey(value: TagKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setValues(value: TagValueList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    inline def setValuesVarargs(value: TagValue*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
