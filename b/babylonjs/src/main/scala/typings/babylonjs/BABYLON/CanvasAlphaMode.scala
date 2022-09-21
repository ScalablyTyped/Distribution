package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CanvasAlphaMode extends StObject
@JSGlobal("BABYLON.CanvasAlphaMode")
@js.native
object CanvasAlphaMode extends StObject {
  
  @js.native
  sealed trait Opaque
    extends StObject
       with CanvasAlphaMode
  
  @js.native
  sealed trait Premultiplied
    extends StObject
       with CanvasAlphaMode
}
