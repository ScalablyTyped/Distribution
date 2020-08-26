package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackSummary extends js.Object {
  /**
    * The number of apps.
    */
  var AppsCount: js.UndefOr[Integer] = js.native
  /**
    * The stack's ARN.
    */
  var Arn: js.UndefOr[String] = js.native
  /**
    * An InstancesCount object with the number of instances in each status.
    */
  var InstancesCount: js.UndefOr[typings.awsSdk.opsworksMod.InstancesCount] = js.native
  /**
    * The number of layers.
    */
  var LayersCount: js.UndefOr[Integer] = js.native
  /**
    * The stack name.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The stack ID.
    */
  var StackId: js.UndefOr[String] = js.native
}

object StackSummary {
  @scala.inline
  def apply(): StackSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackSummary]
  }
  @scala.inline
  implicit class StackSummaryOps[Self <: StackSummary] (val x: Self) extends AnyVal {
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
    def setAppsCount(value: Integer): Self = this.set("AppsCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppsCount: Self = this.set("AppsCount", js.undefined)
    @scala.inline
    def setArn(value: String): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setInstancesCount(value: InstancesCount): Self = this.set("InstancesCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstancesCount: Self = this.set("InstancesCount", js.undefined)
    @scala.inline
    def setLayersCount(value: Integer): Self = this.set("LayersCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayersCount: Self = this.set("LayersCount", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setStackId(value: String): Self = this.set("StackId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackId: Self = this.set("StackId", js.undefined)
  }
  
}

