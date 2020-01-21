package typings.countriesAndTimezones.mod

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
    val __obj = js.Dynamic.literal(dstOffset = dstOffset.asInstanceOf[js.Any], dstOffsetStr = dstOffsetStr.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], utcOffset = utcOffset.asInstanceOf[js.Any], utcOffsetStr = utcOffsetStr.asInstanceOf[js.Any])
    if (aliasOf != null) __obj.updateDynamic("aliasOf")(aliasOf.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timezone]
  }
}

