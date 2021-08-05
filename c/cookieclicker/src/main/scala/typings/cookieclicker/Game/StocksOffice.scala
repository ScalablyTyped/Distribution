package typings.cookieclicker.Game

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StocksOffice extends StObject {
  
  /**
    * The cost to upgrade the office, first value being the cursor amount,
    * Second one being, cursor level
    */
  var cost: (js.Tuple2[Double, Double]) | PseudoNull
  
  /**
    * The description of the office, in HTML text
    */
  var desc: String
  
  var icon: Icon
  
  var name: String
}
object StocksOffice {
  
  inline def apply(cost: (js.Tuple2[Double, Double]) | PseudoNull, desc: String, icon: Icon, name: String): StocksOffice = {
    val __obj = js.Dynamic.literal(cost = cost.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StocksOffice]
  }
  
  extension [Self <: StocksOffice](x: Self) {
    
    inline def setCost(value: (js.Tuple2[Double, Double]) | PseudoNull): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
    
    inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
