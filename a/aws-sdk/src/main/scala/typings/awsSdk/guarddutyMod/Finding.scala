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
    UpdatedAt: String,
    Confidence: js.UndefOr[Double] = js.undefined,
    Description: String = null,
    Partition: String = null,
    Service: Service = null,
    Title: String = null
  ): Finding = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Arn = Arn.asInstanceOf[js.Any], CreatedAt = CreatedAt.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Region = Region.asInstanceOf[js.Any], Resource = Resource.asInstanceOf[js.Any], SchemaVersion = SchemaVersion.asInstanceOf[js.Any], Severity = Severity.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UpdatedAt = UpdatedAt.asInstanceOf[js.Any])
    if (!js.isUndefined(Confidence)) __obj.updateDynamic("Confidence")(Confidence.get.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Partition != null) __obj.updateDynamic("Partition")(Partition.asInstanceOf[js.Any])
    if (Service != null) __obj.updateDynamic("Service")(Service.asInstanceOf[js.Any])
    if (Title != null) __obj.updateDynamic("Title")(Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Finding]
  }
}

