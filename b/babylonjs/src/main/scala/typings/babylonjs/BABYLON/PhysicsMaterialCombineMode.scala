package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PhysicsMaterialCombineMode extends StObject
@JSGlobal("BABYLON.PhysicsMaterialCombineMode")
@js.native
object PhysicsMaterialCombineMode extends StObject {
  
  @js.native
  sealed trait ARITHMETIC_MEAN
    extends StObject
       with PhysicsMaterialCombineMode
  
  /**
    * The final value will be the geometric mean of the two values:
    * sqrt( valueA *  valueB )
    */
  @js.native
  sealed trait GEOMETRIC_MEAN
    extends StObject
       with PhysicsMaterialCombineMode
  
  @js.native
  sealed trait MAXIMUM
    extends StObject
       with PhysicsMaterialCombineMode
  
  /**
    * The final value will be the smaller of the two:
    * min( valueA , valueB )
    */
  @js.native
  sealed trait MINIMUM
    extends StObject
       with PhysicsMaterialCombineMode
  
  /**
    * The final value will be the product of the two values:
    * valueA * valueB
    */
  @js.native
  sealed trait MULTIPLY
    extends StObject
       with PhysicsMaterialCombineMode
}
