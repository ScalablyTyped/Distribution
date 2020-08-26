package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutItemInput extends js.Object {
  /**
    * The table where the message data will be written.
    */
  var tableName: TableName = js.native
}

object PutItemInput {
  @scala.inline
  def apply(tableName: TableName): PutItemInput = {
    val __obj = js.Dynamic.literal(tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutItemInput]
  }
  @scala.inline
  implicit class PutItemInputOps[Self <: PutItemInput] (val x: Self) extends AnyVal {
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
    def setTableName(value: TableName): Self = this.set("tableName", value.asInstanceOf[js.Any])
  }
  
}

