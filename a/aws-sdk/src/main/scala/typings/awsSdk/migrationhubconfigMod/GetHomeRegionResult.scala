package typings.awsSdk.migrationhubconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetHomeRegionResult extends js.Object {
  /**
    * The name of the home region of the calling account.
    */
  var HomeRegion: js.UndefOr[typings.awsSdk.migrationhubconfigMod.HomeRegion] = js.native
}

object GetHomeRegionResult {
  @scala.inline
  def apply(HomeRegion: HomeRegion = null): GetHomeRegionResult = {
    val __obj = js.Dynamic.literal()
    if (HomeRegion != null) __obj.updateDynamic("HomeRegion")(HomeRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHomeRegionResult]
  }
}

