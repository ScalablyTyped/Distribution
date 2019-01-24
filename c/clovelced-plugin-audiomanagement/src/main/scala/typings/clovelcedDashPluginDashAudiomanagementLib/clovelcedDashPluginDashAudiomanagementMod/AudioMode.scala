package typings
package clovelcedDashPluginDashAudiomanagementLib.clovelcedDashPluginDashAudiomanagementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AudioMode extends js.Object

@JSImport("clovelced-plugin-audiomanagement", "AudioMode")
@js.native
object AudioMode extends js.Object {
  @js.native
  sealed trait NORMAL
    extends clovelcedDashPluginDashAudiomanagementLib.clovelcedDashPluginDashAudiomanagementMod.AudioMode
  
  @js.native
  sealed trait SILENT
    extends clovelcedDashPluginDashAudiomanagementLib.clovelcedDashPluginDashAudiomanagementMod.AudioMode
  
  @js.native
  sealed trait VIBRATE
    extends clovelcedDashPluginDashAudiomanagementLib.clovelcedDashPluginDashAudiomanagementMod.AudioMode
  
  val NORMAL: NORMAL with scala.Double = js.native
  /* 0 */ val SILENT: SILENT with scala.Double = js.native
  val VIBRATE: VIBRATE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    clovelcedDashPluginDashAudiomanagementLib.clovelcedDashPluginDashAudiomanagementMod.AudioMode with scala.Double
  ] = js.native
}

