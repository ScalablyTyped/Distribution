package typings.awsSdk.mediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCorsPolicyOutput extends js.Object {
  /**
    * The CORS policy assigned to the container.
    */
  var CorsPolicy: typings.awsSdk.mediastoreMod.CorsPolicy = js.native
}

object GetCorsPolicyOutput {
  @scala.inline
  def apply(CorsPolicy: CorsPolicy): GetCorsPolicyOutput = {
    val __obj = js.Dynamic.literal(CorsPolicy = CorsPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCorsPolicyOutput]
  }
  @scala.inline
  implicit class GetCorsPolicyOutputOps[Self <: GetCorsPolicyOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCorsPolicyVarargs(value: CorsRule*): Self = this.set("CorsPolicy", js.Array(value :_*))
    @scala.inline
    def setCorsPolicy(value: CorsPolicy): Self = this.set("CorsPolicy", value.asInstanceOf[js.Any])
  }
  
}

