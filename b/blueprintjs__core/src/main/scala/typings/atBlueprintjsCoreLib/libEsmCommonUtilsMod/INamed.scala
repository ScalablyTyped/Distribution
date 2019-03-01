package typings
package atBlueprintjsCoreLib.libEsmCommonUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INamed extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object INamed {
  @scala.inline
  def apply(name: java.lang.String = null): INamed = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[INamed]
  }
}

