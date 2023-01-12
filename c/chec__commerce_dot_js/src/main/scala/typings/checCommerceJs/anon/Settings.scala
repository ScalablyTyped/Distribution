package typings.checCommerceJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Settings extends StObject {
  
  var settings: Linkeddomains
}
object Settings {
  
  inline def apply(settings: Linkeddomains): Settings = {
    val __obj = js.Dynamic.literal(settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
    
    inline def setSettings(value: Linkeddomains): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
  }
}
