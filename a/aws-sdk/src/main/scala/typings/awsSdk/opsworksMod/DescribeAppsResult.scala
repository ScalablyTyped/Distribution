package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAppsResult extends js.Object {
  /**
    * An array of App objects that describe the specified apps. 
    */
  var Apps: js.UndefOr[typings.awsSdk.opsworksMod.Apps] = js.native
}

object DescribeAppsResult {
  @scala.inline
  def apply(): DescribeAppsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAppsResult]
  }
  @scala.inline
  implicit class DescribeAppsResultOps[Self <: DescribeAppsResult] (val x: Self) extends AnyVal {
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
    def setAppsVarargs(value: App*): Self = this.set("Apps", js.Array(value :_*))
    @scala.inline
    def setApps(value: Apps): Self = this.set("Apps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApps: Self = this.set("Apps", js.undefined)
  }
  
}

