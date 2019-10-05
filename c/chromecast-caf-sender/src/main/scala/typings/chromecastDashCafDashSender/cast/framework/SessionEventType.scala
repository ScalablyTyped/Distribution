package typings.chromecastDashCafDashSender.cast.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SessionEventType extends js.Object

@JSGlobal("cast.framework.SessionEventType")
@js.native
object SessionEventType extends js.Object {
  @js.native
  sealed trait ACTIVE_INPUT_STATE_CHANGED extends SessionEventType
  
  @js.native
  sealed trait APPLICATION_METADATA_CHANGED extends SessionEventType
  
  @js.native
  sealed trait APPLICATION_STATUS_CHANGED extends SessionEventType
  
  @js.native
  sealed trait MEDIA_SESSION extends SessionEventType
  
  @js.native
  sealed trait VOLUME_CHANGED extends SessionEventType
  
  /* "activeinputstatechanged" */ val ACTIVE_INPUT_STATE_CHANGED: typings.chromecastDashCafDashSender.cast.framework.SessionEventType.ACTIVE_INPUT_STATE_CHANGED with String = js.native
  /* "applicationmetadatachanged" */ val APPLICATION_METADATA_CHANGED: typings.chromecastDashCafDashSender.cast.framework.SessionEventType.APPLICATION_METADATA_CHANGED with String = js.native
  /* "applicationstatuschanged" */ val APPLICATION_STATUS_CHANGED: typings.chromecastDashCafDashSender.cast.framework.SessionEventType.APPLICATION_STATUS_CHANGED with String = js.native
  /* "mediasession" */ val MEDIA_SESSION: typings.chromecastDashCafDashSender.cast.framework.SessionEventType.MEDIA_SESSION with String = js.native
  /* "volumechanged" */ val VOLUME_CHANGED: typings.chromecastDashCafDashSender.cast.framework.SessionEventType.VOLUME_CHANGED with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SessionEventType with String] = js.native
}

