package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElasticGpuSpecificationResponse extends js.Object {
  /**
    * The elastic GPU type.
    */
  var Type: js.UndefOr[String] = js.native
}

object ElasticGpuSpecificationResponse {
  @scala.inline
  def apply(): ElasticGpuSpecificationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElasticGpuSpecificationResponse]
  }
  @scala.inline
  implicit class ElasticGpuSpecificationResponseOps[Self <: ElasticGpuSpecificationResponse] (val x: Self) extends AnyVal {
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
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

