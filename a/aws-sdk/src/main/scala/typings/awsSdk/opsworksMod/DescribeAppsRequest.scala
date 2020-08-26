package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAppsRequest extends js.Object {
  /**
    * An array of app IDs for the apps to be described. If you use this parameter, DescribeApps returns a description of the specified apps. Otherwise, it returns a description of every app.
    */
  var AppIds: js.UndefOr[Strings] = js.native
  /**
    * The app stack ID. If you use this parameter, DescribeApps returns a description of the apps in the specified stack.
    */
  var StackId: js.UndefOr[String] = js.native
}

object DescribeAppsRequest {
  @scala.inline
  def apply(): DescribeAppsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAppsRequest]
  }
  @scala.inline
  implicit class DescribeAppsRequestOps[Self <: DescribeAppsRequest] (val x: Self) extends AnyVal {
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
    def setAppIdsVarargs(value: String*): Self = this.set("AppIds", js.Array(value :_*))
    @scala.inline
    def setAppIds(value: Strings): Self = this.set("AppIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppIds: Self = this.set("AppIds", js.undefined)
    @scala.inline
    def setStackId(value: String): Self = this.set("StackId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackId: Self = this.set("StackId", js.undefined)
  }
  
}

