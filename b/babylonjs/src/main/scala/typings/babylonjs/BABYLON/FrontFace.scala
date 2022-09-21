package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FrontFace extends StObject
@JSGlobal("BABYLON.FrontFace")
@js.native
object FrontFace extends StObject {
  
  @js.native
  sealed trait CCW
    extends StObject
       with FrontFace
  
  @js.native
  sealed trait CW
    extends StObject
       with FrontFace
}
