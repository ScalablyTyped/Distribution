package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorldGenerationJobSummary extends StObject {
  
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
  implicit class WorldGenerationJobSummaryMutableBuilder[Self <: WorldGenerationJobSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: CreatedAt): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setFailedWorldCount(value: Integer): Self = StObject.set(x, "failedWorldCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedWorldCountUndefined: Self = StObject.set(x, "failedWorldCount", js.undefined)
    
    @scala.inline
    def setStatus(value: WorldGenerationJobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setSucceededWorldCount(value: Integer): Self = StObject.set(x, "succeededWorldCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSucceededWorldCountUndefined: Self = StObject.set(x, "succeededWorldCount", js.undefined)
    
    @scala.inline
    def setTemplate(value: Arn): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setWorldCount(value: WorldCount): Self = StObject.set(x, "worldCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorldCountUndefined: Self = StObject.set(x, "worldCount", js.undefined)
  }
}
