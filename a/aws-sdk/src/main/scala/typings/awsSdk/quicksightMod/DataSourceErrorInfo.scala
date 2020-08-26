package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceErrorInfo extends js.Object {
  /**
    * Error message.
    */
  var Message: js.UndefOr[String] = js.native
  /**
    * Error type.
    */
  var Type: js.UndefOr[DataSourceErrorInfoType] = js.native
}

object DataSourceErrorInfo {
  @scala.inline
  def apply(): DataSourceErrorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceErrorInfo]
  }
  @scala.inline
  implicit class DataSourceErrorInfoOps[Self <: DataSourceErrorInfo] (val x: Self) extends AnyVal {
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
    def setMessage(value: String): Self = this.set("Message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
    @scala.inline
    def setType(value: DataSourceErrorInfoType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

