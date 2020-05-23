package typings.carbonIconHelpers.mod

import typings.carbonIconHelpers.anon.D
import typings.carbonIconHelpers.carbonIconHelpersStrings.path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Path extends js.Object {
  var attrs: D
  var elem: path
}

object Path {
  @scala.inline
  def apply(attrs: D, elem: path): Path = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], elem = elem.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
}

