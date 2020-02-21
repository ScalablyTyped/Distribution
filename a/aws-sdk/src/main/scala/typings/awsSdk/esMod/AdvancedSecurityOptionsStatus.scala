package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdvancedSecurityOptionsStatus extends js.Object {
  /**
    *  Specifies advanced security options for the specified Elasticsearch domain.
    */
  var Options: AdvancedSecurityOptions = js.native
  /**
    *  Status of the advanced security options for the specified Elasticsearch domain.
    */
  var Status: OptionStatus = js.native
}

object AdvancedSecurityOptionsStatus {
  @scala.inline
  def apply(Options: AdvancedSecurityOptions, Status: OptionStatus): AdvancedSecurityOptionsStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AdvancedSecurityOptionsStatus]
  }
}

