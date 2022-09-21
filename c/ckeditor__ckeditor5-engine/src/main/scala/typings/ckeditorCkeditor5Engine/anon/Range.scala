package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.textproxyMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Range extends StObject {
  
  var item: default
  
  var range: typings.ckeditorCkeditor5Engine.rangeMod.default
}
object Range {
  
  inline def apply(item: default, range: typings.ckeditorCkeditor5Engine.rangeMod.default): Range = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
  
  extension [Self <: Range](x: Self) {
    
    inline def setItem(value: default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setRange(value: typings.ckeditorCkeditor5Engine.rangeMod.default): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
