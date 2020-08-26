package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteReportInput extends js.Object {
  /**
    *  The ARN of the report to delete. 
    */
  var arn: NonEmptyString = js.native
}

object DeleteReportInput {
  @scala.inline
  def apply(arn: NonEmptyString): DeleteReportInput = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteReportInput]
  }
  @scala.inline
  implicit class DeleteReportInputOps[Self <: DeleteReportInput] (val x: Self) extends AnyVal {
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
    def setArn(value: NonEmptyString): Self = this.set("arn", value.asInstanceOf[js.Any])
  }
  
}

