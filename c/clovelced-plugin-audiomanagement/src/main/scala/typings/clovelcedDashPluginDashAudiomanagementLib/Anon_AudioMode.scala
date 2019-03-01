package typings
package clovelcedDashPluginDashAudiomanagementLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AudioMode extends js.Object {
  var audioMode: clovelcedDashPluginDashAudiomanagementLib.clovelcedDashPluginDashAudiomanagementMod.AudioMode
  var label: java.lang.String
}

object Anon_AudioMode {
  @scala.inline
  def apply(
    audioMode: clovelcedDashPluginDashAudiomanagementLib.clovelcedDashPluginDashAudiomanagementMod.AudioMode,
    label: java.lang.String
  ): Anon_AudioMode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("audioMode")(audioMode)
    __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[Anon_AudioMode]
  }
}

