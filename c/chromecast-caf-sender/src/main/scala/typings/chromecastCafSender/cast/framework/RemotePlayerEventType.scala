package typings.chromecastCafSender.cast.framework

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RemotePlayerEventType extends js.Object

@JSGlobal("cast.framework.RemotePlayerEventType")
@js.native
object RemotePlayerEventType extends js.Object {
  @js.native
  sealed trait ANY_CHANGE extends RemotePlayerEventType
  
  @js.native
  sealed trait CAN_CONTROL_VOLUME_CHANGED extends RemotePlayerEventType
  
  @js.native
  sealed trait CAN_PAUSE_CHANGED extends RemotePlayerEventType
  
  @js.native
  sealed trait CAN_SEEK_CHANGED extends RemotePlayerEventType
  
  @js.native
  sealed trait CURRENT_TIME_CHANGED extends RemotePlayerEventType
  
  @js.native
  sealed trait DISPLAY_NAME_CHANGED extends RemotePlayerEventType
  
  @js.native
  sealed trait DISPLAY_STATUS_CHANGED extends RemotePlayerEventType
  
  @js.native
  sealed trait DURATION_CHANGED extends RemotePlayerEventType
  
  @js.native
  sealed trait IMAGE_URL_CHANGED extends RemotePlayerEventType
  
  @js.native
  sealed trait IS_CONNECTED_CHANGED extends RemotePlayerEventType
  
  @js.native
  sealed trait IS_MEDIA_LOADED_CHANGED extends RemotePlayerEventType
  
  @js.native
  sealed trait IS_MUTED_CHANGED extends RemotePlayerEventType
  
  @js.native
  sealed trait IS_PAUSED_CHANGED extends RemotePlayerEventType
  
  @js.native
  sealed trait LIVE_SEEKABLE_RANGE_CHANGED extends RemotePlayerEventType
  
  @js.native
  sealed trait MEDIA_INFO_CHANGED extends RemotePlayerEventType
  
  @js.native
  sealed trait PLAYER_STATE_CHANGED extends RemotePlayerEventType
  
  @js.native
  sealed trait STATUS_TEXT_CHANGED extends RemotePlayerEventType
  
  @js.native
  sealed trait TITLE_CHANGED extends RemotePlayerEventType
  
  @js.native
  sealed trait VOLUME_LEVEL_CHANGED extends RemotePlayerEventType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RemotePlayerEventType with String] = js.native
  /* "anyChanged" */ @js.native
  object ANY_CHANGE extends TopLevel[ANY_CHANGE with String]
  
  /* "canControlVolumeChanged" */ @js.native
  object CAN_CONTROL_VOLUME_CHANGED extends TopLevel[CAN_CONTROL_VOLUME_CHANGED with String]
  
  /* "canPauseChanged" */ @js.native
  object CAN_PAUSE_CHANGED extends TopLevel[CAN_PAUSE_CHANGED with String]
  
  /* "canSeekChanged" */ @js.native
  object CAN_SEEK_CHANGED extends TopLevel[CAN_SEEK_CHANGED with String]
  
  /* "currentTimeChanged" */ @js.native
  object CURRENT_TIME_CHANGED extends TopLevel[CURRENT_TIME_CHANGED with String]
  
  /* "displayNameChanged" */ @js.native
  object DISPLAY_NAME_CHANGED extends TopLevel[DISPLAY_NAME_CHANGED with String]
  
  /* "displayStatusChanged" */ @js.native
  object DISPLAY_STATUS_CHANGED extends TopLevel[DISPLAY_STATUS_CHANGED with String]
  
  /* "durationChanged" */ @js.native
  object DURATION_CHANGED extends TopLevel[DURATION_CHANGED with String]
  
  /* "imageUrlChanged" */ @js.native
  object IMAGE_URL_CHANGED extends TopLevel[IMAGE_URL_CHANGED with String]
  
  /* "isConnectedChanged" */ @js.native
  object IS_CONNECTED_CHANGED extends TopLevel[IS_CONNECTED_CHANGED with String]
  
  /* "isMediaLoadedChanged" */ @js.native
  object IS_MEDIA_LOADED_CHANGED extends TopLevel[IS_MEDIA_LOADED_CHANGED with String]
  
  /* "isMutedChanged" */ @js.native
  object IS_MUTED_CHANGED extends TopLevel[IS_MUTED_CHANGED with String]
  
  /* "isPausedChanged" */ @js.native
  object IS_PAUSED_CHANGED extends TopLevel[IS_PAUSED_CHANGED with String]
  
  /* "liveSeekableRange" */ @js.native
  object LIVE_SEEKABLE_RANGE_CHANGED extends TopLevel[LIVE_SEEKABLE_RANGE_CHANGED with String]
  
  /* "mediaInfoChanged" */ @js.native
  object MEDIA_INFO_CHANGED extends TopLevel[MEDIA_INFO_CHANGED with String]
  
  /* "playerStateChanged" */ @js.native
  object PLAYER_STATE_CHANGED extends TopLevel[PLAYER_STATE_CHANGED with String]
  
  /* "statusTextChanged" */ @js.native
  object STATUS_TEXT_CHANGED extends TopLevel[STATUS_TEXT_CHANGED with String]
  
  /* "titleChanged" */ @js.native
  object TITLE_CHANGED extends TopLevel[TITLE_CHANGED with String]
  
  /* "volumeLevelChanged" */ @js.native
  object VOLUME_LEVEL_CHANGED extends TopLevel[VOLUME_LEVEL_CHANGED with String]
  
}

