package typings.deezerDashSdk.DeezerSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See:\
  * {@link https://developers.deezer.com/sdk/javascript/events | List of events}\
  * {@link https://developers.deezer.com/sdk/javascript/events-subscribe | Subscribe to an event}
  *
  * @remarks
  * This type is not needed to define the other types, but users may find it useful
  * in some situations anyway.
  */
/* Rewritten from type alias, can be one of: 
  - typings.deezerDashSdk.deezerDashSdkStrings.player_loaded
  - typings.deezerDashSdk.deezerDashSdkStrings.player_play
  - typings.deezerDashSdk.deezerDashSdkStrings.player_paused
  - typings.deezerDashSdk.deezerDashSdkStrings.player_position
  - typings.deezerDashSdk.deezerDashSdkStrings.player_buffering
  - typings.deezerDashSdk.deezerDashSdkStrings.volume_changed
  - typings.deezerDashSdk.deezerDashSdkStrings.shuffle_changed
  - typings.deezerDashSdk.deezerDashSdkStrings.repeat_changed
  - typings.deezerDashSdk.deezerDashSdkStrings.mute_changed
  - typings.deezerDashSdk.deezerDashSdkStrings.tracklist_changed
  - typings.deezerDashSdk.deezerDashSdkStrings.track_end
  - typings.deezerDashSdk.deezerDashSdkStrings.current_track
*/
trait PlayerEvent extends js.Object

object PlayerEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def current_track: typings.deezerDashSdk.deezerDashSdkStrings.current_track = this.cast("current_track")
  @scala.inline
  def mute_changed: typings.deezerDashSdk.deezerDashSdkStrings.mute_changed = this.cast("mute_changed")
  @scala.inline
  def player_buffering: typings.deezerDashSdk.deezerDashSdkStrings.player_buffering = this.cast("player_buffering")
  @scala.inline
  def player_loaded: typings.deezerDashSdk.deezerDashSdkStrings.player_loaded = this.cast("player_loaded")
  @scala.inline
  def player_paused: typings.deezerDashSdk.deezerDashSdkStrings.player_paused = this.cast("player_paused")
  @scala.inline
  def player_play: typings.deezerDashSdk.deezerDashSdkStrings.player_play = this.cast("player_play")
  @scala.inline
  def player_position: typings.deezerDashSdk.deezerDashSdkStrings.player_position = this.cast("player_position")
  @scala.inline
  def repeat_changed: typings.deezerDashSdk.deezerDashSdkStrings.repeat_changed = this.cast("repeat_changed")
  @scala.inline
  def shuffle_changed: typings.deezerDashSdk.deezerDashSdkStrings.shuffle_changed = this.cast("shuffle_changed")
  @scala.inline
  def track_end: typings.deezerDashSdk.deezerDashSdkStrings.track_end = this.cast("track_end")
  @scala.inline
  def tracklist_changed: typings.deezerDashSdk.deezerDashSdkStrings.tracklist_changed = this.cast("tracklist_changed")
  @scala.inline
  def volume_changed: typings.deezerDashSdk.deezerDashSdkStrings.volume_changed = this.cast("volume_changed")
}

