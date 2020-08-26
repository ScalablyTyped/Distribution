package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutResourcePolicyOutput extends js.Object {
  /**
    *  The ARN of the Project or ReportGroup resource that is associated with a resource policy. 
    */
  var resourceArn: js.UndefOr[NonEmptyString] = js.native
}

object PutResourcePolicyOutput {
  @scala.inline
  def apply(): PutResourcePolicyOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutResourcePolicyOutput]
  }
  @scala.inline
  implicit class PutResourcePolicyOutputOps[Self <: PutResourcePolicyOutput] (val x: Self) extends AnyVal {
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
    def setResourceArn(value: NonEmptyString): Self = this.set("resourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceArn: Self = this.set("resourceArn", js.undefined)
  }
  
}

