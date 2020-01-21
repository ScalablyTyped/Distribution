package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFaqResponse extends js.Object {
  /**
    * The date and time that the FAQ was created.
    */
  var CreatedAt: js.UndefOr[Timestamp] = js.native
  /**
    * The description of the FAQ that you provided when it was created.
    */
  var Description: js.UndefOr[typings.awsSdk.kendraMod.Description] = js.native
  /**
    * If the Status field is FAILED, the ErrorMessage field contains the reason why the FAQ failed.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.kendraMod.ErrorMessage] = js.native
  /**
    * The identifier of the FAQ.
    */
  var Id: js.UndefOr[FaqId] = js.native
  /**
    * The identifier of the index that contains the FAQ.
    */
  var IndexId: js.UndefOr[typings.awsSdk.kendraMod.IndexId] = js.native
  /**
    * The name that you gave the FAQ when it was created.
    */
  var Name: js.UndefOr[FaqName] = js.native
  /**
    * The Amazon Resource Name (ARN) of the role that provides access to the S3 bucket containing the input files for the FAQ.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.kendraMod.RoleArn] = js.native
  var S3Path: js.UndefOr[typings.awsSdk.kendraMod.S3Path] = js.native
  /**
    * The status of the FAQ. It is ready to use when the status is ACTIVE.
    */
  var Status: js.UndefOr[FaqStatus] = js.native
  /**
    * The date and time that the FAQ was last updated.
    */
  var UpdatedAt: js.UndefOr[Timestamp] = js.native
}

object DescribeFaqResponse {
  @scala.inline
  def apply(
    CreatedAt: Timestamp = null,
    Description: Description = null,
    ErrorMessage: ErrorMessage = null,
    Id: FaqId = null,
    IndexId: IndexId = null,
    Name: FaqName = null,
    RoleArn: RoleArn = null,
    S3Path: S3Path = null,
    Status: FaqStatus = null,
    UpdatedAt: Timestamp = null
  ): DescribeFaqResponse = {
    val __obj = js.Dynamic.literal()
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (IndexId != null) __obj.updateDynamic("IndexId")(IndexId.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    if (S3Path != null) __obj.updateDynamic("S3Path")(S3Path.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (UpdatedAt != null) __obj.updateDynamic("UpdatedAt")(UpdatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFaqResponse]
  }
}

