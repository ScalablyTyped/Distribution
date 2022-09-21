package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.rangeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemRange extends StObject {
  
  var item: defaultnameany
  
  var range: default
}
object ItemRange {
  
  inline def apply(item: defaultnameany, range: default): ItemRange = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemRange]
  }
  
  extension [Self <: ItemRange](x: Self) {
    
    inline def setItem(value: defaultnameany): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setRange(value: default): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
