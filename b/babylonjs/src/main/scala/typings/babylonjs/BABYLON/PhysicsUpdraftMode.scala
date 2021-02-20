package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PhysicsUpdraftMode extends StObject
@JSGlobal("BABYLON.PhysicsUpdraftMode")
@js.native
object PhysicsUpdraftMode extends StObject {
  
  /** Defines that the upstream forces will pull towards the top center of the cylinder */
  @js.native
  sealed trait Center extends PhysicsUpdraftMode
  
  /** Defines that once a impostor is inside the cylinder, it will shoot out perpendicular from the ground of the cylinder */
  @js.native
  sealed trait Perpendicular extends PhysicsUpdraftMode
}
