package typings
package catalogLib.catalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorPaletteSpecimenProps extends js.Object {
  var colors: js.Array[ColorSpecimenProps]
  var horizontal: js.UndefOr[scala.Boolean] = js.undefined
}

object ColorPaletteSpecimenProps {
  @scala.inline
  def apply(colors: js.Array[ColorSpecimenProps], horizontal: js.UndefOr[scala.Boolean] = js.undefined): ColorPaletteSpecimenProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("colors")(colors)
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal)
    __obj.asInstanceOf[ColorPaletteSpecimenProps]
  }
}

