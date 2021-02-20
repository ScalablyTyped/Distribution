package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PhysicsRadialImpulseFalloff extends StObject
@JSGlobal("BABYLON.PhysicsRadialImpulseFalloff")
@js.native
object PhysicsRadialImpulseFalloff extends StObject {
  
  /** Defines that impulse is constant in strength across it's whole radius */
  @js.native
  sealed trait Constant extends PhysicsRadialImpulseFalloff
  
  /** Defines that impulse gets weaker if it's further from the origin */
  @js.native
  sealed trait Linear extends PhysicsRadialImpulseFalloff
}
