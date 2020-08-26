package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketCorsOutput extends js.Object {
  /**
    * A set of origins and methods (cross-origin access that you want to allow). You can add up to 100 rules to the configuration.
    */
  var CORSRules: js.UndefOr[typings.awsSdk.s3Mod.CORSRules] = js.native
}

object GetBucketCorsOutput {
  @scala.inline
  def apply(): GetBucketCorsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketCorsOutput]
  }
  @scala.inline
  implicit class GetBucketCorsOutputOps[Self <: GetBucketCorsOutput] (val x: Self) extends AnyVal {
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
    def setCORSRulesVarargs(value: CORSRule*): Self = this.set("CORSRules", js.Array(value :_*))
    @scala.inline
    def setCORSRules(value: CORSRules): Self = this.set("CORSRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCORSRules: Self = this.set("CORSRules", js.undefined)
  }
  
}

