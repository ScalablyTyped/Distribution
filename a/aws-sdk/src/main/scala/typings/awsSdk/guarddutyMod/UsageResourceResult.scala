package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsageResourceResult extends js.Object {
  /**
    * The AWS resource that generated usage.
    */
  var Resource: js.UndefOr[String] = js.native
  /**
    * Represents the sum total of usage for the specified resource type.
    */
  var Total: js.UndefOr[typings.awsSdk.guarddutyMod.Total] = js.native
}

object UsageResourceResult {
  @scala.inline
  def apply(): UsageResourceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageResourceResult]
  }
  @scala.inline
  implicit class UsageResourceResultOps[Self <: UsageResourceResult] (val x: Self) extends AnyVal {
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
    def setResource(value: String): Self = this.set("Resource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResource: Self = this.set("Resource", js.undefined)
    @scala.inline
    def setTotal(value: Total): Self = this.set("Total", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal: Self = this.set("Total", js.undefined)
  }
  
}

