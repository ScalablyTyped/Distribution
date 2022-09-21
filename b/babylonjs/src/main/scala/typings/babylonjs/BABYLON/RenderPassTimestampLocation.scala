package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RenderPassTimestampLocation extends StObject
@JSGlobal("BABYLON.RenderPassTimestampLocation")
@js.native
object RenderPassTimestampLocation extends StObject {
  
  @js.native
  sealed trait Beginning
    extends StObject
       with RenderPassTimestampLocation
  
  @js.native
  sealed trait End
    extends StObject
       with RenderPassTimestampLocation
}
