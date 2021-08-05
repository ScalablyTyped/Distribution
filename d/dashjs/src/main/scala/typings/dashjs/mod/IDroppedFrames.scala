package typings.dashjs.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDroppedFrames extends StObject {
  
  var droppedFrames: Double
  
  var time: Date
}
object IDroppedFrames {
  
  inline def apply(droppedFrames: Double, time: Date): IDroppedFrames = {
    val __obj = js.Dynamic.literal(droppedFrames = droppedFrames.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDroppedFrames]
  }
  
  extension [Self <: IDroppedFrames](x: Self) {
    
    inline def setDroppedFrames(value: Double): Self = StObject.set(x, "droppedFrames", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Date): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
