package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SqlApplicationConfigurationUpdate extends js.Object {
  /**
    * The array of InputUpdate objects describing the new input streams used by the application.
    */
  var InputUpdates: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.InputUpdates] = js.native
  /**
    * The array of OutputUpdate objects describing the new destination streams used by the application.
    */
  var OutputUpdates: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.OutputUpdates] = js.native
  /**
    * The array of ReferenceDataSourceUpdate objects describing the new reference data sources used by the application.
    */
  var ReferenceDataSourceUpdates: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ReferenceDataSourceUpdates] = js.native
}

object SqlApplicationConfigurationUpdate {
  @scala.inline
  def apply(): SqlApplicationConfigurationUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlApplicationConfigurationUpdate]
  }
  @scala.inline
  implicit class SqlApplicationConfigurationUpdateOps[Self <: SqlApplicationConfigurationUpdate] (val x: Self) extends AnyVal {
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
    def setInputUpdatesVarargs(value: InputUpdate*): Self = this.set("InputUpdates", js.Array(value :_*))
    @scala.inline
    def setInputUpdates(value: InputUpdates): Self = this.set("InputUpdates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputUpdates: Self = this.set("InputUpdates", js.undefined)
    @scala.inline
    def setOutputUpdatesVarargs(value: OutputUpdate*): Self = this.set("OutputUpdates", js.Array(value :_*))
    @scala.inline
    def setOutputUpdates(value: OutputUpdates): Self = this.set("OutputUpdates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputUpdates: Self = this.set("OutputUpdates", js.undefined)
    @scala.inline
    def setReferenceDataSourceUpdatesVarargs(value: ReferenceDataSourceUpdate*): Self = this.set("ReferenceDataSourceUpdates", js.Array(value :_*))
    @scala.inline
    def setReferenceDataSourceUpdates(value: ReferenceDataSourceUpdates): Self = this.set("ReferenceDataSourceUpdates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceDataSourceUpdates: Self = this.set("ReferenceDataSourceUpdates", js.undefined)
  }
  
}

