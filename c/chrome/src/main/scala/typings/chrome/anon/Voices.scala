package typings.chrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Voices extends js.Object {
  var voices: js.Array[Eventtypes]
}

object Voices {
  @scala.inline
  def apply(voices: js.Array[Eventtypes]): Voices = {
    val __obj = js.Dynamic.literal(voices = voices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Voices]
  }
}

