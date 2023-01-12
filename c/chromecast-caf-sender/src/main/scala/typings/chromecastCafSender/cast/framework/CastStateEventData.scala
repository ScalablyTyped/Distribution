package typings.chromecastCafSender.cast.framework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CastStateEventData
  extends StObject
     with EventData {
  
  var castState: CastState
}
object CastStateEventData {
  
  inline def apply(castState: CastState, `type`: String): CastStateEventData = {
    val __obj = js.Dynamic.literal(castState = castState.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CastStateEventData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CastStateEventData] (val x: Self) extends AnyVal {
    
    inline def setCastState(value: CastState): Self = StObject.set(x, "castState", value.asInstanceOf[js.Any])
  }
}
