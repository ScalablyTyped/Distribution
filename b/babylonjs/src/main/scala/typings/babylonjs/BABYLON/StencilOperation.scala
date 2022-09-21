package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StencilOperation extends StObject
@JSGlobal("BABYLON.StencilOperation")
@js.native
object StencilOperation extends StObject {
  
  @js.native
  sealed trait DecrementClamp
    extends StObject
       with StencilOperation
  
  @js.native
  sealed trait DecrementWrap
    extends StObject
       with StencilOperation
  
  @js.native
  sealed trait IncrementClamp
    extends StObject
       with StencilOperation
  
  @js.native
  sealed trait IncrementWrap
    extends StObject
       with StencilOperation
  
  @js.native
  sealed trait Invert
    extends StObject
       with StencilOperation
  
  @js.native
  sealed trait Keep
    extends StObject
       with StencilOperation
  
  @js.native
  sealed trait Replace
    extends StObject
       with StencilOperation
  
  @js.native
  sealed trait Zero
    extends StObject
       with StencilOperation
}
