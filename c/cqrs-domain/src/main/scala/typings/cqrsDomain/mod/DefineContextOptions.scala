package typings.cqrsDomain.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// endregion
// region defineContext
trait DefineContextOptions extends js.Object {
  /**
    * optional, default is the directory name
    */
  var name: js.UndefOr[String] = js.undefined
}

object DefineContextOptions {
  @scala.inline
  def apply(name: String = null): DefineContextOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineContextOptions]
  }
}

