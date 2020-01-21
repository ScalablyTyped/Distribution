package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VPCDerivedInfoStatus extends js.Object {
  /**
    *  Specifies the VPC options for the specified Elasticsearch domain.
    */
  var Options: VPCDerivedInfo = js.native
  /**
    *  Specifies the status of the VPC options for the specified Elasticsearch domain.
    */
  var Status: OptionStatus = js.native
}

object VPCDerivedInfoStatus {
  @scala.inline
  def apply(Options: VPCDerivedInfo, Status: OptionStatus): VPCDerivedInfoStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VPCDerivedInfoStatus]
  }
}

