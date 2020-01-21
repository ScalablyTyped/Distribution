package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NielsenConfiguration extends js.Object {
  /**
    * Enter the Distributor ID assigned to your organization by Nielsen.
    */
  var DistributorId: js.UndefOr[string] = js.native
  /**
    * Enables Nielsen PCM to ID3 tagging
    */
  var NielsenPcmToId3Tagging: js.UndefOr[NielsenPcmToId3TaggingState] = js.native
}

object NielsenConfiguration {
  @scala.inline
  def apply(DistributorId: string = null, NielsenPcmToId3Tagging: NielsenPcmToId3TaggingState = null): NielsenConfiguration = {
    val __obj = js.Dynamic.literal()
    if (DistributorId != null) __obj.updateDynamic("DistributorId")(DistributorId.asInstanceOf[js.Any])
    if (NielsenPcmToId3Tagging != null) __obj.updateDynamic("NielsenPcmToId3Tagging")(NielsenPcmToId3Tagging.asInstanceOf[js.Any])
    __obj.asInstanceOf[NielsenConfiguration]
  }
}

