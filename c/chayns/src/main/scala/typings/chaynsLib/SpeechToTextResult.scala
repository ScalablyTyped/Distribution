package typings
package chaynsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.setSpeecToText()
trait SpeechToTextResult extends js.Object {
  var languageCode: java.lang.String
  var text: js.Array[java.lang.String]
}

object SpeechToTextResult {
  @scala.inline
  def apply(languageCode: java.lang.String, text: js.Array[java.lang.String]): SpeechToTextResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("languageCode")(languageCode)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[SpeechToTextResult]
  }
}

