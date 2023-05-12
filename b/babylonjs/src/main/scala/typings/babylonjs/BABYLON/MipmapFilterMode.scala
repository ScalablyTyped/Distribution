package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MipmapFilterMode extends StObject
@JSGlobal("BABYLON.MipmapFilterMode")
@js.native
object MipmapFilterMode extends StObject {
  
  @js.native
  sealed trait Linear
    extends StObject
       with MipmapFilterMode
  
  @js.native
  sealed trait Nearest
    extends StObject
       with MipmapFilterMode
}
