package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagFilter extends StObject {
  
  /**
    * The tag key. This must have a valid string value and can't be empty.
    */
  var tagKey: js.UndefOr[TagKey] = js.undefined
  
  /**
    * A list of zero or more tag values. If no values are provided, then the filter matches any tag with the specified key, regardless of its value.
    */
  var tagValues: js.UndefOr[TagValueList] = js.undefined
}
object TagFilter {
  
  inline def apply(): TagFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagFilter]
  }
  
  extension [Self <: TagFilter](x: Self) {
    
    inline def setTagKey(value: TagKey): Self = StObject.set(x, "tagKey", value.asInstanceOf[js.Any])
    
    inline def setTagKeyUndefined: Self = StObject.set(x, "tagKey", js.undefined)
    
    inline def setTagValues(value: TagValueList): Self = StObject.set(x, "tagValues", value.asInstanceOf[js.Any])
    
    inline def setTagValuesUndefined: Self = StObject.set(x, "tagValues", js.undefined)
    
    inline def setTagValuesVarargs(value: TagValue*): Self = StObject.set(x, "tagValues", js.Array(value*))
  }
}
