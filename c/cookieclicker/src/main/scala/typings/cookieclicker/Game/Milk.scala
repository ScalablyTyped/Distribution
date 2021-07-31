package typings.cookieclicker.Game

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Milk extends StObject {
  
  var icon: js.Tuple2[Double, Double]
  
  var name: String
  
  var pic: String
}
object Milk {
  
  @scala.inline
  def apply(icon: js.Tuple2[Double, Double], name: String, pic: String): Milk = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pic = pic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Milk]
  }
  
  @scala.inline
  implicit class MilkMutableBuilder[Self <: Milk] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIcon(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPic(value: String): Self = StObject.set(x, "pic", value.asInstanceOf[js.Any])
  }
}
