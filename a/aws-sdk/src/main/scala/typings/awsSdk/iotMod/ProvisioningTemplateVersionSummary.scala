package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProvisioningTemplateVersionSummary extends js.Object {
  
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
  implicit class ProvisioningTemplateVersionSummaryOps[Self <: ProvisioningTemplateVersionSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreationDate(value: DateType): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDate: Self = this.set("creationDate", js.undefined)
    
    @scala.inline
    def setIsDefaultVersion(value: IsDefaultVersion): Self = this.set("isDefaultVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDefaultVersion: Self = this.set("isDefaultVersion", js.undefined)
    
    @scala.inline
    def setVersionId(value: TemplateVersionId): Self = this.set("versionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionId: Self = this.set("versionId", js.undefined)
  }
}
