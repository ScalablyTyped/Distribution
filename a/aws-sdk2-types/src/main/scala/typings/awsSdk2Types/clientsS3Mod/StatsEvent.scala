package typings.awsSdk2Types.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatsEvent extends StObject {
  
  /**
    * The Stats event details.
    */
  var Details: js.UndefOr[Stats] = js.undefined
}
object StatsEvent {
  
  inline def apply(): StatsEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatsEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StatsEvent] (val x: Self) extends AnyVal {
    
    inline def setDetails(value: Stats): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "Details", js.undefined)
  }
}
