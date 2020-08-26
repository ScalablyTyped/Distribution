package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SqlApplicationConfigurationDescription extends js.Object {
  /**
    * The array of InputDescription objects describing the input streams used by the application.
    */
  var InputDescriptions: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.InputDescriptions] = js.native
  /**
    * The array of OutputDescription objects describing the destination streams used by the application.
    */
  var OutputDescriptions: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.OutputDescriptions] = js.native
  /**
    * The array of ReferenceDataSourceDescription objects describing the reference data sources used by the application.
    */
  var ReferenceDataSourceDescriptions: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ReferenceDataSourceDescriptions] = js.native
}

object SqlApplicationConfigurationDescription {
  @scala.inline
  def apply(): SqlApplicationConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlApplicationConfigurationDescription]
  }
  @scala.inline
  implicit class SqlApplicationConfigurationDescriptionOps[Self <: SqlApplicationConfigurationDescription] (val x: Self) extends AnyVal {
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
    def setInputDescriptionsVarargs(value: InputDescription*): Self = this.set("InputDescriptions", js.Array(value :_*))
    @scala.inline
    def setInputDescriptions(value: InputDescriptions): Self = this.set("InputDescriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputDescriptions: Self = this.set("InputDescriptions", js.undefined)
    @scala.inline
    def setOutputDescriptionsVarargs(value: OutputDescription*): Self = this.set("OutputDescriptions", js.Array(value :_*))
    @scala.inline
    def setOutputDescriptions(value: OutputDescriptions): Self = this.set("OutputDescriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputDescriptions: Self = this.set("OutputDescriptions", js.undefined)
    @scala.inline
    def setReferenceDataSourceDescriptionsVarargs(value: ReferenceDataSourceDescription*): Self = this.set("ReferenceDataSourceDescriptions", js.Array(value :_*))
    @scala.inline
    def setReferenceDataSourceDescriptions(value: ReferenceDataSourceDescriptions): Self = this.set("ReferenceDataSourceDescriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceDataSourceDescriptions: Self = this.set("ReferenceDataSourceDescriptions", js.undefined)
  }
  
}

