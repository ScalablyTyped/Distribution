package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateProjectRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the project whose name to update.
    */
  var arn: AmazonResourceName = js.native
  /**
    * The number of minutes a test run in the project executes before it times out.
    */
  var defaultJobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.native
  /**
    * A string that represents the new name of the project that you are updating.
    */
  var name: js.UndefOr[Name] = js.native
}

object UpdateProjectRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): UpdateProjectRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProjectRequest]
  }
  @scala.inline
  implicit class UpdateProjectRequestOps[Self <: UpdateProjectRequest] (val x: Self) extends AnyVal {
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
    def setArn(value: AmazonResourceName): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultJobTimeoutMinutes(value: JobTimeoutMinutes): Self = this.set("defaultJobTimeoutMinutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultJobTimeoutMinutes: Self = this.set("defaultJobTimeoutMinutes", js.undefined)
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

