package typings.charsetDetector.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * charset detect match result
  */
trait CharsetMatch extends js.Object {
  /**
    * name of charset
    * @example 'UTF-8'
    */
  var charsetName: String
  /**
    * confidence between 0 and 100
    */
  var confidence: Double
  /**
    * language of charset
    * @example 'zh'
    */
  var lang: js.UndefOr[String] = js.undefined
}

object CharsetMatch {
  @scala.inline
  def apply(charsetName: String, confidence: Double, lang: String = null): CharsetMatch = {
    val __obj = js.Dynamic.literal(charsetName = charsetName.asInstanceOf[js.Any], confidence = confidence.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharsetMatch]
  }
}

