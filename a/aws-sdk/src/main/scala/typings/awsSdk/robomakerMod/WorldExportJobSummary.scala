package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorldExportJobSummary extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the world export job.
    */
  var arn: js.UndefOr[Arn] = js.native
  
  /**
    * The time, in milliseconds since the epoch, when the world export job was created.
    */
  var createdAt: js.UndefOr[CreatedAt] = js.native
  
  /**
    * The status of the world export job.  Pending  The world export job request is pending.  Running  The world export job is running.   Completed  The world export job completed.   Failed  The world export job failed. See failureCode for more information.   Canceled  The world export job was cancelled.  Canceling  The world export job is being cancelled.  
    */
  var status: js.UndefOr[WorldExportJobStatus] = js.native
  
  /**
    * A list of worlds.
    */
  var worlds: js.UndefOr[Arns] = js.native
}
object WorldExportJobSummary {
  
  @scala.inline
  def apply(): WorldExportJobSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorldExportJobSummary]
  }
  
  @scala.inline
  implicit class WorldExportJobSummaryOps[Self <: WorldExportJobSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArn(value: Arn): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: CreatedAt): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    
    @scala.inline
    def setStatus(value: WorldExportJobStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setWorldsVarargs(value: Arn*): Self = this.set("worlds", js.Array(value :_*))
    
    @scala.inline
    def setWorlds(value: Arns): Self = this.set("worlds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorlds: Self = this.set("worlds", js.undefined)
  }
}
