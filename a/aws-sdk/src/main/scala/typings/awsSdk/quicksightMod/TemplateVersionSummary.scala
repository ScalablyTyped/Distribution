package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateVersionSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the template version.
    */
  var Arn: js.UndefOr[typings.awsSdk.quicksightMod.Arn] = js.undefined
  
  /**
    * The time that this template version was created.
    */
  var CreatedTime: js.UndefOr[Timestamp_] = js.undefined
  
  /**
    * The description of the template version.
    */
  var Description: js.UndefOr[VersionDescription] = js.undefined
  
  /**
    * The status of the template version.
    */
  var Status: js.UndefOr[ResourceStatus] = js.undefined
  
  /**
    * The version number of the template version.
    */
  var VersionNumber: js.UndefOr[typings.awsSdk.quicksightMod.VersionNumber] = js.undefined
}
object TemplateVersionSummary {
  
  @scala.inline
  def apply(): TemplateVersionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateVersionSummary]
  }
  
  @scala.inline
  implicit class TemplateVersionSummaryMutableBuilder[Self <: TemplateVersionSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: Timestamp_): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    @scala.inline
    def setDescription(value: VersionDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setStatus(value: ResourceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setVersionNumber(value: VersionNumber): Self = StObject.set(x, "VersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNumberUndefined: Self = StObject.set(x, "VersionNumber", js.undefined)
  }
}
