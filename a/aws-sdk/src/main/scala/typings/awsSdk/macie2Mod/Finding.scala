package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Finding extends js.Object {
  /**
    * The identifier for the AWS account that the finding applies to. This is typically the account that owns the affected resource.
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
  def apply(
    accountId: string = null,
    archived: js.UndefOr[boolean] = js.undefined,
    category: FindingCategory = null,
    classificationDetails: ClassificationDetails = null,
    count: js.UndefOr[long] = js.undefined,
    createdAt: timestampIso8601 = null,
    description: string = null,
    id: string = null,
    partition: string = null,
    policyDetails: PolicyDetails = null,
    region: string = null,
    resourcesAffected: ResourcesAffected = null,
    sample: js.UndefOr[boolean] = js.undefined,
    schemaVersion: string = null,
    severity: Severity = null,
    title: string = null,
    `type`: FindingType = null,
    updatedAt: timestampIso8601 = null
  ): Finding = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (!js.isUndefined(archived)) __obj.updateDynamic("archived")(archived.get.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (classificationDetails != null) __obj.updateDynamic("classificationDetails")(classificationDetails.asInstanceOf[js.Any])
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (partition != null) __obj.updateDynamic("partition")(partition.asInstanceOf[js.Any])
    if (policyDetails != null) __obj.updateDynamic("policyDetails")(policyDetails.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (resourcesAffected != null) __obj.updateDynamic("resourcesAffected")(resourcesAffected.asInstanceOf[js.Any])
    if (!js.isUndefined(sample)) __obj.updateDynamic("sample")(sample.get.asInstanceOf[js.Any])
    if (schemaVersion != null) __obj.updateDynamic("schemaVersion")(schemaVersion.asInstanceOf[js.Any])
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (updatedAt != null) __obj.updateDynamic("updatedAt")(updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Finding]
  }
}

