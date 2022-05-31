package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Space extends StObject
@JSGlobal("BABYLON.Space")
@js.native
object Space extends StObject {
  
  /** Bone space */
  @js.native
  sealed trait BONE
    extends StObject
       with Space
  
  /** Local (object) space */
  @js.native
  sealed trait LOCAL
    extends StObject
       with Space
  
  /** World space */
  @js.native
  sealed trait WORLD
    extends StObject
       with Space
}
