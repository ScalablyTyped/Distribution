package typings.devextremeB5DqTZzf.anon

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.close
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.high
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.low
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Level extends StObject {
  
  /**
    * Specifies a color for the points whose price has decreased in comparison to the price of the previous point.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether high, low, open or close prices of points should be compared.
    */
  var level: js.UndefOr[close | high | low | open] = js.undefined
}
object Level {
  
  inline def apply(): Level = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Level]
  }
  
  extension [Self <: Level](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setLevel(value: close | high | low | open): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
  }
}
