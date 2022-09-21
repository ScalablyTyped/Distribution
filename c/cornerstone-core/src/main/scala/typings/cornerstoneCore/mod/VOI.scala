package typings.cornerstoneCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VOI extends StObject {
  
  /** Window Center for display */
  var windowCenter: Double
  
  /** Window Width for display */
  var windowWidth: Double
}
object VOI {
  
  inline def apply(windowCenter: Double, windowWidth: Double): VOI = {
    val __obj = js.Dynamic.literal(windowCenter = windowCenter.asInstanceOf[js.Any], windowWidth = windowWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[VOI]
  }
  
  extension [Self <: VOI](x: Self) {
    
    inline def setWindowCenter(value: Double): Self = StObject.set(x, "windowCenter", value.asInstanceOf[js.Any])
    
    inline def setWindowWidth(value: Double): Self = StObject.set(x, "windowWidth", value.asInstanceOf[js.Any])
  }
}
