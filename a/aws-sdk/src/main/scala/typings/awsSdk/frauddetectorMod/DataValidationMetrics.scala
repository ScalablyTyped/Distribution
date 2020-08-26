package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataValidationMetrics extends js.Object {
  /**
    * The field-specific model training validation messages.
    */
  var fieldLevelMessages: js.UndefOr[fieldValidationMessageList] = js.native
  /**
    * The file-specific model training validation messages.
    */
  var fileLevelMessages: js.UndefOr[fileValidationMessageList] = js.native
}

object DataValidationMetrics {
  @scala.inline
  def apply(): DataValidationMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataValidationMetrics]
  }
  @scala.inline
  implicit class DataValidationMetricsOps[Self <: DataValidationMetrics] (val x: Self) extends AnyVal {
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
    def setFieldLevelMessagesVarargs(value: FieldValidationMessage*): Self = this.set("fieldLevelMessages", js.Array(value :_*))
    @scala.inline
    def setFieldLevelMessages(value: fieldValidationMessageList): Self = this.set("fieldLevelMessages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldLevelMessages: Self = this.set("fieldLevelMessages", js.undefined)
    @scala.inline
    def setFileLevelMessagesVarargs(value: FileValidationMessage*): Self = this.set("fileLevelMessages", js.Array(value :_*))
    @scala.inline
    def setFileLevelMessages(value: fileValidationMessageList): Self = this.set("fileLevelMessages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileLevelMessages: Self = this.set("fileLevelMessages", js.undefined)
  }
  
}

