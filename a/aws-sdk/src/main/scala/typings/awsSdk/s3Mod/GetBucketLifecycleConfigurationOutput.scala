package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketLifecycleConfigurationOutput extends js.Object {
  /**
    * Container for a lifecycle rule.
    */
  var Rules: js.UndefOr[LifecycleRules] = js.native
}

object GetBucketLifecycleConfigurationOutput {
  @scala.inline
  def apply(): GetBucketLifecycleConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketLifecycleConfigurationOutput]
  }
  @scala.inline
  implicit class GetBucketLifecycleConfigurationOutputOps[Self <: GetBucketLifecycleConfigurationOutput] (val x: Self) extends AnyVal {
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
    def setRulesVarargs(value: LifecycleRule*): Self = this.set("Rules", js.Array(value :_*))
    @scala.inline
    def setRules(value: LifecycleRules): Self = this.set("Rules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRules: Self = this.set("Rules", js.undefined)
  }
  
}

