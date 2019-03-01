package typings
package countryDashDataLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllCurrency extends js.Object {
  val all: js.Array[countryDashDataLib.countryDashDataMod.Currency]
}

object Anon_AllCurrency {
  @scala.inline
  def apply(all: js.Array[countryDashDataLib.countryDashDataMod.Currency]): Anon_AllCurrency = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("all")(all)
    __obj.asInstanceOf[Anon_AllCurrency]
  }
}

