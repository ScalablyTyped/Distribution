package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.Asterisk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Extensions extends StObject {
  
  var extensions: js.UndefOr[js.Array[Asterisk | String | Includedirectories]] = js.undefined
  
  /** File types to handle */
  var types: js.UndefOr[js.Array[Asterisk | String | Includedirectories]] = js.undefined
}
object Extensions {
  
  inline def apply(): Extensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Extensions]
  }
  
  extension [Self <: Extensions](x: Self) {
    
    inline def setExtensions(value: js.Array[Asterisk | String | Includedirectories]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtensionsVarargs(value: (Asterisk | String | Includedirectories)*): Self = StObject.set(x, "extensions", js.Array(value :_*))
    
    inline def setTypes(value: js.Array[Asterisk | String | Includedirectories]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setTypesVarargs(value: (Asterisk | String | Includedirectories)*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
