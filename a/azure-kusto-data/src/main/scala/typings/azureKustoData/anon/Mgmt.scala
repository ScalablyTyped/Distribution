package typings.azureKustoData.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mgmt extends js.Object {
  var mgmt: String
  var query: String
}

object Mgmt {
  @scala.inline
  def apply(mgmt: String, query: String): Mgmt = {
    val __obj = js.Dynamic.literal(mgmt = mgmt.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mgmt]
  }
}

