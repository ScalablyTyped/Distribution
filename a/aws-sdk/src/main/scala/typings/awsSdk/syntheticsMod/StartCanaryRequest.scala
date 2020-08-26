package typings.awsSdk.syntheticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartCanaryRequest extends js.Object {
  /**
    * The name of the canary that you want to run. To find canary names, use DescribeCanaries.
    */
  var Name: CanaryName = js.native
}

object StartCanaryRequest {
  @scala.inline
  def apply(Name: CanaryName): StartCanaryRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartCanaryRequest]
  }
  @scala.inline
  implicit class StartCanaryRequestOps[Self <: StartCanaryRequest] (val x: Self) extends AnyVal {
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

