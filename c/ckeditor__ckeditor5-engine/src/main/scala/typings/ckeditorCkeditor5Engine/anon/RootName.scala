package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.empty
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RootName extends StObject {
  
  var rootName: js.UndefOr[String] = js.undefined
  
  var trim: js.UndefOr[empty | none] = js.undefined
}
object RootName {
  
  inline def apply(): RootName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RootName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RootName] (val x: Self) extends AnyVal {
    
    inline def setRootName(value: String): Self = StObject.set(x, "rootName", value.asInstanceOf[js.Any])
    
    inline def setRootNameUndefined: Self = StObject.set(x, "rootName", js.undefined)
    
    inline def setTrim(value: empty | none): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
    
    inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
  }
}
