package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDatasetGroupRequest extends js.Object {
  /**
    * An array of Amazon Resource Names (ARNs) of the datasets that you want to include in the dataset group.
    */
  var DatasetArns: js.UndefOr[ArnList] = js.native
  /**
    * A name for the dataset group.
    */
  var DatasetGroupName: Name = js.native
  /**
    * The domain associated with the dataset group. When you add a dataset to a dataset group, this value and the value specified for the Domain parameter of the CreateDataset operation must match. The Domain and DatasetType that you choose determine the fields that must be present in training data that you import to a dataset. For example, if you choose the RETAIL domain and TARGET_TIME_SERIES as the DatasetType, Amazon Forecast requires that item_id, timestamp, and demand fields are present in your data. For more information, see howitworks-datasets-groups.
    */
  var Domain: typings.awsSdk.forecastserviceMod.Domain = js.native
  /**
    * The optional metadata that you apply to the dataset group to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. The following basic restrictions apply to tags:   Maximum number of tags per resource - 50.   For each resource, each tag key must be unique, and each tag key can have only one value.   Maximum key length - 128 Unicode characters in UTF-8.   Maximum value length - 256 Unicode characters in UTF-8.   If your tagging schema is used across multiple services and resources, remember that other services may have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : / @.   Tag keys and values are case sensitive.   Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for keys as it is reserved for AWS use. You cannot edit or delete tag keys with this prefix. Values can have this prefix. If a tag value has aws as its prefix but the key does not, then Forecast considers it to be a user tag and will count against the limit of 50 tags. Tags with only the key prefix of aws do not count against your tags per resource limit.  
    */
  var Tags: js.UndefOr[typings.awsSdk.forecastserviceMod.Tags] = js.native
}

object CreateDatasetGroupRequest {
  @scala.inline
  def apply(DatasetGroupName: Name, Domain: Domain): CreateDatasetGroupRequest = {
    val __obj = js.Dynamic.literal(DatasetGroupName = DatasetGroupName.asInstanceOf[js.Any], Domain = Domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDatasetGroupRequest]
  }
  @scala.inline
  implicit class CreateDatasetGroupRequestOps[Self <: CreateDatasetGroupRequest] (val x: Self) extends AnyVal {
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
    def setDatasetGroupName(value: Name): Self = this.set("DatasetGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomain(value: Domain): Self = this.set("Domain", value.asInstanceOf[js.Any])
    @scala.inline
    def setDatasetArnsVarargs(value: Arn*): Self = this.set("DatasetArns", js.Array(value :_*))
    @scala.inline
    def setDatasetArns(value: ArnList): Self = this.set("DatasetArns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasetArns: Self = this.set("DatasetArns", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

