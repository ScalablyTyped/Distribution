package typings
package clovelcedDashPluginDashAudiomanagementLib.clovelcedDashPluginDashAudiomanagementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("clovelced-plugin-audiomanagement", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getAudioMode(
    onSuccess: js.Function1[/* results */ clovelcedDashPluginDashAudiomanagementLib.Anon_AudioMode, scala.Unit],
    onError: js.Function1[/* error */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def getMaxVolume(
    `type`: VolumeType,
    onSuccess: js.Function1[/* results */ clovelcedDashPluginDashAudiomanagementLib.Anon_MaxVolume, scala.Unit],
    onError: js.Function1[/* error */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def getVolume(
    `type`: VolumeType,
    onSuccess: js.Function1[/* results */ clovelcedDashPluginDashAudiomanagementLib.Anon_Volume, scala.Unit],
    onError: js.Function1[/* error */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def setAudioMode(
    mode: AudioMode,
    onSuccess: js.Function0[scala.Unit],
    onError: js.Function1[/* error */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def setVolume(
    `type`: VolumeType,
    volume: scala.Double,
    onSuccess: js.Function0[scala.Unit],
    onError: js.Function1[/* error */ js.Any, scala.Unit]
  ): scala.Unit = js.native
}

