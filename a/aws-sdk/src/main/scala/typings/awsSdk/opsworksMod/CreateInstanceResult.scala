package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateInstanceResult extends js.Object {
  /**
    * The instance ID.
    */
  var InstanceId: js.UndefOr[String] = js.native
}

object CreateInstanceResult {
  @scala.inline
  def apply(): CreateInstanceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateInstanceResult]
  }
  @scala.inline
  implicit class CreateInstanceResultOps[Self <: CreateInstanceResult] (val x: Self) extends AnyVal {
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
    def setInstanceId(value: String): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
  }
  
}

