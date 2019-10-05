package typings.chromecastDashCafDashSender.cast.framework

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
  sealed trait MEDIA_INFO_CHANGED extends RemotePlayerEventType
  
  @js.native
  sealed trait PLAYER_STATE_CHANGED extends RemotePlayerEventType
  
  @js.native
  sealed trait STATUS_TEXT_CHANGED extends RemotePlayerEventType
  
  @js.native
  sealed trait TITLE_CHANGED extends RemotePlayerEventType
  
  @js.native
  sealed trait VOLUME_LEVEL_CHANGED extends RemotePlayerEventType
  
  /* "anyChanged" */ val ANY_CHANGE: typings.chromecastDashCafDashSender.cast.framework.RemotePlayerEventType.ANY_CHANGE with String = js.native
  /* "canControlVolumeChanged" */ val CAN_CONTROL_VOLUME_CHANGED: typings.chromecastDashCafDashSender.cast.framework.RemotePlayerEventType.CAN_CONTROL_VOLUME_CHANGED with String = js.native
  /* "canPauseChanged" */ val CAN_PAUSE_CHANGED: typings.chromecastDashCafDashSender.cast.framework.RemotePlayerEventType.CAN_PAUSE_CHANGED with String = js.native
  /* "canSeekChanged" */ val CAN_SEEK_CHANGED: typings.chromecastDashCafDashSender.cast.framework.RemotePlayerEventType.CAN_SEEK_CHANGED with String = js.native
  /* "currentTimeChanged" */ val CURRENT_TIME_CHANGED: typings.chromecastDashCafDashSender.cast.framework.RemotePlayerEventType.CURRENT_TIME_CHANGED with String = js.native
  /* "displayNameChanged" */ val DISPLAY_NAME_CHANGED: typings.chromecastDashCafDashSender.cast.framework.RemotePlayerEventType.DISPLAY_NAME_CHANGED with String = js.native
  /* "displayStatusChanged" */ val DISPLAY_STATUS_CHANGED: typings.chromecastDashCafDashSender.cast.framework.RemotePlayerEventType.DISPLAY_STATUS_CHANGED with String = js.native
  /* "durationChanged" */ val DURATION_CHANGED: typings.chromecastDashCafDashSender.cast.framework.RemotePlayerEventType.DURATION_CHANGED with String = js.native
  /* "imageUrlChanged" */ val IMAGE_URL_CHANGED: typings.chromecastDashCafDashSender.cast.framework.RemotePlayerEventType.IMAGE_URL_CHANGED with String = js.native
  /* "isConnectedChanged" */ val IS_CONNECTED_CHANGED: typings.chromecastDashCafDashSender.cast.framework.RemotePlayerEventType.IS_CONNECTED_CHANGED with String = js.native
  /* "isMediaLoadedChanged" */ val IS_MEDIA_LOADED_CHANGED: typings.chromecastDashCafDashSender.cast.framework.RemotePlayerEventType.IS_MEDIA_LOADED_CHANGED with String = js.native
  /* "isMutedChanged" */ val IS_MUTED_CHANGED: typings.chromecastDashCafDashSender.cast.framework.RemotePlayerEventType.IS_MUTED_CHANGED with String = js.native
  /* "isPausedChanged" */ val IS_PAUSED_CHANGED: typings.chromecastDashCafDashSender.cast.framework.RemotePlayerEventType.IS_PAUSED_CHANGED with String = js.native
  /* "mediaInfoChanged" */ val MEDIA_INFO_CHANGED: typings.chromecastDashCafDashSender.cast.framework.RemotePlayerEventType.MEDIA_INFO_CHANGED with String = js.native
  /* "playerStateChanged" */ val PLAYER_STATE_CHANGED: typings.chromecastDashCafDashSender.cast.framework.RemotePlayerEventType.PLAYER_STATE_CHANGED with String = js.native
  /* "statusTextChanged" */ val STATUS_TEXT_CHANGED: typings.chromecastDashCafDashSender.cast.framework.RemotePlayerEventType.STATUS_TEXT_CHANGED with String = js.native
  /* "titleChanged" */ val TITLE_CHANGED: typings.chromecastDashCafDashSender.cast.framework.RemotePlayerEventType.TITLE_CHANGED with String = js.native
  /* "volumeLevelChanged" */ val VOLUME_LEVEL_CHANGED: typings.chromecastDashCafDashSender.cast.framework.RemotePlayerEventType.VOLUME_LEVEL_CHANGED with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RemotePlayerEventType with String] = js.native
}

