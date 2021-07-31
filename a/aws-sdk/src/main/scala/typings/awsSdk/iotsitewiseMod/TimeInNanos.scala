package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeInNanos extends StObject {
  
  /**
    * The nanosecond offset from timeInSeconds.
    */
  var offsetInNanos: js.UndefOr[OffsetInNanos] = js.undefined
  
  /**
    * The timestamp date, in seconds, in the Unix epoch format. Fractional nanosecond data is provided by offsetInNanos.
    */
  var timeInSeconds: TimeInSeconds
}
object TimeInNanos {
  
  @scala.inline
  def apply(timeInSeconds: TimeInSeconds): TimeInNanos = {
    val __obj = js.Dynamic.literal(timeInSeconds = timeInSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeInNanos]
  }
  
  @scala.inline
  implicit class TimeInNanosMutableBuilder[Self <: TimeInNanos] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOffsetInNanos(value: OffsetInNanos): Self = StObject.set(x, "offsetInNanos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetInNanosUndefined: Self = StObject.set(x, "offsetInNanos", js.undefined)
    
    @scala.inline
    def setTimeInSeconds(value: TimeInSeconds): Self = StObject.set(x, "timeInSeconds", value.asInstanceOf[js.Any])
  }
}
