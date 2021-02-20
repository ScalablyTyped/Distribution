package typings.chromecastCafSender.cast.framework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CastStateEventData extends EventData {
  
  var castState: CastState = js.native
}
object CastStateEventData {
  
  @scala.inline
  def apply(castState: CastState, `type`: String): CastStateEventData = {
    val __obj = js.Dynamic.literal(castState = castState.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CastStateEventData]
  }
  
  @scala.inline
  implicit class CastStateEventDataMutableBuilder[Self <: CastStateEventData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCastState(value: CastState): Self = StObject.set(x, "castState", value.asInstanceOf[js.Any])
  }
}
