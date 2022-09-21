package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextureDimension extends StObject
@JSGlobal("BABYLON.TextureDimension")
@js.native
object TextureDimension extends StObject {
  
  @js.native
  sealed trait E1d
    extends StObject
       with TextureDimension
  
  @js.native
  sealed trait E2d
    extends StObject
       with TextureDimension
  
  @js.native
  sealed trait E3d
    extends StObject
       with TextureDimension
}
