package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FilterMode extends StObject
@JSGlobal("BABYLON.FilterMode")
@js.native
object FilterMode extends StObject {
  
  @js.native
  sealed trait Linear
    extends StObject
       with FilterMode
  
  @js.native
  sealed trait Nearest
    extends StObject
       with FilterMode
}
