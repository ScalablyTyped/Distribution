package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextureViewDimension extends StObject
@JSGlobal("BABYLON.TextureViewDimension")
@js.native
object TextureViewDimension extends StObject {
  
  @js.native
  sealed trait Cube
    extends StObject
       with TextureViewDimension
  
  @js.native
  sealed trait CubeArray
    extends StObject
       with TextureViewDimension
  
  @js.native
  sealed trait E1d
    extends StObject
       with TextureViewDimension
  
  @js.native
  sealed trait E2d
    extends StObject
       with TextureViewDimension
  
  @js.native
  sealed trait E2dArray
    extends StObject
       with TextureViewDimension
  
  @js.native
  sealed trait E3d
    extends StObject
       with TextureViewDimension
}
