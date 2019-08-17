package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreGlacierJobParametersMod

import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.Bulk
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.Expedited
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.Standard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _GlacierJobParameters extends js.Object {
  /**
    * <p>Glacier retrieval tier at which the restore will be processed.</p>
    */
  var Tier: Standard | Bulk | Expedited | String
}

object _GlacierJobParameters {
  @scala.inline
  def apply(Tier: Standard | Bulk | Expedited | String): _GlacierJobParameters = {
    val __obj = js.Dynamic.literal(Tier = Tier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_GlacierJobParameters]
  }
}

