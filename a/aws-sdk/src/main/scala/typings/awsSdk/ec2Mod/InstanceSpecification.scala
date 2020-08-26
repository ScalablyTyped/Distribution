package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceSpecification extends js.Object {
  /**
    * Excludes the root volume from being snapshotted.
    */
  var ExcludeBootVolume: js.UndefOr[Boolean] = js.native
  /**
    * The instance to specify which volumes should be snapshotted.
    */
  var InstanceId: js.UndefOr[typings.awsSdk.ec2Mod.InstanceId] = js.native
}

object InstanceSpecification {
  @scala.inline
  def apply(): InstanceSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceSpecification]
  }
  @scala.inline
  implicit class InstanceSpecificationOps[Self <: InstanceSpecification] (val x: Self) extends AnyVal {
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
    def setExcludeBootVolume(value: Boolean): Self = this.set("ExcludeBootVolume", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeBootVolume: Self = this.set("ExcludeBootVolume", js.undefined)
    @scala.inline
    def setInstanceId(value: InstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
  }
  
}

