package typings.csso.cssoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  /**
    * Resulting CSS.
    */
  var css: String
  /**
    * Instance of SourceMapGenerator or null.
    */
  var map: js.Object | Null
}

object Result {
  @scala.inline
  def apply(css: String, map: js.Object = null): Result = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
}

