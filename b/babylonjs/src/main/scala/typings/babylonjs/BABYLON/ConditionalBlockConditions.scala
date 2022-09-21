package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConditionalBlockConditions extends StObject
@JSGlobal("BABYLON.ConditionalBlockConditions")
@js.native
object ConditionalBlockConditions extends StObject {
  
  /** Logical And */
  @js.native
  sealed trait And
    extends StObject
       with ConditionalBlockConditions
  
  /** Equal */
  @js.native
  sealed trait Equal
    extends StObject
       with ConditionalBlockConditions
  
  /** GreaterOrEqual */
  @js.native
  sealed trait GreaterOrEqual
    extends StObject
       with ConditionalBlockConditions
  
  /** GreaterThan */
  @js.native
  sealed trait GreaterThan
    extends StObject
       with ConditionalBlockConditions
  
  /** LessOrEqual */
  @js.native
  sealed trait LessOrEqual
    extends StObject
       with ConditionalBlockConditions
  
  /** LessThan */
  @js.native
  sealed trait LessThan
    extends StObject
       with ConditionalBlockConditions
  
  /** NotEqual */
  @js.native
  sealed trait NotEqual
    extends StObject
       with ConditionalBlockConditions
  
  /** Logical Or */
  @js.native
  sealed trait Or
    extends StObject
       with ConditionalBlockConditions
  
  /** Logical Exclusive OR */
  @js.native
  sealed trait Xor
    extends StObject
       with ConditionalBlockConditions
}
