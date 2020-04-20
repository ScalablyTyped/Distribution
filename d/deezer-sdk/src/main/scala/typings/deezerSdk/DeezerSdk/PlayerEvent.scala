package typings.deezerSdk.DeezerSdk

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
  - typings.deezerSdk.deezerSdkStrings.player_loaded
  - typings.deezerSdk.deezerSdkStrings.player_play
  - typings.deezerSdk.deezerSdkStrings.player_paused
  - typings.deezerSdk.deezerSdkStrings.player_position
  - typings.deezerSdk.deezerSdkStrings.player_buffering
  - typings.deezerSdk.deezerSdkStrings.volume_changed
  - typings.deezerSdk.deezerSdkStrings.shuffle_changed
  - typings.deezerSdk.deezerSdkStrings.repeat_changed
  - typings.deezerSdk.deezerSdkStrings.mute_changed
  - typings.deezerSdk.deezerSdkStrings.tracklist_changed
  - typings.deezerSdk.deezerSdkStrings.track_end
  - typings.deezerSdk.deezerSdkStrings.current_track
*/
trait PlayerEvent extends js.Object

object PlayerEvent {
  @scala.inline
  def current_track: typings.deezerSdk.deezerSdkStrings.current_track = "current_track".asInstanceOf[typings.deezerSdk.deezerSdkStrings.current_track]
  @scala.inline
  def mute_changed: typings.deezerSdk.deezerSdkStrings.mute_changed = "mute_changed".asInstanceOf[typings.deezerSdk.deezerSdkStrings.mute_changed]
  @scala.inline
  def player_buffering: typings.deezerSdk.deezerSdkStrings.player_buffering = "player_buffering".asInstanceOf[typings.deezerSdk.deezerSdkStrings.player_buffering]
  @scala.inline
  def player_loaded: typings.deezerSdk.deezerSdkStrings.player_loaded = "player_loaded".asInstanceOf[typings.deezerSdk.deezerSdkStrings.player_loaded]
  @scala.inline
  def player_paused: typings.deezerSdk.deezerSdkStrings.player_paused = "player_paused".asInstanceOf[typings.deezerSdk.deezerSdkStrings.player_paused]
  @scala.inline
  def player_play: typings.deezerSdk.deezerSdkStrings.player_play = "player_play".asInstanceOf[typings.deezerSdk.deezerSdkStrings.player_play]
  @scala.inline
  def player_position: typings.deezerSdk.deezerSdkStrings.player_position = "player_position".asInstanceOf[typings.deezerSdk.deezerSdkStrings.player_position]
  @scala.inline
  def repeat_changed: typings.deezerSdk.deezerSdkStrings.repeat_changed = "repeat_changed".asInstanceOf[typings.deezerSdk.deezerSdkStrings.repeat_changed]
  @scala.inline
  def shuffle_changed: typings.deezerSdk.deezerSdkStrings.shuffle_changed = "shuffle_changed".asInstanceOf[typings.deezerSdk.deezerSdkStrings.shuffle_changed]
  @scala.inline
  def track_end: typings.deezerSdk.deezerSdkStrings.track_end = "track_end".asInstanceOf[typings.deezerSdk.deezerSdkStrings.track_end]
  @scala.inline
  def tracklist_changed: typings.deezerSdk.deezerSdkStrings.tracklist_changed = "tracklist_changed".asInstanceOf[typings.deezerSdk.deezerSdkStrings.tracklist_changed]
  @scala.inline
  def volume_changed: typings.deezerSdk.deezerSdkStrings.volume_changed = "volume_changed".asInstanceOf[typings.deezerSdk.deezerSdkStrings.volume_changed]
}

