package typings.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonVoices extends js.Object {
  var voices: js.Array[AnonEventtypes]
}

object AnonVoices {
  @scala.inline
  def apply(voices: js.Array[AnonEventtypes]): AnonVoices = {
    val __obj = js.Dynamic.literal(voices = voices.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonVoices]
  }
}

