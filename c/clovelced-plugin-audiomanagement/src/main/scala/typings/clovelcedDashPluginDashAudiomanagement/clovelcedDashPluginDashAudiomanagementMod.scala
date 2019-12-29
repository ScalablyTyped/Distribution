package typings.clovelcedDashPluginDashAudiomanagement

import org.scalablytyped.runtime.TopLevel
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
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[AudioMode with Double] = js.native
    /* 1 */ @js.native
    object NORMAL extends TopLevel[NORMAL with Double]
    
    /* 0 */ @js.native
    object SILENT extends TopLevel[SILENT with Double]
    
    /* 0 */ @js.native
    object VIBRATE extends TopLevel[VIBRATE with Double]
    
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
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[VolumeType with Double] = js.native
    /* 0 */ @js.native
    object MUSIC extends TopLevel[MUSIC with Double]
    
    /* 1 */ @js.native
    object NOTIFICATION extends TopLevel[NOTIFICATION with Double]
    
    /* 0 */ @js.native
    object RING extends TopLevel[RING with Double]
    
    /* 2 */ @js.native
    object SYSTEM extends TopLevel[SYSTEM with Double]
    
  }
  
}

