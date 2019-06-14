package typings
package clovelcedDashPluginDashAudiomanagementLib.clovelcedDashPluginDashAudiomanagementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VolumeType extends js.Object

@JSImport("clovelced-plugin-audiomanagement", "VolumeType")
@js.native
object VolumeType extends js.Object {
  @js.native
  sealed trait MUSIC
    extends clovelcedDashPluginDashAudiomanagementLib.clovelcedDashPluginDashAudiomanagementMod.VolumeType
  
  @js.native
  sealed trait NOTIFICATION
    extends clovelcedDashPluginDashAudiomanagementLib.clovelcedDashPluginDashAudiomanagementMod.VolumeType
  
  @js.native
  sealed trait RING
    extends clovelcedDashPluginDashAudiomanagementLib.clovelcedDashPluginDashAudiomanagementMod.VolumeType
  
  @js.native
  sealed trait SYSTEM
    extends clovelcedDashPluginDashAudiomanagementLib.clovelcedDashPluginDashAudiomanagementMod.VolumeType
  
  /* 0 */ val MUSIC: MUSIC with scala.Double = js.native
  /* 1 */ val NOTIFICATION: NOTIFICATION with scala.Double = js.native
  /* 0 */ val RING: RING with scala.Double = js.native
  /* 2 */ val SYSTEM: SYSTEM with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    clovelcedDashPluginDashAudiomanagementLib.clovelcedDashPluginDashAudiomanagementMod.VolumeType with scala.Double
  ] = js.native
}

