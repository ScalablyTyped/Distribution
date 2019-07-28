package typings.countryDashData.countryDashDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Language extends js.Object {
  val alpha2: String
  val alpha3: String
  val bibliographic: String
  val name: String
}

object Language {
  @scala.inline
  def apply(alpha2: String, alpha3: String, bibliographic: String, name: String): Language = {
    val __obj = js.Dynamic.literal(alpha2 = alpha2, alpha3 = alpha3, bibliographic = bibliographic, name = name)
  
    __obj.asInstanceOf[Language]
  }
}

