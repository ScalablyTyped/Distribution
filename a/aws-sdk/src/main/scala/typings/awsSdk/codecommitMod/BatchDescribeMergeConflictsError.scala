package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDescribeMergeConflictsError extends js.Object {
  /**
    * The name of the exception.
    */
  var exceptionName: ExceptionName = js.native
  /**
    * The path to the file.
    */
  var filePath: Path = js.native
  /**
    * The message provided by the exception.
    */
  var message: Message = js.native
}

object BatchDescribeMergeConflictsError {
  @scala.inline
  def apply(exceptionName: ExceptionName, filePath: Path, message: Message): BatchDescribeMergeConflictsError = {
    val __obj = js.Dynamic.literal(exceptionName = exceptionName.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDescribeMergeConflictsError]
  }
  @scala.inline
  implicit class BatchDescribeMergeConflictsErrorOps[Self <: BatchDescribeMergeConflictsError] (val x: Self) extends AnyVal {
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
    def setExceptionName(value: ExceptionName): Self = this.set("exceptionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilePath(value: Path): Self = this.set("filePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: Message): Self = this.set("message", value.asInstanceOf[js.Any])
  }
  
}

