package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Basic Functions
  * chayns.intercom
  * interfaces
  */
trait IntercomConfig extends js.Object {
  var text: String
}

object IntercomConfig {
  @scala.inline
  def apply(text: String): IntercomConfig = {
    val __obj = js.Dynamic.literal(text = text)
  
    __obj.asInstanceOf[IntercomConfig]
  }
}

