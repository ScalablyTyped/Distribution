package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAppResponse extends js.Object {
  /**
    * The App's Amazon Resource Name (ARN).
    */
  var AppArn: js.UndefOr[typings.awsSdk.sagemakerMod.AppArn] = js.native
}

object CreateAppResponse {
  @scala.inline
  def apply(): CreateAppResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAppResponse]
  }
  @scala.inline
  implicit class CreateAppResponseOps[Self <: CreateAppResponse] (val x: Self) extends AnyVal {
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
    def setAppArn(value: AppArn): Self = this.set("AppArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppArn: Self = this.set("AppArn", js.undefined)
  }
  
}

