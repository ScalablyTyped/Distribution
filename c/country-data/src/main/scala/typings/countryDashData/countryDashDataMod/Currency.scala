package typings.countryDashData.countryDashDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Currency extends js.Object {
  val code: String
  val decimals: Double
  val name: String
  val number: Double
}

object Currency {
  @scala.inline
  def apply(code: String, decimals: Double, name: String, number: Double): Currency = {
    val __obj = js.Dynamic.literal(code = code, decimals = decimals, name = name, number = number)
  
    __obj.asInstanceOf[Currency]
  }
}

