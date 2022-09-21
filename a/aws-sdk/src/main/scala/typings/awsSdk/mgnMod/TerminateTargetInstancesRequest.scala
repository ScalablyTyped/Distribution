package typings.awsSdk.mgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminateTargetInstancesRequest extends StObject {
  
  /**
    * Terminate Target instance by Source Server IDs.
    */
  var sourceServerIDs: TerminateTargetInstancesRequestSourceServerIDs
  
  /**
    * Terminate Target instance by Tags.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
}
object TerminateTargetInstancesRequest {
  
  inline def apply(sourceServerIDs: TerminateTargetInstancesRequestSourceServerIDs): TerminateTargetInstancesRequest = {
    val __obj = js.Dynamic.literal(sourceServerIDs = sourceServerIDs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminateTargetInstancesRequest]
  }
  
  extension [Self <: TerminateTargetInstancesRequest](x: Self) {
    
    inline def setSourceServerIDs(value: TerminateTargetInstancesRequestSourceServerIDs): Self = StObject.set(x, "sourceServerIDs", value.asInstanceOf[js.Any])
    
    inline def setSourceServerIDsVarargs(value: SourceServerID*): Self = StObject.set(x, "sourceServerIDs", js.Array(value*))
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
