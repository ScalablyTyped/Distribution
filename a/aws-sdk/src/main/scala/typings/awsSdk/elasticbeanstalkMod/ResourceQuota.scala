package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceQuota extends js.Object {
  /**
    * The maximum number of instances of this Elastic Beanstalk resource type that an AWS account can use.
    */
  var Maximum: js.UndefOr[BoxedInt] = js.native
}

object ResourceQuota {
  @scala.inline
  def apply(Maximum: js.UndefOr[BoxedInt] = js.undefined): ResourceQuota = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Maximum)) __obj.updateDynamic("Maximum")(Maximum.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceQuota]
  }
}

