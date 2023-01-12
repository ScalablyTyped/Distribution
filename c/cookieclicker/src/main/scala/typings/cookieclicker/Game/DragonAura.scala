package typings.cookieclicker.Game

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragonAura extends StObject {
  
  /**
    * Description of the aura, in HTML text
    */
  var desc: String
  
  var dname: String
  
  var name: String
  
  var pic: Icon
}
object DragonAura {
  
  inline def apply(desc: String, dname: String, name: String, pic: Icon): DragonAura = {
    val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any], dname = dname.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pic = pic.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragonAura]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DragonAura] (val x: Self) extends AnyVal {
    
    inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    inline def setDname(value: String): Self = StObject.set(x, "dname", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPic(value: Icon): Self = StObject.set(x, "pic", value.asInstanceOf[js.Any])
  }
}
