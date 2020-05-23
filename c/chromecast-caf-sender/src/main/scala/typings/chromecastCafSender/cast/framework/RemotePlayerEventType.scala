package typings.chromecastCafSender.cast.framework

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
  
}

