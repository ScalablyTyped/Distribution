package typings.chartJs.distChunksHelpersDotcoreMod

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartEvent1 extends StObject {
  
  var native: Event | Null
  
  var `type`: "contextmenu" | "mouseenter" | "mousedown" | "mousemove" | "mouseup" | "mouseout" | "click" | "dblclick" | "keydown" | "keypress" | "keyup" | "resize"
  
  var x: Double | Null
  
  var y: Double | Null
}
object ChartEvent1 {
  
  inline def apply(
    `type`: "contextmenu" | "mouseenter" | "mousedown" | "mousemove" | "mouseup" | "mouseout" | "click" | "dblclick" | "keydown" | "keypress" | "keyup" | "resize"
  ): ChartEvent1 = {
    val __obj = js.Dynamic.literal(native = null, x = null, y = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartEvent1]
  }
  
  extension [Self <: ChartEvent1](x: Self) {
    
    inline def setNative(value: Event): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
    
    inline def setNativeNull: Self = StObject.set(x, "native", null)
    
    inline def setType(
      value: "contextmenu" | "mouseenter" | "mousedown" | "mousemove" | "mouseup" | "mouseout" | "click" | "dblclick" | "keydown" | "keypress" | "keyup" | "resize"
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXNull: Self = StObject.set(x, "x", null)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYNull: Self = StObject.set(x, "y", null)
  }
}
