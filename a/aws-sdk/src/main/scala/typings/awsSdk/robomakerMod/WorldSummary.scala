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
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
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
  
  inline def apply(): WorldSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorldSummary]
  }
  
  extension [Self <: WorldSummary](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setGenerationJob(value: Arn): Self = StObject.set(x, "generationJob", value.asInstanceOf[js.Any])
    
    inline def setGenerationJobUndefined: Self = StObject.set(x, "generationJob", js.undefined)
    
    inline def setTemplate(value: Arn): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
