package typings.awsSdk.syntheticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCanaryRequest extends js.Object {
  /**
    * The name of the canary that you want details for.
    */
  var Name: CanaryName = js.native
}

object GetCanaryRequest {
  @scala.inline
  def apply(Name: CanaryName): GetCanaryRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCanaryRequest]
  }
  @scala.inline
  implicit class GetCanaryRequestOps[Self <: GetCanaryRequest] (val x: Self) extends AnyVal {
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
    def setName(value: CanaryName): Self = this.set("Name", value.asInstanceOf[js.Any])
  }
  
}

