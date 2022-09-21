package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ComputePassTimestampLocation extends StObject
@JSGlobal("BABYLON.ComputePassTimestampLocation")
@js.native
object ComputePassTimestampLocation extends StObject {
  
  @js.native
  sealed trait Beginning
    extends StObject
       with ComputePassTimestampLocation
  
  @js.native
  sealed trait End
    extends StObject
       with ComputePassTimestampLocation
}
