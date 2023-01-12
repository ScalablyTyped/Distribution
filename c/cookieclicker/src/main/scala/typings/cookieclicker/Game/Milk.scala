package typings.cookieclicker.Game

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Milk extends StObject {
  
  /**
    * The English name of the milk
    */
  var bname: String
  
  var icon: Icon
  
  /**
    * The localized name of the milk
    */
  var name: String
  
  /**
    * The image to use for the milk, with the file extension
    */
  var pic: String
  
  /**
    * The milk "type" - -1 for always unlocked in Milk Selector but not a regular milk, 0 - regular milk with unlock requirements, 1 - fanciful selection milk
    */
  var `type`: Double
}
object Milk {
  
  inline def apply(bname: String, icon: Icon, name: String, pic: String, `type`: Double): Milk = {
    val __obj = js.Dynamic.literal(bname = bname.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pic = pic.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Milk]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Milk] (val x: Self) extends AnyVal {
    
    inline def setBname(value: String): Self = StObject.set(x, "bname", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPic(value: String): Self = StObject.set(x, "pic", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
