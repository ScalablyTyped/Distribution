package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Finding extends js.Object {
  /**
    * The ID of the account in which the finding was generated.
    */
  var AccountId: String = js.native
  /**
    * The ARN of the finding.
    */
  var Arn: String = js.native
  /**
    * The confidence score for the finding.
    */
  var Confidence: js.UndefOr[Double] = js.native
  /**
    * The time and date when the finding was created.
    */
  var CreatedAt: String = js.native
  /**
    * The description of the finding.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The ID of the finding.
    */
  var Id: String = js.native
  /**
    * The partition associated with the finding.
    */
  var Partition: js.UndefOr[String] = js.native
  /**
    * The Region where the finding was generated.
    */
  var Region: String = js.native
  var Resource: typings.awsSdk.guarddutyMod.Resource = js.native
  /**
    * The version of the schema used for the finding.
    */
  var SchemaVersion: String = js.native
  var Service: js.UndefOr[typings.awsSdk.guarddutyMod.Service] = js.native
  /**
    * The severity of the finding.
    */
  var Severity: Double = js.native
  /**
    * The title of the finding.
    */
  var Title: js.UndefOr[String] = js.native
  /**
    * The type of finding.
    */
  var Type: FindingType = js.native
  /**
    * The time and date when the finding was last updated.
    */
  var UpdatedAt: String = js.native
}

object Finding {
  @scala.inline
  def apply(
    AccountId: String,
    Arn: String,
    CreatedAt: String,
    Id: String,
    Region: String,
    Resource: Resource,
    SchemaVersion: String,
    Severity: Double,
    Type: FindingType,
    UpdatedAt: String
  ): Finding = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Arn = Arn.asInstanceOf[js.Any], CreatedAt = CreatedAt.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Region = Region.asInstanceOf[js.Any], Resource = Resource.asInstanceOf[js.Any], SchemaVersion = SchemaVersion.asInstanceOf[js.Any], Severity = Severity.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UpdatedAt = UpdatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Finding]
  }
  @scala.inline
  implicit class FindingOps[Self <: Finding] (val x: Self) extends AnyVal {
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
    def setAccountId(value: String): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setArn(value: String): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreatedAt(value: String): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegion(value: String): Self = this.set("Region", value.asInstanceOf[js.Any])
    @scala.inline
    def setResource(value: Resource): Self = this.set("Resource", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchemaVersion(value: String): Self = this.set("SchemaVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeverity(value: Double): Self = this.set("Severity", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: FindingType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdatedAt(value: String): Self = this.set("UpdatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfidence(value: Double): Self = this.set("Confidence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfidence: Self = this.set("Confidence", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setPartition(value: String): Self = this.set("Partition", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartition: Self = this.set("Partition", js.undefined)
    @scala.inline
    def setService(value: Service): Self = this.set("Service", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteService: Self = this.set("Service", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("Title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("Title", js.undefined)
  }
  
}

