package typings.countriesDashAndDashTimezones.countriesDashAndDashTimezonesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timezone extends js.Object {
  var aliasOf: String | Null
  var country: String | Null
  var dstOffset: Double
  var dstOffsetStr: String
  var name: String
  var utcOffset: Double
  var utcOffsetStr: String
}

object Timezone {
  @scala.inline
  def apply(
    dstOffset: Double,
    dstOffsetStr: String,
    name: String,
    utcOffset: Double,
    utcOffsetStr: String,
    aliasOf: String = null,
    country: String = null
  ): Timezone = {
    val __obj = js.Dynamic.literal(dstOffset = dstOffset, dstOffsetStr = dstOffsetStr, name = name, utcOffset = utcOffset, utcOffsetStr = utcOffsetStr)
    if (aliasOf != null) __obj.updateDynamic("aliasOf")(aliasOf)
    if (country != null) __obj.updateDynamic("country")(country)
    __obj.asInstanceOf[Timezone]
  }
}

