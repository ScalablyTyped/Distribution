package typings.awsSdk.mgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartTestRequest extends StObject {
  
  /**
    * Start Test for Source Server IDs.
    */
  var sourceServerIDs: StartTestRequestSourceServerIDs
  
  /**
    * Start Test by Tags.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
}
object StartTestRequest {
  
  inline def apply(sourceServerIDs: StartTestRequestSourceServerIDs): StartTestRequest = {
    val __obj = js.Dynamic.literal(sourceServerIDs = sourceServerIDs.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTestRequest]
  }
  
  extension [Self <: StartTestRequest](x: Self) {
    
    inline def setSourceServerIDs(value: StartTestRequestSourceServerIDs): Self = StObject.set(x, "sourceServerIDs", value.asInstanceOf[js.Any])
    
    inline def setSourceServerIDsVarargs(value: SourceServerID*): Self = StObject.set(x, "sourceServerIDs", js.Array(value*))
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
