package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexFieldStatus extends js.Object {
  var Options: IndexField = js.native
  var Status: OptionStatus = js.native
}

object IndexFieldStatus {
  @scala.inline
  def apply(Options: IndexField, Status: OptionStatus): IndexFieldStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IndexFieldStatus]
  }
}

