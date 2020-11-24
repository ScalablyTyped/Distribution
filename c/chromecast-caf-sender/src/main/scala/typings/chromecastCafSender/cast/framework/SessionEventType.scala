package typings.chromecastCafSender.cast.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
