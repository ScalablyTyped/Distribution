package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTableOutput extends js.Object {
  /**
    * Represents the properties of the table.
    */
  var TableDescription: js.UndefOr[typings.awsSdk.dynamodbMod.TableDescription] = js.native
}

object CreateTableOutput {
  @scala.inline
  def apply(): CreateTableOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTableOutput]
  }
  @scala.inline
  implicit class CreateTableOutputOps[Self <: CreateTableOutput] (val x: Self) extends AnyVal {
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
    def setTableDescription(value: TableDescription): Self = this.set("TableDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableDescription: Self = this.set("TableDescription", js.undefined)
  }
  
}

