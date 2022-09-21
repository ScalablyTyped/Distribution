package typings.clovelcedPluginAudiomanagement

import typings.clovelcedPluginAudiomanagement.anon.MaxVolume
import typings.clovelcedPluginAudiomanagement.anon.Volume
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("clovelced-plugin-audiomanagement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait AudioMode extends StObject
  @JSImport("clovelced-plugin-audiomanagement", "AudioMode")
  @js.native
  object AudioMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[AudioMode & Double] = js.native
    
    @js.native
    sealed trait NORMAL
      extends StObject
         with AudioMode
    /* 1 */ val NORMAL: typings.clovelcedPluginAudiomanagement.mod.AudioMode.NORMAL & Double = js.native
    
    @js.native
    sealed trait SILENT
      extends StObject
         with AudioMode
    /* 0 */ val SILENT: typings.clovelcedPluginAudiomanagement.mod.AudioMode.SILENT & Double = js.native
    
    @js.native
    sealed trait VIBRATE
      extends StObject
         with AudioMode
    /* 0 */ val VIBRATE: typings.clovelcedPluginAudiomanagement.mod.AudioMode.VIBRATE & Double = js.native
  }
  
  @js.native
  sealed trait VolumeType extends StObject
  @JSImport("clovelced-plugin-audiomanagement", "VolumeType")
  @js.native
  object VolumeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[VolumeType & Double] = js.native
    
    @js.native
    sealed trait MUSIC
      extends StObject
         with VolumeType
    /* 0 */ val MUSIC: typings.clovelcedPluginAudiomanagement.mod.VolumeType.MUSIC & Double = js.native
    
    @js.native
    sealed trait NOTIFICATION
      extends StObject
         with VolumeType
    /* 1 */ val NOTIFICATION: typings.clovelcedPluginAudiomanagement.mod.VolumeType.NOTIFICATION & Double = js.native
    
    @js.native
    sealed trait RING
      extends StObject
         with VolumeType
    /* 0 */ val RING: typings.clovelcedPluginAudiomanagement.mod.VolumeType.RING & Double = js.native
    
    @js.native
    sealed trait SYSTEM
      extends StObject
         with VolumeType
    /* 2 */ val SYSTEM: typings.clovelcedPluginAudiomanagement.mod.VolumeType.SYSTEM & Double = js.native
  }
  
  inline def getAudioMode(
    onSuccess: js.Function1[/* results */ typings.clovelcedPluginAudiomanagement.anon.AudioMode, Unit],
    onError: js.Function1[/* error */ Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getAudioMode")(onSuccess.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getMaxVolume(
    `type`: VolumeType,
    onSuccess: js.Function1[/* results */ MaxVolume, Unit],
    onError: js.Function1[/* error */ Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxVolume")(`type`.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getVolume(
    `type`: VolumeType,
    onSuccess: js.Function1[/* results */ Volume, Unit],
    onError: js.Function1[/* error */ Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getVolume")(`type`.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setAudioMode(mode: AudioMode, onSuccess: js.Function0[Unit], onError: js.Function1[/* error */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAudioMode")(mode.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setVolume(
    `type`: VolumeType,
    volume: Double,
    onSuccess: js.Function0[Unit],
    onError: js.Function1[/* error */ Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setVolume")(`type`.asInstanceOf[js.Any], volume.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
