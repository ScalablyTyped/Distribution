package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.elementMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Item extends StObject {
  
  var item: default | typings.ckeditorCkeditor5Engine.textproxyMod.default
  
  var range: typings.ckeditorCkeditor5Engine.rangeMod.default
}
object Item {
  
  inline def apply(
    item: default | typings.ckeditorCkeditor5Engine.textproxyMod.default,
    range: typings.ckeditorCkeditor5Engine.rangeMod.default
  ): Item = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
  
  extension [Self <: Item](x: Self) {
    
    inline def setItem(value: default | typings.ckeditorCkeditor5Engine.textproxyMod.default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setRange(value: typings.ckeditorCkeditor5Engine.rangeMod.default): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
