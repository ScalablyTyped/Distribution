package typings.d3pie.anon

import typings.d3pie.d3pieStrings.caption
import typings.d3pie.d3pieStrings.placeholder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaceholderParser extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var placeholderParser: js.UndefOr[js.Function2[/* index */ Double, /* data */ Percentage, Unit]] = js.undefined
  
  var string: js.UndefOr[String] = js.undefined
  
  var styles: js.UndefOr[BackgroundColor] = js.undefined
  
  var `type`: js.UndefOr[placeholder | caption] = js.undefined
}
object PlaceholderParser {
  
  inline def apply(): PlaceholderParser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaceholderParser]
  }
  
  extension [Self <: PlaceholderParser](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setPlaceholderParser(value: (/* index */ Double, /* data */ Percentage) => Unit): Self = StObject.set(x, "placeholderParser", js.Any.fromFunction2(value))
    
    inline def setPlaceholderParserUndefined: Self = StObject.set(x, "placeholderParser", js.undefined)
    
    inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
    
    inline def setStyles(value: BackgroundColor): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setType(value: placeholder | caption): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
