package typings.chardet.chardetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Confidence extends js.Object {
  var confidence: Double
  var lang: js.UndefOr[String] = js.undefined
  var name: String
}

object Confidence {
  @scala.inline
  def apply(confidence: Double, name: String, lang: String = null): Confidence = {
    val __obj = js.Dynamic.literal(confidence = confidence, name = name)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    __obj.asInstanceOf[Confidence]
  }
}

