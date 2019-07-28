package typings.csstype.csstypeMod

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
    js.Dynamic.global.Object.assign(__obj, StandardLonghandPropertiesFallback)
    js.Dynamic.global.Object.assign(__obj, StandardShorthandPropertiesFallback)
    __obj.asInstanceOf[StandardPropertiesFallback[TLength]]
  }
}

