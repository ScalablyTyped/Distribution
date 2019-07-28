package typings.clovelcedDashPluginDashAudiomanagement.clovelcedDashPluginDashAudiomanagementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VolumeType extends js.Object

@JSImport("clovelced-plugin-audiomanagement", "VolumeType")
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

