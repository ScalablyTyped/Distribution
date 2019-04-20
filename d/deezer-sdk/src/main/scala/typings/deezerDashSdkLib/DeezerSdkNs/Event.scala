package typings
package deezerDashSdkLib.DeezerSdkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#region Player Events
/**
  * Allows you to listen to all player-related events.
  *
  * See:\
  * {@link https://developers.deezer.com/sdk/javascript/events | List of events}\
  * {@link https://developers.deezer.com/sdk/javascript/events-subscribe | Subscribe to an event}
  */
@js.native
trait Event extends js.Object {
  @JSName("subscribe")
  def subscribe_current_track(
    event: deezerDashSdkLib.deezerDashSdkLibStrings.current_track,
    callback: js.Function1[/* currentTrackInfo */ deezerDashSdkLib.Anon_Index, scala.Unit]
  ): scala.Unit = js.native
  @JSName("subscribe")
  def subscribe_mute_changed(
    event: deezerDashSdkLib.deezerDashSdkLibStrings.mute_changed,
    callback: js.Function1[/* mute */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  @JSName("subscribe")
  def subscribe_player_buffering(
    event: deezerDashSdkLib.deezerDashSdkLibStrings.player_buffering,
    callback: js.Function1[/* loadedPercentInt */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  /**
    * See: {@link https://developers.deezer.com/sdk/javascript/events | List of events}
    */
  @JSName("subscribe")
  def subscribe_player_loaded(event: deezerDashSdkLib.deezerDashSdkLibStrings.player_loaded, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("subscribe")
  def subscribe_player_paused(event: deezerDashSdkLib.deezerDashSdkLibStrings.player_paused, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("subscribe")
  def subscribe_player_play(event: deezerDashSdkLib.deezerDashSdkLibStrings.player_play, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("subscribe")
  def subscribe_player_position(
    event: deezerDashSdkLib.deezerDashSdkLibStrings.player_position,
    callback: js.Function1[
      /* positionSecondsFloat_durationSecondsInt */ js.Tuple2[scala.Double, scala.Double], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("subscribe")
  def subscribe_repeat_changed(
    event: deezerDashSdkLib.deezerDashSdkLibStrings.repeat_changed,
    callback: js.Function1[/* repeatMode */ RepeatMode, scala.Unit]
  ): scala.Unit = js.native
  @JSName("subscribe")
  def subscribe_shuffle_changed(
    event: deezerDashSdkLib.deezerDashSdkLibStrings.shuffle_changed,
    callback: js.Function1[/* shuffle */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  @JSName("subscribe")
  def subscribe_track_end(
    event: deezerDashSdkLib.deezerDashSdkLibStrings.track_end,
    callback: js.Function1[/* trackPosition */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  @JSName("subscribe")
  def subscribe_tracklist_changed(
    event: deezerDashSdkLib.deezerDashSdkLibStrings.tracklist_changed,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  @JSName("subscribe")
  def subscribe_volume_changed(
    event: deezerDashSdkLib.deezerDashSdkLibStrings.volume_changed,
    callback: js.Function1[/* volumePercentInt */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
}

