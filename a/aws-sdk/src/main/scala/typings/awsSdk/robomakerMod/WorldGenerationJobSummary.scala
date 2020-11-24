package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorldGenerationJobSummary extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the world generator job.
    */
  var arn: js.UndefOr[Arn] = js.native
  
  /**
    * The time, in milliseconds since the epoch, when the world generator job was created.
    */
  var createdAt: js.UndefOr[CreatedAt] = js.native
  
  /**
    * The number of worlds that failed.
    */
  var failedWorldCount: js.UndefOr[Integer] = js.native
  
  /**
    * The status of the world generator job:  Pending  The world generator job request is pending.  Running  The world generator job is running.   Completed  The world generator job completed.   Failed  The world generator job failed. See failureCode for more information.   PartialFailed  Some worlds did not generate.  Canceled  The world generator job was cancelled.  Canceling  The world generator job is being cancelled.  
    */
  var status: js.UndefOr[WorldGenerationJobStatus] = js.native
  
  /**
    * The number of worlds that were generated.
    */
  var succeededWorldCount: js.UndefOr[Integer] = js.native
  
  /**
    * The Amazon Resource Name (arn) of the world template.
    */
  var template: js.UndefOr[Arn] = js.native
  
  /**
    * Information about the world count.
    */
  var worldCount: js.UndefOr[WorldCount] = js.native
}
object WorldGenerationJobSummary {
  
  @scala.inline
  def apply(): WorldGenerationJobSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorldGenerationJobSummary]
  }
  
  @scala.inline
  implicit class WorldGenerationJobSummaryOps[Self <: WorldGenerationJobSummary] (val x: Self) extends AnyVal {
    
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
    def setFailedWorldCount(value: Integer): Self = this.set("failedWorldCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailedWorldCount: Self = this.set("failedWorldCount", js.undefined)
    
    @scala.inline
    def setStatus(value: WorldGenerationJobStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setSucceededWorldCount(value: Integer): Self = this.set("succeededWorldCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSucceededWorldCount: Self = this.set("succeededWorldCount", js.undefined)
    
    @scala.inline
    def setTemplate(value: Arn): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setWorldCount(value: WorldCount): Self = this.set("worldCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorldCount: Self = this.set("worldCount", js.undefined)
  }
}
