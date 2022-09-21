package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationEventInit
  extends StObject
     with EventInit {
  
  var animationName: js.UndefOr[java.lang.String] = js.undefined
  
  var elapsedTime: js.UndefOr[Double] = js.undefined
  
  var pseudoElement: js.UndefOr[java.lang.String] = js.undefined
}
object AnimationEventInit {
  
  inline def apply(): AnimationEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationEventInit]
  }
  
  extension [Self <: AnimationEventInit](x: Self) {
    
    inline def setAnimationName(value: java.lang.String): Self = StObject.set(x, "animationName", value.asInstanceOf[js.Any])
    
    inline def setAnimationNameUndefined: Self = StObject.set(x, "animationName", js.undefined)
    
    inline def setElapsedTime(value: Double): Self = StObject.set(x, "elapsedTime", value.asInstanceOf[js.Any])
    
    inline def setElapsedTimeUndefined: Self = StObject.set(x, "elapsedTime", js.undefined)
    
    inline def setPseudoElement(value: java.lang.String): Self = StObject.set(x, "pseudoElement", value.asInstanceOf[js.Any])
    
    inline def setPseudoElementUndefined: Self = StObject.set(x, "pseudoElement", js.undefined)
  }
}
