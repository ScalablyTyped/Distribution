package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SourceTextureFormat extends StObject
@JSGlobal("BABYLON.SourceTextureFormat")
@js.native
object SourceTextureFormat extends StObject {
  
  @js.native
  sealed trait ETC1S
    extends StObject
       with SourceTextureFormat
  
  @js.native
  sealed trait UASTC4x4
    extends StObject
       with SourceTextureFormat
}
