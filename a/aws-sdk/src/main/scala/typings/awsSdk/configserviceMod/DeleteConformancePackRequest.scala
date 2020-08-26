package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteConformancePackRequest extends js.Object {
  /**
    * Name of the conformance pack you want to delete.
    */
  var ConformancePackName: typings.awsSdk.configserviceMod.ConformancePackName = js.native
}

object DeleteConformancePackRequest {
  @scala.inline
  def apply(ConformancePackName: ConformancePackName): DeleteConformancePackRequest = {
    val __obj = js.Dynamic.literal(ConformancePackName = ConformancePackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConformancePackRequest]
  }
  @scala.inline
  implicit class DeleteConformancePackRequestOps[Self <: DeleteConformancePackRequest] (val x: Self) extends AnyVal {
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
    def setConformancePackName(value: ConformancePackName): Self = this.set("ConformancePackName", value.asInstanceOf[js.Any])
  }
  
}

