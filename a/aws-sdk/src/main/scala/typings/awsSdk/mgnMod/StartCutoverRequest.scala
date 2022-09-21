package typings.awsSdk.mgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartCutoverRequest extends StObject {
  
  /**
    * Start Cutover by Source Server IDs.
    */
  var sourceServerIDs: StartCutoverRequestSourceServerIDs
  
  /**
    * Start Cutover by Tags.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
}
object StartCutoverRequest {
  
  inline def apply(sourceServerIDs: StartCutoverRequestSourceServerIDs): StartCutoverRequest = {
    val __obj = js.Dynamic.literal(sourceServerIDs = sourceServerIDs.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartCutoverRequest]
  }
  
  extension [Self <: StartCutoverRequest](x: Self) {
    
    inline def setSourceServerIDs(value: StartCutoverRequestSourceServerIDs): Self = StObject.set(x, "sourceServerIDs", value.asInstanceOf[js.Any])
    
    inline def setSourceServerIDsVarargs(value: SourceServerID*): Self = StObject.set(x, "sourceServerIDs", js.Array(value*))
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
