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
  def apply(Rules: LifecycleRules = null): GetBucketLifecycleConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    if (Rules != null) __obj.updateDynamic("Rules")(Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketLifecycleConfigurationOutput]
  }
}

