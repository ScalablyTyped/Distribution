package typings.deezerDashSdk

import typings.deezerDashSdk.DeezerSdk.ConnectionStatus
import typings.deezerDashSdk.DeezerSdk.HttpMethod
import typings.deezerDashSdk.DeezerSdk.PlayerEvent
import typings.deezerDashSdk.DeezerSdk.RadioType
import typings.deezerDashSdk.DeezerSdk.WidgetFormat
import typings.deezerDashSdk.DeezerSdk.WidgetLayout
import typings.deezerDashSdk.DeezerSdk.WidgetSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object deezerDashSdkStrings {
  @js.native
  sealed trait DELETE extends HttpMethod
  
  @js.native
  sealed trait GET extends HttpMethod
  
  @js.native
  sealed trait POST extends HttpMethod
  
  @js.native
  sealed trait artist extends RadioType
  
  @js.native
  sealed trait big extends WidgetSize
  
  @js.native
  sealed trait classic extends WidgetFormat
  
  @js.native
  sealed trait connected extends ConnectionStatus
  
  @js.native
  sealed trait current_track extends PlayerEvent
  
  @js.native
  sealed trait dark extends WidgetLayout
  
  @js.native
  sealed trait light extends WidgetLayout
  
  @js.native
  sealed trait medium extends WidgetSize
  
  @js.native
  sealed trait mute_changed extends PlayerEvent
  
  @js.native
  sealed trait notConnected extends ConnectionStatus
  
  @js.native
  sealed trait not_authorized extends ConnectionStatus
  
  @js.native
  sealed trait player_buffering extends PlayerEvent
  
  @js.native
  sealed trait player_loaded extends PlayerEvent
  
  @js.native
  sealed trait player_paused extends PlayerEvent
  
  @js.native
  sealed trait player_play extends PlayerEvent
  
  @js.native
  sealed trait player_position extends PlayerEvent
  
  @js.native
  sealed trait radio extends RadioType
  
  @js.native
  sealed trait repeat_changed extends PlayerEvent
  
  @js.native
  sealed trait shuffle_changed extends PlayerEvent
  
  @js.native
  sealed trait small extends WidgetSize
  
  @js.native
  sealed trait square extends WidgetFormat
  
  @js.native
  sealed trait track_end extends PlayerEvent
  
  @js.native
  sealed trait tracklist_changed extends PlayerEvent
  
  @js.native
  sealed trait unknown extends ConnectionStatus
  
  @js.native
  sealed trait user extends RadioType
  
  @js.native
  sealed trait volume_changed extends PlayerEvent
  
  @scala.inline
  def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  @scala.inline
  def artist: artist = "artist".asInstanceOf[artist]
  @scala.inline
  def big: big = "big".asInstanceOf[big]
  @scala.inline
  def classic: classic = "classic".asInstanceOf[classic]
  @scala.inline
  def connected: connected = "connected".asInstanceOf[connected]
  @scala.inline
  def current_track: current_track = "current_track".asInstanceOf[current_track]
  @scala.inline
  def dark: dark = "dark".asInstanceOf[dark]
  @scala.inline
  def light: light = "light".asInstanceOf[light]
  @scala.inline
  def medium: medium = "medium".asInstanceOf[medium]
  @scala.inline
  def mute_changed: mute_changed = "mute_changed".asInstanceOf[mute_changed]
  @scala.inline
  def notConnected: notConnected = "notConnected".asInstanceOf[notConnected]
  @scala.inline
  def not_authorized: not_authorized = "not_authorized".asInstanceOf[not_authorized]
  @scala.inline
  def player_buffering: player_buffering = "player_buffering".asInstanceOf[player_buffering]
  @scala.inline
  def player_loaded: player_loaded = "player_loaded".asInstanceOf[player_loaded]
  @scala.inline
  def player_paused: player_paused = "player_paused".asInstanceOf[player_paused]
  @scala.inline
  def player_play: player_play = "player_play".asInstanceOf[player_play]
  @scala.inline
  def player_position: player_position = "player_position".asInstanceOf[player_position]
  @scala.inline
  def radio: radio = "radio".asInstanceOf[radio]
  @scala.inline
  def repeat_changed: repeat_changed = "repeat_changed".asInstanceOf[repeat_changed]
  @scala.inline
  def shuffle_changed: shuffle_changed = "shuffle_changed".asInstanceOf[shuffle_changed]
  @scala.inline
  def small: small = "small".asInstanceOf[small]
  @scala.inline
  def square: square = "square".asInstanceOf[square]
  @scala.inline
  def track_end: track_end = "track_end".asInstanceOf[track_end]
  @scala.inline
  def tracklist_changed: tracklist_changed = "tracklist_changed".asInstanceOf[tracklist_changed]
  @scala.inline
  def unknown: unknown = "unknown".asInstanceOf[unknown]
  @scala.inline
  def user: user = "user".asInstanceOf[user]
  @scala.inline
  def volume_changed: volume_changed = "volume_changed".asInstanceOf[volume_changed]
}

