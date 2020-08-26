package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SqlApplicationConfiguration extends js.Object {
  /**
    * The array of Input objects describing the input streams used by the application.
    */
  var Inputs: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.Inputs] = js.native
  /**
    * The array of Output objects describing the destination streams used by the application.
    */
  var Outputs: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.Outputs] = js.native
  /**
    * The array of ReferenceDataSource objects describing the reference data sources used by the application.
    */
  var ReferenceDataSources: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ReferenceDataSources] = js.native
}

object SqlApplicationConfiguration {
  @scala.inline
  def apply(): SqlApplicationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlApplicationConfiguration]
  }
  @scala.inline
  implicit class SqlApplicationConfigurationOps[Self <: SqlApplicationConfiguration] (val x: Self) extends AnyVal {
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
    def setInputsVarargs(value: Input*): Self = this.set("Inputs", js.Array(value :_*))
    @scala.inline
    def setInputs(value: Inputs): Self = this.set("Inputs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputs: Self = this.set("Inputs", js.undefined)
    @scala.inline
    def setOutputsVarargs(value: Output*): Self = this.set("Outputs", js.Array(value :_*))
    @scala.inline
    def setOutputs(value: Outputs): Self = this.set("Outputs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputs: Self = this.set("Outputs", js.undefined)
    @scala.inline
    def setReferenceDataSourcesVarargs(value: ReferenceDataSource*): Self = this.set("ReferenceDataSources", js.Array(value :_*))
    @scala.inline
    def setReferenceDataSources(value: ReferenceDataSources): Self = this.set("ReferenceDataSources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceDataSources: Self = this.set("ReferenceDataSources", js.undefined)
  }
  
}

