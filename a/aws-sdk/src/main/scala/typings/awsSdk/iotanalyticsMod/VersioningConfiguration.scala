package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VersioningConfiguration extends js.Object {
  /**
    * How many versions of data set contents will be kept. The "unlimited" parameter must be false.
    */
  var maxVersions: js.UndefOr[MaxVersions] = js.native
  /**
    * If true, unlimited versions of data set contents will be kept.
    */
  var unlimited: js.UndefOr[UnlimitedVersioning] = js.native
}

object VersioningConfiguration {
  @scala.inline
  def apply(maxVersions: Int | Double = null, unlimited: js.UndefOr[Boolean] = js.undefined): VersioningConfiguration = {
    val __obj = js.Dynamic.literal()
    if (maxVersions != null) __obj.updateDynamic("maxVersions")(maxVersions.asInstanceOf[js.Any])
    if (!js.isUndefined(unlimited)) __obj.updateDynamic("unlimited")(unlimited.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersioningConfiguration]
  }
}

