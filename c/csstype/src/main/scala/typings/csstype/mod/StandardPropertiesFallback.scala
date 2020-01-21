package typings.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StandardPropertiesFallback[TLength]
  extends StandardLonghandPropertiesFallback[TLength]
     with StandardShorthandPropertiesFallback[TLength]

object StandardPropertiesFallback {
  @scala.inline
  def apply[TLength](
    StandardLonghandPropertiesFallback: StandardLonghandPropertiesFallback[TLength] = null,
    StandardShorthandPropertiesFallback: StandardShorthandPropertiesFallback[TLength] = null
  ): StandardPropertiesFallback[TLength] = {
    val __obj = js.Dynamic.literal()
    if (StandardLonghandPropertiesFallback != null) js.Dynamic.global.Object.assign(__obj, StandardLonghandPropertiesFallback)
    if (StandardShorthandPropertiesFallback != null) js.Dynamic.global.Object.assign(__obj, StandardShorthandPropertiesFallback)
    __obj.asInstanceOf[StandardPropertiesFallback[TLength]]
  }
}

