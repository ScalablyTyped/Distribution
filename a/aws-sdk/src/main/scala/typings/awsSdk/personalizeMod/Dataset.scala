package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dataset extends js.Object {
  /**
    * The creation date and time (in Unix time) of the dataset.
    */
  var creationDateTime: js.UndefOr[Date] = js.native
  /**
    * The Amazon Resource Name (ARN) of the dataset that you want metadata for.
    */
  var datasetArn: js.UndefOr[Arn] = js.native
  /**
    * The Amazon Resource Name (ARN) of the dataset group.
    */
  var datasetGroupArn: js.UndefOr[Arn] = js.native
  /**
    * One of the following values:   Interactions   Items   Users  
    */
  var datasetType: js.UndefOr[DatasetType] = js.native
  /**
    * A time stamp that shows when the dataset was updated.
    */
  var lastUpdatedDateTime: js.UndefOr[Date] = js.native
  /**
    * The name of the dataset.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * The ARN of the associated schema.
    */
  var schemaArn: js.UndefOr[Arn] = js.native
  /**
    * The status of the dataset. A dataset can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING &gt; DELETE IN_PROGRESS  
    */
  var status: js.UndefOr[Status] = js.native
}

object Dataset {
  @scala.inline
  def apply(): Dataset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dataset]
  }
  @scala.inline
  implicit class DatasetOps[Self <: Dataset] (val x: Self) extends AnyVal {
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
    def setCreationDateTime(value: Date): Self = this.set("creationDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDateTime: Self = this.set("creationDateTime", js.undefined)
    @scala.inline
    def setDatasetArn(value: Arn): Self = this.set("datasetArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasetArn: Self = this.set("datasetArn", js.undefined)
    @scala.inline
    def setDatasetGroupArn(value: Arn): Self = this.set("datasetGroupArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasetGroupArn: Self = this.set("datasetGroupArn", js.undefined)
    @scala.inline
    def setDatasetType(value: DatasetType): Self = this.set("datasetType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasetType: Self = this.set("datasetType", js.undefined)
    @scala.inline
    def setLastUpdatedDateTime(value: Date): Self = this.set("lastUpdatedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedDateTime: Self = this.set("lastUpdatedDateTime", js.undefined)
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSchemaArn(value: Arn): Self = this.set("schemaArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemaArn: Self = this.set("schemaArn", js.undefined)
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

