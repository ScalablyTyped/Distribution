package typings.cookieclicker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cost extends js.Object {
  
  /**
    * The overridden cost of the spell
    */
  var cost: js.UndefOr[Double] = js.native
  
  /**
    * The additional fail chance of the spell
    */
  var failChanceAdd: js.UndefOr[Double] = js.native
  
  /**
    * The minimum the fail chance of the spell
    */
  var failChanceMax: js.UndefOr[Double] = js.native
  
  /**
    * The multiplier of the fail chance of the spell
    */
  var failChanceMult: js.UndefOr[Double] = js.native
  
  /**
    * The overridden fail chance of the spell
    */
  var failChanceSet: js.UndefOr[Double] = js.native
  
  /**
    * If true, the spell isn't counted towards the spell count
    */
  var passthrough: js.UndefOr[Boolean] = js.native
}
object Cost {
  
  @scala.inline
  def apply(): Cost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cost]
  }
  
  @scala.inline
  implicit class CostOps[Self <: Cost] (val x: Self) extends AnyVal {
    
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
    def setCost(value: Double): Self = this.set("cost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCost: Self = this.set("cost", js.undefined)
    
    @scala.inline
    def setFailChanceAdd(value: Double): Self = this.set("failChanceAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailChanceAdd: Self = this.set("failChanceAdd", js.undefined)
    
    @scala.inline
    def setFailChanceMax(value: Double): Self = this.set("failChanceMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailChanceMax: Self = this.set("failChanceMax", js.undefined)
    
    @scala.inline
    def setFailChanceMult(value: Double): Self = this.set("failChanceMult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailChanceMult: Self = this.set("failChanceMult", js.undefined)
    
    @scala.inline
    def setFailChanceSet(value: Double): Self = this.set("failChanceSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailChanceSet: Self = this.set("failChanceSet", js.undefined)
    
    @scala.inline
    def setPassthrough(value: Boolean): Self = this.set("passthrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassthrough: Self = this.set("passthrough", js.undefined)
  }
}
