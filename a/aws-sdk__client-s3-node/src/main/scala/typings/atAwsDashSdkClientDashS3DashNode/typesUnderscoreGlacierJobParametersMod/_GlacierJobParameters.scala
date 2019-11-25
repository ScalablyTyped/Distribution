package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreGlacierJobParametersMod

import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.Bulk
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.Expedited
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.Standard_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _GlacierJobParameters extends js.Object {
  /**
    * <p>Glacier retrieval tier at which the restore will be processed.</p>
    */
  var Tier: Standard_ | Bulk | Expedited | String
}

object _GlacierJobParameters {
  @scala.inline
  def apply(Tier: Standard_ | Bulk | Expedited | String): _GlacierJobParameters = {
    val __obj = js.Dynamic.literal(Tier = Tier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_GlacierJobParameters]
  }
}

