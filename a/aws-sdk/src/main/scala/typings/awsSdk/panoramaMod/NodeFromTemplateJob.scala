package typings.awsSdk.panoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeFromTemplateJob extends StObject {
  
  /**
    * When the job was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The job's ID.
    */
  var JobId: js.UndefOr[typings.awsSdk.panoramaMod.JobId] = js.undefined
  
  /**
    * The node's name.
    */
  var NodeName: js.UndefOr[typings.awsSdk.panoramaMod.NodeName] = js.undefined
  
  /**
    * The job's status.
    */
  var Status: js.UndefOr[NodeFromTemplateJobStatus] = js.undefined
  
  /**
    * The job's status message.
    */
  var StatusMessage: js.UndefOr[NodeFromTemplateJobStatusMessage] = js.undefined
  
  /**
    * The job's template type.
    */
  var TemplateType: js.UndefOr[typings.awsSdk.panoramaMod.TemplateType] = js.undefined
}
object NodeFromTemplateJob {
  
  inline def apply(): NodeFromTemplateJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeFromTemplateJob]
  }
  
  extension [Self <: NodeFromTemplateJob](x: Self) {
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    inline def setNodeName(value: NodeName): Self = StObject.set(x, "NodeName", value.asInstanceOf[js.Any])
    
    inline def setNodeNameUndefined: Self = StObject.set(x, "NodeName", js.undefined)
    
    inline def setStatus(value: NodeFromTemplateJobStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: NodeFromTemplateJobStatusMessage): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTemplateType(value: TemplateType): Self = StObject.set(x, "TemplateType", value.asInstanceOf[js.Any])
    
    inline def setTemplateTypeUndefined: Self = StObject.set(x, "TemplateType", js.undefined)
  }
}
