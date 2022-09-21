package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LoadOp extends StObject
@JSGlobal("BABYLON.LoadOp")
@js.native
object LoadOp extends StObject {
  
  @js.native
  sealed trait Clear
    extends StObject
       with LoadOp
  
  @js.native
  sealed trait Load
    extends StObject
       with LoadOp
}
