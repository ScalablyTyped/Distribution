package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BundleInstanceResult extends js.Object {
  /**
    * Information about the bundle task.
    */
  var BundleTask: js.UndefOr[typings.awsSdk.ec2Mod.BundleTask] = js.native
}

object BundleInstanceResult {
  @scala.inline
  def apply(): BundleInstanceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BundleInstanceResult]
  }
  @scala.inline
  implicit class BundleInstanceResultOps[Self <: BundleInstanceResult] (val x: Self) extends AnyVal {
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
    def setBundleTask(value: BundleTask): Self = this.set("BundleTask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBundleTask: Self = this.set("BundleTask", js.undefined)
  }
  
}

