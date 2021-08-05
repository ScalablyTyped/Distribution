package typings.awsSdk.datapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetStatusInput extends StObject {
  
  /**
    * The IDs of the objects. The corresponding objects can be either physical or components, but not a mix of both types.
    */
  var objectIds: idList
  
  /**
    * The ID of the pipeline that contains the objects.
    */
  var pipelineId: id
  
  /**
    * The status to be set on all the objects specified in objectIds. For components, use PAUSE or RESUME. For instances, use TRY_CANCEL, RERUN, or MARK_FINISHED.
    */
  var status: String
}
object SetStatusInput {
  
  inline def apply(objectIds: idList, pipelineId: id, status: String): SetStatusInput = {
    val __obj = js.Dynamic.literal(objectIds = objectIds.asInstanceOf[js.Any], pipelineId = pipelineId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetStatusInput]
  }
  
  extension [Self <: SetStatusInput](x: Self) {
    
    inline def setObjectIds(value: idList): Self = StObject.set(x, "objectIds", value.asInstanceOf[js.Any])
    
    inline def setObjectIdsVarargs(value: id*): Self = StObject.set(x, "objectIds", js.Array(value :_*))
    
    inline def setPipelineId(value: id): Self = StObject.set(x, "pipelineId", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
