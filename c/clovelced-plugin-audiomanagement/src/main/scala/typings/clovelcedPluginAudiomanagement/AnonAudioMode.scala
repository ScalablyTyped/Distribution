package typings.clovelcedPluginAudiomanagement

import typings.clovelcedPluginAudiomanagement.mod.AudioMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAudioMode extends js.Object {
  var audioMode: AudioMode
  var label: String
}

object AnonAudioMode {
  @scala.inline
  def apply(audioMode: AudioMode, label: String): AnonAudioMode = {
    val __obj = js.Dynamic.literal(audioMode = audioMode.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAudioMode]
  }
}

