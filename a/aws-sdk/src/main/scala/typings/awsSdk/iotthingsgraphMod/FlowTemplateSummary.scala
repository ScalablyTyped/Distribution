package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlowTemplateSummary extends StObject {
  
  /**
    * The ARN of the workflow.
    */
  var arn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The date when the workflow was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the workflow.
    */
  var id: js.UndefOr[Urn] = js.undefined
  
  /**
    * The revision number of the workflow.
    */
  var revisionNumber: js.UndefOr[Version] = js.undefined
}
object FlowTemplateSummary {
  
  inline def apply(): FlowTemplateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlowTemplateSummary]
  }
  
  extension [Self <: FlowTemplateSummary](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setId(value: Urn): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setRevisionNumber(value: Version): Self = StObject.set(x, "revisionNumber", value.asInstanceOf[js.Any])
    
    inline def setRevisionNumberUndefined: Self = StObject.set(x, "revisionNumber", js.undefined)
  }
}
