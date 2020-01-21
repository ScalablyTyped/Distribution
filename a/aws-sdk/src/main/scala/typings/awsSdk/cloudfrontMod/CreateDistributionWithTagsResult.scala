package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDistributionWithTagsResult extends js.Object {
  /**
    * The distribution's information. 
    */
  var Distribution: js.UndefOr[typings.awsSdk.cloudfrontMod.Distribution] = js.native
  /**
    * The current version of the distribution created.
    */
  var ETag: js.UndefOr[String] = js.native
  /**
    * The fully qualified URI of the new distribution resource just created. For example: https://cloudfront.amazonaws.com/2010-11-01/distribution/EDFDVBD632BHDS5. 
    */
  var Location: js.UndefOr[String] = js.native
}

object CreateDistributionWithTagsResult {
  @scala.inline
  def apply(Distribution: Distribution = null, ETag: String = null, Location: String = null): CreateDistributionWithTagsResult = {
    val __obj = js.Dynamic.literal()
    if (Distribution != null) __obj.updateDynamic("Distribution")(Distribution.asInstanceOf[js.Any])
    if (ETag != null) __obj.updateDynamic("ETag")(ETag.asInstanceOf[js.Any])
    if (Location != null) __obj.updateDynamic("Location")(Location.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDistributionWithTagsResult]
  }
}

