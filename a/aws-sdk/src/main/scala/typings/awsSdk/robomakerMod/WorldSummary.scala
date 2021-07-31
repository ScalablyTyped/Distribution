package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorldSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the world.
    */
  var arn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The time, in milliseconds since the epoch, when the world was created.
    */
  var createdAt: js.UndefOr[CreatedAt] = js.undefined
  
  /**
    * The Amazon Resource Name (arn) of the world generation job.
    */
  var generationJob: js.UndefOr[Arn] = js.undefined
  
  /**
    * The Amazon Resource Name (arn) of the world template.
    */
  var template: js.UndefOr[Arn] = js.undefined
}
object WorldSummary {
  
  @scala.inline
  def apply(): WorldSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorldSummary]
  }
  
  @scala.inline
  implicit class WorldSummaryMutableBuilder[Self <: WorldSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: CreatedAt): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setGenerationJob(value: Arn): Self = StObject.set(x, "generationJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerationJobUndefined: Self = StObject.set(x, "generationJob", js.undefined)
    
    @scala.inline
    def setTemplate(value: Arn): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
