package typings.classnames.anon

import typings.classnames.bindMod.ClassNamesBind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Default extends js.Object {
  var default: ClassNamesBind
}

object Default {
  @scala.inline
  def apply(default: ClassNamesBind): Default = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default]
  }
}

