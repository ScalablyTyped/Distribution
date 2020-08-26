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
  def apply(): DescribeFaqResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFaqResponse]
  }
  @scala.inline
  implicit class DescribeFaqResponseOps[Self <: DescribeFaqResponse] (val x: Self) extends AnyVal {
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
    def setCreatedAt(value: Timestamp): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("CreatedAt", js.undefined)
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setErrorMessage(value: ErrorMessage): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("ErrorMessage", js.undefined)
    @scala.inline
    def setId(value: FaqId): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setIndexId(value: IndexId): Self = this.set("IndexId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndexId: Self = this.set("IndexId", js.undefined)
    @scala.inline
    def setName(value: FaqName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleArn: Self = this.set("RoleArn", js.undefined)
    @scala.inline
    def setS3Path(value: S3Path): Self = this.set("S3Path", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3Path: Self = this.set("S3Path", js.undefined)
    @scala.inline
    def setStatus(value: FaqStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setUpdatedAt(value: Timestamp): Self = this.set("UpdatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdatedAt: Self = this.set("UpdatedAt", js.undefined)
  }
  
}

