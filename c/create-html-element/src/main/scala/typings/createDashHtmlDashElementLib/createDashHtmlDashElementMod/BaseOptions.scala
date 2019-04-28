package typings
package createDashHtmlDashElementLib.createDashHtmlDashElementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOptions extends js.Object {
  /**
  		HTML tag attributes.
  		*/
  var attributes: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Boolean | scala.Double | js.Array[java.lang.String]]
  ] = js.undefined
  /**
  		HTML tag name.
  		@default 'div'
  		*/
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object BaseOptions {
  @scala.inline
  def apply(
    attributes: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Boolean | scala.Double | js.Array[java.lang.String]] = null,
    name: java.lang.String = null
  ): BaseOptions = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[BaseOptions]
  }
}

