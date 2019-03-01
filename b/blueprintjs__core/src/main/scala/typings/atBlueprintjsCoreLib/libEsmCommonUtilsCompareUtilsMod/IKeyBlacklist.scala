package typings
package atBlueprintjsCoreLib.libEsmCommonUtilsCompareUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeyBlacklist[T] extends js.Object {
  var exclude: js.Array[java.lang.String]
}

object IKeyBlacklist {
  @scala.inline
  def apply[T](exclude: js.Array[java.lang.String]): IKeyBlacklist[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("exclude")(exclude)
    __obj.asInstanceOf[IKeyBlacklist[T]]
  }
}

