package typings.branchSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Amount extends js.Object {
  var amount: Double
  var bucket: String
  var date: String
  var id: String
  var `type`: Double
}

object Amount {
  @scala.inline
  def apply(amount: Double, bucket: String, date: String, id: String, `type`: Double): Amount = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], bucket = bucket.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Amount]
  }
}

