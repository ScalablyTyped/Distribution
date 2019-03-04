package typings
package chardetLib.chardetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Confidence extends js.Object {
  var confidence: scala.Double
  var lang: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
}

object Confidence {
  @scala.inline
  def apply(confidence: scala.Double, name: java.lang.String, lang: java.lang.String = null): Confidence = {
    val __obj = js.Dynamic.literal(confidence = confidence, name = name)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    __obj.asInstanceOf[Confidence]
  }
}

