package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FactorGradient extends IValueGradient {
  
  /**
    * Gets or sets first associated factor
    */
  var factor1: Double = js.native
  
  /**
    * Gets or sets second associated factor
    */
  var factor2: js.UndefOr[Double] = js.native
  
  /**
    * Will get a number picked randomly between factor1 and factor2.
    * If factor2 is undefined then factor1 will be used
    * @returns the picked number
    */
  def getFactor(): Double = js.native
}
object FactorGradient {
  
  @scala.inline
  def apply(factor1: Double, getFactor: () => Double, gradient: Double): FactorGradient = {
    val __obj = js.Dynamic.literal(factor1 = factor1.asInstanceOf[js.Any], getFactor = js.Any.fromFunction0(getFactor), gradient = gradient.asInstanceOf[js.Any])
    __obj.asInstanceOf[FactorGradient]
  }
  
  @scala.inline
  implicit class FactorGradientOps[Self <: FactorGradient] (val x: Self) extends AnyVal {
    
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
    def setFactor1(value: Double): Self = this.set("factor1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetFactor(value: () => Double): Self = this.set("getFactor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFactor2(value: Double): Self = this.set("factor2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFactor2: Self = this.set("factor2", js.undefined)
  }
}
