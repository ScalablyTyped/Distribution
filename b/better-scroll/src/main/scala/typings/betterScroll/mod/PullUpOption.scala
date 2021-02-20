package typings.betterScroll.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PullUpOption extends StObject {
  
  var threshold: Double = js.native
}
object PullUpOption {
  
  @scala.inline
  def apply(threshold: Double): PullUpOption = {
    val __obj = js.Dynamic.literal(threshold = threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullUpOption]
  }
  
  @scala.inline
  implicit class PullUpOptionMutableBuilder[Self <: PullUpOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
  }
}
