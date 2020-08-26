package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Finding extends js.Object {
  /**
    * The unique identifier for the AWS account that the finding applies to. This is typically the account that owns the affected resource.
    */
  var accountId: js.UndefOr[string] = js.native
  /**
    * Specifies whether the finding is archived.
    */
  var archived: js.UndefOr[boolean] = js.native
  /**
    * The category of the finding. Possible values are: CLASSIFICATION, for a sensitive data finding; and, POLICY, for a policy finding.
    */
  var category: js.UndefOr[FindingCategory] = js.native
  /**
    * The details of a sensitive data finding. This value is null for a policy finding.
    */
  var classificationDetails: js.UndefOr[ClassificationDetails] = js.native
  /**
    * The total number of occurrences of this finding.
    */
  var count: js.UndefOr[long] = js.native
  /**
    * The date and time, in UTC and extended ISO 8601 format, when the finding was created.
    */
  var createdAt: js.UndefOr[timestampIso8601] = js.native
  /**
    * The description of the finding.
    */
  var description: js.UndefOr[string] = js.native
  /**
    * The unique identifier for the finding. This is a random string that Amazon Macie generates and assigns to a finding when it creates the finding.
    */
  var id: js.UndefOr[string] = js.native
  /**
    * The AWS partition that Amazon Macie created the finding in.
    */
  var partition: js.UndefOr[string] = js.native
  /**
    * The details of a policy finding. This value is null for a sensitive data finding.
    */
  var policyDetails: js.UndefOr[PolicyDetails] = js.native
  /**
    * The AWS Region that Amazon Macie created the finding in.
    */
  var region: js.UndefOr[string] = js.native
  /**
    * The resources that the finding applies to.
    */
  var resourcesAffected: js.UndefOr[ResourcesAffected] = js.native
  /**
    * Specifies whether the finding is a sample finding. A sample finding is a finding that uses example data to demonstrate what a finding might contain.
    */
  var sample: js.UndefOr[boolean] = js.native
  /**
    * The version of the schema that was used to define the data structures in the finding.
    */
  var schemaVersion: js.UndefOr[string] = js.native
  /**
    * The severity of the finding.
    */
  var severity: js.UndefOr[Severity] = js.native
  /**
    * The brief description of the finding.
    */
  var title: js.UndefOr[string] = js.native
  /**
    * The type of the finding.
    */
  var `type`: js.UndefOr[FindingType] = js.native
  /**
    * The date and time, in UTC and extended ISO 8601 format, when the finding was last updated. For sensitive data findings, this value is the same as the value for the createdAt property. Sensitive data findings aren't updated.
    */
  var updatedAt: js.UndefOr[timestampIso8601] = js.native
}

object Finding {
  @scala.inline
  def apply(): Finding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Finding]
  }
  @scala.inline
  implicit class FindingOps[Self <: Finding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccountId(value: string): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setArchived(value: boolean): Self = this.set("archived", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArchived: Self = this.set("archived", js.undefined)
    @scala.inline
    def setCategory(value: FindingCategory): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    @scala.inline
    def setClassificationDetails(value: ClassificationDetails): Self = this.set("classificationDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassificationDetails: Self = this.set("classificationDetails", js.undefined)
    @scala.inline
    def setCount(value: long): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setCreatedAt(value: timestampIso8601): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    @scala.inline
    def setDescription(value: string): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setId(value: string): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setPartition(value: string): Self = this.set("partition", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartition: Self = this.set("partition", js.undefined)
    @scala.inline
    def setPolicyDetails(value: PolicyDetails): Self = this.set("policyDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyDetails: Self = this.set("policyDetails", js.undefined)
    @scala.inline
    def setRegion(value: string): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setResourcesAffected(value: ResourcesAffected): Self = this.set("resourcesAffected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourcesAffected: Self = this.set("resourcesAffected", js.undefined)
    @scala.inline
    def setSample(value: boolean): Self = this.set("sample", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSample: Self = this.set("sample", js.undefined)
    @scala.inline
    def setSchemaVersion(value: string): Self = this.set("schemaVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemaVersion: Self = this.set("schemaVersion", js.undefined)
    @scala.inline
    def setSeverity(value: Severity): Self = this.set("severity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeverity: Self = this.set("severity", js.undefined)
    @scala.inline
    def setTitle(value: string): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setType(value: FindingType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUpdatedAt(value: timestampIso8601): Self = this.set("updatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdatedAt: Self = this.set("updatedAt", js.undefined)
  }
  
}

