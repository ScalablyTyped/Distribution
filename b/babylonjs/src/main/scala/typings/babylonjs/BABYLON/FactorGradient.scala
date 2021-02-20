package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
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
  implicit class FactorGradientMutableBuilder[Self <: FactorGradient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFactor1(value: Double): Self = StObject.set(x, "factor1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFactor2(value: Double): Self = StObject.set(x, "factor2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFactor2Undefined: Self = StObject.set(x, "factor2", js.undefined)
    
    @scala.inline
    def setGetFactor(value: () => Double): Self = StObject.set(x, "getFactor", js.Any.fromFunction0(value))
  }
}
