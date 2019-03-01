package typings
package atCkeditorCkeditor5DashEngineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BatchType extends js.Object {
  var batchType: js.UndefOr[java.lang.String] = js.undefined
  var lastRangeBackward: js.UndefOr[scala.Boolean] = js.undefined
  var rootName: js.UndefOr[java.lang.String] = js.undefined
  var selectionAttributes: js.UndefOr[js.Array[js.Object]] = js.undefined
}

object Anon_BatchType {
  @scala.inline
  def apply(
    batchType: java.lang.String = null,
    lastRangeBackward: js.UndefOr[scala.Boolean] = js.undefined,
    rootName: java.lang.String = null,
    selectionAttributes: js.Array[js.Object] = null
  ): Anon_BatchType = {
    val __obj = js.Dynamic.literal()
    if (batchType != null) __obj.updateDynamic("batchType")(batchType)
    if (!js.isUndefined(lastRangeBackward)) __obj.updateDynamic("lastRangeBackward")(lastRangeBackward)
    if (rootName != null) __obj.updateDynamic("rootName")(rootName)
    if (selectionAttributes != null) __obj.updateDynamic("selectionAttributes")(selectionAttributes)
    __obj.asInstanceOf[Anon_BatchType]
  }
}

