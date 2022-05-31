package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SubEmitterType extends StObject
@JSGlobal("BABYLON.SubEmitterType")
@js.native
object SubEmitterType extends StObject {
  
  /**
    * Attached to the particle over it's lifetime
    */
  @js.native
  sealed trait ATTACHED
    extends StObject
       with SubEmitterType
  
  /**
    * Created when the particle dies
    */
  @js.native
  sealed trait END
    extends StObject
       with SubEmitterType
}
