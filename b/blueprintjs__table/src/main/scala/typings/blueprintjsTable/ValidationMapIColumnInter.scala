package typings.blueprintjsTable

import typings.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.ValidationMap<@blueprintjs/table.@blueprintjs/table/lib/esm/common/context.IColumnInteractionBarContextTypes> */
trait ValidationMapIColumnInter extends js.Object {
  var enableColumnInteractionBar: js.UndefOr[Validator[Boolean]] = js.undefined
}

object ValidationMapIColumnInter {
  @scala.inline
  def apply(enableColumnInteractionBar: Validator[Boolean] = null): ValidationMapIColumnInter = {
    val __obj = js.Dynamic.literal()
    if (enableColumnInteractionBar != null) __obj.updateDynamic("enableColumnInteractionBar")(enableColumnInteractionBar.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationMapIColumnInter]
  }
}

