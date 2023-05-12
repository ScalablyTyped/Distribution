package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PhysicsMotionType extends StObject
@JSGlobal("BABYLON.PhysicsMotionType")
@js.native
object PhysicsMotionType extends StObject {
  
  @js.native
  sealed trait ANIMATED
    extends StObject
       with PhysicsMotionType
  
  @js.native
  sealed trait DYNAMIC
    extends StObject
       with PhysicsMotionType
  
  @js.native
  sealed trait STATIC
    extends StObject
       with PhysicsMotionType
}
