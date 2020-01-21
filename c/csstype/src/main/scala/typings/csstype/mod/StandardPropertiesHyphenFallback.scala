package typings.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StandardPropertiesHyphenFallback[TLength]
  extends StandardLonghandPropertiesHyphenFallback[TLength]
     with StandardShorthandPropertiesHyphenFallback[TLength]

object StandardPropertiesHyphenFallback {
  @scala.inline
  def apply[TLength](
    StandardLonghandPropertiesHyphenFallback: StandardLonghandPropertiesHyphenFallback[TLength] = null,
    StandardShorthandPropertiesHyphenFallback: StandardShorthandPropertiesHyphenFallback[TLength] = null
  ): StandardPropertiesHyphenFallback[TLength] = {
    val __obj = js.Dynamic.literal()
    if (StandardLonghandPropertiesHyphenFallback != null) js.Dynamic.global.Object.assign(__obj, StandardLonghandPropertiesHyphenFallback)
    if (StandardShorthandPropertiesHyphenFallback != null) js.Dynamic.global.Object.assign(__obj, StandardShorthandPropertiesHyphenFallback)
    __obj.asInstanceOf[StandardPropertiesHyphenFallback[TLength]]
  }
}

