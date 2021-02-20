package typings.chromecastCafSender.cast.framework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CastContextEventType extends StObject
@JSGlobal("cast.framework.CastContextEventType")
@js.native
object CastContextEventType extends StObject {
  
  @js.native
  sealed trait CAST_STATE_CHANGED extends CastContextEventType
  
  @js.native
  sealed trait SESSION_STATE_CHANGED extends CastContextEventType
}
