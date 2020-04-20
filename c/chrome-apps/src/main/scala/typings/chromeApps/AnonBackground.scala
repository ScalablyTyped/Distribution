package typings.chromeApps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackground extends js.Object {
  var background: AnonScripts
}

object AnonBackground {
  @scala.inline
  def apply(background: AnonScripts): AnonBackground = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBackground]
  }
}

