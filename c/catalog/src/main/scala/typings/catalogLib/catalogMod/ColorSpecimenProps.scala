package typings
package catalogLib.catalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorSpecimenProps extends js.Object {
  var name: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var value: java.lang.String
}

object ColorSpecimenProps {
  @scala.inline
  def apply(value: java.lang.String, name: java.lang.String | scala.Double = null): ColorSpecimenProps = {
    val __obj = js.Dynamic.literal(value = value)
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorSpecimenProps]
  }
}

