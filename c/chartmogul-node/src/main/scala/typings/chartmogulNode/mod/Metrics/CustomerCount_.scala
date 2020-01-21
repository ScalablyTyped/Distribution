package typings.chartmogulNode.mod.Metrics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomerCount_ extends js.Object {
  var customers: Double
  var date: String
}

object CustomerCount_ {
  @scala.inline
  def apply(customers: Double, date: String): CustomerCount_ = {
    val __obj = js.Dynamic.literal(customers = customers.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CustomerCount_]
  }
}

