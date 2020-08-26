package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBundleTasksResult extends js.Object {
  /**
    * Information about the bundle tasks.
    */
  var BundleTasks: js.UndefOr[BundleTaskList] = js.native
}

object DescribeBundleTasksResult {
  @scala.inline
  def apply(): DescribeBundleTasksResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBundleTasksResult]
  }
  @scala.inline
  implicit class DescribeBundleTasksResultOps[Self <: DescribeBundleTasksResult] (val x: Self) extends AnyVal {
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
    def setBundleTasksVarargs(value: BundleTask*): Self = this.set("BundleTasks", js.Array(value :_*))
    @scala.inline
    def setBundleTasks(value: BundleTaskList): Self = this.set("BundleTasks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBundleTasks: Self = this.set("BundleTasks", js.undefined)
  }
  
}

