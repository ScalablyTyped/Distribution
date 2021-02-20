package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlowTemplateSummary extends StObject {
  
  /**
    * The ARN of the workflow.
    */
  var arn: js.UndefOr[Arn] = js.native
  
  /**
    * The date when the workflow was created.
    */
  var createdAt: js.UndefOr[Timestamp] = js.native
  
  /**
    * The ID of the workflow.
    */
  var id: js.UndefOr[Urn] = js.native
  
  /**
    * The revision number of the workflow.
    */
  var revisionNumber: js.UndefOr[Version] = js.native
}
object FlowTemplateSummary {
  
  @scala.inline
  def apply(): FlowTemplateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlowTemplateSummary]
  }
  
  @scala.inline
  implicit class FlowTemplateSummaryMutableBuilder[Self <: FlowTemplateSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: Timestamp): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setId(value: Urn): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setRevisionNumber(value: Version): Self = StObject.set(x, "revisionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionNumberUndefined: Self = StObject.set(x, "revisionNumber", js.undefined)
  }
}
