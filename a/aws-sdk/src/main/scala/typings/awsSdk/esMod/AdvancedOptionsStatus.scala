package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdvancedOptionsStatus extends js.Object {
  /**
    *  Specifies the status of advanced options for the specified Elasticsearch domain.
    */
  var Options: AdvancedOptions = js.native
  /**
    *  Specifies the status of OptionStatus for advanced options for the specified Elasticsearch domain.
    */
  var Status: OptionStatus = js.native
}

object AdvancedOptionsStatus {
  @scala.inline
  def apply(Options: AdvancedOptions, Status: OptionStatus): AdvancedOptionsStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AdvancedOptionsStatus]
  }
}

