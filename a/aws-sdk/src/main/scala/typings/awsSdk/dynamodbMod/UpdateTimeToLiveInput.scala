package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTimeToLiveInput extends js.Object {
  /**
    * The name of the table to be configured.
    */
  var TableName: typings.awsSdk.dynamodbMod.TableName = js.native
  /**
    * Represents the settings used to enable or disable Time to Live for the specified table.
    */
  var TimeToLiveSpecification: typings.awsSdk.dynamodbMod.TimeToLiveSpecification = js.native
}

object UpdateTimeToLiveInput {
  @scala.inline
  def apply(TableName: TableName, TimeToLiveSpecification: TimeToLiveSpecification): UpdateTimeToLiveInput = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any], TimeToLiveSpecification = TimeToLiveSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTimeToLiveInput]
  }
  @scala.inline
  implicit class UpdateTimeToLiveInputOps[Self <: UpdateTimeToLiveInput] (val x: Self) extends AnyVal {
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
    def setTableName(value: TableName): Self = this.set("TableName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeToLiveSpecification(value: TimeToLiveSpecification): Self = this.set("TimeToLiveSpecification", value.asInstanceOf[js.Any])
  }
  
}

