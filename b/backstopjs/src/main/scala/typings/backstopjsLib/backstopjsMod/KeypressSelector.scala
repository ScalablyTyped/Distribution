package typings
package backstopjsLib.backstopjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeypressSelector extends js.Object {
  var keyPress: java.lang.String
  var selector: java.lang.String
}

object KeypressSelector {
  @scala.inline
  def apply(keyPress: java.lang.String, selector: java.lang.String): KeypressSelector = {
    val __obj = js.Dynamic.literal(keyPress = keyPress, selector = selector)
  
    __obj.asInstanceOf[KeypressSelector]
  }
}

