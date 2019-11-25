package typings.createDashHtmlDashElement.createDashHtmlDashElementMod

import typings.stringifyDashAttributes.stringifyDashAttributesMod.Attributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOptions extends js.Object {
  /**
  		HTML tag attributes.
  		*/
  var attributes: js.UndefOr[Attributes] = js.undefined
  /**
  		HTML tag name.
  		@default 'div'
  		*/
  var name: js.UndefOr[String] = js.undefined
}

object BaseOptions {
  @scala.inline
  def apply(attributes: Attributes = null, name: String = null): BaseOptions = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseOptions]
  }
}

