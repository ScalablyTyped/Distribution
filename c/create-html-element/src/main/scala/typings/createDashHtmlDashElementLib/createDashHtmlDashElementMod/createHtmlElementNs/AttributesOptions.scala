package typings
package createDashHtmlDashElementLib.createDashHtmlDashElementMod.createHtmlElementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributesOptions extends js.Object {
  var attributes: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Boolean | scala.Double | js.Array[java.lang.String]]
  ] = js.undefined
}

object AttributesOptions {
  @scala.inline
  def apply(
    attributes: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Boolean | scala.Double | js.Array[java.lang.String]] = null
  ): AttributesOptions = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    __obj.asInstanceOf[AttributesOptions]
  }
}

