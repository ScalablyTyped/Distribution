package typings.azureKustoData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMgmt extends js.Object {
  var mgmt: String
  var query: String
}

object AnonMgmt {
  @scala.inline
  def apply(mgmt: String, query: String): AnonMgmt = {
    val __obj = js.Dynamic.literal(mgmt = mgmt.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMgmt]
  }
}

