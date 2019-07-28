package typings.csstype.csstypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StandardPropertiesHyphen[TLength]
  extends StandardLonghandPropertiesHyphen[TLength]
     with StandardShorthandPropertiesHyphen[TLength]

object StandardPropertiesHyphen {
  @scala.inline
  def apply[TLength](
    StandardLonghandPropertiesHyphen: StandardLonghandPropertiesHyphen[TLength] = null,
    StandardShorthandPropertiesHyphen: StandardShorthandPropertiesHyphen[TLength] = null
  ): StandardPropertiesHyphen[TLength] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StandardLonghandPropertiesHyphen)
    js.Dynamic.global.Object.assign(__obj, StandardShorthandPropertiesHyphen)
    __obj.asInstanceOf[StandardPropertiesHyphen[TLength]]
  }
}

