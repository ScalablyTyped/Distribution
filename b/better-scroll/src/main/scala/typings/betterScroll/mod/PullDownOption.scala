package typings.betterScroll.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PullDownOption extends StObject {
  
  var stop: Double = js.native
  
  var threshold: Double = js.native
}
object PullDownOption {
  
  @scala.inline
  def apply(stop: Double, threshold: Double): PullDownOption = {
    val __obj = js.Dynamic.literal(stop = stop.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullDownOption]
  }
  
  @scala.inline
  implicit class PullDownOptionMutableBuilder[Self <: PullDownOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStop(value: Double): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
  }
}
