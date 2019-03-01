package typings
package bookshelfLib.bookshelfMod.BookshelfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModelBase extends js.Object {
  /** Should be declared as a getter instead of a plain property. */
  var hasTimestamps: js.UndefOr[scala.Boolean | js.Array[java.lang.String]] = js.undefined
  /** Should be declared as a getter instead of a plain property. Should be required, but cannot have abstract properties yet. */
  var tableName: js.UndefOr[java.lang.String] = js.undefined
}

object IModelBase {
  @scala.inline
  def apply(
    hasTimestamps: scala.Boolean | js.Array[java.lang.String] = null,
    tableName: java.lang.String = null
  ): IModelBase = {
    val __obj = js.Dynamic.literal()
    if (hasTimestamps != null) __obj.updateDynamic("hasTimestamps")(hasTimestamps.asInstanceOf[js.Any])
    if (tableName != null) __obj.updateDynamic("tableName")(tableName)
    __obj.asInstanceOf[IModelBase]
  }
}

