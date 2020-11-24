package typings.clovelcedPluginAudiomanagement.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioMode extends js.Object {
  
  var audioMode: typings.clovelcedPluginAudiomanagement.mod.AudioMode = js.native
  
  var label: String = js.native
}
object AudioMode {
  
  @scala.inline
  def apply(audioMode: typings.clovelcedPluginAudiomanagement.mod.AudioMode, label: String): AudioMode = {
    val __obj = js.Dynamic.literal(audioMode = audioMode.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioMode]
  }
  
  @scala.inline
  implicit class AudioModeOps[Self <: AudioMode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAudioMode(value: typings.clovelcedPluginAudiomanagement.mod.AudioMode): Self = this.set("audioMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
  }
}
