package typings.babylonjs.gradientsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/gradients", "FactorGradient")
@js.native
class FactorGradient protected () extends IValueGradient {
  /**
    * Creates a new factor gradient
    * @param gradient gets or sets the gradient value (between 0 and 1)
    * @param factor1 gets or sets first associated factor
    * @param factor2 gets or sets second associated factor
    */
  def this(
    /**
    * Gets or sets the gradient value (between 0 and 1)
    */
  gradient: Double,
    /**
    * Gets or sets first associated factor
    */
  factor1: Double
  ) = this()
  def this(
    /**
    * Gets or sets the gradient value (between 0 and 1)
    */
  gradient: Double,
    /**
    * Gets or sets first associated factor
    */
  factor1: Double,
    /**
    * Gets or sets second associated factor
    */
  factor2: Double
  ) = this()
  
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
