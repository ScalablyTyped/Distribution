package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeProvisioningTemplateVersionResponse extends js.Object {
  
  /**
    * The date when the fleet provisioning template version was created.
    */
  var creationDate: js.UndefOr[DateType] = js.native
  
  /**
    * True if the fleet provisioning template version is the default version.
    */
  var isDefaultVersion: js.UndefOr[IsDefaultVersion] = js.native
  
  /**
    * The JSON formatted contents of the fleet provisioning template version.
    */
  var templateBody: js.UndefOr[TemplateBody] = js.native
  
  /**
    * The fleet provisioning template version ID.
    */
  var versionId: js.UndefOr[TemplateVersionId] = js.native
}
object DescribeProvisioningTemplateVersionResponse {
  
  @scala.inline
  def apply(): DescribeProvisioningTemplateVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProvisioningTemplateVersionResponse]
  }
  
  @scala.inline
  implicit class DescribeProvisioningTemplateVersionResponseOps[Self <: DescribeProvisioningTemplateVersionResponse] (val x: Self) extends AnyVal {
    
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
    def setTemplateBody(value: TemplateBody): Self = this.set("templateBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateBody: Self = this.set("templateBody", js.undefined)
    
    @scala.inline
    def setVersionId(value: TemplateVersionId): Self = this.set("versionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionId: Self = this.set("versionId", js.undefined)
  }
}
