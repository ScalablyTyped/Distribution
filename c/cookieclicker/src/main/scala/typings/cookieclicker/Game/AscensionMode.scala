package typings.cookieclicker.Game

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AscensionMode extends StObject {
  
  var desc: String
  
  var dname: String
  
  var icon: Icon
  
  var name: String
}
object AscensionMode {
  
  inline def apply(desc: String, dname: String, icon: Icon, name: String): AscensionMode = {
    val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any], dname = dname.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AscensionMode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AscensionMode] (val x: Self) extends AnyVal {
    
    inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    inline def setDname(value: String): Self = StObject.set(x, "dname", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
