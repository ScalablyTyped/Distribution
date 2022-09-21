package typings.devextremeB5DqTZzf.anon

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.straight
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.waved
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Line extends StObject {
  
  /**
    * Specifies the scale breaks&apos; color.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the scale breaks&apos; line style.
    */
  var line: js.UndefOr[straight | waved] = js.undefined
  
  /**
    * Specifies the scale breaks&apos; width in pixels.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object Line {
  
  inline def apply(): Line = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Line]
  }
  
  extension [Self <: Line](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setLine(value: straight | waved): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
