package typings
package createDashHtmlDashElementLib.createDashHtmlDashElementMod.createHtmlElementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsWithTagName[K] extends AttributesOptions {
  var name: K
}

object OptionsWithTagName {
  @scala.inline
  def apply[K](
    name: K,
    attributes: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Boolean | scala.Double | js.Array[java.lang.String]] = null
  ): OptionsWithTagName[K] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    __obj.asInstanceOf[OptionsWithTagName[K]]
  }
}

