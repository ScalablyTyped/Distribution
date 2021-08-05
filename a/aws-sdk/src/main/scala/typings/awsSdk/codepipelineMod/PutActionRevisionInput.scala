package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutActionRevisionInput extends StObject {
  
  /**
    * The name of the action that processes the revision.
    */
  var actionName: ActionName
  
  /**
    * Represents information about the version (or revision) of an action.
    */
  var actionRevision: ActionRevision
  
  /**
    * The name of the pipeline that starts processing the revision to the source.
    */
  var pipelineName: PipelineName
  
  /**
    * The name of the stage that contains the action that acts on the revision.
    */
  var stageName: StageName
}
object PutActionRevisionInput {
  
  inline def apply(
    actionName: ActionName,
    actionRevision: ActionRevision,
    pipelineName: PipelineName,
    stageName: StageName
  ): PutActionRevisionInput = {
    val __obj = js.Dynamic.literal(actionName = actionName.asInstanceOf[js.Any], actionRevision = actionRevision.asInstanceOf[js.Any], pipelineName = pipelineName.asInstanceOf[js.Any], stageName = stageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutActionRevisionInput]
  }
  
  extension [Self <: PutActionRevisionInput](x: Self) {
    
    inline def setActionName(value: ActionName): Self = StObject.set(x, "actionName", value.asInstanceOf[js.Any])
    
    inline def setActionRevision(value: ActionRevision): Self = StObject.set(x, "actionRevision", value.asInstanceOf[js.Any])
    
    inline def setPipelineName(value: PipelineName): Self = StObject.set(x, "pipelineName", value.asInstanceOf[js.Any])
    
    inline def setStageName(value: StageName): Self = StObject.set(x, "stageName", value.asInstanceOf[js.Any])
  }
}
