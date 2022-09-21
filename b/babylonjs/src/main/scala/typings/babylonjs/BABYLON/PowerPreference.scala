package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PowerPreference extends StObject
@JSGlobal("BABYLON.PowerPreference")
@js.native
object PowerPreference extends StObject {
  
  @js.native
  sealed trait HighPerformance
    extends StObject
       with PowerPreference
  
  @js.native
  sealed trait LowPower
    extends StObject
       with PowerPreference
}
