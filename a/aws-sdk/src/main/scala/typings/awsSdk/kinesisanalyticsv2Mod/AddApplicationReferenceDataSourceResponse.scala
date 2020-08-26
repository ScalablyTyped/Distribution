package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddApplicationReferenceDataSourceResponse extends js.Object {
  /**
    * The application Amazon Resource Name (ARN).
    */
  var ApplicationARN: js.UndefOr[ResourceARN] = js.native
  /**
    * The updated application version ID. Amazon Kinesis Data Analytics increments this ID when the application is updated.
    */
  var ApplicationVersionId: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ApplicationVersionId] = js.native
  /**
    * Describes reference data sources configured for the application. 
    */
  var ReferenceDataSourceDescriptions: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ReferenceDataSourceDescriptions] = js.native
}

object AddApplicationReferenceDataSourceResponse {
  @scala.inline
  def apply(): AddApplicationReferenceDataSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddApplicationReferenceDataSourceResponse]
  }
  @scala.inline
  implicit class AddApplicationReferenceDataSourceResponseOps[Self <: AddApplicationReferenceDataSourceResponse] (val x: Self) extends AnyVal {
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
    def setApplicationARN(value: ResourceARN): Self = this.set("ApplicationARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationARN: Self = this.set("ApplicationARN", js.undefined)
    @scala.inline
    def setApplicationVersionId(value: ApplicationVersionId): Self = this.set("ApplicationVersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationVersionId: Self = this.set("ApplicationVersionId", js.undefined)
    @scala.inline
    def setReferenceDataSourceDescriptionsVarargs(value: ReferenceDataSourceDescription*): Self = this.set("ReferenceDataSourceDescriptions", js.Array(value :_*))
    @scala.inline
    def setReferenceDataSourceDescriptions(value: ReferenceDataSourceDescriptions): Self = this.set("ReferenceDataSourceDescriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceDataSourceDescriptions: Self = this.set("ReferenceDataSourceDescriptions", js.undefined)
  }
  
}

