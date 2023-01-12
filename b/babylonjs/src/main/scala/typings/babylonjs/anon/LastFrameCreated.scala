package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LastFrameCreated extends StObject {
  
  var lastFrameCreated: Double
  
  var lookupLastFrame: Double
  
  var noLookupLastFrame: Double
  
  var totalCreated: Double
}
object LastFrameCreated {
  
  inline def apply(lastFrameCreated: Double, lookupLastFrame: Double, noLookupLastFrame: Double, totalCreated: Double): LastFrameCreated = {
    val __obj = js.Dynamic.literal(lastFrameCreated = lastFrameCreated.asInstanceOf[js.Any], lookupLastFrame = lookupLastFrame.asInstanceOf[js.Any], noLookupLastFrame = noLookupLastFrame.asInstanceOf[js.Any], totalCreated = totalCreated.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastFrameCreated]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LastFrameCreated] (val x: Self) extends AnyVal {
    
    inline def setLastFrameCreated(value: Double): Self = StObject.set(x, "lastFrameCreated", value.asInstanceOf[js.Any])
    
    inline def setLookupLastFrame(value: Double): Self = StObject.set(x, "lookupLastFrame", value.asInstanceOf[js.Any])
    
    inline def setNoLookupLastFrame(value: Double): Self = StObject.set(x, "noLookupLastFrame", value.asInstanceOf[js.Any])
    
    inline def setTotalCreated(value: Double): Self = StObject.set(x, "totalCreated", value.asInstanceOf[js.Any])
  }
}
