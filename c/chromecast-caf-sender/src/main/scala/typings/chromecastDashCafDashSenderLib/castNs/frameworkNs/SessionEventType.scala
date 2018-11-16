package typings
package chromecastDashCafDashSenderLib.castNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SessionEventType extends js.Object

@JSGlobal("cast.framework.SessionEventType")
@js.native
object SessionEventType extends js.Object {
  @js.native
  sealed trait ACTIVE_INPUT_STATE_CHANGED
    extends chromecastDashCafDashSenderLib.castNs.frameworkNs.SessionEventType
  
  @js.native
  sealed trait APPLICATION_METADATA_CHANGED
    extends chromecastDashCafDashSenderLib.castNs.frameworkNs.SessionEventType
  
  @js.native
  sealed trait APPLICATION_STATUS_CHANGED
    extends chromecastDashCafDashSenderLib.castNs.frameworkNs.SessionEventType
  
  @js.native
  sealed trait MEDIA_SESSION
    extends chromecastDashCafDashSenderLib.castNs.frameworkNs.SessionEventType
  
  @js.native
  sealed trait VOLUME_CHANGED
    extends chromecastDashCafDashSenderLib.castNs.frameworkNs.SessionEventType
  
  /* "activeinputstatechanged" */ val ACTIVE_INPUT_STATE_CHANGED: ACTIVE_INPUT_STATE_CHANGED with java.lang.String = js.native
  /* "applicationmetadatachanged" */ val APPLICATION_METADATA_CHANGED: APPLICATION_METADATA_CHANGED with java.lang.String = js.native
  /* "applicationstatuschanged" */ val APPLICATION_STATUS_CHANGED: APPLICATION_STATUS_CHANGED with java.lang.String = js.native
  /* "mediasession" */ val MEDIA_SESSION: MEDIA_SESSION with java.lang.String = js.native
  /* "volumechanged" */ val VOLUME_CHANGED: VOLUME_CHANGED with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    chromecastDashCafDashSenderLib.castNs.frameworkNs.SessionEventType with java.lang.String
  ] = js.native
}

