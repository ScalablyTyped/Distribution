package typings.clovelcedPluginAudiomanagement

import org.scalablytyped.runtime.TopLevel
import typings.clovelcedPluginAudiomanagement.anon.MaxVolume
import typings.clovelcedPluginAudiomanagement.anon.Volume
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("clovelced-plugin-audiomanagement", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def getAudioMode(
    onSuccess: js.Function1[/* results */ typings.clovelcedPluginAudiomanagement.anon.AudioMode, Unit],
    onError: js.Function1[/* error */ js.Any, Unit]
  ): Unit = js.native
  
  def getMaxVolume(
    `type`: VolumeType,
    onSuccess: js.Function1[/* results */ MaxVolume, Unit],
    onError: js.Function1[/* error */ js.Any, Unit]
  ): Unit = js.native
  
  def getVolume(
    `type`: VolumeType,
    onSuccess: js.Function1[/* results */ Volume, Unit],
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
  sealed trait AudioMode extends js.Object
  @js.native
  object AudioMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[AudioMode with Double] = js.native
    
    @js.native
    sealed trait NORMAL extends AudioMode
    /* 1 */ @js.native
    object NORMAL extends TopLevel[NORMAL with Double]
    
    @js.native
    sealed trait SILENT extends AudioMode
    /* 0 */ @js.native
    object SILENT extends TopLevel[SILENT with Double]
    
    @js.native
    sealed trait VIBRATE extends AudioMode
    /* 0 */ @js.native
    object VIBRATE extends TopLevel[VIBRATE with Double]
  }
  
  @js.native
  sealed trait VolumeType extends js.Object
  @js.native
  object VolumeType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[VolumeType with Double] = js.native
    
    @js.native
    sealed trait MUSIC extends VolumeType
    /* 0 */ @js.native
    object MUSIC extends TopLevel[MUSIC with Double]
    
    @js.native
    sealed trait NOTIFICATION extends VolumeType
    /* 1 */ @js.native
    object NOTIFICATION extends TopLevel[NOTIFICATION with Double]
    
    @js.native
    sealed trait RING extends VolumeType
    /* 0 */ @js.native
    object RING extends TopLevel[RING with Double]
    
    @js.native
    sealed trait SYSTEM extends VolumeType
    /* 2 */ @js.native
    object SYSTEM extends TopLevel[SYSTEM with Double]
  }
}
