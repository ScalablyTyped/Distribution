package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationTimeline extends StObject {
  
  val currentTime: Double | Null
}
object AnimationTimeline {
  
  inline def apply(): AnimationTimeline = {
    val __obj = js.Dynamic.literal(currentTime = null)
    __obj.asInstanceOf[AnimationTimeline]
  }
  
  extension [Self <: AnimationTimeline](x: Self) {
    
    inline def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    inline def setCurrentTimeNull: Self = StObject.set(x, "currentTime", null)
  }
}
