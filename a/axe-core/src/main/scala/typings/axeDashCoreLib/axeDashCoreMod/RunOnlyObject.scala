package typings
package axeDashCoreLib.axeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunOnlyObject extends js.Object {
  var exclude: js.UndefOr[js.Array[java.lang.String] | js.Array[js.Array[java.lang.String]]] = js.undefined
  var include: js.UndefOr[js.Array[java.lang.String] | js.Array[js.Array[java.lang.String]]] = js.undefined
}

object RunOnlyObject {
  @scala.inline
  def apply(
    exclude: js.Array[java.lang.String] | js.Array[js.Array[java.lang.String]] = null,
    include: js.Array[java.lang.String] | js.Array[js.Array[java.lang.String]] = null
  ): RunOnlyObject = {
    val __obj = js.Dynamic.literal()
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunOnlyObject]
  }
}

