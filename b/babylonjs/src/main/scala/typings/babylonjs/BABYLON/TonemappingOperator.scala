package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TonemappingOperator extends StObject
@JSGlobal("BABYLON.TonemappingOperator")
@js.native
object TonemappingOperator extends StObject {
  
  /** Hable */
  @js.native
  sealed trait Hable
    extends StObject
       with TonemappingOperator
  
  /** HejiDawson */
  @js.native
  sealed trait HejiDawson
    extends StObject
       with TonemappingOperator
  
  /** Photographic */
  @js.native
  sealed trait Photographic
    extends StObject
       with TonemappingOperator
  
  /** Reinhard */
  @js.native
  sealed trait Reinhard
    extends StObject
       with TonemappingOperator
}
