package typings.cookieclicker.Game

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StocksColors extends js.Object {
  
  /**
    * The background color of the graph
    */
  var bg: String = js.native
  
  /**
    * The stock line when the value goes up
    */
  var high: String = js.native
  
  /**
    * The stock line when the it's hovered over
    */
  var hightlight: String = js.native
  
  /**
    * The big lines in the background of the graph
    */
  var line1: String = js.native
  
  /**
    * The small lines in the background of the graph
    */
  var line2: String = js.native
  
  /**
    * The stock line when the value goes down
    */
  var low: String = js.native
}
object StocksColors {
  
  @scala.inline
  def apply(bg: String, high: String, hightlight: String, line1: String, line2: String, low: String): StocksColors = {
    val __obj = js.Dynamic.literal(bg = bg.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], hightlight = hightlight.asInstanceOf[js.Any], line1 = line1.asInstanceOf[js.Any], line2 = line2.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any])
    __obj.asInstanceOf[StocksColors]
  }
  
  @scala.inline
  implicit class StocksColorsOps[Self <: StocksColors] (val x: Self) extends AnyVal {
    
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
    def setBg(value: String): Self = this.set("bg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHigh(value: String): Self = this.set("high", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHightlight(value: String): Self = this.set("hightlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine1(value: String): Self = this.set("line1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine2(value: String): Self = this.set("line2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLow(value: String): Self = this.set("low", value.asInstanceOf[js.Any])
  }
}
