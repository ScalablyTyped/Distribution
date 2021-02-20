package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatsEvent extends StObject {
  
  /**
    * The Stats event details.
    */
  var Details: js.UndefOr[Stats] = js.native
}
object StatsEvent {
  
  @scala.inline
  def apply(): StatsEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatsEvent]
  }
  
  @scala.inline
  implicit class StatsEventMutableBuilder[Self <: StatsEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: Stats): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "Details", js.undefined)
  }
}
