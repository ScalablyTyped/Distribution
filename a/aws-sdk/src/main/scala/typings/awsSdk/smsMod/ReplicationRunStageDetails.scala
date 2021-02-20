package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplicationRunStageDetails extends StObject {
  
  /**
    * The current stage of a replication run.
    */
  var stage: js.UndefOr[ReplicationRunStage] = js.native
  
  /**
    * The progress of the current stage of a replication run.
    */
  var stageProgress: js.UndefOr[ReplicationRunStageProgress] = js.native
}
object ReplicationRunStageDetails {
  
  @scala.inline
  def apply(): ReplicationRunStageDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationRunStageDetails]
  }
  
  @scala.inline
  implicit class ReplicationRunStageDetailsMutableBuilder[Self <: ReplicationRunStageDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStage(value: ReplicationRunStage): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageProgress(value: ReplicationRunStageProgress): Self = StObject.set(x, "stageProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageProgressUndefined: Self = StObject.set(x, "stageProgress", js.undefined)
    
    @scala.inline
    def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
  }
}
