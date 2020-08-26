package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetApplicationOutput extends js.Object {
  /**
    * Information about the application.
    */
  var application: js.UndefOr[ApplicationInfo] = js.native
}

object GetApplicationOutput {
  @scala.inline
  def apply(): GetApplicationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetApplicationOutput]
  }
  @scala.inline
  implicit class GetApplicationOutputOps[Self <: GetApplicationOutput] (val x: Self) extends AnyVal {
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
    def setApplication(value: ApplicationInfo): Self = this.set("application", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplication: Self = this.set("application", js.undefined)
  }
  
}

