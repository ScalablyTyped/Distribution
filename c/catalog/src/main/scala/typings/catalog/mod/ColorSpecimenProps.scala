package typings.catalog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorSpecimenProps extends js.Object {
  var name: js.UndefOr[String | Double] = js.undefined
  var value: String
}

object ColorSpecimenProps {
  @scala.inline
  def apply(value: String, name: String | Double = null): ColorSpecimenProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorSpecimenProps]
  }
}

