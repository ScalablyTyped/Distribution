package typings.cookieclicker.Game

import typings.std.HTMLDivElement
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StocksGood extends StObject {
  
  /**
    * True if at least one of the building is owned
    */
  var active: Boolean
  
  /**
    * The building the good is tied to
    */
  var building: GameObject
  
  /**
    * Name of the company which manages the stock (flavour text)
    */
  var company: String
  
  /**
    * The current delta of the stock
    */
  var d: Double
  
  /**
    * The description of the stock
    */
  var desc: String
  
  /**
    * Ticks left until next mode
    */
  var dur: Double
  
  var graphIconL: HTMLDivElement
  
  /**
    * True if the stock was hidden by the player or it's not active yet
    */
  var hidden: Boolean
  
  var icon: Icon
  
  var id: Double
  
  var l: HTMLDivElement
  
  /**
    * The last action done on the stock
    */
  var last: Double
  
  /**
    * The mode of the stock
    */
  var mode: Double
  
  /**
    * The displayed name of the stock
    */
  var name: String
  
  /**
    * The amount of stocks bought of the good
    */
  var stock: Double
  
  var stockBoxL: HTMLDivElement
  
  var stockL: HTMLSpanElement
  
  var stockMaxL: HTMLSpanElement
  
  /**
    * Name of the stock in 3 letters
    */
  var symbol: String
  
  var symbolNumL: HTMLSpanElement
  
  /**
    * The current value of the stock
    */
  var `val`: Double
  
  /**
    * History of the stock values
    */
  var vals: js.Array[Double]
  
  var viewHideL: HTMLDivElement
}
object StocksGood {
  
  inline def apply(
    active: Boolean,
    building: GameObject,
    company: String,
    d: Double,
    desc: String,
    dur: Double,
    graphIconL: HTMLDivElement,
    hidden: Boolean,
    icon: Icon,
    id: Double,
    l: HTMLDivElement,
    last: Double,
    mode: Double,
    name: String,
    stock: Double,
    stockBoxL: HTMLDivElement,
    stockL: HTMLSpanElement,
    stockMaxL: HTMLSpanElement,
    symbol: String,
    symbolNumL: HTMLSpanElement,
    `val`: Double,
    vals: js.Array[Double],
    viewHideL: HTMLDivElement
  ): StocksGood = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], building = building.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any], dur = dur.asInstanceOf[js.Any], graphIconL = graphIconL.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stock = stock.asInstanceOf[js.Any], stockBoxL = stockBoxL.asInstanceOf[js.Any], stockL = stockL.asInstanceOf[js.Any], stockMaxL = stockMaxL.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], symbolNumL = symbolNumL.asInstanceOf[js.Any], vals = vals.asInstanceOf[js.Any], viewHideL = viewHideL.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StocksGood]
  }
  
  extension [Self <: StocksGood](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setBuilding(value: GameObject): Self = StObject.set(x, "building", value.asInstanceOf[js.Any])
    
    inline def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
    
    inline def setD(value: Double): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    inline def setDur(value: Double): Self = StObject.set(x, "dur", value.asInstanceOf[js.Any])
    
    inline def setGraphIconL(value: HTMLDivElement): Self = StObject.set(x, "graphIconL", value.asInstanceOf[js.Any])
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setL(value: HTMLDivElement): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
    
    inline def setLast(value: Double): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
    
    inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStock(value: Double): Self = StObject.set(x, "stock", value.asInstanceOf[js.Any])
    
    inline def setStockBoxL(value: HTMLDivElement): Self = StObject.set(x, "stockBoxL", value.asInstanceOf[js.Any])
    
    inline def setStockL(value: HTMLSpanElement): Self = StObject.set(x, "stockL", value.asInstanceOf[js.Any])
    
    inline def setStockMaxL(value: HTMLSpanElement): Self = StObject.set(x, "stockMaxL", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolNumL(value: HTMLSpanElement): Self = StObject.set(x, "symbolNumL", value.asInstanceOf[js.Any])
    
    inline def setVal(value: Double): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
    
    inline def setVals(value: js.Array[Double]): Self = StObject.set(x, "vals", value.asInstanceOf[js.Any])
    
    inline def setValsVarargs(value: Double*): Self = StObject.set(x, "vals", js.Array(value :_*))
    
    inline def setViewHideL(value: HTMLDivElement): Self = StObject.set(x, "viewHideL", value.asInstanceOf[js.Any])
  }
}
