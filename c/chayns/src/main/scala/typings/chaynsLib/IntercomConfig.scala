package typings
package chaynsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Basic Functions
  * chayns.intercom
  * interfaces
  */
trait IntercomConfig extends js.Object {
  var text: java.lang.String
}

object IntercomConfig {
  @scala.inline
  def apply(text: java.lang.String): IntercomConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[IntercomConfig]
  }
}

