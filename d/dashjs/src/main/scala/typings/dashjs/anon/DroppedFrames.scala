package typings.dashjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DroppedFrames extends StObject {
  
  var droppedFrames: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object DroppedFrames {
  
  inline def apply(): DroppedFrames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DroppedFrames]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DroppedFrames] (val x: Self) extends AnyVal {
    
    inline def setDroppedFrames(value: Double): Self = StObject.set(x, "droppedFrames", value.asInstanceOf[js.Any])
    
    inline def setDroppedFramesUndefined: Self = StObject.set(x, "droppedFrames", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
