package typings.cookieclicker.Game

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductionAchievementRequirement extends js.Object {
  
  var achiev: Achievement = js.native
  
  /**
    * The amount of cookies required to get the achievement
    */
  var pow: Double = js.native
}
object ProductionAchievementRequirement {
  
  @scala.inline
  def apply(achiev: Achievement, pow: Double): ProductionAchievementRequirement = {
    val __obj = js.Dynamic.literal(achiev = achiev.asInstanceOf[js.Any], pow = pow.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductionAchievementRequirement]
  }
  
  @scala.inline
  implicit class ProductionAchievementRequirementOps[Self <: ProductionAchievementRequirement] (val x: Self) extends AnyVal {
    
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
    def setAchiev(value: Achievement): Self = this.set("achiev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPow(value: Double): Self = this.set("pow", value.asInstanceOf[js.Any])
  }
}
