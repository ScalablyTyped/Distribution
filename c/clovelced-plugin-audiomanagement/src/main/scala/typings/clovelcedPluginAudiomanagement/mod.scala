package typings.clovelcedPluginAudiomanagement

import typings.clovelcedPluginAudiomanagement.anon.MaxVolume
import typings.clovelcedPluginAudiomanagement.anon.Volume
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  sealed trait AudioMode extends StObject
  @JSImport("clovelced-plugin-audiomanagement", "AudioMode")
  @js.native
  object AudioMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[AudioMode with Double] = js.native
    
    @js.native
    sealed trait NORMAL extends AudioMode
    /* 1 */ val NORMAL: typings.clovelcedPluginAudiomanagement.mod.AudioMode.NORMAL with Double = js.native
    
    @js.native
    sealed trait SILENT extends AudioMode
    /* 0 */ val SILENT: typings.clovelcedPluginAudiomanagement.mod.AudioMode.SILENT with Double = js.native
    
    @js.native
    sealed trait VIBRATE extends AudioMode
    /* 0 */ val VIBRATE: typings.clovelcedPluginAudiomanagement.mod.AudioMode.VIBRATE with Double = js.native
  }
  
  @js.native
  sealed trait VolumeType extends StObject
  @JSImport("clovelced-plugin-audiomanagement", "VolumeType")
  @js.native
  object VolumeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[VolumeType with Double] = js.native
    
    @js.native
    sealed trait MUSIC extends VolumeType
    /* 0 */ val MUSIC: typings.clovelcedPluginAudiomanagement.mod.VolumeType.MUSIC with Double = js.native
    
    @js.native
    sealed trait NOTIFICATION extends VolumeType
    /* 1 */ val NOTIFICATION: typings.clovelcedPluginAudiomanagement.mod.VolumeType.NOTIFICATION with Double = js.native
    
    @js.native
    sealed trait RING extends VolumeType
    /* 0 */ val RING: typings.clovelcedPluginAudiomanagement.mod.VolumeType.RING with Double = js.native
    
    @js.native
    sealed trait SYSTEM extends VolumeType
    /* 2 */ val SYSTEM: typings.clovelcedPluginAudiomanagement.mod.VolumeType.SYSTEM with Double = js.native
  }
  
  @JSImport("clovelced-plugin-audiomanagement", "getAudioMode")
  @js.native
  def getAudioMode(
    onSuccess: js.Function1[/* results */ typings.clovelcedPluginAudiomanagement.anon.AudioMode, Unit],
    onError: js.Function1[/* error */ js.Any, Unit]
  ): Unit = js.native
  
  @JSImport("clovelced-plugin-audiomanagement", "getMaxVolume")
  @js.native
  def getMaxVolume(
    `type`: VolumeType,
    onSuccess: js.Function1[/* results */ MaxVolume, Unit],
    onError: js.Function1[/* error */ js.Any, Unit]
  ): Unit = js.native
  
  @JSImport("clovelced-plugin-audiomanagement", "getVolume")
  @js.native
  def getVolume(
    `type`: VolumeType,
    onSuccess: js.Function1[/* results */ Volume, Unit],
    onError: js.Function1[/* error */ js.Any, Unit]
  ): Unit = js.native
  
  @JSImport("clovelced-plugin-audiomanagement", "setAudioMode")
  @js.native
  def setAudioMode(mode: AudioMode, onSuccess: js.Function0[Unit], onError: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  
  @JSImport("clovelced-plugin-audiomanagement", "setVolume")
  @js.native
  def setVolume(
    `type`: VolumeType,
    volume: Double,
    onSuccess: js.Function0[Unit],
    onError: js.Function1[/* error */ js.Any, Unit]
  ): Unit = js.native
}
