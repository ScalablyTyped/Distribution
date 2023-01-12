package typings.cookieclicker.Game

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FoolBuilding extends StObject {
  
  var desc: String
  
  var icon: js.Tuple2[Double, Double]
  
  var name: String
}
object FoolBuilding {
  
  inline def apply(desc: String, icon: js.Tuple2[Double, Double], name: String): FoolBuilding = {
    val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FoolBuilding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FoolBuilding] (val x: Self) extends AnyVal {
    
    inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
