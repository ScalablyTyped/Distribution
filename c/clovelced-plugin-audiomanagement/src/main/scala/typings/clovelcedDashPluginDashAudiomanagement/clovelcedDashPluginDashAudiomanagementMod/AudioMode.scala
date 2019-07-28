package typings.clovelcedDashPluginDashAudiomanagement.clovelcedDashPluginDashAudiomanagementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AudioMode extends js.Object

@JSImport("clovelced-plugin-audiomanagement", "AudioMode")
@js.native
object AudioMode extends js.Object {
  @js.native
  sealed trait NORMAL extends AudioMode
  
  @js.native
  sealed trait SILENT extends AudioMode
  
  @js.native
  sealed trait VIBRATE extends AudioMode
  
  /* 1 */ val NORMAL: typings.clovelcedDashPluginDashAudiomanagement.clovelcedDashPluginDashAudiomanagementMod.AudioMode.NORMAL with Double = js.native
  /* 0 */ val SILENT: typings.clovelcedDashPluginDashAudiomanagement.clovelcedDashPluginDashAudiomanagementMod.AudioMode.SILENT with Double = js.native
  /* 0 */ val VIBRATE: typings.clovelcedDashPluginDashAudiomanagement.clovelcedDashPluginDashAudiomanagementMod.AudioMode.VIBRATE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AudioMode with Double] = js.native
}

