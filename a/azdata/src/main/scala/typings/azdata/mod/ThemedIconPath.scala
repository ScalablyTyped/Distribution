package typings.azdata.mod

import typings.vscode.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemedIconPath extends StObject {
  
  var dark: String | Uri
  
  var light: String | Uri
}
object ThemedIconPath {
  
  inline def apply(dark: String | Uri, light: String | Uri): ThemedIconPath = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemedIconPath]
  }
  
  extension [Self <: ThemedIconPath](x: Self) {
    
    inline def setDark(value: String | Uri): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    inline def setLight(value: String | Uri): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
  }
}
