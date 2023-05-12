package typings.axeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FrameContext extends StObject {
  
  var frameContext: FrameContextObject
  
  var frameSelector: CrossTreeSelector
}
object FrameContext {
  
  inline def apply(frameContext: FrameContextObject, frameSelector: CrossTreeSelector): FrameContext = {
    val __obj = js.Dynamic.literal(frameContext = frameContext.asInstanceOf[js.Any], frameSelector = frameSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FrameContext] (val x: Self) extends AnyVal {
    
    inline def setFrameContext(value: FrameContextObject): Self = StObject.set(x, "frameContext", value.asInstanceOf[js.Any])
    
    inline def setFrameSelector(value: CrossTreeSelector): Self = StObject.set(x, "frameSelector", value.asInstanceOf[js.Any])
  }
}
