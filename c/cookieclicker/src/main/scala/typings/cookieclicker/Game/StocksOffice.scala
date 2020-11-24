package typings.cookieclicker.Game

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StocksOffice extends js.Object {
  
  /**
    * The cost to upgrade the office, first value being the cursor amount,
    * Second one being, cursor level
    */
  var cost: (js.Tuple2[Double, Double]) | PseudoNull = js.native
  
  /**
    * The description of the office, in HTML text
    */
  var desc: String = js.native
  
  var icon: Icon = js.native
  
  var name: String = js.native
}
object StocksOffice {
  
  @scala.inline
  def apply(cost: (js.Tuple2[Double, Double]) | PseudoNull, desc: String, icon: Icon, name: String): StocksOffice = {
    val __obj = js.Dynamic.literal(cost = cost.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StocksOffice]
  }
  
  @scala.inline
  implicit class StocksOfficeOps[Self <: StocksOffice] (val x: Self) extends AnyVal {
    
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
    def setCost(value: (js.Tuple2[Double, Double]) | PseudoNull): Self = this.set("cost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesc(value: String): Self = this.set("desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: Icon): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
