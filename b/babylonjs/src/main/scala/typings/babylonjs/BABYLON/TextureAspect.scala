package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextureAspect extends StObject
@JSGlobal("BABYLON.TextureAspect")
@js.native
object TextureAspect extends StObject {
  
  @js.native
  sealed trait All
    extends StObject
       with TextureAspect
  
  @js.native
  sealed trait DepthOnly
    extends StObject
       with TextureAspect
  
  @js.native
  sealed trait StencilOnly
    extends StObject
       with TextureAspect
}
