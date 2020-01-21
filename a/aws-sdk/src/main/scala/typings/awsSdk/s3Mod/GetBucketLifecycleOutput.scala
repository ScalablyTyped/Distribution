package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketLifecycleOutput extends js.Object {
  /**
    * Container for a lifecycle rule.
    */
  var Rules: js.UndefOr[typings.awsSdk.s3Mod.Rules] = js.native
}

object GetBucketLifecycleOutput {
  @scala.inline
  def apply(Rules: Rules = null): GetBucketLifecycleOutput = {
    val __obj = js.Dynamic.literal()
    if (Rules != null) __obj.updateDynamic("Rules")(Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketLifecycleOutput]
  }
}

