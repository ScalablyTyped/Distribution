package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.Asterisk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Extensions extends StObject {
  
  var extensions: js.UndefOr[js.Array[Asterisk | String | Includedirectories]] = js.native
  
  /** File types to handle */
  var types: js.UndefOr[js.Array[Asterisk | String | Includedirectories]] = js.native
}
object Extensions {
  
  @scala.inline
  def apply(): Extensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Extensions]
  }
  
  @scala.inline
  implicit class ExtensionsMutableBuilder[Self <: Extensions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtensions(value: js.Array[Asterisk | String | Includedirectories]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    @scala.inline
    def setExtensionsVarargs(value: (Asterisk | String | Includedirectories)*): Self = StObject.set(x, "extensions", js.Array(value :_*))
    
    @scala.inline
    def setTypes(value: js.Array[Asterisk | String | Includedirectories]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    @scala.inline
    def setTypesVarargs(value: (Asterisk | String | Includedirectories)*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
