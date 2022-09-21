package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StoreOp extends StObject
@JSGlobal("BABYLON.StoreOp")
@js.native
object StoreOp extends StObject {
  
  @js.native
  sealed trait Discard
    extends StObject
       with StoreOp
  
  @js.native
  sealed trait Store
    extends StObject
       with StoreOp
}
