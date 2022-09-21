package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.FactorGradient")
@js.native
open class FactorGradient protected ()
  extends StObject
     with typings.babylonjs.BABYLON.FactorGradient {
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
  /* CompleteClass */
  var factor1: Double = js.native
  
  /**
    * Will get a number picked randomly between factor1 and factor2.
    * If factor2 is undefined then factor1 will be used
    * @returns the picked number
    */
  /* CompleteClass */
  override def getFactor(): Double = js.native
  
  /**
    * Gets or sets the gradient value (between 0 and 1)
    */
  /* CompleteClass */
  var gradient: Double = js.native
}
