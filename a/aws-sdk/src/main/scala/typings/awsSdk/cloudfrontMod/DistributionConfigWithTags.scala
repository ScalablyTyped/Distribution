package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributionConfigWithTags extends js.Object {
  /**
    * A distribution configuration.
    */
  var DistributionConfig: typings.awsSdk.cloudfrontMod.DistributionConfig = js.native
  /**
    * A complex type that contains zero or more Tag elements.
    */
  var Tags: typings.awsSdk.cloudfrontMod.Tags = js.native
}

object DistributionConfigWithTags {
  @scala.inline
  def apply(DistributionConfig: DistributionConfig, Tags: Tags): DistributionConfigWithTags = {
    val __obj = js.Dynamic.literal(DistributionConfig = DistributionConfig.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionConfigWithTags]
  }
}

