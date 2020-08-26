package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeGlobalTableSettingsOutput extends js.Object {
  /**
    * The name of the global table.
    */
  var GlobalTableName: js.UndefOr[TableName] = js.native
  /**
    * The Region-specific settings for the global table.
    */
  var ReplicaSettings: js.UndefOr[ReplicaSettingsDescriptionList] = js.native
}

object DescribeGlobalTableSettingsOutput {
  @scala.inline
  def apply(): DescribeGlobalTableSettingsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeGlobalTableSettingsOutput]
  }
  @scala.inline
  implicit class DescribeGlobalTableSettingsOutputOps[Self <: DescribeGlobalTableSettingsOutput] (val x: Self) extends AnyVal {
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
    def setGlobalTableName(value: TableName): Self = this.set("GlobalTableName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalTableName: Self = this.set("GlobalTableName", js.undefined)
    @scala.inline
    def setReplicaSettingsVarargs(value: ReplicaSettingsDescription*): Self = this.set("ReplicaSettings", js.Array(value :_*))
    @scala.inline
    def setReplicaSettings(value: ReplicaSettingsDescriptionList): Self = this.set("ReplicaSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicaSettings: Self = this.set("ReplicaSettings", js.undefined)
  }
  
}

