package typings.clovelcedDashPluginDashAudiomanagement.clovelcedDashPluginDashAudiomanagementMod

import typings.clovelcedDashPluginDashAudiomanagement.Anon_AudioMode
import typings.clovelcedDashPluginDashAudiomanagement.Anon_MaxVolume
import typings.clovelcedDashPluginDashAudiomanagement.Anon_Volume
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("clovelced-plugin-audiomanagement", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getAudioMode(
    onSuccess: js.Function1[/* results */ Anon_AudioMode, Unit],
    onError: js.Function1[/* error */ js.Any, Unit]
  ): Unit = js.native
  def getMaxVolume(
    `type`: VolumeType,
    onSuccess: js.Function1[/* results */ Anon_MaxVolume, Unit],
    onError: js.Function1[/* error */ js.Any, Unit]
  ): Unit = js.native
  def getVolume(
    `type`: VolumeType,
    onSuccess: js.Function1[/* results */ Anon_Volume, Unit],
    onError: js.Function1[/* error */ js.Any, Unit]
  ): Unit = js.native
  def setAudioMode(mode: AudioMode, onSuccess: js.Function0[Unit], onError: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  def setVolume(
    `type`: VolumeType,
    volume: Double,
    onSuccess: js.Function0[Unit],
    onError: js.Function1[/* error */ js.Any, Unit]
  ): Unit = js.native
}

