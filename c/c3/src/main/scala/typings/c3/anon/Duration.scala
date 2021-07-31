package typings.c3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Duration extends StObject {
  
  /**
    * Set duration of transition (in milliseconds) for chart animation.
    * Note: If `0` or `null` set, transition will be skipped. So, this makes initial rendering faster especially in case you have a lot of data.
    */
  var duration: js.UndefOr[Double | Null] = js.undefined
}
object Duration {
  
  @scala.inline
  def apply(): Duration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Duration]
  }
  
  @scala.inline
  implicit class DurationMutableBuilder[Self <: Duration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationNull: Self = StObject.set(x, "duration", null)
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
  }
}
