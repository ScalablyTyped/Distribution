package typings.chromecastDashCafDashSender.cast.framework

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SessionEventType with String] = js.native
  /* "activeinputstatechanged" */ @js.native
  object ACTIVE_INPUT_STATE_CHANGED extends TopLevel[ACTIVE_INPUT_STATE_CHANGED with String]
  
  /* "applicationmetadatachanged" */ @js.native
  object APPLICATION_METADATA_CHANGED extends TopLevel[APPLICATION_METADATA_CHANGED with String]
  
  /* "applicationstatuschanged" */ @js.native
  object APPLICATION_STATUS_CHANGED extends TopLevel[APPLICATION_STATUS_CHANGED with String]
  
  /* "mediasession" */ @js.native
  object MEDIA_SESSION extends TopLevel[MEDIA_SESSION with String]
  
  /* "volumechanged" */ @js.native
  object VOLUME_CHANGED extends TopLevel[VOLUME_CHANGED with String]
  
}

