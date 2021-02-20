package typings.d3pie.anon

import typings.d3pie.d3pieStrings.caption
import typings.d3pie.d3pieStrings.placeholder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaceholderParser extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var placeholderParser: js.UndefOr[js.Function2[/* index */ Double, /* data */ Percentage, Unit]] = js.native
  
  var string: js.UndefOr[String] = js.native
  
  var styles: js.UndefOr[BackgroundColor] = js.native
  
  var `type`: js.UndefOr[placeholder | caption] = js.native
}
object PlaceholderParser {
  
  @scala.inline
  def apply(): PlaceholderParser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaceholderParser]
  }
  
  @scala.inline
  implicit class PlaceholderParserMutableBuilder[Self <: PlaceholderParser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setPlaceholderParser(value: (/* index */ Double, /* data */ Percentage) => Unit): Self = StObject.set(x, "placeholderParser", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPlaceholderParserUndefined: Self = StObject.set(x, "placeholderParser", js.undefined)
    
    @scala.inline
    def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
    
    @scala.inline
    def setStyles(value: BackgroundColor): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    @scala.inline
    def setType(value: placeholder | caption): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
