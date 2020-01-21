package typings.classnames

import typings.classnames.bindMod.ClassNamesBind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefault extends js.Object {
  var default: ClassNamesBind
}

object AnonDefault {
  @scala.inline
  def apply(default: ClassNamesBind): AnonDefault = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDefault]
  }
}

