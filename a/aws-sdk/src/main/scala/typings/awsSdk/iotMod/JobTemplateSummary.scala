package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobTemplateSummary extends StObject {
  
  /**
    * The time, in seconds since the epoch, when the job template was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A description of the job template.
    */
  var description: js.UndefOr[JobDescription] = js.undefined
  
  /**
    * The ARN of the job template.
    */
  var jobTemplateArn: js.UndefOr[JobTemplateArn] = js.undefined
  
  /**
    * The unique identifier of the job template.
    */
  var jobTemplateId: js.UndefOr[JobTemplateId] = js.undefined
}
object JobTemplateSummary {
  
  inline def apply(): JobTemplateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobTemplateSummary]
  }
  
  extension [Self <: JobTemplateSummary](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setDescription(value: JobDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setJobTemplateArn(value: JobTemplateArn): Self = StObject.set(x, "jobTemplateArn", value.asInstanceOf[js.Any])
    
    inline def setJobTemplateArnUndefined: Self = StObject.set(x, "jobTemplateArn", js.undefined)
    
    inline def setJobTemplateId(value: JobTemplateId): Self = StObject.set(x, "jobTemplateId", value.asInstanceOf[js.Any])
    
    inline def setJobTemplateIdUndefined: Self = StObject.set(x, "jobTemplateId", js.undefined)
  }
}
