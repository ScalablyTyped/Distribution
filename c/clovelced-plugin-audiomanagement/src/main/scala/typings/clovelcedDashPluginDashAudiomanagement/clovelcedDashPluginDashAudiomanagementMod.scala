package typings.clovelcedDashPluginDashAudiomanagement

import typings.clovelcedDashPluginDashAudiomanagement.clovelcedDashPluginDashAudiomanagementMod.AudioMode
import typings.clovelcedDashPluginDashAudiomanagement.clovelcedDashPluginDashAudiomanagementMod.VolumeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("clovelced-plugin-audiomanagement", JSImport.Namespace)
@js.native
object clovelcedDashPluginDashAudiomanagementMod extends js.Object {
  @js.native
  sealed trait AudioMode extends js.Object
  
  @js.native
  sealed trait VolumeType extends js.Object
  
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
  
  @js.native
  object VolumeType extends js.Object {
    @js.native
    sealed trait MUSIC extends VolumeType
    
    @js.native
    sealed trait NOTIFICATION extends VolumeType
    
    @js.native
    sealed trait RING extends VolumeType
    
    @js.native
    sealed trait SYSTEM extends VolumeType
    
    /* 0 */ val MUSIC: typings.clovelcedDashPluginDashAudiomanagement.clovelcedDashPluginDashAudiomanagementMod.VolumeType.MUSIC with Double = js.native
    /* 1 */ val NOTIFICATION: typings.clovelcedDashPluginDashAudiomanagement.clovelcedDashPluginDashAudiomanagementMod.VolumeType.NOTIFICATION with Double = js.native
    /* 0 */ val RING: typings.clovelcedDashPluginDashAudiomanagement.clovelcedDashPluginDashAudiomanagementMod.VolumeType.RING with Double = js.native
    /* 2 */ val SYSTEM: typings.clovelcedDashPluginDashAudiomanagement.clovelcedDashPluginDashAudiomanagementMod.VolumeType.SYSTEM with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[VolumeType with Double] = js.native
  }
  
}

