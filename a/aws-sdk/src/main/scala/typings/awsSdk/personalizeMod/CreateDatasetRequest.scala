package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDatasetRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dataset group to add the dataset to.
    */
  var datasetGroupArn: Arn = js.native
  /**
    * The type of dataset. One of the following (case insensitive) values:   Interactions   Items   Users  
    */
  var datasetType: DatasetType = js.native
  /**
    * The name for the dataset.
    */
  var name: Name = js.native
  /**
    * The ARN of the schema to associate with the dataset. The schema defines the dataset fields.
    */
  var schemaArn: Arn = js.native
}

object CreateDatasetRequest {
  @scala.inline
  def apply(datasetGroupArn: Arn, datasetType: DatasetType, name: Name, schemaArn: Arn): CreateDatasetRequest = {
    val __obj = js.Dynamic.literal(datasetGroupArn = datasetGroupArn.asInstanceOf[js.Any], datasetType = datasetType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schemaArn = schemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDatasetRequest]
  }
  @scala.inline
  implicit class CreateDatasetRequestOps[Self <: CreateDatasetRequest] (val x: Self) extends AnyVal {
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
    def setDatasetGroupArn(value: Arn): Self = this.set("datasetGroupArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setDatasetType(value: DatasetType): Self = this.set("datasetType", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchemaArn(value: Arn): Self = this.set("schemaArn", value.asInstanceOf[js.Any])
  }
  
}

