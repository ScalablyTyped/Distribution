package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BlendOperation extends StObject
@JSGlobal("BABYLON.BlendOperation")
@js.native
object BlendOperation extends StObject {
  
  @js.native
  sealed trait Add
    extends StObject
       with BlendOperation
  
  @js.native
  sealed trait Max
    extends StObject
       with BlendOperation
  
  @js.native
  sealed trait Min
    extends StObject
       with BlendOperation
  
  @js.native
  sealed trait ReverseSubtract
    extends StObject
       with BlendOperation
  
  @js.native
  sealed trait Subtract
    extends StObject
       with BlendOperation
}
