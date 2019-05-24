package typings
package createDashHtmlDashElementLib.createDashHtmlDashElementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOptions extends js.Object {
  /**
  		HTML tag attributes.
  		*/
  var attributes: js.UndefOr[stringifyDashAttributesLib.stringifyDashAttributesMod.Attributes] = js.undefined
  /**
  		HTML tag name.
  		@default 'div'
  		*/
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object BaseOptions {
  @scala.inline
  def apply(
    attributes: stringifyDashAttributesLib.stringifyDashAttributesMod.Attributes = null,
    name: java.lang.String = null
  ): BaseOptions = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[BaseOptions]
  }
}

