package typings.ckeditorCkeditor5Engine.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Styles extends StObject {
  
  var styles: Record[String, String | js.RegExp]
}
object Styles {
  
  inline def apply(styles: Record[String, String | js.RegExp]): Styles = {
    val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Styles]
  }
  
  extension [Self <: Styles](x: Self) {
    
    inline def setStyles(value: Record[String, String | js.RegExp]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
  }
}
