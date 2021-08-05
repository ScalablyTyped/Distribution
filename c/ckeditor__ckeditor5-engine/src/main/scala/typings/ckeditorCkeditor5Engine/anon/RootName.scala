package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RootName extends StObject {
  
  var rootName: js.UndefOr[String] = js.undefined
}
object RootName {
  
  inline def apply(): RootName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RootName]
  }
  
  extension [Self <: RootName](x: Self) {
    
    inline def setRootName(value: String): Self = StObject.set(x, "rootName", value.asInstanceOf[js.Any])
    
    inline def setRootNameUndefined: Self = StObject.set(x, "rootName", js.undefined)
  }
}
