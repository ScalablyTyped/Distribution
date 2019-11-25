package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.setSpeecToText()
trait SpeechToTextResult extends js.Object {
  var languageCode: String
  var text: js.Array[String]
}

object SpeechToTextResult {
  @scala.inline
  def apply(languageCode: String, text: js.Array[String]): SpeechToTextResult = {
    val __obj = js.Dynamic.literal(languageCode = languageCode.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SpeechToTextResult]
  }
}

