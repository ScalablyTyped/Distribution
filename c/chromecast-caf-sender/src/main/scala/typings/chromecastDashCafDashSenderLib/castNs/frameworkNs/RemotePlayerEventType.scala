package typings
package chromecastDashCafDashSenderLib.castNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RemotePlayerEventType extends js.Object

@JSGlobal("cast.framework.RemotePlayerEventType")
@js.native
object RemotePlayerEventType extends js.Object {
  @js.native
  sealed trait ANY_CHANGE
    extends chromecastDashCafDashSenderLib.castNs.frameworkNs.RemotePlayerEventType
  
  @js.native
  sealed trait CAN_CONTROL_VOLUME_CHANGED
    extends chromecastDashCafDashSenderLib.castNs.frameworkNs.RemotePlayerEventType
  
  @js.native
  sealed trait CAN_PAUSE_CHANGED
    extends chromecastDashCafDashSenderLib.castNs.frameworkNs.RemotePlayerEventType
  
  @js.native
  sealed trait CAN_SEEK_CHANGED
    extends chromecastDashCafDashSenderLib.castNs.frameworkNs.RemotePlayerEventType
  
  @js.native
  sealed trait CURRENT_TIME_CHANGED
    extends chromecastDashCafDashSenderLib.castNs.frameworkNs.RemotePlayerEventType
  
  @js.native
  sealed trait DISPLAY_NAME_CHANGED
    extends chromecastDashCafDashSenderLib.castNs.frameworkNs.RemotePlayerEventType
  
  @js.native
  sealed trait DISPLAY_STATUS_CHANGED
    extends chromecastDashCafDashSenderLib.castNs.frameworkNs.RemotePlayerEventType
  
  @js.native
  sealed trait DURATION_CHANGED
    extends chromecastDashCafDashSenderLib.castNs.frameworkNs.RemotePlayerEventType
  
  @js.native
  sealed trait IMAGE_URL_CHANGED
    extends chromecastDashCafDashSenderLib.castNs.frameworkNs.RemotePlayerEventType
  
  @js.native
  sealed trait IS_CONNECTED_CHANGED
    extends chromecastDashCafDashSenderLib.castNs.frameworkNs.RemotePlayerEventType
  
  @js.native
  sealed trait IS_MEDIA_LOADED_CHANGED
    extends chromecastDashCafDashSenderLib.castNs.frameworkNs.RemotePlayerEventType
  
  @js.native
  sealed trait IS_MUTED_CHANGED
    extends chromecastDashCafDashSenderLib.castNs.frameworkNs.RemotePlayerEventType
  
  @js.native
  sealed trait IS_PAUSED_CHANGED
    extends chromecastDashCafDashSenderLib.castNs.frameworkNs.RemotePlayerEventType
  
  @js.native
  sealed trait MEDIA_INFO_CHANGED
    extends chromecastDashCafDashSenderLib.castNs.frameworkNs.RemotePlayerEventType
  
  @js.native
  sealed trait PLAYER_STATE_CHANGED
    extends chromecastDashCafDashSenderLib.castNs.frameworkNs.RemotePlayerEventType
  
  @js.native
  sealed trait STATUS_TEXT_CHANGED
    extends chromecastDashCafDashSenderLib.castNs.frameworkNs.RemotePlayerEventType
  
  @js.native
  sealed trait TITLE_CHANGED
    extends chromecastDashCafDashSenderLib.castNs.frameworkNs.RemotePlayerEventType
  
  @js.native
  sealed trait VOLUME_LEVEL_CHANGED
    extends chromecastDashCafDashSenderLib.castNs.frameworkNs.RemotePlayerEventType
  
  /* "anyChanged" */ val ANY_CHANGE: ANY_CHANGE with java.lang.String = js.native
  /* "canControlVolumeChanged" */ val CAN_CONTROL_VOLUME_CHANGED: CAN_CONTROL_VOLUME_CHANGED with java.lang.String = js.native
  /* "canPauseChanged" */ val CAN_PAUSE_CHANGED: CAN_PAUSE_CHANGED with java.lang.String = js.native
  /* "canSeekChanged" */ val CAN_SEEK_CHANGED: CAN_SEEK_CHANGED with java.lang.String = js.native
  /* "currentTimeChanged" */ val CURRENT_TIME_CHANGED: CURRENT_TIME_CHANGED with java.lang.String = js.native
  /* "displayNameChanged" */ val DISPLAY_NAME_CHANGED: DISPLAY_NAME_CHANGED with java.lang.String = js.native
  /* "displayStatusChanged" */ val DISPLAY_STATUS_CHANGED: DISPLAY_STATUS_CHANGED with java.lang.String = js.native
  /* "durationChanged" */ val DURATION_CHANGED: DURATION_CHANGED with java.lang.String = js.native
  /* "imageUrlChanged" */ val IMAGE_URL_CHANGED: IMAGE_URL_CHANGED with java.lang.String = js.native
  /* "isConnectedChanged" */ val IS_CONNECTED_CHANGED: IS_CONNECTED_CHANGED with java.lang.String = js.native
  /* "isMediaLoadedChanged" */ val IS_MEDIA_LOADED_CHANGED: IS_MEDIA_LOADED_CHANGED with java.lang.String = js.native
  /* "isMutedChanged" */ val IS_MUTED_CHANGED: IS_MUTED_CHANGED with java.lang.String = js.native
  /* "isPausedChanged" */ val IS_PAUSED_CHANGED: IS_PAUSED_CHANGED with java.lang.String = js.native
  /* "mediaInfoChanged" */ val MEDIA_INFO_CHANGED: MEDIA_INFO_CHANGED with java.lang.String = js.native
  /* "playerStateChanged" */ val PLAYER_STATE_CHANGED: PLAYER_STATE_CHANGED with java.lang.String = js.native
  /* "statusTextChanged" */ val STATUS_TEXT_CHANGED: STATUS_TEXT_CHANGED with java.lang.String = js.native
  /* "titleChanged" */ val TITLE_CHANGED: TITLE_CHANGED with java.lang.String = js.native
  /* "volumeLevelChanged" */ val VOLUME_LEVEL_CHANGED: VOLUME_LEVEL_CHANGED with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    chromecastDashCafDashSenderLib.castNs.frameworkNs.RemotePlayerEventType with java.lang.String
  ] = js.native
}

