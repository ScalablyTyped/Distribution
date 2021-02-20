package typings.dashjs.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDroppedFrames extends StObject {
  
  var droppedFrames: Double = js.native
  
  var time: Date = js.native
}
object IDroppedFrames {
  
  @scala.inline
  def apply(droppedFrames: Double, time: Date): IDroppedFrames = {
    val __obj = js.Dynamic.literal(droppedFrames = droppedFrames.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDroppedFrames]
  }
  
  @scala.inline
  implicit class IDroppedFramesMutableBuilder[Self <: IDroppedFrames] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDroppedFrames(value: Double): Self = StObject.set(x, "droppedFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Date): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
