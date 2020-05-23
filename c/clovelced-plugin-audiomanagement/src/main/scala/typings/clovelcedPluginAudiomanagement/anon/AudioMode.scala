package typings.clovelcedPluginAudiomanagement.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioMode extends js.Object {
  var audioMode: typings.clovelcedPluginAudiomanagement.mod.AudioMode
  var label: String
}

object AudioMode {
  @scala.inline
  def apply(audioMode: typings.clovelcedPluginAudiomanagement.mod.AudioMode, label: String): AudioMode = {
    val __obj = js.Dynamic.literal(audioMode = audioMode.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioMode]
  }
}

