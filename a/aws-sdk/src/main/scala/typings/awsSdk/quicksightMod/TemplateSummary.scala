package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateSummary extends StObject {
  
  /**
    * A summary of a template.
    */
  var Arn: js.UndefOr[typings.awsSdk.quicksightMod.Arn] = js.native
  
  /**
    * The last time that this template was created.
    */
  var CreatedTime: js.UndefOr[Timestamp_] = js.native
  
  /**
    * The last time that this template was updated.
    */
  var LastUpdatedTime: js.UndefOr[Timestamp_] = js.native
  
  /**
    * A structure containing a list of version numbers for the template summary.
    */
  var LatestVersionNumber: js.UndefOr[VersionNumber] = js.native
  
  /**
    * A display name for the template.
    */
  var Name: js.UndefOr[TemplateName] = js.native
  
  /**
    * The ID of the template. This ID is unique per AWS Region for each AWS account.
    */
  var TemplateId: js.UndefOr[RestrictiveResourceId] = js.native
}
object TemplateSummary {
  
  @scala.inline
  def apply(): TemplateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateSummary]
  }
  
  @scala.inline
  implicit class TemplateSummaryMutableBuilder[Self <: TemplateSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: Timestamp_): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    @scala.inline
    def setLastUpdatedTime(value: Timestamp_): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    @scala.inline
    def setLatestVersionNumber(value: VersionNumber): Self = StObject.set(x, "LatestVersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestVersionNumberUndefined: Self = StObject.set(x, "LatestVersionNumber", js.undefined)
    
    @scala.inline
    def setName(value: TemplateName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setTemplateId(value: RestrictiveResourceId): Self = StObject.set(x, "TemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateIdUndefined: Self = StObject.set(x, "TemplateId", js.undefined)
  }
}
