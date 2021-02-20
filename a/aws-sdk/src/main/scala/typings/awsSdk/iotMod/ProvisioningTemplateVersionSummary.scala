package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProvisioningTemplateVersionSummary extends StObject {
  
  /**
    * The date when the fleet provisioning template version was created
    */
  var creationDate: js.UndefOr[DateType] = js.native
  
  /**
    * True if the fleet provisioning template version is the default version, otherwise false.
    */
  var isDefaultVersion: js.UndefOr[IsDefaultVersion] = js.native
  
  /**
    * The ID of the fleet privisioning template version.
    */
  var versionId: js.UndefOr[TemplateVersionId] = js.native
}
object ProvisioningTemplateVersionSummary {
  
  @scala.inline
  def apply(): ProvisioningTemplateVersionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisioningTemplateVersionSummary]
  }
  
  @scala.inline
  implicit class ProvisioningTemplateVersionSummaryMutableBuilder[Self <: ProvisioningTemplateVersionSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDate(value: DateType): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    @scala.inline
    def setIsDefaultVersion(value: IsDefaultVersion): Self = StObject.set(x, "isDefaultVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDefaultVersionUndefined: Self = StObject.set(x, "isDefaultVersion", js.undefined)
    
    @scala.inline
    def setVersionId(value: TemplateVersionId): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
  }
}
