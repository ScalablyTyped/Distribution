package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorldExportJobSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the world export job.
    */
  var arn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The time, in milliseconds since the epoch, when the world export job was created.
    */
  var createdAt: js.UndefOr[CreatedAt] = js.undefined
  
  /**
    * The status of the world export job.  Pending  The world export job request is pending.  Running  The world export job is running.   Completed  The world export job completed.   Failed  The world export job failed. See failureCode for more information.   Canceled  The world export job was cancelled.  Canceling  The world export job is being cancelled.  
    */
  var status: js.UndefOr[WorldExportJobStatus] = js.undefined
  
  /**
    * A list of worlds.
    */
  var worlds: js.UndefOr[Arns] = js.undefined
}
object WorldExportJobSummary {
  
  @scala.inline
  def apply(): WorldExportJobSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorldExportJobSummary]
  }
  
  @scala.inline
  implicit class WorldExportJobSummaryMutableBuilder[Self <: WorldExportJobSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: CreatedAt): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setStatus(value: WorldExportJobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setWorlds(value: Arns): Self = StObject.set(x, "worlds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorldsUndefined: Self = StObject.set(x, "worlds", js.undefined)
    
    @scala.inline
    def setWorldsVarargs(value: Arn*): Self = StObject.set(x, "worlds", js.Array(value :_*))
  }
}
