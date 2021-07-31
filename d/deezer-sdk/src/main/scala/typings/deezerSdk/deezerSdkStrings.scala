package typings.deezerSdk

import typings.deezerSdk.DeezerSdk.ConnectionStatus
import typings.deezerSdk.DeezerSdk.HttpMethod
import typings.deezerSdk.DeezerSdk.PlayerEvent
import typings.deezerSdk.DeezerSdk.RadioType
import typings.deezerSdk.DeezerSdk.WidgetFormat
import typings.deezerSdk.DeezerSdk.WidgetLayout
import typings.deezerSdk.DeezerSdk.WidgetSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deezerSdkStrings {
  
  @js.native
  sealed trait DELETE
    extends StObject
       with HttpMethod
  @scala.inline
  def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  
  @js.native
  sealed trait GET
    extends StObject
       with HttpMethod
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait POST
    extends StObject
       with HttpMethod
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait artist
    extends StObject
       with RadioType
  @scala.inline
  def artist: artist = "artist".asInstanceOf[artist]
  
  @js.native
  sealed trait big
    extends StObject
       with WidgetSize
  @scala.inline
  def big: big = "big".asInstanceOf[big]
  
  @js.native
  sealed trait classic
    extends StObject
       with WidgetFormat
  @scala.inline
  def classic: classic = "classic".asInstanceOf[classic]
  
  @js.native
  sealed trait connected
    extends StObject
       with ConnectionStatus
  @scala.inline
  def connected: connected = "connected".asInstanceOf[connected]
  
  @js.native
  sealed trait current_track
    extends StObject
       with PlayerEvent
  @scala.inline
  def current_track: current_track = "current_track".asInstanceOf[current_track]
  
  @js.native
  sealed trait dark
    extends StObject
       with WidgetLayout
  @scala.inline
  def dark: dark = "dark".asInstanceOf[dark]
  
  @js.native
  sealed trait light
    extends StObject
       with WidgetLayout
  @scala.inline
  def light: light = "light".asInstanceOf[light]
  
  @js.native
  sealed trait medium
    extends StObject
       with WidgetSize
  @scala.inline
  def medium: medium = "medium".asInstanceOf[medium]
  
  @js.native
  sealed trait mute_changed
    extends StObject
       with PlayerEvent
  @scala.inline
  def mute_changed: mute_changed = "mute_changed".asInstanceOf[mute_changed]
  
  @js.native
  sealed trait notConnected
    extends StObject
       with ConnectionStatus
  @scala.inline
  def notConnected: notConnected = "notConnected".asInstanceOf[notConnected]
  
  @js.native
  sealed trait not_authorized
    extends StObject
       with ConnectionStatus
  @scala.inline
  def not_authorized: not_authorized = "not_authorized".asInstanceOf[not_authorized]
  
  @js.native
  sealed trait player_buffering
    extends StObject
       with PlayerEvent
  @scala.inline
  def player_buffering: player_buffering = "player_buffering".asInstanceOf[player_buffering]
  
  @js.native
  sealed trait player_loaded
    extends StObject
       with PlayerEvent
  @scala.inline
  def player_loaded: player_loaded = "player_loaded".asInstanceOf[player_loaded]
  
  @js.native
  sealed trait player_paused
    extends StObject
       with PlayerEvent
  @scala.inline
  def player_paused: player_paused = "player_paused".asInstanceOf[player_paused]
  
  @js.native
  sealed trait player_play
    extends StObject
       with PlayerEvent
  @scala.inline
  def player_play: player_play = "player_play".asInstanceOf[player_play]
  
  @js.native
  sealed trait player_position
    extends StObject
       with PlayerEvent
  @scala.inline
  def player_position: player_position = "player_position".asInstanceOf[player_position]
  
  @js.native
  sealed trait radio
    extends StObject
       with RadioType
  @scala.inline
  def radio: radio = "radio".asInstanceOf[radio]
  
  @js.native
  sealed trait repeat_changed
    extends StObject
       with PlayerEvent
  @scala.inline
  def repeat_changed: repeat_changed = "repeat_changed".asInstanceOf[repeat_changed]
  
  @js.native
  sealed trait shuffle_changed
    extends StObject
       with PlayerEvent
  @scala.inline
  def shuffle_changed: shuffle_changed = "shuffle_changed".asInstanceOf[shuffle_changed]
  
  @js.native
  sealed trait small
    extends StObject
       with WidgetSize
  @scala.inline
  def small: small = "small".asInstanceOf[small]
  
  @js.native
  sealed trait square
    extends StObject
       with WidgetFormat
  @scala.inline
  def square: square = "square".asInstanceOf[square]
  
  @js.native
  sealed trait track_end
    extends StObject
       with PlayerEvent
  @scala.inline
  def track_end: track_end = "track_end".asInstanceOf[track_end]
  
  @js.native
  sealed trait tracklist_changed
    extends StObject
       with PlayerEvent
  @scala.inline
  def tracklist_changed: tracklist_changed = "tracklist_changed".asInstanceOf[tracklist_changed]
  
  @js.native
  sealed trait unknown
    extends StObject
       with ConnectionStatus
  @scala.inline
  def unknown: unknown = "unknown".asInstanceOf[unknown]
  
  @js.native
  sealed trait user
    extends StObject
       with RadioType
  @scala.inline
  def user: user = "user".asInstanceOf[user]
  
  @js.native
  sealed trait volume_changed
    extends StObject
       with PlayerEvent
  @scala.inline
  def volume_changed: volume_changed = "volume_changed".asInstanceOf[volume_changed]
}
