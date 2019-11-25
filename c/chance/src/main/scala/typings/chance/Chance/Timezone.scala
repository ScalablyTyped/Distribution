package typings.chance.Chance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timezone extends js.Object {
  var abbr: String
  var isdst: Boolean
  var name: String
  var offset: Double
  var text: String
  var utc: js.Array[String]
}

object Timezone {
  @scala.inline
  def apply(abbr: String, isdst: Boolean, name: String, offset: Double, text: String, utc: js.Array[String]): Timezone = {
    val __obj = js.Dynamic.literal(abbr = abbr.asInstanceOf[js.Any], isdst = isdst.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], utc = utc.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Timezone]
  }
}

