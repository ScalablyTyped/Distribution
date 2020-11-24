package typings.cookieclicker.Game

import typings.std.HTMLDivElement
import typings.std.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StocksGood extends js.Object {
  
  /**
    * True if at least one of the building is owned
    */
  var active: Boolean = js.native
  
  /**
    * The building the good is tied to
    */
  var building: GameObject = js.native
  
  /**
    * Name of the company which manages the stock (flavour text)
    */
  var company: String = js.native
  
  /**
    * The current delta of the stock
    */
  var d: Double = js.native
  
  /**
    * The description of the stock
    */
  var desc: String = js.native
  
  /**
    * Ticks left until next mode
    */
  var dur: Double = js.native
  
  var graphIconL: HTMLDivElement = js.native
  
  /**
    * True if the stock was hidden by the player or it's not active yet
    */
  var hidden: Boolean = js.native
  
  var icon: Icon = js.native
  
  var id: Double = js.native
  
  var l: HTMLDivElement = js.native
  
  /**
    * The last action done on the stock
    */
  var last: Double = js.native
  
  /**
    * The mode of the stock
    */
  var mode: Double = js.native
  
  /**
    * The displayed name of the stock
    */
  var name: String = js.native
  
  /**
    * The amount of stocks bought of the good
    */
  var stock: Double = js.native
  
  var stockBoxL: HTMLDivElement = js.native
  
  var stockL: HTMLSpanElement = js.native
  
  var stockMaxL: HTMLSpanElement = js.native
  
  /**
    * Name of the stock in 3 letters
    */
  var symbol: String = js.native
  
  var symbolNumL: HTMLSpanElement = js.native
  
  /**
    * The current value of the stock
    */
  var `val`: Double = js.native
  
  /**
    * History of the stock values
    */
  var vals: js.Array[Double] = js.native
  
  var viewHideL: HTMLDivElement = js.native
}
object StocksGood {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class StocksGoodOps[Self <: StocksGood] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuilding(value: GameObject): Self = this.set("building", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompany(value: String): Self = this.set("company", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setD(value: Double): Self = this.set("d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesc(value: String): Self = this.set("desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDur(value: Double): Self = this.set("dur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphIconL(value: HTMLDivElement): Self = this.set("graphIconL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: Icon): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL(value: HTMLDivElement): Self = this.set("l", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast(value: Double): Self = this.set("last", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: Double): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStock(value: Double): Self = this.set("stock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStockBoxL(value: HTMLDivElement): Self = this.set("stockBoxL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStockL(value: HTMLSpanElement): Self = this.set("stockL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStockMaxL(value: HTMLSpanElement): Self = this.set("stockMaxL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol(value: String): Self = this.set("symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolNumL(value: HTMLSpanElement): Self = this.set("symbolNumL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVal(value: Double): Self = this.set("val", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValsVarargs(value: Double*): Self = this.set("vals", js.Array(value :_*))
    
    @scala.inline
    def setVals(value: js.Array[Double]): Self = this.set("vals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewHideL(value: HTMLDivElement): Self = this.set("viewHideL", value.asInstanceOf[js.Any])
  }
}
