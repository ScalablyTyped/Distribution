package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCostAllocationTagsStatusError extends StObject {
  
  /**
    * An error code representing why the action failed on this entry. 
    */
  var Code: js.UndefOr[GenericString] = js.undefined
  
  /**
    * A message explaining why the action failed on this entry. 
    */
  var Message: js.UndefOr[ErrorMessage] = js.undefined
  
  /**
    * The key for the cost allocation tag. 
    */
  var TagKey: js.UndefOr[typings.awsSdk.costexplorerMod.TagKey] = js.undefined
}
object UpdateCostAllocationTagsStatusError {
  
  inline def apply(): UpdateCostAllocationTagsStatusError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateCostAllocationTagsStatusError]
  }
  
  extension [Self <: UpdateCostAllocationTagsStatusError](x: Self) {
    
    inline def setCode(value: GenericString): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setMessage(value: ErrorMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setTagKey(value: TagKey): Self = StObject.set(x, "TagKey", value.asInstanceOf[js.Any])
    
    inline def setTagKeyUndefined: Self = StObject.set(x, "TagKey", js.undefined)
  }
}
